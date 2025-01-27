package game;

import game.entities.Character;
import game.entities.Enemy;
import game.entities.Friend;
import game.entities.Player;
import game.objects.Inventory;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GameWindow extends JFrame implements Displayable {
    private GameField map;
    private int scale;
    private Inventory inventory;
    private BufferedImage displayArea;
    private final Map<Integer, Runnable> inputMap;
    private final List<BufferedImage> imageList;
    private ArrayList<Character> entities;

    public GameWindow(GameField map) throws IOException {
        this.map = map;
        this.inventory = new Inventory(map.getCols());

        BufferedImage floor = loadImage("C:\\git\\M320_givi\\Project\\src\\main\\resources\\images\\floor.png");
        BufferedImage player = loadImage("C:\\git\\M320_givi\\Project\\src\\main\\resources\\images\\player.png");
        BufferedImage enemy = loadImage("C:\\git\\M320_givi\\Project\\src\\main\\resources\\images\\nom.png");
        BufferedImage friend = loadImage("C:\\git\\M320_givi\\Project\\src\\main\\resources\\images\\friend.png");
        BufferedImage tree = loadImage("C:\\git\\M320_givi\\Project\\src\\main\\resources\\images\\tree.png");
        BufferedImage stump = loadImage("C:\\git\\M320_givi\\Project\\src\\main\\resources\\images\\stump.png");
        BufferedImage playerArmored = loadImage("C:\\git\\M320_givi\\Project\\src\\main\\resources\\images\\playerarmored.png");

        this.scale = floor.getWidth();
        this.entities = new ArrayList<>();
        entities.add(new Player("player", player));
        entities.add(new Enemy("nommonster", enemy));
        entities.add(new Friend("frend", friend));

        inputMap = Map.of(KeyEvent.VK_UP, map::moveUp, KeyEvent.VK_DOWN, map::moveDown,
                KeyEvent.VK_RIGHT, map::moveRight, KeyEvent.VK_LEFT, map::moveLeft, KeyEvent.VK_E, map::interact);
        imageList = List.of(floor, player, enemy, friend, tree, stump, playerArmored);

        initInput();
        initOutput();
        updateOutput();
    }

    private void initInput() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (inputMap.containsKey(e.getKeyCode())) {
                    inputMap.get(e.getKeyCode()).run();
                    updateOutput();
                }
            }
        });
    }

    private void initOutput() {
        displayArea = new BufferedImage(map.getCols() * scale + 5, map.getRows() * scale + 5,
                BufferedImage.TYPE_INT_ARGB);

        this.getContentPane().add(new JLabel(new ImageIcon(displayArea)));
        //this.getContentPane().add(new JLabel(new ImageIcon(inventory.initInventory(map.getCols(), scale))));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setTitle("Game");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void updateOutput() {
        Graphics2D g2d = (Graphics2D) displayArea.getGraphics();
        for (int x = 0; x < map.getCols(); x++) {
            for (int y = 0; y < map.getRows(); y++) {
                int scaleX = x * scale;
                int scaleY = y * scale;
                int imageIndex = map.getMap()[y][x];

                if (imageIndex >= 0 && imageIndex < imageList.size()) {
                    BufferedImage image = imageList.get(imageIndex);
                    g2d.drawImage(image, scaleX, scaleY, null);
                } else {
                    System.out.println("Invalid index: " + imageIndex);
                }
            }
        }
        repaint();
    }

    @Override
    public BufferedImage loadImage(String path) throws IOException {
        File file = new File(path);
        return ImageIO.read(file);
    }
}
