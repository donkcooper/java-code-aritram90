package concepts.functionalinterface;

public class Car {

    public static void main(String[] args) {
        Fuel maruti = (x) -> System.out.println("Mileage of Maruti is " + x);
        maruti.calculateMileage(12);

        Fuel tata = (x) -> System.out.println("Mileage of Tata is " + x);
        tata.calculateMileage(15);
    }
}