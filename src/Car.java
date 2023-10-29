public class Car {
    private String model;

    public String getModel() {
        return model;
    }

    private String marka;

    public String getMarka() {
        return marka;
    }

    private int rok_pr;

    public int getRok_pr() {
        return rok_pr;
    }

    public Car(String model, String marka, int rok_pr){ // Konstruktor z parametrami
        this.model = model;
        this.marka = marka;
        this.rok_pr = rok_pr;
    }
    public String toString(){ //Przesłonięta metoda, która zwraca reprezentację obiektu Osoba w postaci ciągu znaków.
        return "Car{" +
                "model='" + model +'\'' +
                ", marka='" + marka + '\''+
                ", rok produkcji='" + rok_pr + '\'' +
                "}";
    }
}
