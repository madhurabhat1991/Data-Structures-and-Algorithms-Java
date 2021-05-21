public class _08_twitter{
  public static void main(String[] args){
    String[] tweets = new String[]{"hi","good","morning"};

    findTweet(tweets);

    TweetObject[] tweetObjects = new TweetObject[]{
      new TweetObject("hi", 2012),
      new TweetObject("good", 2014),
      new TweetObject("morning", 2018)
    };

    compareAllDates(tweetObjects);
  }

  public static void findTweet(String[] tweets){
    System.out.println("First: " + tweets[0]);
    System.out.println("Latest: " + tweets[tweets.length-1]);

    // Both O(1)
  }

  public static void compareAllDates(TweetObject[] tweetObjects){
    for (TweetObject each : tweetObjects){
      for (TweetObject other : tweetObjects){
        if (each.getDate() < other.getDate()){
          System.out.println(each.getDate() + " < " + other.getDate());
        }
      }
    }

    // O(n^2)
  }
}

class TweetObject{
  public String Tweet;
  public int Date;

  public TweetObject(String tweet, int date){
    Tweet = tweet;
    Date = date;
  }

  public String getTweet(){
    return Tweet;
  }

  public int getDate(){
    return Date;
  }
}