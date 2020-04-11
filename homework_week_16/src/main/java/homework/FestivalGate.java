package homework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FestivalGate {
    private PriorityQueue<TicketType> queue;

    public FestivalGate(){
        queue = new PriorityQueue<>(Comparator.comparing(TicketType::getPriorityLevel));
    }

    public void addToQueue(TicketType ticketType){
        queue.add(ticketType);
    }

    public PriorityQueue<TicketType> getQueue(){
        return queue;
    }
}
