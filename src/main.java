public class main {
    public static void main(String[] args) {
        int moneyInTheAccount = 45;
        int deposit = 1200;
        int bonus = 0;
        if (deposit >= 1000) {
            bonus = deposit / 100;
        }
        int finaleMoneyInTheAccount = moneyInTheAccount + deposit + bonus;
        System.out.println("Количество бонусов " + bonus);
        System.out.println("Сумма денег на счете после пополнения " + finaleMoneyInTheAccount);
    }
}
