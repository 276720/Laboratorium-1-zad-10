import java.util.Comparator;

public class SortCarByRok implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) { // Metoda sortuje Car według roku produkcji
        return car1.getRok_pr()-car2.getRok_pr();
    }
}
