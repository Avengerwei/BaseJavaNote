package com.zgwei.springmvc.aopbusinessrule;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zgwei on 2017/9/9.
 */
@Component
@Aspect
public class TrackCounterAop {

    private Map<Integer, Integer> trackCounts = new HashMap<>();

    @Pointcut("execution(* com.zgwei.springmvc.businessrule.CompanctDisc.playTrack(int)) && args(trackNumber)")
    public void trackPlayed(int trackNumber){}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
        System.out.println("===== " +currentCount  +" ======");
    }

    public int getPlayCount(int trackNumber){
        return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
    }



}
