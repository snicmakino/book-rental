package rental.presentation.controller.book;

import rental.application.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rental.model.book.BookSummaries;

@Controller
@RequestMapping("books")
class IndexController {

    @Autowired
    SearchService searchService;

    @ModelAttribute("books")
    BookSummaries books() {
        return searchService.all();
    }

    @GetMapping(value = "")
    String index() {
        return "book/index";
    }
}
