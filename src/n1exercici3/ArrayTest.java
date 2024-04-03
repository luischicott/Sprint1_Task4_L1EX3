package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTest {
	
	@Test
    public void testArray() {
        Array arrayOne = new Array();  
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            arrayOne.elementArray();
        });
    }

}
