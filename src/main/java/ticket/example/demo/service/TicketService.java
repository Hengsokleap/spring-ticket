package ticket.example.demo.service;

import ticket.example.demo.model.Ticket;

public interface TicketService {
    void createTicket(Ticket ticket);
    void getAllTicket();
    void getTicketById();
    void searchTicketByPassengerName();
    void filterTicketByStatusAndDate();
    void updateTicketById();
    void deleteTicketById();
}
