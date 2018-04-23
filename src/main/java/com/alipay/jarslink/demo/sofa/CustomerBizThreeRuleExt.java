package com.alipay.jarslink.demo.sofa;

import com.alibaba.sofa.exception.BizException;
import com.alibaba.sofa.extension.Extension;
import com.alibaba.sofa.test.customer.Constants;
import com.alibaba.sofa.test.customer.entity.CustomerEntity;
import com.alibaba.sofa.test.customer.entity.SourceType;
import com.alibaba.sofa.test.customer.entity.rule.CustomerRuleExtPt;

/**
 * CustomerBizOneRuleExt
 *
 * @author Frank Zhang
 * @date 2018-01-07 12:10 PM
 */
@Extension(bizCode = Constants.BIZ_3)
public class CustomerBizThreeRuleExt implements CustomerRuleExtPt {

    @Override
    public boolean addCustomerCheck(CustomerEntity customerEntity) {
        System.out.println("executor biz_3 rule....");
        return true;
    }
}
