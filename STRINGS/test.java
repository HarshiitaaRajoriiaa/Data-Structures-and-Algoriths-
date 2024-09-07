public class test {
    public static void main(String[] args) {
        int one = 1;
        String two = "twoq";
        // System.out.println(String.valueOf(one));
        try {
            // Attempt to parse the string to an integer
            int parsedNumber = Integer.parseInt(two);
            System.out.println(parsedNumber);
        } catch (NumberFormatException error) {
            // Handle the exception if the string is not a valid number
            System.out.println("Invalid number format: " + two);
        }

    }
}