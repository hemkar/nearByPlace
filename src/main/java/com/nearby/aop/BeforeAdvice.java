package com.nearby.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAdvice {

	@Before("execution(public * getCities(*))")
	public void before(){
		System.out.println("logging aspect");
	}
}
