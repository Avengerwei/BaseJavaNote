package com.zgwei.springmvc.businessruleImpl;

import com.zgwei.springmvc.businessrule.Encoreable;
import org.springframework.stereotype.Component;

/**
 * Created by Avenger on 2017/10/14.
 */
@Component
public class DefaultEncoreable implements Encoreable {
    @Override
    public void performEncore() {
            System.out.println("AOP ===========  Performance ===== ");
    }
}
