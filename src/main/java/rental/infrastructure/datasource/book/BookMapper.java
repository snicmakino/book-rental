package rental.infrastructure.datasource.book;

import org.apache.ibatis.annotations.Mapper;
import rental.model.book.BookSummary;

import java.util.List;

@Mapper
public interface BookMapper {

    List<BookSummary> list();
}
