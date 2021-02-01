package kz.iitu.model;

import kz.iitu.model.CarType;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public List getAvailableBrands(CarType type){

        List brands = new ArrayList();

        if(type.equals(CarType.BMW)){
            brands.add("X5");
            brands.add(("Core i5"));

        }else if(type.equals(CarType.MERCEDES)){
            brands.add("Benz");
            brands.add("Royalyo");

        }else if(type.equals(CarType.TOYOTA)){
            brands.add("Corolla");
            brands.add("Camry");

        }else {
            brands.add("No Brand Available");
        }
        return brands;
    }
}
