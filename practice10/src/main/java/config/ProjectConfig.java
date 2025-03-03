package config;

import aspects.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import service.CommentService;

@Configuration
@ComponentScan(basePackages = {"service", "aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {

}
