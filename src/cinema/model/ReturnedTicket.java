package cinema.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReturnedTicket  {
    @JsonProperty("returned_ticket")
    private Seat returnedTicket;

    public ReturnedTicket(Seat returnedTicket) {
        this.returnedTicket = returnedTicket;
    }

    public ReturnedTicket() {
    }

    public Seat getReturnedTicket() {
        return returnedTicket;
    }

    public void setReturnedTicket(Seat returnedTicket) {
        this.returnedTicket = returnedTicket;
    }
}
