import java.util.Scanner;

public class MetricConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Metric Converter!");
        System.out.println("You can convert between kilometers, meters, and centimeters.");
        System.out.println("Please enter your query in the format: '10 km to m' or '5 m to cm'.");
        System.out.println("Enter 'exit' or '-1' to exit the program.");

        while (true) {
            System.out.print("Enter your conversion query: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit") || input.equals("-1")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            if (isValidInput(input)) {
                double value = Double.parseDouble(input.split(" ")[0]);
                String fromUnit = input.split(" ")[1];
                String toUnit = input.split(" ")[3];

                double result = convert(value, fromUnit, toUnit);
                System.out.println(value + " " + fromUnit + " = " + result + " " + toUnit);
            } else {
                System.out.println("Invalid input. Please use the format '10 km to m'.");
            }
        }

        scanner.close();
    }

    private static boolean isValidInput(String input) {
        // Check if the input matches the expected format.
        return input.matches("\\d+(\\.\\d+)?\\s+(km|m|cm)\\s+to\\s+(km|m|cm)");
    }

    private static double convert(double value, String fromUnit, String toUnit) {
        // Conversion logic
        if (fromUnit.equals("km") && toUnit.equals("m")) {
            return value * 1000;
        } else if (fromUnit.equals("m") && toUnit.equals("km")) {
            return value / 1000;
        } else if (fromUnit.equals("m") && toUnit.equals("cm")) {
            return value * 100;
        } else if (fromUnit.equals("cm") && toUnit.equals("m")) {
            return value / 100;
        } else if (fromUnit.equals(toUnit)) {
            return value; // No conversion needed for the same unit.
        } else {
            return -1; // Invalid conversion
        }
    }
}
