package ticket.example.demo.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticket.example.demo.model.Ticket;
import ticket.example.demo.repository.TicketRepository;
import ticket.example.demo.service.TicketService;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {
    @Autowired
    private final TicketRepository ticketRepository;
    @Override
    public void createTicket(Ticket ticket) {

    }

    @Override
    public void getAllTicket() {

    }

    @Override
    public void getTicketById() {

    }

    @Override
    public void searchTicketByPassengerName() {

    }

    @Override
    public void filterTicketByStatusAndDate() {

    }

    @Override
    public void updateTicketById() {

    }

    @Override
    public void deleteTicketById() {

    }
}
