public class Main {
    public static void main(String[] args) {
        int ticketPriceInKopecks = 20_000_60;
        int milePrice = 20;
        int bonusMile = ticketPriceInKopecks / milePrice / 100;

        System.out.println(bonusMile);
    }
}

