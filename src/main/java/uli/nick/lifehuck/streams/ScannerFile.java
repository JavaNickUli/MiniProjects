package uli.nick.lifehuck.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile {

    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream(new Scanner(System.in).nextLine()))) {
            scanner.tokens()
                    .map(Integer::parseInt)
                    .filter(x -> x % 2 == 0)
                    .sorted()
                    .forEach(System.out::println);
        }
    }
}
