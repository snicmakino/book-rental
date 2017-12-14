package application;

import model.book.Book;
import model.book.BookRepository;
import model.貸出.状態遷移;
import model.貸出.貸出イベントタイプ;
import model.貸出.貸出ステータスタイプ;

import java.util.Set;

public class ReservationService {

    BookRepository bookRepository;
    状態遷移 状態遷移 = new 状態遷移();

    void reserve(Book book) {
        // 状態のチェック
        貸出ステータスタイプ status = bookRepository.status(book);

        状態遷移.ensureStatus(貸出イベントタイプ.予約, status);

    }
}
