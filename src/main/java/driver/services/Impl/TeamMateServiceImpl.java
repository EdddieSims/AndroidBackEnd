package driver.services.Impl;

import driver.domain.TeamMate;
import driver.repositories.TeamMateRepository;
import driver.services.TeamMateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Edmund.Simons on 2016/08/10.
 */
@Service
public class TeamMateServiceImpl implements TeamMateService
{
    @Autowired
    private TeamMateRepository repository;

    public TeamMate findById(Long aLong) {
        return null;
    }

    public TeamMate save(TeamMate entity) {
        return null;
    }

    public TeamMate update(TeamMate entity) {
        return null;
    }

    public void delete(TeamMate entity) {

    }

    public List<TeamMate> findAll() {
        return null;
    }
}
