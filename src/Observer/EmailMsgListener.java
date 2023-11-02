package Observer;

public class EmailMsgListener {
    String email;
    public EmailMsgListener(String string){
        this.email = email;
    }
    public void update() {
        // Actually send the mail
        System.out.println("Sending mail to " + email + " concerning ");
    }
}
