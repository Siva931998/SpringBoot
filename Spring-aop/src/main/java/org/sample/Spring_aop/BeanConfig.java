package org.sample.Spring_aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.sample.Spring_aop")
@EnableAspectJAutoProxy
public class BeanConfig {

}
