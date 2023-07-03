
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /**
         * by bobrossiotta
         */
    // integer
    //  Taxi Fare Calculator
    //perkm is 2.20 TL, opening is 10Tl and minimum price is 20Tl
        int perkm,km;
        double opening=10;
        Scanner bob = new Scanner(System.in);

        System.out.print("Opening price is 10Tl. What is the kilometer of the road you will travel?:");
        km = bob.nextInt();

        double price= opening+(km*2.20);
        price=(price<20)? 20 : price;
        System.out.println("taxi fare you will pay:"+ price);



    } }