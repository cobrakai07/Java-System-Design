package BehaviouralPattern.Observer;

public class YouTubeSubscriber implements Subscriber{
    String youTubeUserName;
    public YouTubeSubscriber(String youTubeUserName){
        this.youTubeUserName = youTubeUserName;
    }
    @Override
    public void notify(String video) {
        System.out.println("Sending youtube notification of uploaded video " + video + " to youtube userId: " + youTubeUserName);
    }
}


