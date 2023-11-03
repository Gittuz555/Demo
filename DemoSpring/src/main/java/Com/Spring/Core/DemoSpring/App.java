package Com.Spring.Core.DemoSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args ) {
    	
    
    
  //spring container will provide the objects --seperate object creation not required//
    		BeanFactory cont=new ClassPathXmlApplicationContext("spring.xml");
    		Inmakes at=cont.getBean(Inmakes.class);
    		at.mockTest();
    
      }		
    
    //Bean initialization//
    //constructor initialization//
    //setter Initialization//
    
}
