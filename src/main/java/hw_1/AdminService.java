package hw_1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class AdminService implements Service {

    @Override
    public void check(Parameters parameters) throws IOException {
        String path = "src\\com\\company\\info.txt";
        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            if(scanner.equals(parameters)){
                System.out.printf("True");
            }else {
                System.out.printf("False");
            }
        }
        scanner.close();
        fileReader.close();
    }

    @Override
    public void write(Parameters parameters) throws IOException{
        String path = "src\\com\\company\\info.txt";
        Path pathToFile = Paths.get(path);
        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            scanner.nextLine();
        }


        FileWriter fileWriter2 = new FileWriter(path, true);
        fileWriter2.write(String.valueOf(scanner));
        fileWriter2.close();

        scanner.close();
        fileReader.close();
    }
}
