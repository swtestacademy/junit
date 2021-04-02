import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Junit4Assertions {

    @Test
    public void T01_assertionExamples() {

        //1)assertEquals
        //Parameters: "message", expected, actual

        //Text Comparison Example
        assertEquals("Text comparison failed!", "Test Text", "Test Text");

        //Computation Comparison
        assertEquals("Computation comparison failed!", 9, 3 + 6);

        //Boolean Comparison
        //3<5 is true and comparison of true==true is true so it will not assert anything.
        assertEquals("Boolean comparison is not Passed!", true, 3 < 5);

        //----------------------------------------------------------------------------------

        //2)assertTrue
        //Parameters: "message", boolean condition
        //If the condition is true, do not assert anything!
        assertTrue("Boolean condition is not TRUE! Pls check it!", 3 < 5);

        //----------------------------------------------------------------------------------

        //3)assertFalse
        //Parameters: "message", boolean condition
        //If the condition is false, do not assert anything!
        assertFalse("Boolean condition is not FALSE! Pls check it!", 3 > 5);

        //----------------------------------------------------------------------------------

        //4)assertNull
        //Parameters: "message", object
        //If object is null, do not assert anything! If it is not null, assert an error message.
        String testObj1 = null;
        assertNull("testObj1 is not null! Pls Check it!", testObj1);

        //----------------------------------------------------------------------------------

        //5)assertNotNull
        //Parameters: "message", object
        //If object is not null, do not assert anything! If it is null, assert an error message.
        String testObj2 = new String("test");
        assertNotNull("testObj2 is null! Pls Check it!", testObj2);

        //----------------------------------------------------------------------------------

        //6)assertSame
        //Parameters: "message", expected, actual
        //If two objects refer to the same object, do not assert anything! If it is not, assert an error message.
        String str1 = "SAME";
        String str2 = "SAME";
        assertSame("Two objects do not refer to the same object!", str1, str2);

        //----------------------------------------------------------------------------------

        //7)assertNotSame
        //Parameters: "message", expected, actual
        //If two objects do not refer to the same object, do not assert anything! If it is not, assert an error message.
        String str3 = "SAME";
        String str4 = "NOT SAME";
        assertNotSame("Two objects refer to the same object!", str3, str4);
    }
}