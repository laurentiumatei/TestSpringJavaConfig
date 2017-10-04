import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.test.repository.CustomerRepository;
import com.test.repository.HibernateCustomerRepositoryImpl;
import com.test.service.CustomerService;
import com.test.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.test"})
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
//	@Bean(name = "customerService")
//	@Scope("prototype")
//	public CustomerService getCustomerService() {
//		CustomerServiceImpl  customerService = new CustomerServiceImpl();
//		//customerService.setCustomerRepository(getCustomerRepository());
//		
//		return customerService;
//		
//	}
	
//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}
}
