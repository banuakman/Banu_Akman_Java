package com.company.M2ChallengeAkmanBanu.controller;

import com.company.M2ChallengeAkmanBanu.models.Definition;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {
    /*  URI: /word
        Method: GET
        Request Body: None
        Response Body: Definition
     */

    private static int idCounter = 1;

    private static List<Definition> definitionList = new ArrayList<>(Arrays.asList(
            new Definition(idCounter++, "simit", "(n) a Turkish circular bread, typically encrusted with sesame seeds or, less commonly, poppy, flax or sunflower seeds, "),
            new Definition(idCounter++, "baklava", "(n) a pastry made of many layers of paper-thin dough with a filling of ground nuts, baked and then drenched in a syrup of honey"),
            new Definition(idCounter++, "borek", "(n) family of baked filled pastries made of a thin flaky dough such as phyllo or yufka. Common fillings are made with meat, cheese, leafy greens or potatoes."),
            new Definition(idCounter++, "bulgur", "(n) a cereal food made from the cracked parboiled groats of several different wheat species, most often from durum wheat."),
            new Definition(idCounter++, "dolma", "(n) a family of stuffed dishes from Ottoman cuisine that can be served warm or cold. Some types of dolma are made with whole vegetables, fruit, offal or seafood, while others are made by wrapping leaves, most commonly grape or cabbage leaves, around the filling."),
            new Definition(idCounter++, "kefir", "(n) a fermented milk drink with a sour taste, made using a culture of yeasts and bacteria."),
            new Definition(idCounter++, "cacik", "(n) a Turkish dish made from yoghurt, salt, olive oil, crushed garlic, chopped cucumber, dill, mint, and vinegar, diluted with water."),
            new Definition(idCounter++, "meze", "(n) a selection of small dishes served as appetizers in Turkish Cuisine"),
            new Definition(idCounter++, "kofte", "(n) family of dishes in Turkish cuisine consist of balls of ground meat - usually beef, chicken, lamb or mutton, or a mixture - mixed with spices or onions."),
            new Definition(idCounter++, "lokum", "(n) confections based on a gel of starch and sugar, also known as Turkish Delight.")
    ));

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Definition getRandomWord() {
        Random rand = new Random();
        return definitionList.get(rand.nextInt(definitionList.size()));

    }

}
