package com.zgwei.springmvc.businessruleImpl;

import com.zgwei.springmvc.businessrule.Performance;
import org.springframework.stereotype.Component;

/**
 * Created by zgwei on 2017/9/9.
 */
@Component
public class DancerPerform  implements Performance {
    @Override
    public void perform() {
        System.out.println("============Dance Perform=================");
    }
}
