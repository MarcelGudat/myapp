package htw.berlin.wi.prog2.domain;

import java.util.List;

public class PrecomputedBowl {
    private float totalPrice;
    private int totalCalories;
    private List<String> ingredients;
    public PrecomputedBowl(float totalPrice, int totalCalories, List<String> ingredients) {
        this.totalPrice = totalPrice;
        this.totalCalories = totalCalories;
        this.ingredients = ingredients;
    }
    public float getTotalPrice() {
        return totalPrice;
    }

    public int getTotalCalories() {
        return totalCalories;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
