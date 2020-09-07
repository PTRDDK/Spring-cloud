package com.edu.ingredientclient.feign;

import com.edu.ingredientclient.Ingredient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("ingredient-service")
public interface IngredientClient {

    @GetMapping("/ingredients")
    Iterable<Ingredient> getAllIngredients();

    @GetMapping("/ingredients/{id}")
    Ingredient getIngredientById(@PathVariable("id") String id);
}
