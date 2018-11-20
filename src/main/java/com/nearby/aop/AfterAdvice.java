package com.nearby.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterAdvice {

	@AfterThrowing(pointcut = "execution(* com.nearby.service.NearbyServicesImpl.getCities(..))", throwing = "result")
	public void afterThrowingAspect(JoinPoint joinpoint, Throwable result) {
		System.out.println("Exception occured so i am inside after advice NOT a after throwing advice "+result);
	}
}
