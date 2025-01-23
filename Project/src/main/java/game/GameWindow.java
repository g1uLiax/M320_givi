package game;

import game.objects.Inventory;

import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.Map;

public class GameWindow extends JFrame {
    private Map map;
    private Inventory inventory;
    private BufferedImage displayMap;
    private BufferedImage displayInventory;
    private final Map<Integer, Runnable> inputMap;

    public GameWindow(Map map, Inventory inventory) {
        this.map = map;
        this.inventory = inventory;

        inputMap = Map.of(KeyEvent.VK_W, map::move)
    }



}
