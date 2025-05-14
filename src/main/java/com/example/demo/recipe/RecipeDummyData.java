package com.example.demo.recipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecipeDummyData {
    public static List<Recipe> recipes = new ArrayList<>();

    static {
        initRecipes();
    }
    public static List<Recipe> getRecipes() {

        return recipes;
    }

    public static void initRecipes() {
        Recipe recipe1 = new Recipe(1, "ijsklontjes", new ArrayList<>(Arrays.asList("water")), "doe in de vriezer voor 3 uur");
        Recipe recipe2 = new Recipe(2, "wraps", new ArrayList<>(Arrays.asList("wraps", "chicken", "veggies")), "bak de kip en groentes, stop ze in de wrap");

        recipes.add(recipe1);
        recipes.add(recipe2);
    }

    public static Recipe getRecipeById(int id) {
        List<Recipe> recipes = getRecipes();
        return recipes.stream()
                .filter(r -> r.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public static Recipe addRecipe(Recipe recipe) {
         recipes.add(recipe);
         return recipe;
    }

    public static List<Recipe> getRecipesByIngredient(String name) {
        return recipes.stream()
                .filter(r -> r.getIngredients().contains(name))
                .toList();
    }
}
