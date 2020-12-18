package controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.fail;


public class ConsoleTest {

    private Scanner scanner;
    private int number;


    @Before
    public void initScanner() {
     this.scanner = new Scanner(System.in);
    }


    @Test
    public void testGetNumberFromUserWhenExepIsCaughtThenReturnFalse() throws NumberFormatException {

        try {
            //put the code here (from the Console class).
            //todo get this method done
            
            fail();
        } catch (NumberFormatException ex) {
            Assert.assertEquals("The value should be integer", ex.getMessage());
        }
    }


}
