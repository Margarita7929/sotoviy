public class Main {
    public static void main(String[] args) {
        int initialAccountAmount = 500;
        int replenishmentAmount = 1200;
        int finalAccountAmount = initialAccountAmount + replenishmentAmount;
        int bonusAmount = replenishmentAmount / 100;
        System.out.println("У вас на счету " + finalAccountAmount + " рублей");
        if (replenishmentAmount > 1000) {
            System.out.println("У вас на счету " + bonusAmount + " бонусов");
        } else {
            System.out.println("У вас на счету 0 бонусов");
        }
    }
}
