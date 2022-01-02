public class Main {
    public static void main(String[] args) {
        int account = 100;
        int replenishmentAmount = 1001;
        int bonusRuble;
        int accountWithReplenish;
        if ( replenishmentAmount >=1000){
            bonusRuble = replenishmentAmount/100;
        }else {
            bonusRuble = 0;
        }
        accountWithReplenish = account +  replenishmentAmount + bonusRuble;
        System.out.println("На вашем счёте " + accountWithReplenish + " из них начисленно " + bonusRuble + " бонусных рублей");
    }
}
