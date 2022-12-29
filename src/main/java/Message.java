public class Message {
    private Person receiver;
    private Person sender;
    private String message;

    public Message(){}

    public Message(Person sender,Person receiver, String message){
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

    public Person getReceiver() {
        return receiver;
    }

    public void setReceiver(Person receiver) {
        this.receiver = receiver;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
