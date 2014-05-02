package de.wiese24.springlearning;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import de.wiese24.springlearning.model.Offer;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"de/wiese24/springlearning/beans/beans.xml");
		OffersDAO offersDao = (OffersDAO) context.getBean("offersDao");

		List<Offer> offers = offersDao.getOffers();
		for (Offer offer : offers) {
			System.out.println(offer);
		}
		((ClassPathXmlApplicationContext) context).close();

	}
}
