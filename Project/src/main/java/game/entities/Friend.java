package game.entities;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Friend extends Character {


    public Friend(String name, String path) throws IOException {
        super(name, path);
    }

    @Override
    public void fight() {
        System.out.println("I am game.entities.Friend, game.entities.Friend dont fight!");
        TextArea area = new TextArea("I am Friend, Friend dont fight!");
    }
}
