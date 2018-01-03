package rental.model.book;

import java.util.Collections;
import java.util.List;

public class BookSummaries {
    final List<BookSummary> values;

    public BookSummaries(List<BookSummary> values) {
        this.values = values;
    }

    public List<BookSummary> list() {
        return Collections.unmodifiableList(values);
    }

    @Override
    public String toString() {
        return "BookSummaries{" +
                "values=" + values +
                '}';
    }
}
