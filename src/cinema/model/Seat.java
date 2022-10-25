package cinema.model;

import java.util.Objects;


    public class Seat {
        private int row;
        private int column;
        private int price;

        public Seat(int row, int column) {
            this.row = row;
            this.column = column;
            this.price = selectPrice();

        }

        public Seat() {
        }

        public void setPrice() {
            this.price = selectPrice();
        }

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public int getColumn() {
            return column;
        }

        public void setColumn(int column) {
            this.column = column;
        }

        private int selectPrice() {
            return row <= 4 ? 10 : 8;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Seat seat = (Seat) o;
            return row == seat.row && column == seat.column && price == seat.price;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, column, price);
        }

        @Override
        public String toString() {
            return "Seat{" +
                    "row=" + row + "\n" +
                    ", column=" + column + "\n" +
                    ", price=" + price + "\n" +
                    '}' + "\n";
        }
}
