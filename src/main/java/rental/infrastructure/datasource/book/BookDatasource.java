package rental.infrastructure.datasource.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import rental.model.book.Book;
import rental.model.book.BookRepository;
import rental.model.book.BookSummaries;
import rental.model.貸出.貸出ステータスタイプ;

@Repository
public class BookDatasource implements BookRepository {
    @Autowired
    BookMapper mapper;

    @Override
    public 貸出ステータスタイプ status(Book book) {
        return book.貸出ステータスタイプ();
    }

    @Override
    public BookSummaries list() {
        return new BookSummaries(mapper.list());
    }
}
