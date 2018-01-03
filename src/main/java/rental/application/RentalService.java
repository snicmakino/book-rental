package rental.application;

import rental.model.book.Book;
import rental.model.user.User;
import rental.model.貸出.貸出イベント;
import rental.model.貸出.貸出イベントタイプ;
import rental.model.貸出.貸出イベントリポジトリ;
import org.springframework.beans.factory.annotation.Autowired;

public class RentalService {

    @Autowired
    貸出イベントリポジトリ リポジトリ;

    void 貸出(Book book,User user) {
        record(貸出イベントタイプ.貸出, book, user);
    }

    void 返却(Book book, User user) {
        record(貸出イベントタイプ.返却, book, user);
    }

    private void record(貸出イベントタイプ 貸出イベントタイプ, Book book, User user) {
        貸出イベント 貸出イベント = 貸出イベントタイプ.generate(book, user);
        リポジトリ.record(貸出イベント);
    }
}
