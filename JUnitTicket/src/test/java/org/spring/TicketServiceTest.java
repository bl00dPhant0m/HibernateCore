package org.spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketServiceTest {
    TicketService ticketService = new TicketService();
    Ticket ticket = new Ticket();

    @Test
    public void TestCreateTicketMethod() {
        ticket.setDistance(10_000);
        ticket.setPrice(30_000);
        Assertions.assertEquals(ticket, ticketService.createTicket(10_000));
    }

    @Test
    public void TestCreateTicketMethodWithIncorrectDistance() {
        Assertions.assertNull(ticketService.createTicket(-2));
    }

    @Test
    public void TestCreateTicketWithDiscountWithIncorrectDistance() {
        Assertions.assertNull(ticketService.createTicket(-2));
    }

    @Test
    public void TestCreateTicketWithDiscountWithDistanceMoreOneThousandAndLessTwoThousand() {
        ticket.setDistance(1_500);
        ticket.setPrice(3_000);
        Assertions.assertEquals(ticket, ticketService.createTicketWithDiscount(1_500));
    }

    @Test
    public void TestCreateTicketWithDiscountWithDistanceLessOneThousand() {
        ticket.setDistance(500);
        ticket.setPrice(1_500);
        Assertions.assertEquals(ticket, ticketService.createTicketWithDiscount(500));
    }

    @Test
    public void TestCreateTicketWithDiscountWithDistanceMoreTwoThousand() {
        ticket.setDistance(20_000);
        ticket.setPrice(20_000);
        Assertions.assertEquals(ticket, ticketService.createTicketWithDiscount(20_000));
    }

}
