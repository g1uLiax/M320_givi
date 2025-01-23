package game.entities;

import game.Displayable;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Character implements Displayable {
    private String name;
    private String path;
    private BufferedImage image;

    public Character(String name, String path) throws IOException {
        this.name = name;
        image = loadImage(path);
    }

    public BufferedImage loadImage(String path) throws IOException {
        File file = new File(path);
        return ImageIO.read(file);
    }

    public void fight() {

    }
}
