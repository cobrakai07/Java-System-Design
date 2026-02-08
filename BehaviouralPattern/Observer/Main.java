package BehaviouralPattern.Observer;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel youTubeChannel = new YouTubeChannel();

        EmailSubscriber emailSubscriber = new EmailSubscriber("dk@gmail.com");
        YouTubeSubscriber youTubeSubscriber = new YouTubeSubscriber("cobraKai");
        
        youTubeChannel.addSubsciber(youTubeSubscriber);
        youTubeChannel.addSubsciber(emailSubscriber);

        youTubeChannel.uploadVideo("Java OOPS");

    }
}
