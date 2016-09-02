package driver.services.Impl;

import driver.domain.Track;
import driver.repositories.TrackRepository;
import driver.services.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Edmund.Simons on 2016/08/10.
 */
@Service
public class TrackServiceImpl implements TrackService
{
    @Autowired
    private TrackRepository repository;

    public Track findById(Long aLong) {
        return null;
    }

    public Track save(Track entity) {
        return null;
    }

    public Track update(Track entity) {
        return null;
    }

    public void delete(Track entity) {

    }

    public List<Track> findAll() {
        return null;
    }
}
