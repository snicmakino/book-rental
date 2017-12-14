package model.book;

import model.貸出.貸出ステータスタイプ;

public interface BookRepository {
    貸出ステータスタイプ status(Book book);
}
