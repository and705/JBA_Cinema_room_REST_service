package cinema.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;


    public class Ticket {
        private String token;
        @JsonProperty("ticket")
        private Seat seat;

        public Ticket(Seat ticket) {
            this.token = generateToken();
            this.seat = ticket;
        }

        public Ticket() {
        }

        private String generateToken() {
            return UUID.randomUUID().toString();
        }

        public String getToken() {
           return token;
        }

        public Seat getSeat() {
            return seat;
        }
    }

