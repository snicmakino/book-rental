package application;

import model.book.Book;
import model.book.BookRepository;
import model.�ݏo.��ԑJ��;
import model.�ݏo.�ݏo�C�x���g�^�C�v;
import model.�ݏo.�ݏo�X�e�[�^�X�^�C�v;

import java.util.Set;

public class ReservationService {

    BookRepository bookRepository;
    ��ԑJ�� ��ԑJ�� = new ��ԑJ��();

    void reserve(Book book) {
        // ��Ԃ̃`�F�b�N
        �ݏo�X�e�[�^�X�^�C�v status = bookRepository.status(book);

        ��ԑJ��.ensureStatus(�ݏo�C�x���g�^�C�v.�\��, status);

    }
}
