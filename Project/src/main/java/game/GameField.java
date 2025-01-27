package game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameField {
    private int x;
    private int y;
    private int player = 1;
    private int section = 0;
    private int rows;
    private int cols;

    private int[][] map;
    private List<int[][]> field;
    private static ArrayList<Integer> notMovable = new ArrayList<>();

    public GameField() throws IOException {
        /*
        field = List.of(getMap("resources/map/part1.txt"));
        map = field.get(section);*/
        this.map = getMap("C:\\git\\M320_givi\\Project\\src\\main\\resources\\map\\part1.txt");
        notMovable.add(2);
        notMovable.add(3);
        notMovable.add(4);
        notMovable.add(5);
    }

    private int[][] getMap(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        rows = 0;
        cols = 0;

        while ((line = reader.readLine()) != null) {
            if (rows == 0) {
                cols = line.split(" ").length;
            }
            rows++;
        }
        reader.close();
        System.out.println(rows + ", c " + cols);

        int[][] grid = new int[rows][cols];
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        for (int i = 0; i < rows; i++) {
            String[] st = br.readLine().trim().split(" ");
            for (int j = 0; j < cols; j++) {
                grid[i][j] = Integer.parseInt(st[j]);
            }
        }
        return grid;
    }

    public void interact() {
        getPos();
        if (map[y][x-1] != 0 || map[y][x+1] != 0 || map[y-1][x] != 0 || map[y+1][x] != 0) {

        }

    }

    private void getPos() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == player) {
                    x = j;
                    y = i;
                }
            }
        }
        System.out.println(x + " " + y);
    }

    private void move(int fy, int fx) throws ArrayIndexOutOfBoundsException {
        getPos();
        int nnPos=1;
        int nextPos = map[y + fy][x + fx];
        try {
            nnPos = map[y + fy * 2][x + fx * 2];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of bound");
        }

        if (notMovable.contains(nextPos)) {
            System.out.println("cant move");
        } else {
            map[y][x] -= player;
            map[y + fy][x + fx] += player;
        }
    }

    public void moveUp() {
        System.out.println("UP");
        move(-1, 0);
    }

    public void moveDown() {
        System.out.println("DOWN");
        move(1, 0);
    }

    public void moveLeft() {
        System.out.println("LEFT");
        move(0, -1);
    }

    public void moveRight() {
        System.out.println("RIGHT");
        move(0, 1);
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int[][] getMap() {
        return map;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }
}
