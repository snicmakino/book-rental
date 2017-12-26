package model.貸出;

import model.book.Book;
import model.user.User;

public enum 貸出イベントタイプ {
    棚卸,
    貸出,
    貸出の失敗,
    返却期限が近付いた時の通知,
    期限切れ,
    延長,
    返却;

    public 貸出イベント generate(Book book, User user) {
        return new 貸出イベント(book, user, this);
    }
}
