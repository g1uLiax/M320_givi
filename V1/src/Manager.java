import java.util.ArrayList;

/**
 * The Manager Class which manages all the Media.
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

    public void addMedia(Media media) {
        medias.add(media);
    }

    public void printAll() {
        for(Media media: medias) {
            media.print();
        }
    }

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
