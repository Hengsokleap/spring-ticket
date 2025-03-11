package ticket.example.demo.repository;

import org.springframework.stereotype.Repository;
import ticket.example.demo.model.Ticket;

import java.util.ArrayList;

@Repository
public class TicketRepository {
    ArrayList<Ticket> tickets=new ArrayList<>();
    public void saveTicket(Ticket ticket){
       tickets.add(ticket);
    }
    public ArrayList<Ticket> getAllTicket(){
        return tickets;
    }
}
