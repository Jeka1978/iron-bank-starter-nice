package com.gameofthrones.ironbankstarternice.infra.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

/**
 * @author Evgeny Borisov
 */
public class OnProdCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String answer = JOptionPane.showInputDialog("Is it production?");
        return answer.equalsIgnoreCase("yes");
    }
}
