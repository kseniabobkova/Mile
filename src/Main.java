public class Main {
    public static void main(String[] args) {
        int ticket_price_InKopecks = 20_000_60;
        int mile_price = 20;
        int bonus_mile = ticket_price_InKopecks / mile_price / 100;

        System.out.println(bonus_mile);
    }
}

