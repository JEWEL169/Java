import java.util.Scanner;

public class CreditCardValidator {
    private String ccNumber;

    // Constructor to initialize credit card number
    public CreditCardValidator(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    // Method to validate the credit card
    public void validateCard() {
        int length = ccNumber.length();
        
        // Check if card number length is valid
        if (length < 8 || length > 9) {
            System.out.println("Invalid credit card number");
            return;
        }

        int lastDigit = Integer.parseInt(ccNumber.substring(length - 1));
        String remainingNumber = ccNumber.substring(0, length - 1);

        switch (1) { // We use switch just to implement the steps as requested
            case 1: {
                // Step b: Reverse the remaining digits
                String reversed = new StringBuilder(remainingNumber).reverse().toString();

                // Step c: Double the odd-positioned digits (starting from 0 index as even)
                StringBuilder doubledString = new StringBuilder();
                for (int i = 0; i < reversed.length(); i++) {
                    int digit = Integer.parseInt(String.valueOf(reversed.charAt(i)));
                    if (i % 2 == 0) { // Odd-positioned digits
                        digit *= 2;
                        if (digit > 9) {
                            digit = digit / 10 + digit % 10; // Add the digits of double-digit numbers
                        }
                    }
                    doubledString.append(digit);
                }

                // Step d: Sum of all digits
                int sum = 0;
                for (int i = 0; i < doubledString.length(); i++) {
                    sum += Integer.parseInt(String.valueOf(doubledString.charAt(i)));
                }

                // Step e: Subtract last digit obtained from step a (lastDigit) from 10
                int result = 10 - (sum % 10);

                // Step f: Compare result with last digit
                if (result == lastDigit) {
                    System.out.println("Credit card number is valid.");
                } else {
                    System.out.println("Credit card number is invalid.");
                }
                break;
            }
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your credit card number: ");
        String ccNumber = scanner.nextLine();
        
        // Create an instance of the validator
        CreditCardValidator validator = new CreditCardValidator(ccNumber);
        // Validate the card number
        validator.validateCard();
    }
}
