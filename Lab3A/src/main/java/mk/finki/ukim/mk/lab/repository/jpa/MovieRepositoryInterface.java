package mk.finki.ukim.mk.lab.repository.jpa;

import mk.finki.ukim.mk.lab.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface MovieRepositoryInterface extends JpaRepository<Movie,Long> {
    List<Movie> findByTitleContainingOrSummaryContaining(String title, String summary);
    List<Movie> findByRatingGreaterThanEqual(Double rating);
    List<Movie> findByTitleContainingOrSummaryContainingAndRatingGreaterThanEqual(String title, String summary, Double rating);

}
