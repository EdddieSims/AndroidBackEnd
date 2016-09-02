package driver.api;

import driver.domain.Car;
import driver.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Edmund.Simons on 2016/08/23.
 */
@RestController
@RequestMapping("/api/**")
public class CarAPI
{
    @Autowired
    private CarService service;

    //-------------------Retrieve All Cars--------------------------------------------------------

    @RequestMapping(value = "/car/", method = RequestMethod.GET)
    public ResponseEntity<List<Car>> listAllCars()
    {
        List<Car> cars = service.findAll();
        if(cars.isEmpty())
        {
            return new ResponseEntity<List<Car>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Car>>(cars, HttpStatus.OK);
    }

}
