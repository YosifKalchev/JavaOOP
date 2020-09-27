package dataBase;

public class Table {

    private int tableNumber;
    private boolean isTableFree;
    private Order tableOrder;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
        this.isTableFree = true;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public boolean isTableFree() {
        return isTableFree;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void setTableFree(boolean tableFree) {
        isTableFree = tableFree;
    }
}
