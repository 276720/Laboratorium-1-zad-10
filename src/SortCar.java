import java.util.Comparator;

public class SortCar implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) { // Metoda sortuje Car według marki i modelu
        int result = car1.getMarka().compareTo(car2.getMarka());
        if(result==0){ // jeżeli obiekt ma tę samą markę to dalej on porównuje wedłeg modelu
            return car1.getModel().compareTo(car2.getModel());
        }
        return result;
    }
}
