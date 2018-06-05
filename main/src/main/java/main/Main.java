package main;

import java.sql.SQLException;

import javax.swing.JFrame;

import controller.Controller;
import model.Model;
import view.View;

public abstract class Main extends JFrame {

	public static void main(final String[] args) throws SQLException {
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(view, model);
		view.setController(controller);
		controller.start();

	}

}
