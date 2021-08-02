package Controllers;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");// <- assim permite de qualquer origem, troque "/**" pelo seu dominio por exemplo "http://meudominio.com"
    }
}

