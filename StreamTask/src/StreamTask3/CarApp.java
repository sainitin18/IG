package StreamTask3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cars[]= {
				new Car("Maruti","Swift Dezire",810000.00),
				new Car("Hyundai","Verna",1100000.00),
				new Car("Toyota","Innova",2450000.00),
				new Car("Audi","Q3",4500000.00)
		
			};

        List<Car> carList = new ArrayList<>(Arrays.asList(cars));
        CarTest c = new CarTest();
        try {
        	//TODO
        	System.out.println(c.sumOfPrices(carList));
        	System.out.println(c.getCarNames(carList));
        	System.out.println(c.getCarMakers(carList));
        	System.out.println(c.getHighPricedCar(carList));
        	System.out.println(c.getCarWithLowPricedCar(carList));
        	
        }catch(Exception e) {        
	        e.printStackTrace();
        }
    }
        
 }
