package driver.services.Impl;

import driver.domain.Driver;
import driver.repositories.DriverRepository;
import driver.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edmund.Simons on 2016/08/10.
 */
@Service
public class DriverServiceImpl implements DriverService
{
    @Autowired
    private DriverRepository repository;

    public Driver findById(Long aLong)
    {
        return repository.findOne(aLong);
    }

    public Driver save(Driver entity)
    {
        return repository.save(entity);
    }

    public Driver update(Driver entity)
    {
        return repository.save(entity);
    }

    public void delete(Driver entity)
    {

    }

    public List<Driver> findAll()
    {
        List<Driver> allDrivers = new ArrayList<>();
        Iterable<Driver> drivers = repository.findAll();
        for(Driver driver: drivers)
        {
            allDrivers.add(driver);
        }
        return allDrivers;
    }
}
