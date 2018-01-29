package com.gameofthrones.ironbankstarternice.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class RavenSenderListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private RavenProperties ravenProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        List<String> recipients = Arrays.asList(ravenProperties.getRecipients().split(","));
        recipients.forEach(recipient -> {
            System.out.println("Raven sent to "+recipient);
        });
    }
}
