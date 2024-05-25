package byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ap= new ClassPathXmlApplicationContext("byname/Spring.xml");
		student s = (student)ap.getBean("s");
		
		System.out.println(s.getS_id());
		System.out.println(s.getS_name());
		System.out.println(s.getAddrs().getArea_Name());
		System.out.println(s.getAddrs().getCity_Name());

	}

}
