package spacecraft;

import org.junit.Test;

public class Chandrayaan3Test {
	@Test 
	public void testInitialization() {
		Chandrayaan3 spacecraft = new Chandrayaan(0,0,0,Direction.NORTH);
        assertEquals(0, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals(Direction.NORTH, spacecraft.getDirection());

	}
}
