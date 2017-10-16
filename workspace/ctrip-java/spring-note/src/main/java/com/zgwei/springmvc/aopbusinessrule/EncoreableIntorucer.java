package com.zgwei.springmvc.aopbusinessrule;

import com.zgwei.springmvc.businessrule.Encoreable;
import com.zgwei.springmvc.businessruleImpl.DefaultEncoreable;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by Avenger on 2017/10/14.
 */
@Aspect
@Component
public class EncoreableIntorucer {

    @DeclareParents(value = "com.zgwei.springmvc.businessruleImpl.Perfoemance+", defaultImpl = DefaultEncoreable.class)
    private  Encoreable encoreable;


}
