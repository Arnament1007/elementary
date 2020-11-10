package units;

import exceptions.Exceptions;

public class Helper {
    boolean checkIDbool = false;
    boolean checkAKKIDbool = false;
    boolean checkSumbool = false;
    double num = 1000;

    Exceptions ex = new Exceptions();

    public void CheckId(String id) throws Exception {
        if (Integer.parseInt(id) != 10) {//длинна строки 10
            ex.WrongFieldException();
        } else {
            this.checkIDbool = true;
        }
    }

    public void CheckSum(double sum) throws Exception {
        if (sum < num) {
            ex.WrongSumException();
        } else {
            this.checkSumbool = true;
        }
    }

    public void Transfer(String id, String AkkID) throws Exception {
        if (id.equals(AkkID)) {
            this.checkAKKIDbool = true;
        } else {
            ex.UserExpectedError();
        }
    }

    public boolean GetCheckIDbool() {
        return checkIDbool;
    }

    public boolean GetCheckAKKIDbool() {
        return checkAKKIDbool;
    }

    public boolean GetCheckSumbool() {
        return checkSumbool;
    }
}
