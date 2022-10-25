package cinema.service;

import cinema.model.Cinema;
import cinema.model.Seat;

import java.util.ArrayList;
import java.util.List;

public class CinemaBuild {
    private final int totalRows = 9;
    private final int totalColumns = 9;
    private Cinema cinema;

    private List<Seat> generateSeats() {
        List<Seat> seats = new ArrayList<>();
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= totalColumns; j++) {
                Seat seat = new Seat(i, j);
                seats.add(seat);
            }
        }
        return seats;
    }

    public Cinema cinemaBuilder() {
        cinema = new Cinema(totalRows, totalColumns, generateSeats());
        return cinema;
    }

    void addToReservedSeats(Seat seat) {
        cinema.getReservedSeats().add(seat);
    }

    void addToAvailableSeats(Seat seat) {
        cinema.getAvailableSeats().add(seat);
    }

    void deleteFromAvailableSeats(Seat deleteSeat) {
        cinema.getAvailableSeats().removeIf(seat -> seat.equals(deleteSeat));

    }

    void deleteFromReservedSeats(Seat deleteSeat) {
        cinema.getReservedSeats().removeIf(seat -> seat.equals(deleteSeat));

    }
}
