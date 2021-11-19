package btu;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// meore pirdapir PSVMshi

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int n = scanner.nextInt();
        try {
            FileWriter myWriter = new FileWriter("numbers.txt");
            for(int i = 0; i <=n; i++){
                int x = rand.nextInt(23 + 18)-18;
                myWriter.write(x);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
