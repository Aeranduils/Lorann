package Mock;

import controller.IController;
import model.IModel;
import view.Order;

public class ControllerMock implements IController {

	Order o;

	public void orderPerform(Order order) {
		this.o = order;
	}

	public Order getLastOrder() {
		return o;
	}

	@Override
	public void setModel(IModel model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

}
