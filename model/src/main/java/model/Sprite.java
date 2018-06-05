package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 
 * @author flori
 *
 */
public class Sprite implements ISprite {

	private Image image;
	private String imageURL = "C://Users//flori/Desktop/PROJET JAVA/WORKSPACE/Lorann/sprite/";

	/**
	 * Read sprite of the element
	 * 
	 * @param image
	 */
	public Sprite(final String image) {
		try {
			this.image = ImageIO.read(new File(imageURL + image));
		} catch (IOException e) {
			System.err.println("Impossible to load the image" + image);
			e.printStackTrace();
		}
	}

	/**
	 * The sprite
	 * 
	 * @param image
	 */
	public Sprite(final Image image) {
		this.image = image;
	}

	/**
	 * The image
	 * 
	 * @return image
	 */

	public Image getImage() {
		return this.image;

	}

	/**
	 * Set the image
	 * 
	 * @param image
	 */

	public void setImage(String image) {
		try {
			this.image = ImageIO.read(new File(imageURL + image));
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

}
