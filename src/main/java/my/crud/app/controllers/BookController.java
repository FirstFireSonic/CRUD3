package my.crud.app.controllers;

import jakarta.validation.Valid;
import my.crud.app.dao.BookDAO;
import my.crud.app.models.Book;
import my.crud.app.util.BookValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookDAO bookDAO;
    private final BookValidator bookValidator;

    @Autowired
    public BookController(BookDAO bookDAO, BookValidator bookValidator) {
        this.bookDAO = bookDAO;
        this.bookValidator = bookValidator;
    }


















//    @GetMapping
//    public String index(Model model) {
//        model.addAttribute("books", bookDAO.index());
//        return "books/index";
//    }
//
//    @GetMapping("/{id}")
//    public String show(@PathVariable("id") int id, Model model) {
//        model.addAttribute("book", bookDAO.show(id));
//        return "books/show";
//    }
//
//    @GetMapping("/new")
//    public String newPerson(@ModelAttribute("book") Book book) {
//        return "books/new";
//    }
//
//    @GetMapping("/{id}/edit")
//    public String edit(@PathVariable("id") int id, Model model) {
//        model.addAttribute("book", bookDAO.show(id));
//        return "books/edit";
//    }
//
//
//    @PostMapping()
//    public String create(@ModelAttribute("book") @Valid Book book,
//                         BindingResult bindingResult) {
//        bookValidator.validate(book, bindingResult);
//        if (bindingResult.hasErrors()) {
//            return "books/new";
//        }
//        bookDAO.save(book);
//        return "redirect:/books";
//    }
//
//    @PatchMapping("/{id}")
//    public String update(@ModelAttribute("book") @Valid Book book,
//                         BindingResult bindingResult,
//                         @PathVariable("id") int id) {
//        bookValidator.validate(book, bindingResult);
//
//        if (bindingResult.hasErrors()) {
//            return "books/edit";
//        }
//        bookDAO.update(id, book);
//        return "redirect:/books";
//    }
//
//    @DeleteMapping("/{id}")
//    public String delete(@PathVariable("id") int id) {
//        bookDAO.delete(id);
//        return "redirect:/books";
//    }
}
