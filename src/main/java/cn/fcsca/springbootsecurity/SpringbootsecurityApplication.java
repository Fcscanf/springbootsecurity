package cn.fcsca.springbootsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class SpringbootsecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootsecurityApplication.class, args);
    }
}
