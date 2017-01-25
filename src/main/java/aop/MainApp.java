package aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by NESOY on 2017-01-25.
 */
public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans/animal.xml");

        PetOwner person = (PetOwner) context.getBean("petOwner");
        person.play();

        context.close();
    }
}
