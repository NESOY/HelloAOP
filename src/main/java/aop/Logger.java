package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by NESOY on 2017-01-25.
 */
@Aspect
public class Logger {
    @Pointcut("execution(void aop.*.sound())") // expression
    private void selectSound(){ // PointCut signature

    }

    @Before("selectSound()")
    public void aboutToSound(){
        System.out.println("Before : Sound ");
    }
}