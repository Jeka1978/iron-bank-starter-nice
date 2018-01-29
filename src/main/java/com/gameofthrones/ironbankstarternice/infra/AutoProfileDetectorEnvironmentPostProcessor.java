package com.gameofthrones.ironbankstarternice.infra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author Evgeny Borisov
 */
public class AutoProfileDetectorEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication springApplication) {
        if (environment.getActiveProfiles().length == 0) {
            if (getTempreature() < -250) {
                environment.addActiveProfile("WINTER_IS_HERE");
            } else {
                environment.addActiveProfile("WINTER_IS_COMING");
            }
        }
    }

    private int getTempreature() {
        return -273;

    }
}
