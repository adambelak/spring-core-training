package com.epam.training.springcore;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.training.springcore.domain.Card;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
        	
        	Card card = context.getBean("myCard", Card.class);
        	
            System.out.println(card);    		
    	}
    }
}
