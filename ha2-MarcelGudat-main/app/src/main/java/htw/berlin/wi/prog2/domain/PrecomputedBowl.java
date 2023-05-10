package htw.berlin.wi.prog2.domain;

import java.util.ArrayList;
import java.util.List;

public class PrecomputedBowl implements Bowl {
    private double totalPrice;
    private int totalCalories;
    private List<Ingredient> ingredients;


    public PrecomputedBowl(double precomputedPrice, int precomputedCalories, List<Ingredient> precomputdedIngredientsNames) {
        this.totalPrice = precomputedPrice;
        this.totalCalories = precomputedCalories;
        this.ingredients = precomputdedIngredientsNames;
    }


    @Override
    public double calculatePrice() {
        return totalPrice;
    }

    @Override
    public int calculateCalories() {
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
