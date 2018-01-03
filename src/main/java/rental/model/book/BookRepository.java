package rental.model.book;

import rental.model.貸出.貸出ステータスタイプ;

public interface BookRepository {
    貸出ステータスタイプ status(Book book);
    BookSummaries list();
}
