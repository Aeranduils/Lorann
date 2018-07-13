package view;

import static org.junit.Assert.assertEquals;

import java.awt.event.KeyEvent;

import org.junit.Before;
import org.junit.Test;

import Mock.ComponentMock;
import Mock.ControllerMock;

public class GameFrameTest {

	GameFrame g;
	ControllerMock c;

	@Before
	public void setUp() throws Exception {
		c = new ControllerMock();
		g = new GameFrame();
		g.setController(c);
	}

	@Test
	public void testKeyPressedUp() throws Exception {
		KeyEvent e = new KeyEvent(new ComponentMock(), 0, 0, 0, 0);
		e.setKeyCode(KeyEvent.VK_UP);
		this.g.keyPressed(e);
		assertEquals(Order.UP, c.getLastOrder());
	}

	@Test
	public void testKeyPressed8() throws Exception {
		KeyEvent e = new KeyEvent(new ComponentMock(), 0, 0, 0, 0);
		e.setKeyCode(KeyEvent.VK_NUMPAD8);
		this.g.keyPressed(e);
		assertEquals(Order.UP, c.getLastOrder());
	}

	@Test
	public void testKeyPressedZ() throws Exception {
		KeyEvent e = new KeyEvent(new ComponentMock(), 0, 0, 0, 0);
		e.setKeyCode(KeyEvent.VK_Z);
		this.g.keyPressed(e);
		assertEquals(Order.UP, c.getLastOrder());
	}

	@Test
	public void testKeyPressedDown() throws Exception {
		KeyEvent e = new KeyEvent(new ComponentMock(), 0, 0, 0, 0);
		e.setKeyCode(KeyEvent.VK_DOWN);
		this.g.keyPressed(e);
		assertEquals(Order.DOWN, c.getLastOrder());
	}

	@Test
	public void testKeyPressed2() throws Exception {
		KeyEvent e = new KeyEvent(new ComponentMock(), 0, 0, 0, 0);
		e.setKeyCode(KeyEvent.VK_NUMPAD2);
		this.g.keyPressed(e);
		assertEquals(Order.DOWN, c.getLastOrder());
	}

	@Test
	public void testKeyPressedS() throws Exception {
		KeyEvent e = new KeyEvent(new ComponentMock(), 0, 0, 0, 0);
		e.setKeyCode(KeyEvent.VK_S);
		this.g.keyPressed(e);
		assertEquals(Order.DOWN, c.getLastOrder());
	}

	@Test
	public void testKeyPressedLeft() throws Exception {
		KeyEvent e = new KeyEvent(new ComponentMock(), 0, 0, 0, 0);
		e.setKeyCode(KeyEvent.VK_LEFT);
		this.g.keyPressed(e);
		assertEquals(Order.LEFT, c.getLastOrder());
	}

	@Test
	public void testKeyPressed4() throws Exception {
		KeyEvent e = new KeyEvent(new ComponentMock(), 0, 0, 0, 0);
		e.setKeyCode(KeyEvent.VK_NUMPAD4);
		this.g.keyPressed(e);
		assertEquals(Order.LEFT, c.getLastOrder());
	}

	@Test
	public void testKeyPressedQ() throws Exception {
		KeyEvent e = new KeyEvent(new ComponentMock(), 0, 0, 0, 0);
		e.setKeyCode(KeyEvent.VK_Q);
		this.g.keyPressed(e);
		assertEquals(Order.LEFT, c.getLastOrder());
	}

	@Test
	public void testKeyPressedRight() throws Exception {
		KeyEvent e = new KeyEvent(new ComponentMock(), 0, 0, 0, 0);
		e.setKeyCode(KeyEvent.VK_RIGHT);
		this.g.keyPressed(e);
		assertEquals(Order.RIGHT, c.getLastOrder());
	}

	@Test
	public void testKeyPressed6() throws Exception {
		KeyEvent e = new KeyEvent(new ComponentMock(), 0, 0, 0, 0);
		e.setKeyCode(KeyEvent.VK_NUMPAD6);
		this.g.keyPressed(e);
		assertEquals(Order.RIGHT, c.getLastOrder());
	}

	@Test
	public void testKeyPressedD() throws Exception {
		KeyEvent e = new KeyEvent(new ComponentMock(), 0, 0, 0, 0);
		e.setKeyCode(KeyEvent.VK_D);
		this.g.keyPressed(e);
		assertEquals(Order.RIGHT, c.getLastOrder());
	}

	@Test
	public void testKeyPressed1() throws Exception {
		KeyEvent e = new KeyEvent(new ComponentMock(), 0, 0, 0, 0);
		e.setKeyCode(KeyEvent.VK_NUMPAD1);
		this.g.keyPressed(e);
		assertEquals(Order.DIAGBOTLEFT, c.getLastOrder());
	}

	@Test
	public void testKeyPressed3() throws Exception {
		KeyEvent e = new KeyEvent(new ComponentMock(), 0, 0, 0, 0);
		e.setKeyCode(KeyEvent.VK_NUMPAD3);
		this.g.keyPressed(e);
		assertEquals(Order.DIAGBOTRIGHT, c.getLastOrder());
	}

	@Test
	public void testKeyPressed7() throws Exception {
		KeyEvent e = new KeyEvent(new ComponentMock(), 0, 0, 0, 0);
		e.setKeyCode(KeyEvent.VK_NUMPAD7);
		this.g.keyPressed(e);
		assertEquals(Order.DIAGTOPLEFT, c.getLastOrder());
	}

	@Test
	public void testKeyPressed9() throws Exception {
		KeyEvent e = new KeyEvent(new ComponentMock(), 0, 0, 0, 0);
		e.setKeyCode(KeyEvent.VK_NUMPAD9);
		this.g.keyPressed(e);
		assertEquals(Order.DIAGTOPRIGHT, c.getLastOrder());
	}

	@Test
	public void testKeyPressedSpace() throws Exception {
		KeyEvent e = new KeyEvent(new ComponentMock(), 0, 0, 0, 0);
		e.setKeyCode(KeyEvent.VK_SPACE);
		this.g.keyPressed(e);
		assertEquals(Order.SPELL, c.getLastOrder());
	}

}
