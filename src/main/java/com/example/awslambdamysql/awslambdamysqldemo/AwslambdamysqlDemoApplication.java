package com.example.awslambdamysql.awslambdamysqldemo;

import com.example.awslambdamysql.awslambdamysqldemo.function.Createuserfunction;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionRegistration;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class AwslambdamysqlDemoApplication implements ApplicationContextInitializer<GenericApplicationContext> {
	@Override
	public void initialize(GenericApplicationContext context) {
		context.registerBean("createuserfunction", FunctionRegistration.class, () -> new FunctionRegistration<>(new Createuserfunction()).type(Createuserfunction.class));
	}

	public static void main(String[] args) {
		FunctionalSpringApplication.run(AwslambdamysqlDemoApplication.class, args);
	}

}
