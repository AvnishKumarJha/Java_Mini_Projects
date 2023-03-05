// Random Number Mini Project.

import java.util.Scanner;

public class miniProject {
    public static void main(String[] args) {
        // MINI PROJECT
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do {
            System.out.println("Guess my number(1-100) : ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WOOHOO .. CORRECT NUMBER!!!!");
                break;
            }
            else if (userNumber > myNumber) {
                System.out.println("Your Number is to Large");
            }
            else {
                System.out.println("Your Number is to small");
            }
        } while(userNumber >= 0);

        System.out.print("My number was : ");
        System.out.print(myNumber);
    }
}
