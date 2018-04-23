package com.alibaba.sofa.test.customer.entity;

import com.alibaba.sofa.domain.Entity;
import com.alibaba.sofa.test.customer.CustomerType;
import lombok.Data;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Customer Entity
 *
 * @author Frank Zhang
 * @date 2018-01-07 2:38 AM
 */
@Data
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerEntity extends Entity {

    private String companyName;
    private SourceType sourceType;
    private CustomerType customerType;


    public CustomerEntity() {

    }

    public void addNewCustomer() {
    }
}
