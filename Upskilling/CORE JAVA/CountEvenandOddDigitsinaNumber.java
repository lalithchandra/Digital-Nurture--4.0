import java.util.Scanner;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int even = 0, odd = 0;

        if (num == 0) even = 1;
        else {
            while (num != 0) {
                int digit = num % 10;
                if (digit % 2 == 0)
                    even++;
                else
                    odd++;
                num /= 10;
            }
        }

        System.out.println("Even digits: " + even);
        System.out.println("Odd digits: " + odd);
    }
}
