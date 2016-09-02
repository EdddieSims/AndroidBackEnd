package driver.repositories;

import driver.domain.Race;
import driver.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Edmund.Simons on 2016/06/04.
 */
public interface RaceRepository extends CrudRepository<Race, Long>
{
}
