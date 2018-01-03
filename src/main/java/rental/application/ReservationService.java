package rental.application;

import rental.model.book.Book;
import rental.model.book.BookRepository;
import rental.model.貸出.状態遷移;
import rental.model.貸出.貸出イベントタイプ;
import rental.model.貸出.貸出ステータスタイプ;

public class ReservationService {

    BookRepository bookRepository;
    状態遷移 状態遷移 = new 状態遷移();

    void reserve(Book book) {
        // 状態のチェック
        貸出ステータスタイプ status = bookRepository.status(book);

        状態遷移.ensureStatus(貸出イベントタイプ.返却, status);

    }
}
