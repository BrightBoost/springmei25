package com.example.demo.recipe;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("recipe")
public class RecipeController {
    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public ResponseEntity<List<Recipe>> getAllRecipes() {
        return ResponseEntity.ok(recipeService.getAllRecipes());
    }

    @GetMapping("{id}")
    public ResponseEntity<Recipe> getRecipeById(@PathVariable("id") int id) {
        return ResponseEntity.ok(recipeService.getRecipeById(id));
    }

    @PostMapping
    public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe) {
        return ResponseEntity.ok(recipeService.addRecipe(recipe));
    }

    @GetMapping("ingredient/{ingredient}")
    public ResponseEntity<List<Recipe>> getRecipesByIngredient(@PathVariable("ingredient") String ingredient) {
        return ResponseEntity.ok(recipeService.getRecipesByIngredient(ingredient));
    }

    

}
