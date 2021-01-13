package com.nt.bean;


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Clientapp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FileSystemResource resource=new FileSystemResource("applicationcontext.xml");
		
		XmlBeanFactory factory=new XmlBeanFactory(resource);
		
		
		WishGenerator bean=(WishGenerator) factory.getBean("wsg");
		
		
		String result=bean.WishGenerateMsg();
		System.out.println(result);
	}

}
