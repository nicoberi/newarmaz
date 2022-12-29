import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	public final static Logger LOGGER = LogManager.getLogger(Main.class);

    
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

				LOGGER.info("Armaz\n");
			

            // Batteries
            Battery battery1 = new Battery(100);
            System.out.println(battery1.hashCode());
            Battery battery2 = new Battery(90);
            System.out.println(battery2.hashCode());
            Battery battery3 = new Battery(80);

            // Processors
            Processor processor1 = new Processor("i7");
            System.out.println(processor1.hashCode());
            Processor processor2 = new Processor("i7");
            System.out.println(processor2.hashCode());
            Processor processor3 = new Processor("i5");
            System.out.println(processor1.equals(processor2));

            // Phones
            Phone iphone = new Smartphone("iphone", "13pro", battery1, processor1);
            Phone nokia = new FlipPhone("nokia", "329", battery2, processor2);
            Phone samsung = new SliderPhone("samsung", "galaxy", battery3, processor3);

            // Persons
            Person john = new John("John", " + 995599562564", iphone);
            Person mary = new Mary("Mary", " + 995599363678", nokia);
            Person george = new George("George", " + 46939423969", samsung);

            try {
                while (true) {
                	System.out.println("1 - Call");
                    System.out.println("2 - Send messages");
                    System.out.println("3 - List Users and their Phones");
                    System.out.println("\nSelect an operation: ");
                    String query = scanner.nextLine();
                    switch (query) {
                        case "1":
                            System.out.println("...................");
                            System.out.println(john.call());
                            System.out.println(mary.call());
                            System.out.println(george.call());

                            System.out.println("---");
                            break;
                        case "2":
                            System.out.println("1 - John");
                            System.out.println("2 - Mary");
                            System.out.println("\nSelect user to send: ");
                            String selectedUser = scanner.nextLine();
                            System.out.println("\nType message to send: ");
                            String message = scanner.nextLine();
                            switch (selectedUser) {
                                case "1":
                                    mary.sendMessage(new Message(mary, john, message));
                                    for (Message m: mary.getPhone().getMessages()){
                                        System.out.println(m.getSender().getName()+ " is sending " + m.getReceiver().getName() + " ' " + m.getMessage() + " ' ");
                                    }
                                    break;
                                case "2":
                                    john.sendMessage(new Message(john, mary, message));
                                    for (Message m: john.getPhone().getMessages()){
                                        System.out.println(m.getSender().getName()+ " is sending " + m.getReceiver().getName() + " ' " + m.getMessage() + "'");
                                    }
                                    break;

                                default:
                                    break;
                            }
                            break;
                        case "3":
                            System.out.println("Johns Phone name: " + john.getPhone().getName() + ",  model: "
                                    + john.getPhone().getModel());
                            System.out.println("Marys Phone name: " + mary.getPhone().getName() + ",  model: "
                                    + mary.getPhone().getModel());
                            System.out.println("Georges Phone name: " + george.getPhone().getName() + ",  model: "
                                    + george.getPhone().getModel());
                            break;
                        default:
                            break;
                    }
                }
            }catch(

                    Exception ex)
            {
                System.out.println("Error while processing or taking an Input");
            }scanner.close();
        
    }
    
}
