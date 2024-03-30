import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        // Получаем два бина cat
        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");

        // Сравниваем ссылки на бины и выводим результат
        System.out.println("Ссылки на HelloWorld одинаковые: " +
                (bean == applicationContext.getBean("helloworld")));
        System.out.println("Ссылки на cat одинаковые: " +
                (catBean1 == catBean2));
    }
}