package driver.repositories;

import driver.domain.Car;
import driver.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Edmund.Simons on 2016/04/21.
 */
public interface CarRepository extends CrudRepository<Car, Long>
{
}
