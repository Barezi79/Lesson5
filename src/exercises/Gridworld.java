package exercises;

import java.awt.Color;

import java.util.Random;
import info.gridworld.grid.Location;
import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
/* 
 * Use the Gridworld Reference document in the "doc" directory to complete the following tasks;
 * 
 * 1. Figure out how to get the World to show.
 * 2. Figure out how to add a Bug to the world (clue: you will need the Bug and Location objects)
 * 3. Add another bug at a random location in the world.
 * 4. Change the color of that bug to blue.
 * 5. Make the bug face to the right.
 * 6. Add flowers to the left and right of the bug.
 * 7. Fill the whole world with flowers!
*/
public class Gridworld {
	public static void main(String[] args) {
		
		ActorWorld world = new ActorWorld();
		Grid<Actor> theGrid = world.getGrid();
		int numRows = theGrid.getNumRows();
		int numCols = theGrid.getNumCols();

		world.show();
		
		Location L1 = new Location(0, 0);
		Bug B1 = new Bug();
		world.add(L1, B1);

		int randomX = new Random().nextInt(numRows);
		int randomY = new Random().nextInt(numCols - 2) + 1;
		Location L2 = new Location(randomX, randomY);
		System.out.println("Coordinates of random location are: " + randomX + " , " + randomY + ".");
		Bug B2 = new Bug();
		world.add(L2, B2);

		B2.setColor(Color.YELLOW);

		B2.turn();
		B2.turn();
		
		Location L3 = new Location(randomX, randomY - 1);
		Flower F1 = new Flower();
		world.add(L3, F1);

		Location L4 = new Location(randomX, randomY + 1);
		Flower F2 = new Flower();
		world.add(L4, F2);
		
		int occupiedLocations = theGrid.getOccupiedLocations().size();
		int emptyLocations = (numRows * numCols) - occupiedLocations;
		System.out.println("There are: " + emptyLocations + " empty locations left.");

		for (int i = 0; i < emptyLocations; i++) {
			Flower F3 = new Flower();
			F3.setColor(Color.GREEN);
			world.add(world.getRandomEmptyLocation(), F3);
		}
		
	}
} 


