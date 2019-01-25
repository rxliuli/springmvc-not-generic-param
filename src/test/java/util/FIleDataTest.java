package util;

import org.junit.Test;

import java.io.File;

/**
 * @author rxliuli
 */
public class FIleDataTest {
    @Test
    public void testFile() {
        final File file = new File("./");
        System.out.println(file);
    }
}
