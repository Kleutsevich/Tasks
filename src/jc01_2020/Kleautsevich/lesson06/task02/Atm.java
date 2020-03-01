package jc01_2020.Kleautsevich.lesson06.task02;

public class Atm {
    int quantity20;
    int quantity50;
    int quantity100;

    public Atm(int quantity20, int quantity50, int quantity100) {
        this.quantity20 = quantity20;
        this.quantity50 = quantity50;
        this.quantity100 = quantity100;
    }
    public void add20(int quantity) {
        quantity20 += quantity;
    }
    public void add50(int quantity) {
        quantity50 += quantity;
    }
    public void add100(int quantity) {
        quantity100 += quantity;
    }

    public boolean check(int sum) {
        if (sum % 10 != 0 || sum == 10 || sum == 30) {
            System.out.println("Wrong sum, please enter correct sum");
            return false;
        }
        return true;
    }
    boolean withdrawMoney(int sum) {
        if (check(sum)) {
            return false;
        }

        int sum50 = sum % 100;
        int count100 = (sum - sum50) / 100;
        if (quantity100 >= count100) {
            int sum20 = sum50 % 50;
            int count50 = (sum50 - sum20) / 50;
            if (quantity50 >= count50) {
                int count20 = sum20 / 20;
                if (quantity20 >= count20) {
                    System.out.println(String.format(
                            "Withdrawing %s = %s * 100, %s * 50, %s * 20",
                            sum, count100, count50, count20));
                    quantity20 -= count20;
                    quantity50 -= count50;
                    quantity100 -= count100;
                    return true;
                }
            }
        }
        return false;
    }

    void getMoneyStatus() {
        System.out.println(String.format(
                "Status: 100-%s, 50-%s, 20-%s",
                quantity100, quantity50, quantity20));
    }

}
