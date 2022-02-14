public class Main {
    public static void main(String[] args) {

        int startBalance = 300;
        int replenishment = 600;
        int balance = startBalance + replenishment;

        int bonus;
        if (replenishment>1000) {
            bonus = 1*replenishment;}
        else {
            bonus = 0;}

        int totalBalance = balance + bonus;

                    System.out.println (("Ваш баланс ") + (totalBalance));

    }

}

