package springproject;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
public class TestByDepInjConsAggr {
public static void main(String[] args) {
	Resource r=new ClassPathResource("springproject/heello.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	EmpAddr   s=(EmpAddr)factory.getBean("e");
	s.show();
}
}
