package dev.pixellogic.authguardian.config;

import com.github.javafaker.Faker;
import dev.pixellogic.authguardian.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.ArrayList;
import java.util.List;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"dev.pixellogic.authguardian"})
public class AppConfig {


    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }


    @Bean
    public Faker faker() {
        return new Faker();
    }


    @Bean
    public List<User> users(Faker faker) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            users.add(User.builder()
                    .userName(faker.name().username())
                    .password("123")
                    .email(faker.name().title())
                    .build());
        }
        return users;
    }


}
