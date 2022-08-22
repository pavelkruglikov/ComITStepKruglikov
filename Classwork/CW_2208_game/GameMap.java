package CW_2208_game;

public class GameMap {
    public char[][] map;
    int x = 9;
    int y = 0;

    public void addPlayer(int indexX, int indexY) {
        map[indexX][indexY] = 'P';
    }

    public void moveToTheRight() {
        if (y + 1 > 9 || map[x][y + 1] == 'S') {
            System.out.println("Нет хода");
        } else {
            map[x][y + 1] = 'P';
            map[x][y] = '.';
            y++;
        }
    }

    public void moveToTheLeft() {
        if (y - 1 < 0 || map[x][y - 1] == 'S') {
            System.out.println("Нет хода");
        } else {
            map[x][y - 1] = 'P';
            map[x][y] = '.';
            y--;
        }

    }

    public void moveUp() {
        if (x - 1 < 0 || map[x - 1][y] == 'S') {
            System.out.println("Нет хода");
        } else {
            map[x - 1][y] = 'P';
            map[x][y] = '.';
            x--;
        }
    }

    public void moveDown() {
        if (map[x + 1][y] == 'S' || x + 1 > 9) {
            System.out.println("Нет хода");
        } else {
            map[x + 1][y] = 'P';
            map[x][y] = '.';
            x++;
        }
    }

    public void showMap() {
        for (char[] chars : map) {
            for (char ch : chars) {
                System.out.print(ch);
            }
            System.out.println();
        }

    }


}
