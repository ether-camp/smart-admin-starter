package camp.ether.sa.starter.config;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author Mikhail Kalinin
 * @since 24.12.2015
 */
@Configuration
@ComponentScan("camp.ether.sa.starter.controllers.api.**")
public class ApiConfig {

    @Bean
    public DispatcherServlet apiDispatcherServlet() {
        return new DispatcherServlet();
    }

    @Bean
    public ServletRegistrationBean apiDispatcherServletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(
                apiDispatcherServlet(), "/api/*");
        registration.setName("apiDispatcherServletRegistration");
        return registration;
    }
}
