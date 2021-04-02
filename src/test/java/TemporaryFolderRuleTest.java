import static org.junit.Assert.assertTrue;

import java.io.File;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class TemporaryFolderRuleTest {
    @Rule public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test public void testFile() throws Exception {
        File testFolder = tempFolder.newFolder("TestFolder");
        File testFile = tempFolder.newFile("test.txt");
        assertTrue(testFolder.exists());
        assertTrue(testFile.exists());
        //Do something else...
    }
}
