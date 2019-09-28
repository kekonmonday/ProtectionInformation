package laba_4;

public class Indexes {

    private int row;

    private int column;

    public Indexes(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
        return String.valueOf(row + column);
    }

}
