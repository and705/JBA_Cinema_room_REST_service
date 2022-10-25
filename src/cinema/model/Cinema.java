package cinema.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

    @JsonProperty("total_rows")
    private int totalRows;
    @JsonProperty("total_columns")
    private int totalColumns;
    @JsonProperty("available_seats")
    private List<Seat> availableSeats;
    @JsonIgnore
    private List<Seat> reservedSeats;

    public Cinema(int totalColumns, int totalRows, List<Seat> availableSeats) {
        this.totalColumns = totalColumns;
        this.totalRows = totalRows;
        this.availableSeats = availableSeats;
        this.reservedSeats = new ArrayList<>();
    }

    public List<Seat> getReservedSeats() {
        return reservedSeats;
    }

    public List<Seat> getAvailableSeats() {
        return availableSeats;
    }

    public int getTotalColumns() {
        return totalColumns;
    }

    public void setTotalColumns(int totalColumns) {
        this.totalColumns = totalColumns;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

}
