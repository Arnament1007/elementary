import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserService implements Service {

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
    public void write(Parameters parameters) throws IOException {
        System.out.println("Этот сервис недоступен. \n");
    }
}
