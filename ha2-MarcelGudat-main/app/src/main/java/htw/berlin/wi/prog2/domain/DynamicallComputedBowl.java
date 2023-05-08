package htw.berlin.wi.prog2.domain;

import java.util.List;

public class DynamicallComputedBowl {

    private List<Ingredient> ingredients;

    public DynamicallComputedBowl(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public float getTotalPrice() {
        float totalPrice = 0;
        for (Ingredient ingredient : ingredients) {
            totalPrice += ingredient.getPrice();
        }
        return totalPrice;
    }

    public int getTotalCalories() {
        int totalCalories = 0;
        for (Ingredient ingredient : ingredients) {
            totalCalories += ingredient.getCalories();
        }
        return totalCalories;
    }

    public List<String> getIngredients() {
        List<String> ingredientNames = new ArrayList<>();
        for (Ingredient ingredient : ingredients) {
            ingredientNames.add(ingredient.getName());
        }
        return ingredientNames;
    }


}
