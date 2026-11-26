import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        /* 1. Write a program that prints the numbers from 1 to 100 such that:
                if the number is a multiply of 3, you need to print "Fizz" instead of that number.
                if the number is a multiply of 5, you need to print "Buzz" instead of that number.
                if the number is a multiply of 3 and 5, you need to print "FizzBuzz" instead of that number.
         */
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

        // 2. Write a Java program to reverse a string.
        System.out.println("Please enter a string to reverse:");
        String text = in.nextLine();
        StringBuilder reversedString = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            reversedString.append(text.charAt(i));
        }

        System.out.println(reversedString);

        // 3. Write a program to find a factorial value of any number entered through the keyboard
        System.out.print("Please enter a number: ");
        int number = in.nextInt();

        int factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println(number + "! = " + factorial);

        // 4. Two numbers are entered through the keyboard. Write a program to find the value of the number raised to a power of another.
        System.out.print("Enter first number: ");
        int firstNumber = in.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = in.nextInt();

        int result = 1;
        for (int i = 0; i < secondNumber; i++) {
            result *= firstNumber;
        }

        System.out.println("The first number power of the second number result is: " + result);

        // 5. Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        int num;
        int sumOfEvens = 0;
        int sumOfOdds = 0;
        do {
            System.out.print("Please enter a number to sum, type -1 to exit: ");
            num = in.nextInt();

            if (num == -1) {
                continue;
            }

            if (num % 2 == 0) {
                sumOfEvens += num;
            } else {
                sumOfOdds += num;
            }
        } while (num != -1);

        System.out.println("Sum of evens: " + sumOfEvens);
        System.out.println("Sum of odds: " + sumOfOdds);

        // 6. Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
        int potentialPrime = 0;
        while (potentialPrime <= 0) {
            System.out.print("Please enter a positive number to check if it is prime or not: ");
            potentialPrime = in.nextInt();
        }

        if (potentialPrime == 1) {
            System.out.println(potentialPrime + " is not a prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= potentialPrime - 1; i++) {
                if (potentialPrime % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(potentialPrime + " is a prime number");
            } else {
                System.out.println(potentialPrime + " is not a prime number");
            }
        }

        // 7. Use a for loop to print headings for four weeks (Weeks 1-4). Then use another for loop to print the days (Days 1-7) for each week.
        for (int i = 1; i <= 4; i++) {
            System.out.println("Week " + i);
            for (int j = 1; j <= 7; j++) {
                System.out.println("Day " + j);
            }
        }

        // 8. Write a program thats check if the word is palindrome or not.
        System.out.print("Please enter a word: ");
        String word = in.next();

        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }

        if (word.equalsIgnoreCase(reversedWord.toString())) {
            System.out.println(word + " is palindrome");
        } else {
            System.out.println(word + " is not palindrome");
        }
    }
}
