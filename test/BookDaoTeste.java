import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class BookDAOTest {

    private final BookDAO bookDAO = new BookDAO();

    @Test
    public void testAddBook() {
        Book book = new Book(0, "O Hobbit", "J.R.R. Tolkien", 1937);
        bookDAO.addBook(book);
        assertNotEquals(0, book.getId());  // O id deve ser gerado automaticamente
    }

    @Test
    public void testListBooks() {
        List<Book> books = bookDAO.listBooks();
        assertTrue(books.size() > 0);  // Deve haver pelo menos 1 livro
    }

    @Test
    public void testUpdateBook() {
        Book book = new Book(1, "1984", "George Orwell", 1949);
        bookDAO.updateBook(book);
        Book updatedBook = bookDAO.listBooks().get(0);
        assertEquals("1984", updatedBook.getTitle());
    }

    @Test
    public void testDeleteBook() {
        Book book = new Book(2, "Remover este livro", "Autor", 2000);
        bookDAO.addBook(book);
        bookDAO.deleteBook(book.getId());
        List<Book> books = bookDAO.listBooks();
        assertFalse(books.contains(book));
    }
}
