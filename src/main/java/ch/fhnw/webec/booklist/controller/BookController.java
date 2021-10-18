package ch.fhnw.webec.booklist.controller;

import ch.fhnw.webec.booklist.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @ResponseBody
    @GetMapping("/")
    public String index() {
        var book = this.bookService.findAll().get(0);
        // language=HTML
        return String.format(
                """
                        <h1>%s</h1>
                        <p>%s</p>
                        """,
                book.getTitle(),
                book.getDescription()
        );
    }
}
