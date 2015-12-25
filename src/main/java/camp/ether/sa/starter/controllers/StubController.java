package camp.ether.sa.starter.controllers;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Mikhail Kalinin
 * @since 24.12.2015
 */
public abstract class StubController {

    protected String renderFile(String filename) throws URISyntaxException, IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(ClassLoader.getSystemResource("stub/" + filename).toURI()));
        return new String(encoded, "UTF-8");
    }
}
