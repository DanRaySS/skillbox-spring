package ioc_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
