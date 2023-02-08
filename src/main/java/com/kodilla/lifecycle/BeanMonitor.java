package com.kodilla.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.slf4j.LoggerFactory.*;
public class BeanMonitor implements BeanPostProcessor {

    private final Logger logger = LoggerFactory.getLogger(BeanMonitor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before initialization of bean: " + beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("After initialziation of bean: " + beanName);
        logger.debug("Created bean: " + beanName);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

}
