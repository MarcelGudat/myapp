package htw.berlin.wi.prog2.domain;

import java.util.ArrayList;
import java.util.List;

public class DynamicallyComputedBowl implements Bowl {

    private List<Ingredient> ingredients;

    public DynamicallyComputedBowl(List<Ingredient> ingredientList) {
        this.ingredients = ingredientList;
    }
    public static BowlBuilder builder() {
        return new BowlBuilder();
    }
    public static class BowlBuilder {
        private List<Ingredient> ingredientList = new ArrayList<>();

        public BowlBuilder add(Ingredient ingredient) {
            ingredientList.add(ingredient);
            return this;
        }

        public DynamicallyComputedBowl build() {
            return new DynamicallyComputedBowl(ingredientList);
        }

        public Bowl buildDynamicallyComputed() {
            return build();
        }
    }

    @Override
    public double calculatePrice() {
        float totalPrice = 0;
        for (Ingredient ingredient : ingredients) {
            totalPrice += ingredient.getPrice();
        }
        return totalPrice;
    }

    @Override
    public int calculateCalories() {
        int totalCalories = 0;
        for (Ingredient ingredient : ingredients) {
            totalCalories += ingredient.getCalories();
        }
        return totalCalories;
    }

    @Override
    public List<String> getIngredientNames() {
        List<String> ingredientNames = new ArrayList<>();
        for (Ingredient ingredient : ingredients) {
            ingredientNames.add(ingredient.getName());
        }
        return ingredientNames;
    }
}
