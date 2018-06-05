package controller;

import model.ILorann;
import model.IModel;
import model.Movement;

public class MobileMovement {

	private static MobileMovement mov;
	private IModel model;
	private ElementMovement em;

	public static MobileMovement getMov() {
		return mov;
	}

	private MobileMovement(IModel model) {
		this.model = model;
		this.em = ElementMovement.getMov();
	}

	public static void init(IModel model) {
		mov = new MobileMovement(model);
	}

	public boolean move(Movement direction) {
		ILorann l = this.model.getLevel().getLorann();
		if (!l.isAlive()) {
			return false;
		}

		int nextX = l.getPosition().getX();
		int nextY = l.getPosition().getY();
		switch (direction) {
		case UP:
			nextX--;
			break;
		case DOWN:
			nextX++;
			break;
		case LEFT:
			nextY--;
			break;
		case RIGHT:
			nextY++;
			break;
		case DIAGTOPLEFT:
			nextX--;
			nextY--;
			break;
		case DIAGTOPRIGHT:
			nextX--;
			nextY++;
			break;
		case DIAGBOTLEFT:
			nextX++;
			nextY--;
			break;
		case DIAGBOTRIGHT:
			nextX++;
			nextY++;
		default:
			break;

		}

		l.setMovement(direction);
		return em.safeMove(l, nextY, nextX);

	}

	public void launchSpell() {
		ILorann l = this.model.getLevel().getLorann();
		int spellX = l.getPosition().getX();
		int spellY = l.getPosition().getY();
		switch (l.getDirection()) {
		case UP:
			spellY--;
			break;
		case DOWN:
			spellY++;
			break;
		case LEFT:
			spellX--;
			break;
		case RIGHT:
			spellX++;
			break;
		default:
			break;

		}
		this.model.getLevel().createSpell(spellY, spellX, l.getDirection());
		l.setSpell(false);
	}

}
