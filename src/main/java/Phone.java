import java.util.ArrayList;

public class Phone {
    private String name;
    private String model;
    private Battery battery;
    private Processor processor;
    private int messageCount;
    private ArrayList<Message> messageList = new ArrayList<>();

    public Phone() {
    }

    public Phone(String name, String model, Battery battery, Processor processor) {
        this.name = name;
        this.model = model;
        this.battery = battery;
        this.processor = processor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void sendTextMessage(Message message) {
        messageList.add(message);
        messageCount++;

    }

    /**
     * Gets all of the messages safely from the list .
     *
     */
    public Message[] getMessages() {
        Message[] safeArray = new Message[messageCount];
        for (int i = 0; i < messageCount; i++) {
            safeArray[i] = messageList.get(i);
        }
        return safeArray;
    }

}
