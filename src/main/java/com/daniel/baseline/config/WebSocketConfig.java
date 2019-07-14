package com.daniel.baseline.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    /* Subscription Configuration */
    public static final String ENDPOINT = "/subscribe";
    public static final String ALLOWED_ORIGINS = "*";
    public static final String SOCKET_URL = ENDPOINT + "/websocket";

    /* URL Configuration */
    public static final String TOPIC = "/topic";

    public static final String USER = "/user/queue";

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker(TOPIC);
        config.setApplicationDestinationPrefixes("/");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint(ENDPOINT).setAllowedOrigins(ALLOWED_ORIGINS).withSockJS();
    }
}