package game.entities;

import game.Displayable;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Parent Class Character which implements the Interface Displayable is
 * for all Entities in the Game 
 */
public class Character {
    private String name;
    private String path;
    private BufferedImage image;

    /**
     * Super Params of Character
     * @param name          Name of the Character
     * @param image         Image of the Character
     * @throws IOException  Throws IOException in case file cant be found
     */
    public Character(String name, BufferedImage image) throws IOException {
        this.name = name;
        image = image;
    }
    public void fight() {

    }
}
