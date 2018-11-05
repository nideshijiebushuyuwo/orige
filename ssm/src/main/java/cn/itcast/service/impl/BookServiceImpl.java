package cn.itcast.service.impl;

import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import cn.itcast.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public List<Book> findBook() {

        return bookDao.findBook();
    }

    @Override
    public void saveBook(Book book) {

        bookDao.saveBook(book);
    }

}
