package game;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Interface for a single Displayable Item/Object that doesn't contain other Objects/Items like
 * Map or Inventory.
 */
public interface Displayable {
    public String path = new String();
    BufferedImage image = null;

    public BufferedImage loadImage(String path) throws IOException;
}
