package hellospring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      Rectangle objA = (Rectangle) context.getBean("rect");
      
      System.out.println(objA.getArea());
      System.out.println(objA.getPerimeter());

      Square objB = (Square) context.getBean("square");
      System.out.println(objB.getArea());
      System.out.println(objB.getPerimeter());
   }
}