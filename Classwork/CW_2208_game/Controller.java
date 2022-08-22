package CW_2208_game;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Controller {
    public void navigatePlayer(GameMap map) {
        int movie = getDirection();
        switch (movie) {
            case (4): {
                map.moveToTheLeft();
                map.showMap();
                break;
            }
            case (6): {
                map.moveToTheRight();
                map.showMap();
                break;
            }
            case (8): {
                map.moveUp();
                map.showMap();
                break;
            }
            case (2): {
                map.moveDown();
                map.showMap();
                break;
            }
            default: {
                System.out.println("Неправильный ввод");
            }
        }

    }
    int direction = 0;

    private int getDirection() {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    System.in
            ));
            direction = Integer.parseInt(br.readLine());


        } catch (Exception ex) {
            System.out.println("");

        }
        return direction;
    }
}
