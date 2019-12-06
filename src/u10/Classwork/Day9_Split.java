package u10.Classwork;

import java.util.Scanner;
import java.io.FileReader;

public class Day9_Split {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new FileReader("names.txt"));


        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] names = line.split("-");

            for (int i = 0; i < names.length; i++) {
                System.out.println(names[i]);
            }
        }
    }
}
