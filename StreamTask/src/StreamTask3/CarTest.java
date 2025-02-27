package StreamTask3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class CarTest implements CarService {

	@Override
	public double sumOfPrices(List<Car> carList) {
		// TODO Auto-generated method stub
		Double c = carList.stream().map(x->x.getPrice()).reduce((a,b)->a+b).orElse(0.0);
		return c;
	}

	@Override
	public List<String> getCarNames(List<Car> carList) {
		// TODO Auto-generated method stub
		List<String> s = carList.stream().map(x->x.getCarName()).collect(Collectors.toList());
		return s;
	}

	@Override
	public Set<String> getCarMakers(List<Car> carList) {
		// TODO Auto-generated method stub
		Set<String> s = carList.stream().map(x->x.getCareMake()).collect(Collectors.toSet());
		return s;
	}

	@Override
	public double getHighPricedCar(List<Car> carList) {
		// TODO Auto-generated method stub
		Double c =  carList.stream().max(Comparator.comparingDouble(x->x.getPrice())).map(x->x.getPrice()).orElse(0.0);
		return c;
	}

	@Override
	public Car getCarWithLowPricedCar(List<Car> carList) {
		// TODO Auto-generated method stub
		Car c =  carList.stream().min(Comparator.comparingDouble(x->x.getPrice())).orElse(null);
		return c;
	}

}
