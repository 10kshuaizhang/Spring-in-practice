package main.java.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages={"main.java.spittr"},
        excludeFilters={
                @Filter(type=FilterType.ANNOTATION, value= EnableWebMvc.class)
        })
public class RootConfig {
}