package org.usfirst.frc.team2342.samples;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.usfirst.frc.team2342.models.*;

public class JsonSample {
	private static public final ObjectMapper JACKSON = new ObjectMapper();

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
	{
		
		// Setup some data. We could do this by reading from a JSON file, but
		// this example shows the full extent of the classes being built.
		JsonData newData = new JsonData();
		{
			PageInfo pageInfo = new PageInfo();
			{
				pageInfo.pageName = "First Page";
				pageInfo.pagePic = "sample.png";
				pageInfo.Posts = new ArrayList<Post>();
				
				Post firstPost = new Post();
				{
					firstPost.actorId = 100L;
					firstPost.comments = new ArrayList<String>();
					firstPost.comments.add("I find this very useful.");
					firstPost.comments.add("Thanks for the help!");
					firstPost.likesCount = 3;
					firstPost.nameOfPoster = "Paul Lagasse";
					firstPost.pictureOfPoster = "paul.png";
					firstPost.postId = 1;
					firstPost.timeOfPost = new Date();
					pageInfo.Posts.add(firstPost);
				}

				Post secondPost = new Post();
				{
					secondPost.actorId = 105L;
					secondPost.comments = new ArrayList<String>();
					secondPost.comments.add("This wasn't very useful.");
					secondPost.comments.add("I wish your example had been more clear!");
					secondPost.likesCount = 0;
					secondPost.nameOfPoster = "Ian Malcolm";
					secondPost.pictureOfPoster = "ian.png";
					secondPost.postId = 2;
					secondPost.timeOfPost = new Date();
					pageInfo.Posts.add(secondPost);
				}

			}
			newData.setPageInfo(pageInfo);
		}

		// Use Jackson to Serialize the JSON data to the console.
		String JsonDataAsString = JACKSON.writeValueAsString(newData);
		System.out.println(JsonDataAsString);

		// Use Jackson to Deserialize (Marshal) the JSON data from a String.
		JsonData fileData = JACKSON.readValue(JsonDataAsString, JsonData.class);

		// As an example, we can iterate through the new objects Jackson created for us and write out the data from our Posts.
		for (Post post : fileData.pageInfo.Posts) {
			System.out.println(JACKSON.writeValueAsString(post));
		}
	}

}
