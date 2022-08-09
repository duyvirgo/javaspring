package fa.training.bfams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.training.bfams.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	

}
