package game;

import java.awt.image.BufferedImage;
import java.io.IOException;

public interface Displayable {
    public String path = new String();

    public BufferedImage loadImage(String path) throws IOException;
}
