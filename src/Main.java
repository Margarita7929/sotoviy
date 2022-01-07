public class Main {
    public static void main(String[] args) {
        int initialAccountAmount = 100;
        int replenishmentAmount = 1100;
        int bonusAmount;
        if (replenishmentAmount > 1000) {
            bonusAmount = replenishmentAmount / 100;
        } else {
            bonusAmount = 0;
        }
        int finalAccountAmount = initialAccountAmount + replenishmentAmount + bonusAmount;
        System.out.println("У вас на счету " + finalAccountAmount + " рублей");
        if (replenishmentAmount > 1000) {
            System.out.println("Из них бонусных рублей " + bonusAmount);
        } else {
            System.out.println("Из них бонусных рублей 0");
        }
    }
}
