/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama
 * Modifier Thinh Quach
 * Student number 991603369
 * Date modify June 9 2021
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)Math.floor(Math.random() * 13 + 1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)Math.floor(Math.random() * 4)]);
     
            magicHand[i] = new Card();
            magicHand[i].setValue(c.getValue());
            magicHand[i].setSuit(c.getSuit());
            System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuit());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your card value between 1 to 13 ");
        int user_value = input.nextInt();
        System.out.println("Enter your card suit (Hearts, Diamonds, Spades, Clubs) ");
        input.nextLine();
        String user_suit = input.nextLine();
        Card user_card = new Card();
        user_card.setValue(user_value);
        user_card.setSuit(user_suit);
        // and search magicHand here
        int flag = 0;
        for(int i=0; i < magicHand.length; i++) {
            if(user_card.getValue() == magicHand[i].getValue() && user_card.getSuit().equalsIgnoreCase(magicHand[i].getSuit()))  {
                flag = 1;
            }
        }
        //Then report the result here
        if(flag == 1){
            System.out.println("Your card is in the magic hand.");
        }
        else {
            System.out.println("Your card is not in the magic hand.");
        }
        
        //Lucky Card
        Card luckyCard = new Card();
        luckyCard.setValue(9);
        luckyCard.setSuit("Diamonds");
        
    }
    
}
