package hue4git;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Hue4GIT {

    public static void main(String[] args) {
        File file = new File("numbers.csv");
        Reader reader = new Reader(file);
        NumericFinder finder = new NumericFinder();

        ArrayList<String> list = reader.readFile();

        for (int i = 0; i < list.size(); i++) {
            if (finder.isNumeric(list.get(i)) == false) {
                list.remove(i);
            }
        }

        System.out.println("Teiler eingeben: ");
        Scanner s = new Scanner(System.in);
        
        int readConsole = Integer.parseInt(s.nextLine());
        
        
    }
}