package com.edu.ingredientclient.resttemplate;

import com.edu.ingredientclient.Ingredient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
@Conditional(NotFeignCondition.class)
public class IngredientServiceClient {

    private RestTemplate rest;

    public IngredientServiceClient(@LoadBalanced RestTemplate rest) {
        this.rest = rest;
    }


    public Iterable<Ingredient> getAllIngredients() {
        Ingredient[] ingredients = rest.getForObject(
                "http://ingredient-service/ingredients", Ingredient[].class);
        return Arrays.asList(ingredients);
    }

    public Ingredient getIngredientById(String id) {
        return rest.getForObject(
                "http://ingredient-service/ingredients/{id}", Ingredient.class, id);
    }
}
