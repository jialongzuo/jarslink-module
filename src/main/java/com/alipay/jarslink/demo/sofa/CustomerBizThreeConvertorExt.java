package com.alipay.jarslink.demo.sofa;

import com.alibaba.sofa.extension.Extension;
import com.alibaba.sofa.test.customer.Constants;
import com.alibaba.sofa.test.customer.CustomerCO;
import com.alibaba.sofa.test.customer.convertor.CustomerConvertor;
import com.alibaba.sofa.test.customer.convertor.CustomerConvertorExtPt;
import com.alibaba.sofa.test.customer.entity.CustomerEntity;
import com.alibaba.sofa.test.customer.entity.SourceType;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * CustomerBizOneConvertorExt
 *
 * @author Frank Zhang
 * @date 2018-01-07 3:05 AM
 */
@Extension(bizCode = Constants.BIZ_3)
public class CustomerBizThreeConvertorExt implements CustomerConvertorExtPt {

    @Autowired
    private CustomerConvertor customerConvertor;//Composite basic convertor to do basic conversion

    @Override
    public CustomerEntity clientToEntity(CustomerCO customerCO){
        System.out.println("do CustomerBizOneConvertorExt extension2.....");

        CustomerEntity customerEntity = customerConvertor.clientToEntity(customerCO);
        //In this business, if customers from RFQ and Advertisement are both regarded as Advertisement
        if(Constants.SOURCE_AD.equals(customerCO.getSource()) || Constants.SOURCE_RFQ.equals(customerCO.getSource()))
        {
            customerEntity.setSourceType(SourceType.AD);
        }
        System.out.println("executor biz_3 convertor....");

        return customerEntity;
    }
}
