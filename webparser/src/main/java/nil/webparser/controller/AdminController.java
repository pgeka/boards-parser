package nil.webparser.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AdminController {
    @GetMapping(value = "/admin", consumes = MediaType.APPLICATION_JSON_VALUE)
    private String welcome() {
        return "admin role access";
    }
}
