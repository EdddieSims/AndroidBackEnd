package driver.services.Impl;

import driver.domain.Car;
import driver.repositories.CarRepository;
import driver.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Edmund.Simons on 2016/08/09.
 */
@Service
public class CarServiceImpl implements CarService
{
    @Autowired
    private CarRepository repository;

    public Car findById(Long aLong) {
        return repository.findOne(aLong);
    }

    public Car save(Car entity) {
        return null;
    }

    public Car update(Car entity) {
        return null;
    }

    public void delete(Car entity) {
    }

    public List<Car> findAll() {
        return null;
    }
}
