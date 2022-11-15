package com.javatpoint;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AirplaneController 
{
@Autowired
private IAirplaneService airplaneService;
//mapping the getProduct() method to /product
@GetMapping(value = "/airplanes")
public List<Airplane> getAirplanes() 
{
//finds all the products
List<Airplane> airplanes = airplaneService.findAllAirplanes();
//returns the product list
return airplanes;
}

@GetMapping(value = "/airplanes/{id}")
public Airplane getAirplaneById(@PathVariable int id) {
    Airplane airplane = airplaneService.findByAirplaneId(id);
    return airplane;
}

}
