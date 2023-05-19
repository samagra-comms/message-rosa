package messagerosa.xml;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class XMessageParserTest {

    @Test
    void parse() throws IOException {
		try (InputStream inputStream = new FileInputStream("src/test/resources/xml/" + "testMessage.xml")) {
			assertDoesNotThrow(() -> XMessageParser.parse(inputStream));
		}
    }
}