package ioc_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ConfigWithAnnotations {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext3.xml");

//        // 1
////        Cat myCat = context.getBean("catBean", Cat.class);
//        // 2 - default
//        Cat myCat = context.getBean("cat", Cat.class);
//
//        myCat.say();

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
