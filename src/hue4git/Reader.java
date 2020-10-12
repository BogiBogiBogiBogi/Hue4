package hue4git;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reader {

    private Scanner scanner;

    public Reader(File file) {
        try {
            this.scanner = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<String> readFile() {
        ArrayList<String> list = new ArrayList<String>();

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] array = line.split(":");
            for (int i = 0; i < array.length; i++) {
                list.add(array[i]);
            }
        }

        return list;
    }
}