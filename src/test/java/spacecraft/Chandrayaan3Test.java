package spacecraft;

import org.junit.Test;
import static org.junit.Assert.*;
public class Chandrayaan3Test {
	@Test 
	public void testInitialization() {
		Chandrayaan3 spacecraft = new Chandrayaan3(0,0,0,Direction.NORTH);
        assertEquals(0, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals(Direction.NORTH, spacecraft.getDirection());

	}
	
	//test to move forward
	@Test
	public void testMoveForward() {
	    Chandrayaan3 spacecraft = new Chandrayaan3(0, 0, 0, Direction.NORTH);
	    spacecraft.moveForward();
	    
	    assertEquals(0, spacecraft.getX());
	    assertEquals(1, spacecraft.getY());
	    assertEquals(0, spacecraft.getZ());
	    assertEquals(Direction.NORTH,spacecraft.getDirection());
	}
	
	@Test
	public void testMoveRight() {
		Chandrayaan3 spacecraft = new Chandrayaan3(0, 1, 0, Direction.NORTH);
	    spacecraft.moveRight();
	    
	    assertEquals(0, spacecraft.getX());
	    assertEquals(1, spacecraft.getY());
	    assertEquals(0, spacecraft.getZ());
	    assertEquals(Direction.EAST,spacecraft.getDirection());
	}
	
	@Test
	public void testMoveUp() {
		Chandrayaan3 spacecraft = new Chandrayaan3(0, 1, 0, Direction.UP);
	    spacecraft.moveUp();
	    
	    assertEquals(0, spacecraft.getX());
	    assertEquals(1, spacecraft.getY());
	    assertEquals(0, spacecraft.getZ());
	    assertEquals(Direction.UP,spacecraft.getDirection());
	}
	
	@Test 
	public void testMoveBackward() {
		Chandrayaan3 spacecraft = new Chandrayaan3(0, 1, 0, Direction.UP);
	    spacecraft.moveBackward();
	    
	    assertEquals(0, spacecraft.getX());
	    assertEquals(1, spacecraft.getY());
	    assertEquals(-1, spacecraft.getZ());
	    assertEquals(Direction.UP,spacecraft.getDirection());
	}
	
	
	@Test 
	public void testMoveLeft() {
		Chandrayaan3 spacecraft = new Chandrayaan3(0, 1, -1, Direction.UP);
	    spacecraft.moveLeft();
	    
	    assertEquals(0, spacecraft.getX());
	    assertEquals(1, spacecraft.getY());
	    assertEquals(-1, spacecraft.getZ());
	    assertEquals(Direction.WEST,spacecraft.getDirection());
	}
	
	
	@Test 
	public void testMoveDown() {
		Chandrayaan3 spacecraft = new Chandrayaan3(0, 1, -1, Direction.UP);
	    spacecraft.moveDown();
	    
	    assertEquals(0, spacecraft.getX());
	    assertEquals(1, spacecraft.getY());
	    assertEquals(-1, spacecraft.getZ());
	    assertEquals(Direction.DOWN,spacecraft.getDirection());

	}

}
