package aop.mod2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook();
        uniLibrary.addBook("Zaur", book);
        uniLibrary.addMagazine();

//        uniLibrary.returnMagazine();
//        uniLibrary.addBook();

//        uniLibrary.returnBook();
//        uniLibrary.getMagazine();


        context.close();

    }

}
