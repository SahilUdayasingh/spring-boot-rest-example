package com.javatpoint;
import java.util.List;
public interface IAirplaneService 
{
List<Airplane> findAllAirplanes();
Airplane findByAirplaneId(int id);
}
