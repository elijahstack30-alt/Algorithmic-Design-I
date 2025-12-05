import java.util.Scanner;

public class ZodiacSignFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input with explanation
        System.out.println("Enter your birth month as a number (1-12): ");
        int month = scanner.nextInt();

        // Validate month input
        if (month < 1 || month > 12) {
            System.out.println("Invalid Month");
            return;
        }

        System.out.println("Enter your birth day as a number: ");
        int day = scanner.nextInt();

        // Validate day input based on the month
        if (!isValidDay(month, day)) {
            System.out.println("Invalid Day");
            return;
        }

        // Determine zodiac sign and print
        String zodiacSign = getZodiacSign(month, day);
        System.out.println("Your Zodiac sign is: " + zodiacSign);
    }

    // Method to check if the day is valid for the given month
    public static boolean isValidDay(int month, int day) {
        if (day < 1) {
            return false;
        }

        switch (month) {
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return day <= 30;

            case 2: // February (assumed 29 days)
                return day <= 29;

            default: // All other months have 31 days
                return day <= 31;
        }
    }

    // Method to determine zodiac sign based on month and day
    public static String getZodiacSign(int month, int day) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Pisces";
        } else {
            return "Unknown"; // Should never happen if inputs are valid
        }
    }
}

