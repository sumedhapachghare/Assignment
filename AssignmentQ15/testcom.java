 package AssignmentQ15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testcom {
	public static void main(String args[]) {
	ApplicationContext objctx=new ClassPathXmlApplicationContext("my.xml");
	customer obj=(customer) objctx.getBean("objcom");
	obj.showcdetails();
	
}
}
