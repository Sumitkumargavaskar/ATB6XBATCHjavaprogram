package may.ex_25052024.exceptions;

import java.io.File;
import java.io.FileReader;

public class Lab227 {
    public static void main(String[] args) {
        try {
            int a = 10/0; //UnChecked - JVM don't know?
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader f = new FileReader(new File("c://a.txt"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}

