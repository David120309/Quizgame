package com.example.quiz;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    private static List<QuestionsList> footballQuestions () {
        final List<QuestionsList> questionsList = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");
        final QuestionsList question2 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");
        final QuestionsList question3 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");
        final QuestionsList question4 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");
        final QuestionsList question5 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);

        return questionsList;
    }
    private static List<QuestionsList> mathQuestions () {
        final List<QuestionsList> questionsList = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");
        final QuestionsList question2 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");
        final QuestionsList question3 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");
        final QuestionsList question4 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");
        final QuestionsList question5 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);

        return questionsList;
    }
    private static List<QuestionsList> countryQuestions () {
        final List<QuestionsList> questionsList = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");
        final QuestionsList question2 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");
        final QuestionsList question3 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");
        final QuestionsList question4 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");
        final QuestionsList question5 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);

        return questionsList;
    }
    private static List<QuestionsList> factsQuestions () {
        final List<QuestionsList> questionsList = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");
        final QuestionsList question2 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");
        final QuestionsList question3 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");
        final QuestionsList question4 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");
        final QuestionsList question5 = new QuestionsList("Vrdon lav txaya?",
                "Che",
                "djvar",
                "karoxa",
                "esim",
                "Che", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);

        return questionsList;
    }

    public static List<QuestionsList> qetQuestions (String selectedTopicName){
        switch (selectedTopicName) {
            case "football" : return footballQuestions() ;
            case "math" : return mathQuestions() ;
            case "country" : return countryQuestions() ;
            default: return factsQuestions() ;
        }

    }
}
