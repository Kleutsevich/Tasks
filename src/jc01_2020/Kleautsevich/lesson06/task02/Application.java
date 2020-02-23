package jc01_2020.Kleautsevich.lesson06.task02;

public class Application {
    public static void main(String[] args) {
        Atm atm = new Atm(10, 10, 10);
        atm.getMoneyStatus();
        atm.withdrawMoney(100);
        atm.getMoneyStatus();
        atm.withdrawMoney(470);
        atm.getMoneyStatus();
        atm.withdrawMoney(540);
        atm.getMoneyStatus();
        atm.withdrawMoney(100);
        atm.getMoneyStatus();
    }
}
