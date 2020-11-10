import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        InitializationData initializationData = new InitializationData();
        Information information = initializationData.fillIn();


        ArrayList<Integer> integers = new ArrayList<>(); //cntl + alt + v

//        conversion(integers, information);
        initializationData.comparison(information);

    }
    private static Information conversion(List<? extends Number> list, Information info){
        ArrayList<Byte> listByte = new ArrayList<>();
        ArrayList<Integer> listInteger = new ArrayList<>();

        return  info;
    }

}
