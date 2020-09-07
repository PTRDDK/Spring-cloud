package com.edu.ingredientservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevelopmentConfig {

    @Bean
    public CommandLineRunner dataLoader(IngredientRepository repo) {
        return args -> {
            repo.save(new Ingredient("FLTO", "pszenna", Ingredient.Type.WRAP));
            repo.save(new Ingredient("COTO", "kukurydziana", Ingredient.Type.WRAP));
            repo.save(new Ingredient("GRBF", "mielona wołowina", Ingredient.Type.PROTEIN));
            repo.save(new Ingredient("CARN", "kawałki mięsa", Ingredient.Type.PROTEIN));
            repo.save(new Ingredient("TMTO", "pomidory pokrojone w kostkę", Ingredient.Type.VEGGIES));
            repo.save(new Ingredient("LETC", "sałata", Ingredient.Type.VEGGIES));
            repo.save(new Ingredient("CHED", "cheddar", Ingredient.Type.CHEESE));
            repo.save(new Ingredient("JACK", "Monterrey Jack", Ingredient.Type.CHEESE));
            repo.save(new Ingredient("SLSA", "pikantny sos pomidorowy", Ingredient.Type.SAUCE));
            repo.save(new Ingredient("SRCR", "śmietana", Ingredient.Type.SAUCE));
        };
    }
}
