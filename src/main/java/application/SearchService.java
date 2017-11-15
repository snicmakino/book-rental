package application;

import model.book.Author;
import model.book.BookSummary;
import model.book.BookTitle;
import model.search.Criteria;
import model.search.Keyword;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    BookSummary all() {
        return null;
    }

    BookSummary findForKeyword(Keyword keyword) {
        return null;
    }

    BookSummary findByTitle(BookTitle bookTitle) {
        return null;
    }

    BookSummary findByRentable() {
        return null;
    }

    BookSummary findByAuthor(Author author) {
        return null;
    }

    BookSummary findByCriteria(Criteria criteria) {
        return null;
    }
}
