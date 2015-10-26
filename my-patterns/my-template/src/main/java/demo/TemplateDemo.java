package demo;

import api.Cricket;
import api.Football;
import api.Game;

public class TemplateDemo {
    public static void main(String[] args) {

	Game game = new Cricket();
	game.play();
	System.out.println();
	game = new Football();
	game.play();
    }
}
