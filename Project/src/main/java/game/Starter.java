package game;

import game.objects.Inventory;

import java.io.IOException;

public class Starter {
    public static void main(String []args) throws IOException {
        GameWindow window = new GameWindow(new GameField());
    }
}
