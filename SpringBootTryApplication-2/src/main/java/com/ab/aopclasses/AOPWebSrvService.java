package com.ab.aopclasses;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPWebSrvService {

	Long before, after;

	@Before("execution(* com.ab.service.WebSrvService.getAllRecords(..))")
	public void beforeForGetRecordById() {
		before = System.currentTimeMillis();
		System.out.println(" AOP TIME BEFORE METHOD CALLED: " + before);
	}

	@After("execution(* com.ab.service.WebSrvService.getAllRecords(..))")
	public void afterForGetRecordById() {
		after = System.currentTimeMillis();
		System.out.println("AOP TIME AFTER METHOD CALLED: " + (after - before));

	}

	/*
	 * @Around("execution(* com.ab.service.WebSrvService.getAllRecords(..))") public
	 * void aroundForGetRecordById() {
	 * System.out.println("AOP TIME AROUND METHOD CALLED: " +
	 * System.currentTimeMillis()); }
	 */
}
