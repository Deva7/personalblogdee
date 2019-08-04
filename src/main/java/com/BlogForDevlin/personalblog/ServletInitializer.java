package com.BlogForDevlin.personalblog;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @program: personalblog
 * @author: Devlin
 * @create: 2019-08-03 22:02
 **/

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PersonalblogApplication.class);
	}

}
