package controller;

import model.ILevel;
import model.IModel;
import model.Movement;
import view.IView;
import view.Order;

/**
 * 
 * @author flori
 *
 */
public class Controller implements IController {

	private IView view;

	private IModel model;

	private GameLoop loop;

	/**
	 * The Controller of the game
	 * 
	 * @param view
	 * @param model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
		ElementMovement.init(this.model);
		MobileMovement.init(this.model);

	}

	/**
	 * Instanciate the game Loop and load the map
	 */
	public void start() {
		this.model.loadLevel(1);
		this.model.getObservable().addObserver(this.view.getObserver());
		this.loop = new GameLoop(this);
		this.loop.start();
		this.view.openFrame();

	}

	/**
	 * Update
	 */
	public void update() {
		ILevel level = this.model.getLevel();
		this.model.flush();
	}

	/**
	 * Get the view
	 * 
	 * @return view
	 */
	public IView getView() {
		return this.view;
	}

	/**
	 * Order of the player
	 */
	public void orderPerform(Order order) {
		MobileMovement mm = MobileMovement.getMov();

		switch (order) {
		case UP:
			mm.move(Movement.UP);
			System.out.println("Up");
			break;
		case DOWN:

			mm.move(Movement.DOWN);
			System.out.println("Down");
			break;
		case LEFT:

			mm.move(Movement.LEFT);
			System.out.println("Left");
			break;
		case RIGHT:

			mm.move(Movement.RIGHT);
			System.out.println("Right");
			break;
		case SPELL:
			break;
		case DIAGTOPLEFT:

			mm.move(Movement.DIAGTOPLEFT);
			System.out.println("DiagTopLeft");
			break;
		case DIAGTOPRIGHT:

			mm.move(Movement.DIAGTOPRIGHT);
			System.out.println("DiagTopRight");
			break;
		case DIAGBOTLEFT:

			System.out.println("DiagBotLeft");
			mm.move(Movement.DIAGBOTLEFT);
			break;
		case DIAGBOTRIGHT:

			System.out.println("DiagBotRight");
			mm.move(Movement.DIAGBOTRIGHT);
			break;
		default:
			System.out.println("Not supported order : " + order.toString());
			break;
		}
		this.model.flush();

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
	 * Set the View of the game
	 * 
	 * @param view
	 */

	public void setView(final IView view) {
		this.view = view;
	}

	/**
	 * Set the Lorann Model of the game
	 * 
	 * @param model
	 */

	public void setModel(IModel model) {
		this.model = model;

	}

}
