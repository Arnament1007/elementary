import enteties.Client;
import exceptions.Exceptions;
import services.Transaction;
import units.Helper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Exceptions ex = new Exceptions();
        Helper helper = new Helper();
        Client client = new Client();
        Transaction transaction = new Transaction();

        String inputsaveid = "";
        String inputAKKid = "";

        while (helper.GetCheckIDbool() == false) {
            System.out.println("Введите идентификатор аккаунта.");
            String input = scan.nextLine();
            helper.CheckId(input);
            inputsaveid = input;
        }

        while (helper.GetCheckAKKIDbool() == false) {
            System.out.println("Введите AKK идентификатор аккаунта.");
            String inputAKK = scan.nextLine();
            System.out.println(inputsaveid.equals(inputAKK));
            helper.Transfer(inputsaveid, inputAKK);
            inputAKKid = inputAKK;
        }
        while (helper.GetCheckSumbool() == false) {
            System.out.println("Введите сумму перевода.");
            float inputsum = scan.nextFloat();
            helper.CheckSum(inputsum);
        }

        transaction.Trans(inputsaveid, inputAKKid);
        System.out.println("Средства переведены успешно!");

    }
}
