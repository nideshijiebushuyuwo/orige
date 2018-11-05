package cn.itcast.controller;

import cn.itcast.domain.Book;
import cn.itcast.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/findBook")
    public String findBook(Model model){
        List<Book> book = bookService.findBook();
        model.addAttribute("list",book);
        return "success";
    }
    @RequestMapping("/savaBook")
    public void savaBook(Book book, HttpServletResponse response,HttpServletRequest request) throws IOException {
        bookService.saveBook(book);
        response.sendRedirect(request.getContextPath()+"/book/findBook");
        return;
    }

}
