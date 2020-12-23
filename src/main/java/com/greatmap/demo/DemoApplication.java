package com.greatmap.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;

import java.io.PrintStream;
import java.net.InetAddress;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		try {
			SpringApplication bootstrap = new SpringApplication(DemoApplication.class);
			bootstrap.setBanner(new ResourceBanner(new ClassPathResource("banner.txt")));
			bootstrap.setBannerMode(Banner.Mode.CONSOLE);
			ConfigurableApplicationContext context = bootstrap.run(args);

			Environment env = context.getEnvironment();
			String host = InetAddress.getLocalHost().getHostAddress();
			String port = env.getProperty("server.port");
			String contextPath = env.getProperty("server.servlet.context-path");
			contextPath = contextPath == null ? "" : contextPath;
			System.out.println("项目启动完成,地址：http://" + host + ":" + port + contextPath + "/");
			System.out.println("Swagger2接口文档地址：http://" + host + ":" + port + contextPath + "/swagger-ui.html");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
