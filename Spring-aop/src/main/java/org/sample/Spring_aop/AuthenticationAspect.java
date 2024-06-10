package org.sample.Spring_aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
	
	@Pointcut("execution(* org.sample.Spring_aop.ShoppingCart.checkout(..))")
	public void authenticatingPointcut() {
		
	}

	@Pointcut("execution(* org.sample.Spring_aop.ShoppingCart.checkout(..))")
	public void authorizationPointcut() {
		
	}
	
	@Before("authenticatingPointcut() && authorizationPointcut()")
	public void authenticate() {
		System.out.println("Authenticating the Request");
	}
	
	
	
}
