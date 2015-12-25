package camp.ether.sa.starter.controllers.api;

import camp.ether.sa.starter.controllers.StubController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @author Mikhail Kalinin
 * @since 24.12.2015
 */
@RestController
@RequestMapping
public class LanguagesController extends StubController {

    @RequestMapping("/languages")
    public String index() throws IOException, URISyntaxException {
        return renderFile("languages.json");
    }

    @RequestMapping("/langs/{id}")
    public String get(@PathVariable("id") String id) throws IOException, URISyntaxException {
        return renderFile("langs/" + id + ".json");
    }
}
