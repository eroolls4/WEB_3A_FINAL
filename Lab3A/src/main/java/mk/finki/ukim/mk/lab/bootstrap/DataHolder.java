package mk.finki.ukim.mk.lab.bootstrap;

import jakarta.annotation.*;
import lombok.Getter;
import mk.finki.ukim.mk.lab.model.*;
import mk.finki.ukim.mk.lab.repository.jpa.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

import java.time.*;
import java.util.*;

@Component
@Getter
public class DataHolder {
    public static List<User> users= new ArrayList<>();
    public static List<Movie> movies= new ArrayList<>();
    public static List<Production> productions= new ArrayList<>();
    public static List<ShoppingCart> shoppingCarts= new ArrayList<>();
    public static List<TicketOrder> ticketOrders= new ArrayList<>();

    @Autowired
    private MovieRepositoryInterface movieRepositoryInterface;

//
//    @PostConstruct
//    public void init(){
//
//        User user1 = new User("user1", new UserFullname("John", "Doe"), "password1", LocalDate.of(1990, 1, 1));
//        User user2 = new User("user2", new UserFullname("Jane", "Doe"), "password2", LocalDate.of(1995, 5, 5));
//
//        // Initialize productions
//        Production production1 = new Production("Production1", "Country1", "Address1");
//        Production production2 = new Production("Production2", "Country2", "Address2");
//
//     //    Initialize movies
//        Movie movie1 = new Movie("Movie1", "Summary1", 4.5, production1);
//        Movie movie2 = new Movie("Movie2", "Summary2", 3.8, production2);
//
////        List<Movie> movies = new ArrayList<>();
////        Movie movie1=new Movie("Movie1", "Summary1", 4.5, production1);
////        Movie movie2=new Movie("Movie2", "Summary2", 3.8, production2);
//        movies.add(movie1);
//        movies.add(movie2);
////
////        // Save movies to the database
////        movieRepositoryInterface.saveAll(movies);
//
//        // Initialize shopping carts
//        ShoppingCart cart1 = new ShoppingCart(user1);
//        ShoppingCart cart2 = new ShoppingCart(user2);
//
//        // Initialize ticket orders
//        TicketOrder order1 = new TicketOrder(user1, movie1, 2L, LocalDateTime.now());
//        TicketOrder order2 = new TicketOrder(user2, movie2, 3L, LocalDateTime.now());
//
//        // Assign the initialized values to the static lists
//        DataHolder.users.addAll(Arrays.asList(user1, user2));
//        DataHolder.movies.addAll(Arrays.asList(movie1, movie2));
//        DataHolder.productions.addAll(Arrays.asList(production1, production2));
//        DataHolder.shoppingCarts.addAll(Arrays.asList(cart1, cart2));
//        DataHolder.ticketOrders.addAll(Arrays.asList(order1, order2));
//
//    }

}
