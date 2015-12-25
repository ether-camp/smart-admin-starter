package camp.ether.sa.starter.controllers.api;

import camp.ether.sa.starter.controllers.StubController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @author Mikhail Kalinin
 * @since 24.12.2015
 */
@RestController
@RequestMapping("/inbox")
public class InboxController extends StubController {

    @RequestMapping
    public String get() throws IOException, URISyntaxException {
        return renderFile("inbox.json");
    }
}
