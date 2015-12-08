package com.epam.training.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.epam.training.springcore.domain.Card;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
    	
    	Card card = factory.getBean("myCard", Card.class);
    	
        System.out.println(card);
        
    }
}
