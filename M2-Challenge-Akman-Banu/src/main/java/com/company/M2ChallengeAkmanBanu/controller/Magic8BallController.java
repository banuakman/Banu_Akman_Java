package com.company.M2ChallengeAkmanBanu.controller;

import com.company.M2ChallengeAkmanBanu.models.Answer;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class Magic8BallController {
    /*  URI: /magic
        Method: POST
        Request Body: question
        Response Body: Answer
     */

    private static int idCounter = 1;

    private static List<Answer> answersList = new ArrayList<>(Arrays.asList(
            new Answer(idCounter++, "", "It is Certain."),
            new Answer(idCounter++, "", "It is decidedly so."),
            new Answer(idCounter++, "", "Without a doubt."),
            new Answer(idCounter++, "", "Yes definitely."),
            new Answer(idCounter++, "", "You may rely on it."),
            new Answer(idCounter++, "", "As I see it, yes."),
            new Answer(idCounter++, "", "Most likely."),
            new Answer(idCounter++, "", "Outlook good."),
            new Answer(idCounter++, "", "Yes."),
            new Answer(idCounter++, "", "Signs point to yes."),
            new Answer(idCounter++, "", "Reply hazy, try again."),
            new Answer(idCounter++, "", "Ask again later."),
            new Answer(idCounter++, "", "Better not tell you now."),
            new Answer(idCounter++, "", "Cannot predict now."),
            new Answer(idCounter++, "", "Concentrate and ask again."),
            new Answer(idCounter++, "", "Don't count on it."),
            new Answer(idCounter++, "", "My reply is no."),
            new Answer(idCounter++, "", "My sources say no."),
            new Answer(idCounter++, "", "Outlook not so good."),
            new Answer(idCounter++, "", "Very doubtful.")
    ));

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public Answer askMagic8Ball(@RequestBody String question) {
        Random rand = new Random();
        int randomAnswerIndex = rand.nextInt(answersList.size());
        answersList.get(randomAnswerIndex).setQuestion(question);
        return answersList.get(randomAnswerIndex);
    }
}
