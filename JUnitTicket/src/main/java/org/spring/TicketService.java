package org.spring;

public class TicketService {
    public Ticket createTicket(long kilometres) {
        if (kilometres <= 0) return null;
        Ticket ticket = new Ticket();
        ticket.setDistance(kilometres);
        ticket.setPrice((int) (kilometres * 3));
        return ticket;
    }

    public Ticket createTicketWithDiscount(long kilometres) {
        if (kilometres <= 0) return null;
        Ticket ticket = new Ticket();
        ticket.setDistance(kilometres);
        if (kilometres <= 1_000) {
            ticket.setPrice((int) (kilometres * 3));
        }else if (kilometres <= 2_000) {
            ticket.setPrice((int) (kilometres * 2));
        }else {
            ticket.setPrice((int) (kilometres));
        }
        return ticket;
    }
}
