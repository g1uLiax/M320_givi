package game.objects;

import game.Displayable;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Item implements Displayable {
    public String path;
    private BufferedImage image;
    public Item(String path) throws IOException {
        image = loadImage(path);
    }

    @Override
    public BufferedImage loadImage(String path) throws IOException {
        File file = new File(path);
        return ImageIO.read(file);
    }
}
