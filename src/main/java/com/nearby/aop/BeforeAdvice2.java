package com.nearby.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class BeforeAdvice2 {
	// before advice which calls point-cut declaration
	@Before("com.nearby.aop.PointCuts.forServAndController()")
	public void before(JoinPoint joinPoint) { // joinpoint contains meta data
												// about method being called
		System.out.println("logging aspect 2 for service and controller");

		// display method signature
		MethodSignature sign = (MethodSignature) joinPoint.getSignature();
		System.out.println(sign);

		// Display method argument.
		Object[] args = joinPoint.getArgs();
		for (Object obj : args) {
			System.out.println("Argument using joinpoint : " + obj);
		}
	}

	
}
