package ioc_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        // 1
//        Pet pet = new Cat();
//        Person person = new Person(pet);
//        person.callYourPet();

        // 2
//        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person = new Person(pet);
//        person.callYourPet();
//
//        context.close();

        // 3
//        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Person person = context.getBean("myPerson", Person.class);
//        person.callYourPet();
//
//        context.close();

        // 4
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
