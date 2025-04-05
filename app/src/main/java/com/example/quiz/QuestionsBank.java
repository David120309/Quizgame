package com.example.quiz;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    private static List<QuestionsList> footballQuestions () {
        final List<QuestionsList> questionsList = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList("Кто выиграл чемпионат мира по футболу в 2018 году?",
                "Германия",
                "Франция",
                "Бразилия",
                "Аргентина",
                "Франция", "");
        final QuestionsList question2 = new QuestionsList("Сколько игроков на поле у одной команды в футболе (включая вратаря)?",
                "10",
                "11",
                "12",
                "9",
                "11", "");
        final QuestionsList question3 = new QuestionsList("Кто является лучшим бомбардиром Лиги чемпионов УЕФА?",
                "Лионель Месси" ,
                "Криштиану Роналду",
                "Роберт Левандовски",
                "Рауль",
                "Криштиану Роналду", "");
        final QuestionsList question4 = new QuestionsList("Кто выиграл Золотой мяч в 2020 году?",
                "Роберт Левандовски",
                "Лионель Месси",
                "Килиан Мбаппе",
                "Криштиану Роналду",
                "Роберт Левандовски", "");
        final QuestionsList question5 = new QuestionsList("Как называется знаменитый стадион Челси?",
                "Олд Траффорд",
                "Стэмфорд Бридж",
                "Сигнал Идуна Парк",
                "Камп Ноу",
                "Стэмфорд Бридж", "");
        final QuestionsList question6 = new QuestionsList("Какую команду называют Красные дьяволы?",
                "Манчестер Сити",
                "Манчестер Юнайтед",
                "Ливерпуль",
                "Арсенал",
                "Манчестер Юнайтед", "");
        final QuestionsList question7 = new QuestionsList("В какой стране прошел чемпионат мира по футболу в 2018 году?",
                "Франция",
                "Россия",
                "Бразилия",
                "Германия",
                "Россия", "");
        final QuestionsList question8 = new QuestionsList("Какой клуб выиграл Лигу чемпионов в 2021 году?",
                "Реал Мадрид",
                "Манчестер Сити",
                "Манчестер Юнайтед",
                "Ливерпуль",
                "Манчестер Сити", "");
        final QuestionsList question9 = new QuestionsList("Какую команду называют Королевский клуб?",
                "Реал Мадрид",
                "Манчестер Сити",
                "Ювентус",
                "Ливерпуль",
                "Реал Мадрид", "");
        final QuestionsList question10 = new QuestionsList("Кто является самым дорогим футболистом в истории на момент 2025 года?",
                "Неймар",
                "Килиан Мбаппе",
                "Эрлинг Холанд",
                "Лионель Месси",
                "Килиан Мбаппе", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        return questionsList;
    }
    private static List<QuestionsList> mathQuestions () {
        final List<QuestionsList> questionsList = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList(".",
                ".",
                ".",
                ".",
                "1",
                "1", "");
        final QuestionsList question2 = new QuestionsList("",
                ".",
                ".",
                ".",
                "1",
                "1", "");
        final QuestionsList question3 = new QuestionsList("",
                "1",
                "2",
                "3",
                "4",
                "2", "");
        final QuestionsList question4 = new QuestionsList("",
                "1",
                "2",
                "3",
                "4",
                "2", "");
        final QuestionsList question5 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");
        final QuestionsList question6 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");
        final QuestionsList question7 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");
        final QuestionsList question8 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");
        final QuestionsList question9 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");
        final QuestionsList question10 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        return questionsList;
    }
    private static List<QuestionsList> countryQuestions () {
        final List<QuestionsList> questionsList = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList(".",
                ".",
                ".",
                ".",
                "1",
                "1", "");
        final QuestionsList question2 = new QuestionsList("",
                ".",
                ".",
                ".",
                "1",
                "1", "");
        final QuestionsList question3 = new QuestionsList("",
                "1",
                "2",
                "3",
                "4",
                "2", "");
        final QuestionsList question4 = new QuestionsList("",
                "1",
                "2",
                "3",
                "4",
                "2", "");
        final QuestionsList question5 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");
        final QuestionsList question6 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");
        final QuestionsList question7 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");
        final QuestionsList question8 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");
        final QuestionsList question9 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");
        final QuestionsList question10 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        return questionsList;
    }
    private static List<QuestionsList> factsQuestions () {
        final List<QuestionsList> questionsList = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList(".",
                ".",
                ".",
                ".",
                "1",
                "1", "");
        final QuestionsList question2 = new QuestionsList("",
                ".",
                ".",
                ".",
                "1",
                "1", "");
        final QuestionsList question3 = new QuestionsList("",
                "1",
                "2",
                "3",
                "4",
                "2", "");
        final QuestionsList question4 = new QuestionsList("",
                "1",
                "2",
                "3",
                "4",
                "2", "");
        final QuestionsList question5 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");
        final QuestionsList question6 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");
        final QuestionsList question7 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");
        final QuestionsList question8 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");
        final QuestionsList question9 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");
        final QuestionsList question10 = new QuestionsList("",
                "1",
                "4",
                "2",
                "3",
                "3", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

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
