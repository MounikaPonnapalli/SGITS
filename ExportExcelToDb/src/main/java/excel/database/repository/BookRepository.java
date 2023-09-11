package excel.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import excel.database.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Long>
{

}
