package org.sample.Spring_aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Loggingaspect {
	@Before("execution(* org.sample.Spring_aop.ShoppingCart.checkout(..))")
	public void beforeLogger(JoinPoint jp) {
		System.out.println(jp.getSignature());
		String arg = jp.getArgs()[0].toString();
		System.out.println("Before Loggers with Argument :" + arg);
	}
	
	@After("execution(* *.*.*.*.checkout(..))")
	public void afterLogger() {
		System.out.println("After Loggers");
	}
	
	@Pointcut("execution(* org.sample.Spring_aop.ShoppingCart.name(..))")
	public void afterreturningpointcut() {
		
	}
	@AfterReturning(pointcut = "afterreturningpointcut()", returning = "retVal")
	public void afterreturning(String retVal) {
		
		System.out.println("After returning: " + retVal);
	}

	
}
