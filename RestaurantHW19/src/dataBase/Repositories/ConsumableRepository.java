package dataBase.Repositories;

import dataBase.Consumable;
import dataBase.Order;

import java.util.ArrayList;
import java.util.List;

public class ConsumableRepository {

    private static final ConsumableRepository instance = new ConsumableRepository();

    public static ConsumableRepository getInstance() {return instance;}

    private static List<Consumable> menu;

    private ConsumableRepository() {
        menu = new ArrayList<>();
        menu.add(new Consumable("CocaCola", "Drink", 2));
        menu.add(new Consumable("Fanta", "Drink", 2.5));
        menu.add(new Consumable("bob", "Meal", 4));
    }

    public void showAllConsumables() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println("Name: " + menu.get(i).getName() +
                    ", Type: " + menu.get(i).getType() +
                    ", Price: " + menu.get(i).getPrice());
        }
    }

}
