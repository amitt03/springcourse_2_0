package springcourse.exercises.exercise4.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import springcourse.exercises.exercise4.Library;
import springcourse.exercises.exercise4.model.Book;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Amit Tal
 * @since 4/16/2014
 */
@Component
public class BookLoader {

    private Library library;

    @Autowired
    public BookLoader(Library library) {
        this.library = library;
    }

    @PostConstruct
    public void loadBooks() throws IOException {
        ClassPathResource csvResource = new ClassPathResource("books.csv");
        String line;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(csvResource.getInputStream()))) {
            while ((line = br.readLine()) != null) {
                String[] bookDetails = line.split(",");
                Book book = new Book(bookDetails[0], bookDetails[1]);
                book.setDetails(bookDetails[2]);
                library.addNewBook(book);
            }
        }
    }
}
