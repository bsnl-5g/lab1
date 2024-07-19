public class EvenNumbers {
    public static void main(String[] args) {
        int count = 0; // Counter to keep track of even numbers printed
        int num = 2;   // Starting from the first even number
        
        // Loop to print the first 100 even numbers
        while (count < 100) {
            System.out.print(num + " ");
            num += 2;   // Increment to the next even number
            count++;
        }
    }
}

