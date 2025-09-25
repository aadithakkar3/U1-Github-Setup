//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static String money(double dollars) {
        // Format Money
        return String.format("%.2f", dollars);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Note: Do not use any symbols when entering data.\n");
        // Prompt User and Store Data
        System.out.print("Enter your Bill($): ");
        double bill = s.nextDouble();
        System.out.print("Tip Percent: ");
        int tipPercent = s.nextInt();
        System.out.print("Number of People: ");
        int numPeople = s.nextInt();
        // Calculate New Values
        double totalTip = bill * tipPercent / 100;
        double totalBill = bill + totalTip;
        double tipPerPerson = totalTip / numPeople;
        double billPerPerson = totalBill / numPeople;
        // Output Calculated Values
        System.out.println("\nTotal Tip Amount: $" + money(totalTip));
        System.out.println("Total Bill Cost: $" + money(totalBill));
        System.out.println("Tip Per Person: $" + money(tipPerPerson));
        System.out.println("Bill Per Person: $" + money(billPerPerson));
    }
}