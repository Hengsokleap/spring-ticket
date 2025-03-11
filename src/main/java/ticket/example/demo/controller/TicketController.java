package ticket.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ticket.example.demo.model.Ticket;
import ticket.example.demo.service.TicketService;
@RestController
@RequiredArgsConstructor
public class TicketController {
    private final TicketService ticketService;
    @PostMapping("create-ticket")
    public void createTicket(@RequestBody Ticket ticket){
        ticketService.createTicket(ticket);
    }
    @GetMapping("get-all-ticket")
    public void getAllTicket(){
        ticketService.getAllTicket();
    }
}
