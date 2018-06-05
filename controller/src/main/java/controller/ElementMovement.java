package controller;

import model.IMobile;
import model.IModel;

public class ElementMovement {

	private static ElementMovement mov;
	private IModel model;

	public static ElementMovement getMov() {
		return mov;
	}

	public static void init(IModel model) {
		mov = new ElementMovement(model);
	}

	private ElementMovement(IModel model) {
		this.model = model;
	}

	boolean safeMove(IMobile mobile, int y, int x) {
		mobile.move(y, x);
		this.model.flush();
		return true;
	}

}
