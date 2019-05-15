package com.productsmgmt.productsmgmt.config;

import com.productsmgmt.productsmgmt.MyProductsMgmtWebAppApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MyProductsMgmtWebAppApplication.class);
	}

}