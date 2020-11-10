package hw_4.entities;

import java.util.Scanner;

public class Client {
    String clientID;
    String surname;
    String clientAccID;
    double suma;

    public Client recordClientID (){
        Client recordClientID = new Client();
        Scanner scanner = new Scanner(System.in);
        clientID = scanner.next();
        scanner.close();

        return recordClientID;
    }

    public Client recordSurname (){
        Client recordSurname = new Client();
        Scanner scanner = new Scanner(System.in);
        surname = scanner.next();
        scanner.close();

        return recordSurname;
    }

    public Client recordAccId (){
        Client recordSurname = new Client();
        Scanner scanner = new Scanner(System.in);
        clientAccID = scanner.next();
        scanner.close();

        return recordAccId();
    }

    public Client recordSuma (){
        Client recordSurname = new Client();
        Scanner scanner = new Scanner(System.in);
        suma = scanner.nextInt();
        scanner.close();

        return recordSuma();
    }
}
