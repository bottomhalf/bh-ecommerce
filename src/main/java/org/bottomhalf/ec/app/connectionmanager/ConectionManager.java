/**
 * 
 */
package org.bottomhalf.ec.app.connectionmanager;
import javax.activation.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author istiyaq
 *
 */

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:hibernate.properties")
@EnableJpaRepositories(
		basePackages="org.bottomhalf.ec",
		entityManagerFactoryRef="dbEntityManager",
		transactionManagerRef="dbTransactionManager"
)
public class ConectionManager {
	@Autowired
	Environment env;
	
	
	@Primary
	@Bean("dbEntityManager")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		return null;
	}
	
	/**
	 * @return
	 */
	@Primary
	@Bean("dbDataSource")
	public DataSource dbDataSource() {
		return null;
	}
	
	@Autowired
	@Bean("sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		return null;
	}
	
	@Primary
	@Bean("dbTransactionManager")
	public PlatformTransactionManager transactionManager() {
		return null;
	}
}
