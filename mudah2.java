import java.util.Scanner;
public class mudah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan : ");
        int number = input.nextInt();

        // Memeriksa apakah bilangan tersebut adalah bilangan prima
        if (isPrime(number)) {
            System.out.println(number + " adalah bilangan prima.");
        } else {
            System.out.println(number + " bukan bilangan prima.");
        }
        input.close();
    }
    // memeriksa apakah suatu bilangan adalah bilangan prima
    public static boolean isPrime(int number) {
        // Bilangan kurang dari 2 bukan bilangan prima
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

