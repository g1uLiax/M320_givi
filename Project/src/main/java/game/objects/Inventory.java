package game.objects;

import game.Displayable;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Inventory implements Displayable {
    private List<BufferedImage> objects;
    private List<Object> acquired;
    private BufferedImage displayInventory;
    private int cols;
    private int scale;
    private int[] inventory;

    public Inventory(int cols) throws IOException {
        BufferedImage sword = loadImage("C:\\git\\M320_givi\\Project\\src\\main\\resources\\images\\inventory\\sword.png");
        objects = List.of(sword);
        this.scale = sword.getWidth();
        this.cols = cols;

    }

    public BufferedImage initInventory(int cols, int scale) {
        displayInventory = new BufferedImage(cols * scale, 1 * scale, BufferedImage.TYPE_INT_ARGB);
        cols = cols;
        inventory = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        return displayInventory;
    }

    public void updateInventory() {
        Graphics2D g2d = displayInventory.createGraphics();
        for (int x = 0; x < 1; x++) {
            int scaleY = x * scale;

            BufferedImage image = objects.get(x);
        }


    }

    @Override
    public BufferedImage loadImage(String path) throws IOException {
        File file = new File(path);
        return ImageIO.read(file);
    }

    public List<Object> getAcquired() {
        return acquired;
    }

    public void setAcquired(List<Object> acquired) {
        this.acquired = acquired;
    }

    public List<BufferedImage> getObjects() {
        return objects;
    }

    public void setObjects(List<BufferedImage> objects) {
        this.objects = objects;
    }


}
