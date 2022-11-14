package com.javatpoint;
import java.util.List;
public interface IProductService 
{
List<Product> findAll();
Product findByProductId(int id);
}
