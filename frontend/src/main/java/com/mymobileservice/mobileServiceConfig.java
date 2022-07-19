package com.mymobileservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class MobileServiceConfig implements WebApplicationInitializer, WebMvcConfigurer {
  String url = "jdbc:mysql://localhost:3306/mymobileservice";
  String user = "root";
  String password = "root";
  String driver = "com.mysql.cj.jdbc.Driver";

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    // everything that we would put in the web.xml we put here
    // things like:
    // register the dispatcher servlet with the servlet container
    // servlet mappings(url-pattern)
    // load-on startup, etc

    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
    context.scan("com.mymobileservice");

    // need the context loader listener
    // this needs out app context
    servletContext.addListener(new ContextLoaderListener(context));

    // setup our dispatcher
    // have to hand that new dispatcher servlet a blank web.xml (handled by
    // GenericWebApplicationContext)
    ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher",
        new DispatcherServlet(new GenericWebApplicationContext()));
    dispatcher.addMapping("/");
    dispatcher.setLoadOnStartup(1);
  }

  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource(url, user, password);
    dataSource.setDriverClassName(driver);
    return dataSource;
  }

}
