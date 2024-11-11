import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
}
