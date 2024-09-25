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
 * Some additional tests from SamR.
 *
 * @author Samuel A. Rebelsky
 */
public class TestsFromSam {
  /**
   * A simple test.
   */
  @Test
  public void testSetAndGet() throws Exception {
    AssociativeArray<String, String> aa = 
        new AssociativeArray<String, String>();
    aa.set("a", "aardvark");
    assertEquals("aardvark", aa.get("a"), "M: We can get what we just set");
  } // testSetAndGet()
} // class TestsFromSam
