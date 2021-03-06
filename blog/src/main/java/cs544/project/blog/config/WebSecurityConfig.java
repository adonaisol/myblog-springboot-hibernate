package cs544.project.blog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import javax.sql.DataSource;
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private DataSource dataSource;
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().anyRequest().permitAll();
       /* http
        
            .authorizeRequests()
                .antMatchers("/","/resources/static/**","/assets/**", "/home", "/index","/resources/**", "/registration","/login","/api/**","/addPerson").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
            .loginPage("/views/login.jsp")
          //  .usernameParameter("username")
           // .passwordParameter("password")
          .defaultSuccessUrl("/views/secure.jsp")
        //  .failureForwardUrl("/login")
          .loginProcessingUrl("/login")
            	.permitAll()
            	
            	.and()
            .logout()
            	.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            	.deleteCookies("JSESSIONID")
				.invalidateHttpSession(true)
            	.logoutSuccessUrl("/index")
                .permitAll();*/
             //   .and().csrf().disable();
    }

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		/*auth.inMemoryAuthentication().withUser("k@gmail.com").password("k").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("h@gmail.com").password("h").roles("USER");*/
		/*auth.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery(
			"select username,password, enabled from users where username=?")
		.authoritiesByUsernameQuery(
			"select username, role from user_roles where username=?");*/
		
	}
}