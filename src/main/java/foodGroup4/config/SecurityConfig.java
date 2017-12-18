//package foodGroup4.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//import foodGroup4.service.LoginService;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	LoginService loginService;
//
//	@Autowired
//	private AuthenticationSuccessHandler authenticationSuccessHandler;
//
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(loginService);
//		auth.authenticationProvider(authenticationProvider());
//	}
//
//	@Bean
//	public DaoAuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider authenticationProvider= new DaoAuthenticationProvider();
//		authenticationProvider.setUserDetailsService(loginService);
//		return authenticationProvider;
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//			.httpBasic()
//			.and()
//			.authorizeRequests()
//			.antMatchers("/food/**")
//			.hasAnyAuthority("ADMIN", "MOD", "USER")
//			.antMatchers("/branch/**")
//			.hasAnyAuthority("ADMIN", "MOD","USER")
//			.antMatchers("/**/register").permitAll()
//			.and()
//			.formLogin()
//				.loginPage("/login")
//				.successHandler(authenticationSuccessHandler)
//				.failureUrl("/login?error")
//				.usernameParameter("username")
//				.passwordParameter("password")
//			.and()
//			.logout()
//				.logoutSuccessUrl("/login?logout")
//			.and()
//			.exceptionHandling()
//				.accessDeniedPage("/403")
//			.and()
//			.csrf()
//				.disable();
//		}
//}
