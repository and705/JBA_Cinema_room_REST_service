package cinema.controller;

import cinema.model.*;
import cinema.service.CinemaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


    @RestController
    public class CinemaController {

        CinemaService cinemaService = new CinemaService();

        @GetMapping("/seats")
        public Cinema getSeats() {
            return cinemaService.getSeats();
        }

        @PostMapping("/purchase")
        public ResponseEntity<Ticket> buyTicket(@RequestBody Seat seat) {
            Ticket ticket = cinemaService.buyTicket(seat);
            return ResponseEntity.ok(ticket);
        }

        @PostMapping("/return")
        public ResponseEntity<ReturnedTicket> returnTicket(@RequestBody Token token) {
            return ResponseEntity.ok(cinemaService.returnTicket(token));
        }

        @PostMapping("/stats")
        public ResponseEntity<Statistics> getStats(@RequestParam(value = "password", required = false) String password) {
            Statistics statistics = cinemaService.getStatistics(password);
            return ResponseEntity.ok(statistics);
        }
    }

