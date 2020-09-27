package dataBase.Repositories;

import dataBase.Table;

import java.util.ArrayList;
import java.util.List;

public class TableRepository {

    private static final TableRepository instance = new TableRepository();

    public static TableRepository getInstance() {return instance;}

    private static List<Table> tables;

    private TableRepository() {
        tables = new ArrayList<>();
        tables.add(new Table(1));
        tables.add(new Table(2));
        tables.add(new Table(3));
        tables.add(new Table(4));
        tables.add(new Table(5));
        tables.add(new Table(6));
        tables.add(new Table(7));
        tables.add(new Table(8));
        tables.add(new Table(9));
        tables.add(new Table(10));

    }

    public boolean isValid(int tableNumber) {
        return ((tableNumber >= 1) && (tableNumber <= 10));
    }

    public Table getTableByNumber(int tableNumber) {
        for (int i = 0; i < tables.size(); i++) {
            if (tables.get(i).getTableNumber() == tableNumber) {
                return tables.get(i);
            }
        } return null;
    }

//    public void showAllTables() {
//        System.out.print("The list of all tables:\n");
//        for (int i = 0; i < tables.size(); i++) {
//            print("Tape: " + tables.get(i).getTableNumber() + " - available");
//        }
//    }
//
//    public void showAllAvailableTapes() {
//        print("The list of all available tapes:\n");
//        for (int i = 0; i < tables.size(); i++) {
//            print("Tape: " + tables.get(i).getName());
//        }
//        print("");
//    }


    private void print(String text) {
        System.out.println(text);
    }
}
