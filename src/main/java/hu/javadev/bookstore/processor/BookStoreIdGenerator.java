package hu.javadev.bookstore.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import hu.javadev.bookstore.model.HasId;

@Component
public class BookStoreIdGenerator implements BeanPostProcessor {

    private long nextId = 1;

    public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
        if (bean instanceof HasId) {
            HasId beanWithId = (HasId) bean;
            beanWithId.setId(nextId);
            nextId++;
        }

        return bean;
    }

    public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
        return bean;
    }

}
