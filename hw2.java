import java.util.*;

class ticketClass implements Runnable {
    static int ticket = 10000;
    int getTicket;
    Thread buy;
    static int number;
    Random random = new Random();

    ticketClass(String name) {
        getTicket = 0;
        buy = new Thread(this, name);
        buy.start();
    }

    public void run() {
        while (hasTicket() >= 4) {
            number = random.nextInt(4) + 1;
            getTicket += number;
            ticket -= number;
            System.out.println(buy.getName() + " 買到" + number + "張票。");
        }
        while (hasTicket() > 0 && hasTicket() < 4) {
            number = random.nextInt(hasTicket()) + 1; //
            getTicket += number;
            ticket -= number;
            System.out.println(buy.getName() + " 買到" + number + "張票。");
        }
        System.out.println(buy.getName() + " 總共買到" + getTicket + "張票。");
    }

    private synchronized static int hasTicket() {
        return ticket;
    }
}

public class hw2 {
    public static void main(String[] args) {
        ticketClass A_machine = new ticketClass("machine_A");
        ticketClass B_machine = new ticketClass("machine_B");
        ticketClass C_machine = new ticketClass("machine_C");
        ticketClass D_machine = new ticketClass("machine_D");
    }
}
