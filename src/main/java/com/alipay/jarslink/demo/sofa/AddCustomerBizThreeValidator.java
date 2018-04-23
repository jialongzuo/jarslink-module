package com.alipay.jarslink.demo.sofa;

import com.alibaba.sofa.extension.Extension;
import com.alibaba.sofa.test.customer.Constants;
import com.alibaba.sofa.test.customer.validator.extensionpoint.AddCustomerValidatorExtPt;

/**
 * AddCustomerBizOneValidator
 *
 * @author Frank Zhang
 * @date 2018-01-07 1:31 AM
 */
@Extension(bizCode = Constants.BIZ_3)
public class AddCustomerBizThreeValidator implements AddCustomerValidatorExtPt{

    @Override
    public void validate(Object candidate) {
        System.out.println("executor biz_3 vaildator...");
    }
}
