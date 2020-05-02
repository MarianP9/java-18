package homework;

public enum TicketType {
    FREE_PASS(0),
    ONE_DAY(1),
    ONE_DAY_VIP(2),
    FULL(3),
    FULL_VIP(4);

    private final int priorityLevel;

    TicketType(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public static TicketType generateRandomTicket() {
        return TicketType.values()[(int) (Math.random() * TicketType.values().length)];
    }
}
