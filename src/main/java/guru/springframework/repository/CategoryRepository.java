package guru.springframework.repository;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by: Nick N  9/16/23
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
	Optional<Category> findByDescription(String description);
}
