package ch.fhnw.webec.booklist.controller;

import ch.fhnw.webec.booklist.service.BookService;

// TODO Add an annotation to make this a Controller component
public class BookController {
    // TODO Add an annotation to tell Spring that you want the value of this property to be injected
    private BookService bookService;

    // TODO Add a RequestMapping for GET requests to /
    // TODO Add the ResponseBody annotation to be able to return the HTML response directly as a String
    public String index() {
        // TODO Use this.bookService.findAll().get(0) to get the first book in the list

        // language=HTML
        return String.format(
            """
            <!-- TODO Write your HTML here -->
            """
            // TODO Pass the book title (<h1>) and description (<p>) to the view and render them as HTML, see the Controller example in the slides
        );
    }
}
