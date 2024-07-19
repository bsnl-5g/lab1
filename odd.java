public class OddNumbers {
    public static void main(String[] args) {
        int count = 0; // Counter to keep track of odd numbers printed
        int num = 1;   // Starting from the first odd number
        
        // Loop to print the first 100 odd numbers
        while (count < 100) {
            System.out.print(num + " ");
            num += 2;   // Increment to the next odd number
            count++;
        }
    }
}

