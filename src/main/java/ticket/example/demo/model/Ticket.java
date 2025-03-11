package ticket.example.demo.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;
@Data
@RequiredArgsConstructor
public class Ticket {
    private int ticketId;
    private String passengerName;
    private Date travelDate;
    private String sourceStation;
    private String destinationStation;
    private double price;
    private boolean paymentStatus;
    private String ticketStatus;
    private String numberSeat;
}
