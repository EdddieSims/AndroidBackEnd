package driver.services.Impl;

import driver.domain.Standings;
import driver.repositories.StandingsRepository;
import driver.services.StandingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Edmund.Simons on 2016/08/10.
 */
@Service
public class StandingsServiceImpl implements StandingsService
{
    @Autowired
    private StandingsRepository repository;

    public Standings findById(Long aLong) {
        return null;
    }

    public Standings save(Standings entity) {
        return null;
    }

    public Standings update(Standings entity) {
        return null;
    }

    public void delete(Standings entity) {

    }

    public List<Standings> findAll() {
        return null;
    }
}
