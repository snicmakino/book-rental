package rental.application;

import org.springframework.beans.factory.annotation.Autowired;
import rental.model.book.*;
import rental.model.search.Criteria;
import rental.model.search.Keyword;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    @Autowired
    BookRepository bookRepository;

    public BookSummaries all() {
        return bookRepository.list();
    }

    BookSummary findForKeyword(Keyword keyword) {
        return null;
    }

    BookSummary findByTitle(Title title) {
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
