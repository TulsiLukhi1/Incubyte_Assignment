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
}
