package homework;

public class Main {
    public static void main(String[] args) {

        FestivalGate gate = new FestivalGate();

        FestivalStatisticsThread statsThread = new FestivalStatisticsThread(gate);
        statsThread.start();

        double attendeesCount = Math.ceil(Math.random() * 10_000);
        for (int i = 0; i < attendeesCount; i++) {
            FestivalAttendeeThread attendee = new FestivalAttendeeThread(TicketType.generateRandomTicket(), gate);
            attendee.start();
            try {
                attendee.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
