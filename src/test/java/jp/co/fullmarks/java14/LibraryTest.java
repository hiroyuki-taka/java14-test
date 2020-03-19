/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jp.co.fullmarks.java14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibraryTest {
    Library library;

    @BeforeEach
    public void setup() {
        library = new Library();

    }

    @Test
    void isNumberInteger() {
        assertTrue(library.isInteger(5) == 5);
        assertTrue(library.isInteger("6") == null);
    }
}
