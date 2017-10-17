package org.usfirst.frc.team2342.models;

import java.util.Date;
import java.util.List;

/*import com.fasterxml.jackson.annotation.JsonProperty;*/

public class Post 
{
	public long postId;
/*    @JsonProperty("actor_id")*/
    public long actorId;
/*    @JsonProperty("picOfPersonWhoPosted")*/
    public String pictureOfPoster;
/*    @JsonProperty("nameOfPersonWhoPosted")*/
    public String nameOfPoster;
    public int likesCount;
    public List<String> comments;
    public Date timeOfPost;
}
