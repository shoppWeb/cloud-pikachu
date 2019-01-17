package com.cloud.pikachu.gateway.component.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter(){
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration config =new CorsConfiguration();
        config.setAllowCredentials(true);
        config.setAllowedOrigins(Arrays.asList("*")); // http://www.a.com
        config.setAllowedHeaders(Arrays.asList("*")); //所有的请求头
        config.setAllowedMethods(Arrays.asList("*")); //所有的请求方式
        config.setMaxAge(300L);//缓存时间 在300秒内相同的跨域请求不再检查


        source.registerCorsConfiguration("/**",config);
        return new CorsFilter(source);
    }
}
