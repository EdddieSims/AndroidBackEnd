package driver.services.Impl;

import driver.domain.Race;
import driver.repositories.RaceRepository;
import driver.services.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Edmund.Simons on 2016/08/10.
 */
@Service
public class RaceServiceImpl implements RaceService
{
    @Autowired
    private RaceRepository repository;

    public Race findById(Long aLong) {
        return null;
    }

    public Race save(Race entity) {
        return null;
    }

    public Race update(Race entity) {
        return null;
    }

    public void delete(Race entity) {

    }

    public List<Race> findAll() {
        return null;
    }
}
