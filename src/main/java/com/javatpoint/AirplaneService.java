package com.javatpoint;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class AirplaneService implements IAirplaneService  
{
@Override
public List<Airplane> findAllAirplanes()
{
//creating an object of ArrayList
ArrayList<Airplane> airplanes = new ArrayList<Airplane>();
//adding products to the List
airplanes.add(new Airplane(100, "Mobile", "CLK98123", 9000.00, 6));
airplanes.add(new Airplane(101, "Smart TV", "LGST09167", 60000.00, 3));
airplanes.add(new Airplane(102, "Washing Machine", "38753BK9", 9000.00, 7));
airplanes.add(new Airplane(103, "Laptop", "LHP29OCP", 24000.00, 1));
airplanes.add(new Airplane(104, "Air Conditioner", "ACLG66721", 30000.00, 5));
airplanes.add(new Airplane(105, "Refrigerator ", "12WP9087", 10000.00, 4));
//returns a list of product
return airplanes;
}

@Override
public Airplane findByAirplaneId(int id) {
    List<Airplane> airplanes = findAllAirplanes();
    Airplane airplane = airplanes.stream()
                    .filter(t -> (id == t.getId()))
                    .findFirst()
                    .orElse(null);
    return airplane;
}
}
