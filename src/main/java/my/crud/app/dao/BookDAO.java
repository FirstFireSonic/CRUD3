package my.crud.app.dao;

import my.crud.app.models.Book;
import my.crud.app.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
























//    public List<Person> index() {
//        return jdbcTemplate.query("SELECT * FROM Book",
//                new BeanPropertyRowMapper<>(Person.class));
//    }
//
//    public Book show(int id) {
//        return jdbcTemplate.query("SELECT * FROM Book WHERE id=?",
//                        new Object[]{id},
//                        new BeanPropertyRowMapper<>(Book.class))
//                .stream()
//                .findAny()
//                .orElse(null);
//    }
//
//    public Optional<Book> show(String title) {
//        return jdbcTemplate.query("SELECT * FROM Book WHERE title=?",
//                        new Object[]{title},
//                        new BeanPropertyRowMapper<>(Book.class))
//                .stream()
//                .findAny();
//    }
//
//    public void save(Book book) {
//        jdbcTemplate.update("INSERT INTO Person(title, author, year) VALUES(?, ?, ?)",
//                book.getTitle(),
//                book.getAuthor(),
//                book.getYear());
//    }
//
//    public void update(int id, Book updatedBook) {
//        jdbcTemplate.update("UPDATE Book SET title=?, author=?, year=? WHERE id=?",
//                updatedBook.getTitle(),
//                updatedBook.getAuthor(),
//                updatedBook.getYear(),
//                id);
//    }
//
//    public void delete(int id) {
//        jdbcTemplate.update("DELETE FROM Book WHERE id=?", id);
//    }
}
