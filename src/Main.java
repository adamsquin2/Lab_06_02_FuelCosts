import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double gallons = 0;
        double fuelEfficiency = 0;
        double gasPerGallonPrice = 0;


        Scanner in = new Scanner(System.in);

        System.out.print("Enter the gallons of gas in your tank: ");
        gallons = in.nextDouble();

        System.out.print("Enter the fuel efficiency of your car: ");
        fuelEfficiency = in.nextDouble();

        System.out.print("Enter the price per gallon of gas: ");
        gasPerGallonPrice = in.nextDouble();

        double hundredMiles = (100/fuelEfficiency) * gasPerGallonPrice;
        double carCanGo = fuelEfficiency * gallons;

        System.out.println("The cost for going 100 miles is: $" + hundredMiles);
        System.out.println("How many miles the car can go with the current amount of gas is: " + carCanGo);







    }
}