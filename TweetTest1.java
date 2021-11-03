package twitter;



import java.util.*;
import twitter4j.*;
import twitter4j.JSONArray;
import twitter4j.JSONObject;
import twitter4j.conf.*;
import org.json.*;

public class TweetTest1 {

public static void main(String[] a) {

    ConfigurationBuilder cb = new ConfigurationBuilder();
    cb.setOAuthConsumerKey("Hx0UGvHKBJ28vyFUJC9QzlBui");
    cb.setOAuthConsumerSecret("VYDMrBZkbpdLdPzNB0A08R7k3AiiB900mrsrVAWYhhOCGoa6Ns");
    cb.setOAuthAccessToken("1451491304311967745-GHrTecwTLhr42GdwEt4fwmtQOdf9sX");
    cb.setOAuthAccessTokenSecret("j6ZOovU77ziMsPEUChwAvVfNwoj7XyRS8uZYsz0d3enCn");


    List<Status> statuses = new ArrayList();

    TwitterFactory tf = new TwitterFactory(cb.build());
    Twitter twitter = tf.getInstance();
      Query query = new Query("#tesla");
      query.setCount(5);
      try {
    	  QueryResult result  = twitter.search(query);
        statuses.addAll(result.getTweets());
        System.out.println("Gathered " + statuses.size() + " tweets");
    } catch (TwitterException te) {
        System.out.println("Couldn't connect: " + te.toString());
    }
      
    for (Status status1 : statuses){
    	
        
       System.out.println("id: "+status1.getUser().getId());
       System.out.println("name: "+status1.getUser().getName());
       System.out.println("text: "+ status1.getText());
       System.out.println("time: "+ status1.getUser().getCreatedAt());
       System.out.println("Language: " +status1.getLang());
       System.out.println("Source: "+status1.getSource());
       System.out.println("number of likes: "+ status1.getFavoriteCount());
       System.out.println("my favorite: "+status1.isFavorited());
       System.out.println();
       System.out.println();
    }
   
}

}

