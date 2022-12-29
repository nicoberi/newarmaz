public abstract class Person implements iCall, iSendMessage {
    private String name;
    private String phoneNumber;
    private Phone phone;



    public Person(String name, String phonenum, Phone phone) {
        this.name = name;
        this.phoneNumber = phonenum;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Phone getPhone() {
        return phone;
    }
    
    public void sendMessage(Message message) {
        this.phone.sendTextMessage(message);
    }

    public String call() {
        return name + " is calling";
    }

}
