package ioc_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
//        int value = myDog.init();
//        System.out.println(value); // >> 5
        myDog.say();
//        myDog.destroy();

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();

        context.close();
    }
}
