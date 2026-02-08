package BehaviouralPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Publisher {
    List<Subscriber> subscribers;
    List<String> videos;

    public YouTubeChannel() {
        subscribers = new ArrayList<>();
        videos = new ArrayList<>();
    }

    public void uploadVideo(String video) {
        videos.add(video);
        notifySubscribers(video);
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String video) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notify(video);
        }
    }
}
