
package SecondaryMapConstructorInject;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Integer bookId() {
        return 101;
    }

    @Bean
    public String title() {
        return "Java";
    }

    @Bean
    public Integer authorId() {
        return 1;
    }

    @Bean
    public String authorName() {
        return "Ruturaj";
    }

    @Bean
    public Book book() {
        return new Book(bookId(), title());
    }

    @Bean
    public Author author() {
        return new Author(authorId(), authorName());
    }

    @Bean
    public BookAutherMap Library() {
        Map<Book, Author> map = new HashMap<>();

        map.put(book(), author());

        return new BookAutherMap(map);
    }
}
