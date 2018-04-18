package com.co.cbg.sbt.app;

//import java.nio.file.Paths;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;


@Configuration
public class MvcConfig implements WebMvcConfigurer{

	//private final Logger log = LoggerFactory.getLogger(getClass());
	
	/*@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		super.addResourceHandlers(registry);
		///Esto es para agregar directorio uploads externo al proyecto
		

		String resourcePath = Paths.get("uploads").toAbsolutePath().toUri().toString();

		log.info(resourcePath);
		
		registry.addResourceHandler("/uploads/**")
		.addResourceLocations(resourcePath);
	}*/
	

}
