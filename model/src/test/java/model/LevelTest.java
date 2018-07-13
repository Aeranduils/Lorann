package model;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Mocks.ElementMock;
import Mocks.MobileMock;
import elements.Dimension;
import elements.Element;
import elements.Level;
import elements.Lorann;
import elements.Mobile;

public class LevelTest {

	Level l;
	Lorann lo;

	@Before
	public void setUp() throws Exception {
		lo = new Lorann(4, 10);
		l = new Level(1, 20, 21, lo, 1);
	}

	@Test
	public void testSetElement() throws Exception {
		Element e = new ElementMock(1, 2);
		l.setElement(1, 2, e);
		assertNotNull("Element can't be null", l.getElements()[1][2]);
		assertSame("Set an element must place it at the good case in the table", e, l.getElements()[1][2]);
	}

	@Test
	public void testAddMobile() throws Exception {

		Mobile m = new MobileMock(8, 5);
		l.addMobile(m);
		assertTrue("The mobile is supposed to be in the Mobile ArrayList", l.getMobile().indexOf(m) != -1);

	}

	@Test
	public void testRemoveMobile() throws Exception {
		Mobile m = new MobileMock(8, 5);
		l.removeMobile(m);
		assertTrue("The mobile is supposed to be removed in the Mobile ArrayList", l.getMobile().indexOf(m) == -1);

	}

	@Test
	public void testGetDimension() throws Exception {
		Dimension d = new Dimension(25, 32);
		l.setDimension(d);
		assertSame("The dimension should have been modified", d, l.getDimension());
	}

}
