import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main Class, which is responsible for the TUI, calls functions from Manager.
 * Main only accesses the Manager
 * @author Giulia Villiger
 */
public class Main {

    /**
     * The solutions for exercise V1.
     */
    public static void v1() {
        List<Media> mediaList = new ArrayList<>();
        CD cd = new CD("TKKG", 2004, 10.50, "Der grosse Coup");

        // Objekte verschiedener Medientypen zur Liste hinzufügen
        mediaList.add(new Book("The Stranger", 1942, 21.50, 800, 200000000));
        mediaList.add(new CD("Die drei ???", 1973, 13.90, "Das verlassene Schloss"));
        mediaList.add(new DVD("Kill Bill", 2003, 12.50, 101));
        mediaList.add(cd);
        System.out.println(mediaList.size());
        mediaList.remove(cd);
        System.out.println(mediaList.size());


        // Alle Medien in der Liste anzeigen
        for (Media media: mediaList) {
            System.out.println(media.toString());
        }
    }

    /**
     * In the main function the TUI is created.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        manager.addMedia(new Book("The Stranger", 1942, 21.50, 800, 200000000));
        manager.addMedia(new CD("Die drei ???", 1973, 13.90, "Das verlassene Schloss"));
        manager.addMedia(new DVD("Kill Bill", 2003, 12.50, 101));
        manager.addMedia(new DVD("Inception", 2010, 9.99, 148));

        String action;
        do {
            System.out.println("p to print all\ns to search by title\nx to exit");
            action = scanner.next();
            if(action.equals("p")) {
                manager.printAll();
            } else if (action.equals("s")) {
                System.out.println("Title: ");
                String title = scanner.next();
                manager.findMedia(title);
            }
        }while(!action.equals("x"));
        scanner.close();

    }
}
