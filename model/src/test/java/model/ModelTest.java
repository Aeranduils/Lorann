package model;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Observable;
import java.util.Observer;

import org.junit.Before;
import org.junit.Test;

import Mocks.ModelMock;

public class ModelTest implements Observer {

	Model m;
	boolean notified = false;

	@Before
	public void setUp() throws Exception {
		m = new ModelMock();
	}

	@Test
	public void testLoadTuto1ShouldCreateTheLevel() throws Exception {
		m.loadLevel();
		assertNotNull("The Level shouldn't be null after the creation", m.getLevel());

		assertTrue("The Lorann should be alive at start", m.getLevel().getLorann().isAlive());

	}

	@Override
	public void update(Observable observable, Object o) {
		notified = true;

	}

	@Test
	public void testFlush() throws Exception {
		m.addObserver(this);
		assertFalse("Need only to notify after have flushed", notified);

		m.flush();
		assertTrue("Need to notify after flush", notified);

	}

	@Test
	public void testGetObservableIsNotNull() throws Exception {
		assertNotNull("The observable can't be null", m.getObservable());
	}

	@Test
	public void testGetLorannIsNotNull() throws Exception {
		assertNotNull("The Lorann can't be null", m.getLorann());
	}

	@Test
	public void testGetElement() throws Exception {
		m.loadLevel();
		assertArrayEquals("Should return elements of the level", m.getElements(), m.getLevel().getElements());

	}

}
