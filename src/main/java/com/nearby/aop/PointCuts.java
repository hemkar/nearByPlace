package com.nearby.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCuts {

	// point-cut declaration with point-cut expression
		@Pointcut("execution(public * com.nearby.service.NearbyServicesImpl.getCities(*))")
		public void forServicePackage() {

		}

		@Pointcut("execution(public * com.nearby.controller.NearByController.getCities(*))")
		public void forControllerPackage() {

		}

		//combining 2 point cut
		@Pointcut("forServicePackage() || forControllerPackage()")
		public void forServAndController() {
		}
	
		
	
}
