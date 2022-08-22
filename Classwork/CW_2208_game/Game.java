package CW_2208_game;

import java.util.Random;

public class Game {
    private void createMap(GameMap map) {
        map.map = new char[10][10];
        Random random = new Random();
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map.length; j++) {
                if (random.nextInt(9) == random.nextInt(9)) {
                    map.map[i][j] = 'S';
                    continue;
                }
                map.map[i][j] = '.';
            }
        }
        map.map[0][9] = '.';
    }


    public static void main(String[] args) {
        Game game = new Game();
        GameMap map = new GameMap();
        game.createMap(map);
        map.addPlayer(9, 0);
        Controller controller = new Controller();
        map.showMap();
        while (map.x != 0 || map.y != 9){
            controller.navigatePlayer(map);
        }

    }
}


