import java.util.ArrayList;

/**
 * The Manager Class is responsible for adding, printing and finding Media.
 * @author Giulia Villiger
 */
public class Manager {

    private ArrayList<Media> medias;

    /**
     * The Constructor for Manager which has no parameters.
     */
    public Manager() {
        this.medias = new ArrayList<>();
    }

    /**
     * The addMedia function adds a Media to the medias ArrayList.
     * @param media
     */
    public void addMedia(Media media) {
        medias.add(media);
    }

    /**
     * The printAll function goes through the ArrayList and prints all the medias.
     */
    public void printAll() {
        for(Media media: medias) {
            media.print();
        }
    }

    /**
     * The findMedia function takes an input string and searches all the media names until said string is found.
     * If the String cant be found it will print a message.
     * @param title
     */
    public void findMedia(String title) {
        for (Media media : medias) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                media.print();
                return;
            }
        }
        System.out.println("Nothing found with Title " + title);

    }

    public ArrayList<Media> getMedias() {
        return medias;
    }
}
