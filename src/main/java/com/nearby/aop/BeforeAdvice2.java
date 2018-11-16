package com.nearby.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class BeforeAdvice2 {
	// before advice which calls point-cut declaration
	@Before("com.nearby.aop.PointCuts.forServAndController()")
	public void before() {
		System.out.println("logging aspect 2 for service and controller");
	}
}
