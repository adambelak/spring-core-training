package com.epam.training.springcore;

import com.epam.training.springcore.domain.Card;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Card card = new Card("myCard", 10, 20, 100);
        System.out.println(card);
        
    }
}
