package elements;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import Mocks.ElementMock;

public class ElementTest {

	Element e;
	int x;
	int y;
	Random rand;

	@Before
	public void setUp() throws Exception {

		rand = new Random();
		x = rand.nextInt(150) - 10;
		y = rand.nextInt(150) - 10;
		e = new ElementMock(x, y);
	}

	@Test
	public void testGetImageIsNotNull() throws Exception {
		assertNotNull("The element must have an image", e.getImage());
	}

	@Test
	public void testGetSpriteIsNotNull() throws Exception {
		assertNotNull("The element must have a sprite", e.getSprite());
	}

	@Test
	public void testGetPositionIsCorrectAndNotNull() throws Exception {
		assertNotNull("Element can't have null position", e.getPosition());
		assertEquals("X is supposed to be the same", x, e.getPosition().getX());
		assertEquals("Y is supposed to be the same", y, e.getPosition().getY());

	}

}
