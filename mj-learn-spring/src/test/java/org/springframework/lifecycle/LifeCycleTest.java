package org.springframework.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.config.LifeCycleConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.entity.SysUser;

public class LifeCycleTest {

	@Test
	public void test() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
		SysUser sysUser = applicationContext.getBean(SysUser.class);
		System.out.println(sysUser.getUserName());
	}
}
