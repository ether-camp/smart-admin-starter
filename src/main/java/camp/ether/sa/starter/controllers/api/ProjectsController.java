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
@RequestMapping
public class ProjectsController extends StubController {

    @RequestMapping("/projects")
    public String index() throws IOException, URISyntaxException {
        return renderFile("projects.json");
    }

    @RequestMapping("/project-list")
    public String list() throws IOException, URISyntaxException {
        return renderFile("project-list.json");
    }
}
