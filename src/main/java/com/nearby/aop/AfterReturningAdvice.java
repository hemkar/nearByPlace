package com.nearby.aop;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Controller;

@Aspect
@Controller
public class AfterReturningAdvice {

	/*
	 * 
	 * */
	@AfterReturning(pointcut = "execution(public * com.nearby.service.NearbyServicesImpl.getCities(*))", returning = "result")
	public void afterReturning(JoinPoint joinPoint, List<String> result) {
		System.out.println("Inside @AfterReturning advice with result :"+result);
		result.add("bihar");

	}
}
