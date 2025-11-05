import java.util.Scanner;
public class Lab12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many trips to get gas did you make?");
        double[] trips = new double[input.nextInt()];

        for (int i = 0, t = 1; i < trips.length; i++, t++) {
            System.out.print("Enter the gas cost for trip " + t + ": ");
            trips[i] = input.nextDouble();
        }
        System.out.println("---Gas Expense Summary---");
        for (int i = 0, t = 1; i < trips.length; i++, t++) {
            System.out.println("Trip" + t + ": $" + trips[i] + "\n");
        }
        double totalCost = 0;
        double averageCost = 0;
        for (int i = 0; i < trips.length; i++) {
            totalCost = totalCost + trips[i];
        }

        System.out.println("The total gas spent: $" + totalCost);
        System.out.println("The average gas spent per trip: $" + totalCost / trips.length);



    }
}