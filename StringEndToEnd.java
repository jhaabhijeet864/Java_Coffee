public class StringEndToEnd {

    public static void printStringEndToEnd(String[] strings) {
        // Input validation (Optional but good practice)
        if (strings == null || strings.length == 0) {
            System.out.println("Error: Input array is null or empty.");
            return;
        }

        // Iterate through the array using a for loop
        for (int i = 0; i < strings.length; i++) {
            // Print the current string
            System.out.print(strings[i]);
            // Add a space between each string for better readability (except after the last one)
            if (i < strings.length - 1) {
                System.out.print(" ");
            }
        }

        // Add a newline character at the end for better formatting
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage
        String[] myStrings = {"Hello", "World", "Java"};
        printStringEndToEnd(myStrings);
    }
}