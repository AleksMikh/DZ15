import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AviaSoulsTest {
    Ticket ticket_1 = new Ticket("Москва", "Тула", 100, 12, 14);
    Ticket ticket_2 = new Ticket("Москва", "Нижний Новгород", 250, 12, 15);
    Ticket ticket_3 = new Ticket("Москва", "Владимир", 200, 12, 14);
    Ticket ticket_4 = new Ticket("Москва", "Ижевск", 500, 12, 18);
    Ticket ticket_5 = new Ticket("Москва", "Тюмень", 600, 12, 20);
    Ticket ticket_6 = new Ticket("Москва", "Красноярск", 700, 12, 22);

    @Test
    public void CompareTo() {
        AviaSouls souls = new AviaSouls();
        souls.add(ticket_1);
        souls.add(ticket_2);
        souls.add(ticket_3);
        souls.add(ticket_4);
        souls.add(ticket_5);
        souls.add(ticket_6);

        Ticket[] tickets = {ticket_2, ticket_3};
        Arrays.sort(tickets);

        Ticket[] expected = {ticket_3, ticket_2};

        Assertions.assertArrayEquals(expected, tickets);
    }

    @Test
    public void Search() {
        AviaSouls souls = new AviaSouls();
        souls.add(ticket_1);
        souls.add(ticket_2);
        souls.add(ticket_3);
        souls.add(ticket_4);
        souls.add(ticket_5);
        souls.add(ticket_6);

        Ticket[] tickets = {ticket_1, ticket_2, ticket_3, ticket_4, ticket_5, ticket_6};
        Arrays.sort(tickets);

        Ticket[] expected = {ticket_1, ticket_3, ticket_2, ticket_4, ticket_5, ticket_6};

        Assertions.assertArrayEquals(expected, tickets);
    }

    @Test
    public void CompareTime() {
        AviaSouls souls = new AviaSouls();
        souls.add(ticket_1);
        souls.add(ticket_2);
        souls.add(ticket_3);
        souls.add(ticket_4);
        souls.add(ticket_5);
        souls.add(ticket_6);

        TicketTimeComparator timeComparator = new TicketTimeComparator();

        Ticket[] tickets = {ticket_1, ticket_6};
        Arrays.sort(tickets, timeComparator);

        Ticket[] expected = {ticket_1, ticket_6};


        Assertions.assertArrayEquals(expected, tickets);
    }

    @Test
    public void SearchAndSortByTimeFlight() {
        AviaSouls souls = new AviaSouls();
        souls.add(ticket_1);
        souls.add(ticket_2);
        souls.add(ticket_3);
        souls.add(ticket_4);
        souls.add(ticket_5);
        souls.add(ticket_6);

        TicketTimeComparator timeComparator = new TicketTimeComparator();

        Ticket[] tickets = {ticket_1, ticket_2, ticket_3, ticket_4, ticket_5, ticket_6};
        Arrays.sort(tickets, timeComparator);

        Ticket[] expected = {ticket_1, ticket_3, ticket_2, ticket_4, ticket_5, ticket_6};

        Assertions.assertArrayEquals(expected, tickets);
    }
}
