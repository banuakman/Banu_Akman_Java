package com.company.M2ChallengeAkmanBanu.controller;

import com.company.M2ChallengeAkmanBanu.models.Quote;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {
    /*  URI: /quote
        Method: GET
        Request Body: None
        Response Body: Quote
    */

    private static int idCounter = 1;

    private static List<Quote> quotesList = new ArrayList<>(Arrays.asList(
            new Quote(idCounter++, "Rumi", "Yesterday I was clever, so I wanted to change the world. Today I am wise, so I am changing myself."),
            new Quote(idCounter++, "Rumi", "Don’t grieve. Anything you lose comes round in another form."),
            new Quote(idCounter++, "Rumi", "What you seek is seeking you"),
            new Quote(idCounter++, "Rumi", "Every mortal will taste DEATH but only some will taste LIFE."),
            new Quote(idCounter++, "A.Einstein", "Anyone who has never made a mistake has never tried anything new."),
            new Quote(idCounter++, "A.Einstein", "Insanity: doing the same thing over and over again and expecting different results."),
            new Quote(idCounter++, "A.Einstein", "The measure of intelligence is the ability to change"),
            new Quote(idCounter++, "Buddha", "One moment can change a day, one day can change a life, and one life can change the world."),
            new Quote(idCounter++, "Heraklitus", "There is nothing permanent, except the change"),
            new Quote(idCounter++, "Lao-Tzu", "What the caterpillar calls the end, the rest of the world calls a butterfly.")
    ));

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getRandomQuote(){
        Random rand = new Random();
        return quotesList.get(rand.nextInt(quotesList.size()));
    }

}
