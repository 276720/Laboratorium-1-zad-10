import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Inicjalizacja {
    private static void printCollection(ArrayList<Car> list){ //Metoda służąca do wyświetlania
        for(Car car: list){                                   //zawartości zbioru samochodów na konsoli
            System.out.println(car.toString());
        }
        System.out.println();
    }
    public static void run() {
        ArrayList<Car> list = new ArrayList<>();

        list.add(new Car("B","Audi", 2003));
        list.add(new Car("A","Fiat", 1998));
        list.add(new Car("B","Kia", 1987));
        list.add(new Car("D","BMW", 2007));
        list.add(new Car("A","Toyota", 1990));

        SortCar comparator = new SortCar();
        SortCarByRok comparator2 = new SortCarByRok();
        System.out.println("Sortowanie najpierw według marki, a następnie według modelu:");
        Collections.sort(list, comparator);
        printCollection(list);
        System.out.println("Sortowanie na podstawie rocznika od najstarszego do najnowszego:");
        Collections.sort(list,comparator2);
        printCollection(list);
    }
}
