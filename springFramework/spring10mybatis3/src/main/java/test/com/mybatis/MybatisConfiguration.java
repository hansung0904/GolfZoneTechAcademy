package test.com.mybatis;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@MapperScan("test.com.mapper") // TestMapper 경로
@PropertySource("classpath:jdbc/oracle.properties")
public class MybatisConfiguration {
	private static final Logger logger = LoggerFactory.getLogger(MybatisConfiguration.class);

	@Autowired
	ApplicationContext context;

	@Value("${oracle.DRIVER_NAME}")
	private String DRIVER_NAME;

	@Value("${oracle.URL}")
	private String URL;

	@Value("${oracle.USER}")
	private String USER;

	@Value("${oracle.PASSWORD}")
	private String PASSWORD;
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
          return new PropertySourcesPlaceholderConfigurer();
    }

	@Bean
	public DataSource dataSource() {
		logger.info("dataSource().....");
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(DRIVER_NAME);
		dataSource.setUrl(URL);
		dataSource.setUsername(USER);
		dataSource.setPassword(PASSWORD);
		return dataSource;
	}

	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(@Qualifier("dataSource") DataSource dataSource)
			throws IOException {
		logger.info("sqlSessionFactoryBean().....");
		SqlSessionFactoryBean ssf_bean = new SqlSessionFactoryBean();
		ssf_bean.setDataSource(dataSource);
		ssf_bean.setMapperLocations(context.getResources("classpath:jdbc/sqlMapper_*.xml"));
//		ssf_bean.setMapperLocations(context.getResources("classpath:jdbc/sqlMapper_member.xml"));
		return ssf_bean;
	}

}
