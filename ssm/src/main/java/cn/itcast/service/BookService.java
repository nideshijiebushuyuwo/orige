package cn.itcast.service;

import cn.itcast.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> findBook();
    void saveBook(Book book);
}
