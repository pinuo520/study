package com.bage.lifecircle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		
		String beansFilePathStr[] = {
				"classpath:com/bage/template.xml"  // 包下的配置文件
		};
		
		// 加载 spring 容器
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(beansFilePathStr); 
//		ConfigurableApplicationContext context =
//				new ClassPathXmlApplicationContext(beansFilePathStr); //Shutting down the Spring IoC container gracefully in non-web applications
		// beans.xml == classpath:beans.xml 等价
		// add a shutdown hook for the above context...Shutting down the Spring IoC container gracefully in non-web applications
		// context.registerShutdownHook();
        
		// 获取一个基本bean
		LifeCircleBean myBean = context.getBean(LifeCircleBean.class);
		System.out.println(myBean);

		
	}
	
}
