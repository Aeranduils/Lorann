package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.IElement;
import model.ILevel;
import model.ILorann;
import model.IMobile;
import model.IModel;

/**
 * 
 * @author flori
 *
 */
class GamePanel extends JPanel implements Observer {

	private static final long serialVersionUID = 1L;

	private IModel model;

	Font f;

	/**
	 * The Game Panel of the game
	 */
	GamePanel() {
		setBackground(Color.BLACK);
		setVisible(true);

	}

	/**
	 * Set the Lorann Model
	 * 
	 * @param model
	 */
	public void setModel(IModel model) {
		this.model = model;

	}

	/**
	 * Get the Lorann Model
	 * 
	 * @return model
	 */

	public IModel getModel() {
		return this.model;
	}

	/**
	 * Draw the graphics components
	 */
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		IModel model = getModel();
		ILevel level = this.model.getLevel();
		for (int y = 0; y < level.getDimension().getheight(); y++) {
			for (int x = 0; x < level.getDimension().getwidth(); x++) {

				IElement ele = level.getElement(y, x);
				if (ele == null)
					continue;
				g.drawImage(model.getElement(y, x).getImage(), y * 32, x * 32, this);
			}
		}

		for (IMobile ele : model.getLevel().getMobile()) {
			g.drawImage(ele.getImage(), ele.getPosition().getY() * 32, ele.getPosition().getX() * 32, null);
		}

		if (this.model.getLevel().getLorann().isAlive()) {
			ILorann ele = level.getLorann();
			g.drawImage(ele.getImage(), ele.getPosition().getY() * 32, ele.getPosition().getX() * 32, null);
		}

		f = new Font("Console", Font.BOLD, 20);
		g.setFont(f);
		g.setColor(Color.WHITE);

		if (!this.model.getLevel().getLorann().isAlive()) {
			g.drawString("GAME OVER", 250, 414);
		}

	}

	public void update(Observable observable, Object o) {

		this.model = (IModel) observable;
		this.repaint();

	}

}
