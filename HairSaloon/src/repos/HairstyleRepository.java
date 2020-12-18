package repos;

import dataBase.Hairstyle;

import java.util.ArrayList;
import java.util.List;

public class HairstyleRepository {

    private static final HairstyleRepository instance = new HairstyleRepository();

    public static HairstyleRepository getInstance() {
        return instance;
    }

    private final List<Hairstyle> hairstyles;

    private HairstyleRepository() {
        hairstyles = new ArrayList<>();
    }

    private void print(String text) {
        System.out.println(text);
    }

}
