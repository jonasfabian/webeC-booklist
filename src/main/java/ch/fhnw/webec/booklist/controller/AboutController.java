package ch.fhnw.webec.booklist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AboutController {
    @ResponseBody
    @GetMapping("/about")
    // Does basically the same as @GetMapping("/about")
    // @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about() {
        // language=HTML
        return """
                <div>Hello Guys!</div>
                """;
    }
}
