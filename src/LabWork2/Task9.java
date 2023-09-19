package LabWork2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Poker poker = new Poker();

        poker.main();
    }
}

class Poker {
    public void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество игроков. От 1 до 10");
        int numberOfPlayers = scanner.nextInt();

        List<String> cardDeck = createPokerDeck();

        int cardsForOnePlayer = 5;

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Колода игрока " + (i + 1) + ":");
            for (int j = 0; j < cardsForOnePlayer; j++) {
                String card = cardDeck.remove(0);
                System.out.println(card);
            }
            System.out.println();
        }

    }

    public List<String> createPokerDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = {"Черви", "Бубны", "Пики", "Крести"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        for (String suit: suits){
            for (String rang: ranks){
                String card = suit + " " + rang;
                deck.add(card);
            }
        }

        Collections.shuffle(deck);

        return deck;
    }
}