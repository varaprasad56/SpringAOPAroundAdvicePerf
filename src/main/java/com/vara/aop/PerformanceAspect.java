package com.vara.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceAspect {
    public Object calculatePerf(ProceedingJoinPoint pjp) throws Throwable{
        long startTimeInMillis = System.currentTimeMillis();
        Object result = pjp.proceed();
        long endTimeInMillis = System.currentTimeMillis();
        System.out.println("The program took "+(endTimeInMillis-startTimeInMillis)+"ms for execution");
        return result;
    }
}
