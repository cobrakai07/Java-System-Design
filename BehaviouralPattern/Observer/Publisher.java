package BehaviouralPattern.Observer;

public interface Publisher {
    void addSubsciber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(String video);
}
