public class Main {
    public static void main(String[] args) {
        int initialAccountAmount = 500;
        int replenishmentAmount = 1200;
        int bonusAmount = replenishmentAmount / 100;
        int finalAccountAmount = initialAccountAmount + replenishmentAmount + bonusAmount;
        System.out.println("У вас на счету " + finalAccountAmount + " рублей");
        if (replenishmentAmount > 1000) {
            System.out.println("Из них бонусных рублей " + bonusAmount);
        } else {
            System.out.println("У вас на счету 0 бонусов");
        }
    }
}
