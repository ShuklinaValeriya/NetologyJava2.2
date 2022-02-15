public class Main {
    public static void main(String[] args) {

        int startBalance = 300;
        int replenishment = 1600;
        int balance = startBalance + replenishment;

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        int totalBalance = balance + bonus;

        System.out.println(("Ваш баланс ") + (totalBalance));

    }

}

