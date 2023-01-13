package com.gol.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;

//import lombok.RequiredArgsConstructor;

@Configuration
//@RequiredArgsConstructor
@EnableWebSecurity // 시큐리티에 필터로 등록이 된다.
@EnableMethodSecurity(prePostEnabled = true) // 특정주소로 접근하면 권한 및 인증을 미리 첵크하겠다는 뜻.
@RequiredArgsConstructor
public class SecurityConfig {

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfiguration) throws Exception {
        return authConfiguration.getAuthenticationManager();
    }

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests().requestMatchers("/auth/**").permitAll()
                .anyRequest().authenticated();

//        http
//                .formLogin()
//                .loginPage("/auth/loginForm")
//                .defaultSuccessUrl("/")
//                .usernameParameter("userId")
//                .passwordParameter("password")
//                .loginProcessingUrl("/login");

        return http.build();
    }
//    
//    @Bean
//    public WebSecurityCustomizer webSecurityCustomizer() {
//        return (web) -> web.ignoring().requestMatchers("/images/**", "/js/**");
//    }

}