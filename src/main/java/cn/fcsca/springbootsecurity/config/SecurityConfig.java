package cn.fcsca.springbootsecurity.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * SecurityConfig
 *
 * @author Fcscanf@樊乘乘
 * @description
 * @date 下午 22:18 2018-08-25
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    /**
     * 定制请求授权规则
     *
     * @param http
     * @return 
     * @author Fcscanf@樊乘乘
     * @date 下午 22:22 2018-08-25 
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("VIP1")
                .antMatchers("/level2/**").hasRole("VIP2")
                .antMatchers("/level3/**").hasRole("VIP3");

        //开启自动配置登录功能
        http.formLogin().loginPage("/userlogin");

        //开启自动配置注销功能,并配置注销成功指向的URL
        http.logout().logoutSuccessUrl("/");

        //开启记住用户
        http.rememberMe().rememberMeParameter("remember");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("Fcscanf").password("123").roles("VIP1","VIP2")
        .and().withUser("Fc").password("123").roles("VIP2","VIP3")
        .and().withUser("Fcsca").password("123").roles("VIP1","VIP3");
    }
}
