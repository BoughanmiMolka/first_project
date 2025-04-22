package tn.esprit.arctic.first_project.Configurations;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {
    @Before("execution(* tn.esprit.arctic.first_project.service.*.retrieve*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }
    @After("execution(* tn.esprit.arctic.first_project.service.*.add*(..))")
    public void logMethodExit(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Out of method " + name + " : ");
    }
    @AfterReturning("execution(* tn.esprit.arctic.first_project.service.*.add*(..))")
    public void logMethodExit1(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Out of method without errors " + name + " : ");
    }
    @AfterThrowing("execution(* tn.esprit.arctic.first_project.service.*.add*(..))")
    public void logMethodExitThrow(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Throw method " + name + " : ");
    }

}
