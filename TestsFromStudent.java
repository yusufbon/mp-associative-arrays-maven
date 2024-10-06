package edu.grinnell.csc207;

import edu.grinnell.csc207.util.AssociativeArray;
import edu.grinnell.csc207.util.NullKeyException;
import edu.grinnell.csc207.util.KeyNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Bonsen Yusuf
 */
public class TestsFromStudent {
  /**
   * A simple test.
   */
  @Test
  public void alwaysPass() throws Exception {
  } // alwaysPass()



/**
   * Test sto see if the overwiting behavior in AssociativeArray.java works correctly.
   */
  @Test
public void yusufBonsenTest1() throws Exception {
    AssociativeArray<String, String> aa = new AssociativeArray<String, String>();
   
    // Set an initial key-value pair.
    aa.set("banana", "yellow");
    assertEquals("yellow", aa.get("banana"), "The initial value for 'banana' should be 'yellow'.");
   
    // Overwrite the value for the same key.
    aa.set("banana", "minion");
    assertEquals("minion", aa.get("banana"), "After overwriting, the value for 'banana' should be 'minion'.");
} // yusufBonsenTest1()


/**
     * Test that sets and gets multiple key-value pairs of brother/bro and sister/sis.
     */
    @Test
    public void yusufBonsenTest2() throws Exception {
        AssociativeArray<String, String> aa = new AssociativeArray<String, String>();
        aa.set("brother", "bro");
        aa.set("sister", "sis");
        assertEquals("bro", aa.get("brother"), "We can get the value for 'brother'.");
        assertEquals("sis", aa.get("sister"), "We can get the value for 'sister'.");
    } //yusufBonsenTest2()

/**
   * Test setting a key with an empty string and retrieving its value. This is an edge case test.
   */
  @Test
  public void yusufBonsenTest3() throws Exception {
    AssociativeArray<String, String> aa = new AssociativeArray<>();
    aa.set("", "emptyKey");

    assertEquals("emptyKey", aa.get(""), "Test3: Expecting 'emptyKey' for an empty string key");
  }//yusufBonsenTest3()

} // class TestsFromStudent


