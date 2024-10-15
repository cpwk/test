package com.cp.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Monitor {

    NodeEnum node();

}

@Aspect
@Component
@Order(0)
class MonitorHandlerAspect {

    /**
     * 切入点
     */
    @Pointcut("@annotation(com.cp.test.aop.Monitor)")
    public void HandlerPointcut() {
    }

    /**
     * 增强处理主流程
     */
    @Around("HandlerPointcut()")
    public <T> T handleControllerMethod(ProceedingJoinPoint pjp) throws Throwable {

        // 获取方法名
        String methodName = pjp.getSignature().getName();

        // 获取方法所属类
        Class<?> classTarget = pjp.getTarget().getClass();

        // 获取方法参数类型
        Class<?>[] par = ((MethodSignature) pjp.getSignature()).getParameterTypes();

        // 获取方法
        Method objMethod = classTarget.getMethod(methodName, par);

        // 获取方法上的注解
        Monitor monitor = objMethod.getAnnotation(Monitor.class);

        try {
            // 手动控制该方法执行
            T proceed = (T) pjp.proceed();

            // 日志正常记录
            this.record(monitor);
            return proceed;
        } catch (Throwable e) {
            // 日志异常记录
            this.recordException(monitor, e);
            throw e;
        }
    }

    /**
     * @desc: 正常日志记录
     */
    private void record(Monitor monitor) {
        if (NodeEnum.A.equals(monitor.node())) {
            System.out.println("我是正常日志切面处理，监控到被标记A节点的方法执行了，正在记录日志中。。。");
        }
        if (NodeEnum.B.equals(monitor.node())) {
            System.out.println("我是正常日志切面处理，监控到被标记B节点的方法执行了，正在记录日志中。。。");
        }
    }

    /**
     * @desc: 异常日志记录
     */
    private void recordException(Monitor monitor, Throwable e) {
        if (NodeEnum.A.equals(monitor.node())) {
            System.out.println("我是异常日志切面处理，监控到被标记A节点的方法执行时异常了，异常信息是" + e);
        }
        if (NodeEnum.B.equals(monitor.node())) {
            System.out.println("我是异常日志切面处理，监控到被标记B节点的方法执行时异常了，异常信息是" + e);
        }
    }
}
