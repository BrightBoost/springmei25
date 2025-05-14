package com.example.demo.recipe;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    private RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    // get all
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    // get by id
    public Recipe getRecipeById(int id) {
        return recipeRepository.findById(id).orElse(null);
    }

    // get by ingredient
    public List<Recipe> getRecipesByIngredient(String ingredient) {
        return recipeRepository.findByIngredientsContains(ingredient);
    }

    // add
    public Recipe addRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

}
