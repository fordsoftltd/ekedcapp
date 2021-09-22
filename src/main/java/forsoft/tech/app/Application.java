package forsoft.tech.app;

import java.util.concurrent.Executor;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "forsoft.tech.app")
@EnableJpaRepositories(basePackages = "forsoft.tech.app.repo")
@EnableTransactionManagement
@EnableWebMvc
@EnableSpringDataWebSupport
@EnableAsync
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
//        @Bean
//  ServletRegistrationBean jsfServletRegistration (ServletContext servletContext) {
//      //spring boot only works if this is set
//      servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
//
//      //registration
//      ServletRegistrationBean srb = new ServletRegistrationBean();
//      srb.setServlet(new FacesServlet());
//      srb.setUrlMappings(Arrays.asList("*.xhtml"));
//      srb.setLoadOnStartup(1);
//      return srb;
//  }
@Bean(name = "asyncExecutor")
    public Executor asyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(3);
        executor.setMaxPoolSize(3);
        executor.setQueueCapacity(100);
        executor.setThreadNamePrefix("FORDSOFT-");
        executor.initialize();
        return executor;
    }
}
