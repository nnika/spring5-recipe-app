package guru.springframework.repository;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by: Nick N  9/16/23
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
