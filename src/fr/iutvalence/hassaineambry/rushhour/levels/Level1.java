package fr.iutvalence.hassaineambry.rushhour.levels;

import static fr.iutvalence.hassaineambry.rushhour.Color.*;
import static fr.iutvalence.hassaineambry.rushhour.Orientation.*;

import java.util.LinkedList;
import java.util.List;

import fr.iutvalence.hassaineambry.rushhour.Car;
import fr.iutvalence.hassaineambry.rushhour.Coordinate;
import fr.iutvalence.hassaineambry.rushhour.Level;

/**
* Create level one by placing car on grid.
*
* @author HASSAINE Abderrahmane/AMBRY Maxime/TP1B
* @version 1.0
*/

/**
 * Create the first level 
 */
public class Level1 implements Level 
{
	/**
	 * Create a list of cars
	 */
	@Override
	public List<Car> createCar()
	{
		final List<Car> car = new LinkedList<>();
		car.add(new Car(new Coordinate(0, 1), HORIZONTAL, 3, GREEN));
		car.add(new Car(new Coordinate(1, 3), HORIZONTAL, 2, YELLOW));
		car.add(new Car(new Coordinate(2, 0), HORIZONTAL, 3, RED));
		car.add(new Car(new Coordinate(2, 5), VERTICAL, 3, BLUE));
		car.add(new Car(new Coordinate(2, 3), VERTICAL, 3, ORANGE));
		car.add(new Car(new Coordinate(2, 4), VERTICAL, 2, PINK));
		car.add(new Car(new Coordinate(3, 1), VERTICAL, 2, LIGHT_BLUE));
		car.add(new Car(new Coordinate(5, 2), HORIZONTAL, 3, WHITE));
		return car;
	}
	
	/**
	 * Get the exit coordinate
	 */
    @Override
	public Coordinate getExit() {
        Coordinate exitCoordinate = new Coordinate(2, 5);
		return exitCoordinate;
    }
}


