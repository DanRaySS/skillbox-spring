package ioc_di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(MyConfig.class);

        // 1
//        Pet cat = context.getBean("catBean", Pet.class);
//        cat.say();

        // 2
//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);

        // 3
//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();

        // 4
//        Person person = context.getBean("personBean", Person.class);
//        Person person2 = context.getBean("personBean", Person.class);

        Person person = context.getBean("personBean", Person.class);

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
