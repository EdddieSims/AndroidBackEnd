package driver.repositories;

import driver.domain.Standings;
import driver.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Edmund.Simons on 2016/04/22.
 */
public interface StandingsRepository extends CrudRepository<Standings, Long>
{
}
