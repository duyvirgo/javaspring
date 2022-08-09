package fa.training.bfams.service;

import java.util.List;

import fa.training.bfams.entity.Book;

public interface BookService {
	public Book addBook(Book book);
	
	public void deleteBookById(Long id);
	
	public Book editBook(Book book);
	
	public List<Book> findAllBook();
	
	public Book findBookById(Long id);

	Book findBookByIdBook(Long id);
	
}	
