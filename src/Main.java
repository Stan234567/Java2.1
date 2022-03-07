public class Main {

    public static void main(String[] args) {
        boolean buy = true;
        int ticketPrice = 100;
        int mile = buy ? 5 : 0;

        int bonus = ticketPrice * mile / 100;

        System.out.println("Ваши Мили: "+ bonus);


    }

}