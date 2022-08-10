package fa.training.bfams.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fa.training.bfams.entity.Book;
import fa.training.bfams.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@GetMapping
	public List<Book> findAll() {
		return bookService.findAllBook();
	}
	
	@PostMapping
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	
	@GetMapping(value = "/{id}")
	public Book findById(@PathVariable("id") Long id) {
		return bookService.findBookByIdBook(id);
	}
	
	@DeleteMapping(value = "/{id}")
	public void removeById(@PathVariable("id") Long id) {
		bookService.deleteBookById(id);
	}
	
	@PutMapping
	public Book editBook(@RequestBody Book book) {
		return bookService.editBook(book);
	}
}
