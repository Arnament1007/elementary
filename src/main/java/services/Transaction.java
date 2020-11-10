package services;

import units.Helper;

public class Transaction {
    Helper helper = new Helper();

    public void Trans(String client, String id) throws Exception {
        helper.Transfer(client, id);
    }
}
