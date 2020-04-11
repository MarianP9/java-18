package homework;

import java.util.PriorityQueue;

public class FestivalStatisticsThread extends Thread {

    private FestivalGate gate;

    public FestivalStatisticsThread(FestivalGate gate) {
        this.gate = gate;
    }

    public void run() {
        PriorityQueue<TicketType> queue;
        while (true) {
            synchronized (gate) {
                queue = gate.getQueue();
            }
            if (!queue.isEmpty()) {
                System.out.println("\n\n\n"
                        + queue.size() + " have entered\n"
                        + queue.stream().filter(ticketType -> ticketType == TicketType.FREE_PASS).count() + " have FREE passes\n"
                        + queue.stream().filter(ticketType -> ticketType == TicketType.ONE_DAY).count() + " have ONE DAY passes\n"
                        + queue.stream().filter(ticketType -> ticketType == TicketType.ONE_DAY_VIP).count() + " have ONE DAY VIP passes\n"
                        + queue.stream().filter(ticketType -> ticketType == TicketType.FULL).count() + " have FULL passes\n"
                        + queue.stream().filter(ticketType -> ticketType == TicketType.FULL_VIP).count() + " have FULL VIP passes");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
