package hue4git;

import java.io.File;
import java.util.ArrayList;

public class Hue4GIT {

    public static void main(String[] args) {
        File file = new File("numbers.csv");
        Reader reader = new Reader(file);

        ArrayList<String> list = reader.readFile();

        list.forEach(System.out::println);
    }
}
