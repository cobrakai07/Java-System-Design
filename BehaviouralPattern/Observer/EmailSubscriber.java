package BehaviouralPattern.Observer;

public class EmailSubscriber implements Subscriber {
    String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void notify(String video) {
        System.out.println("Sending email notification of uploaded video " + video + " to email ID: " + email);
    }
}
