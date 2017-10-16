package com.zgwei.springmvc.main;

import com.zgwei.springmvc.aopbusinessrule.EncoreableIntorucer;
import com.zgwei.springmvc.businessrule.CompanctDisc;
import com.zgwei.springmvc.businessrule.Encoreable;
import com.zgwei.springmvc.businessruleImpl.Art;
import com.zgwei.springmvc.businessruleImpl.Perfoemance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zgwei on 2017/9/9.
 */
public class AopTest {


    public static  void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
//        Performance performance = (Performance) ac.getBean("danceperform");
//        performance.perform();


       CompanctDisc companctDisc = (CompanctDisc) context.getBean("blankDisc");
       companctDisc.playTrack(1);
       companctDisc.playTrack(1);

        Art art = (Art) context.getBean("art");
        Encoreable encoreable = (Encoreable) art;
        encoreable.performEncore();


    }



}
