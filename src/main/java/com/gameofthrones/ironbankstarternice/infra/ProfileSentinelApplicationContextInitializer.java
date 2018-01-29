package com.gameofthrones.ironbankstarternice.infra;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
public class ProfileSentinelApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext context) {
        if (context.getEnvironment().getActiveProfiles().length == 0) {
            throw new RuntimeException("YOU CAN'T RUN WITHOUT PROFILE");
        }
    }
}
