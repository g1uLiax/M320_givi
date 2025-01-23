import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Game {
    private int x;
    private int y;
    private int section = 1;

    private int[][] map;
    private List<int[][]> mapSections;

    public Game() throws IOException {
        mapSections = List.of(getMap("resources/map/part1.txt"), getMap("resources/map/part1.txt"));
        map = mapSections.get(section - 1);
    }

    public int[][] getMap(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        int rows = 0;
        int cols = 0;

        while ((line = reader.readLine()) != null) {
            if (rows == 0) {
                cols = line.split(" ").length;
            }
            rows++;
        }
        reader.close();
        System.out.println(rows + ", c " + cols);

        int[][] grid = new int[rows][cols];
        reader.reset();

        for (int i = 0; i < rows; i++) {
            String[] st = reader.readLine().trim().split(" ");
            for (int j = 0; j < cols; j++) {
                grid[i][j] = Integer.parseInt(st[j]);
            }
        }
        return grid;
    }

    public void getPos() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 2) {
                    x = j;
                    y = i;
                }
            }
        }
        System.out.println(x + " " + y);
    }

    public void move(int fy, int fx) throws ArrayIndexOutOfBoundsException {
        getPos();
        int nnPos=1;
        int nextPos = map[y + fy][x + fx];
        try {
            nnPos = map[y + fy * 2][x + fx * 2];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of bound");
        }

        if (nextPos == 1 || ((nextPos == 3 || nextPos == 7) && (nnPos == 1 || nnPos == 3 || nnPos == 7))) {
            System.out.println("invalid move");
        } else {
            map[y][x] -= 2;
            map[y + fy][x + fx] += 2;
            for(int m = 3; m <8; m++) {
                if(nextPos == m && nextPos != 4) {
                    map[y + fy][x + fx] -=  3;
                    if(nnPos == 4 || nnPos == 0) {
                        map[y + fy * 2][x + fx * 2] += 3;
                    }
                }
            }
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

}
