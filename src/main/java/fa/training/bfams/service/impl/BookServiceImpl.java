package fa.training.bfams.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.training.bfams.entity.Book;
import fa.training.bfams.repository.BookRepository;
import fa.training.bfams.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book addBook(Book book) {
		return bookRepository.save(book);	
	}

	@Override
	public void deleteBookById(Long id) {
		bookRepository.deleteById(id);
	}

	@Override
	public Book editBook(Book book) {
		Book bookToEdit = findBookById(book.getId());
		
		if (bookToEdit != null) {
			return bookRepository.saveAndFlush(book);
		} else {
			return addBook(book);
		}
		
	}

	@Override
	public List<Book> findAllBook() {
		return bookRepository.findAll();
	}

	@Override
	public Book findBookByIdBook(Long id) {
		return bookRepository.findById(id).get();
	}

	
	
	
	public BookRepository getBookRepository() {
		return bookRepository;
	}

	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public Book findBookById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
