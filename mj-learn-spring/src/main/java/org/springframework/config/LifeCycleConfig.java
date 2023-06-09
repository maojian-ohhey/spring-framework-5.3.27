package org.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.entity.SysUser;

public class LifeCycleConfig {

	@Bean
	public SysUser sysUser() {
		return new SysUser("maojian", "123456");
	}
}
