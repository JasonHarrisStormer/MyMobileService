package com.mymobileservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobileServiceConfig implements WebApplicationInitializer, WebMvcConfigurer {
  String url = "jdbc:mysql://localhost:3306/mymobileservice";
  String user = "root";
  String password = "root";
  String driver = "com.mysql.cj.jdbc.Driver";

}
