package cn.itcast.dao;

import cn.itcast.domain.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {
    @Select("select * from book")
    List<Book> findBook();

    @Insert("insert into book values(null,#{bookName},#{kind_id},#{author},#{company},#{price}) ")
    void saveBook(Book book);

}
