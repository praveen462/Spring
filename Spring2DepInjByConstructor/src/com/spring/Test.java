package com.spring;  
  
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Employee s=(Employee)factory.getBean("e");  
        s.show();
        
        Employee s1=(Employee)factory.getBean("e1");  
        s1.show();
        
        Employee s2=(Employee)factory.getBean("e2");  
        s2.show();  
        
        Employee s3=(Employee)factory.getBean("e3");  
        s3.show();  
          
    }  
}  
