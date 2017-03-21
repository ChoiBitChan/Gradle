package spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {
	
	@Pointcut("execution(public * spring.aop..say*(..))")
	private void aroundPointCut(){}
	
	//around method로 사용할때는 첫번째 매개변수로 ProceedingJoinPoint를 써야한다
	@Around("aroundPointCut()")
	public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable {
		
		Signature s = joinPoint.getSignature();
		String methodName = s.getName();
		long startTime = System.nanoTime();
		
		System.out.println("[Log]METHOD Before : " + methodName + " time check start");
		Object obj = null;
		
		try {
			obj = joinPoint.proceed();
		} catch (Exception e) {
			System.out.println("[Log]METHOD error : " + methodName);
		}
		
		long endTime = System.nanoTime();
		System.out.println("[Log]METHOD After : " + methodName + " time check end");
		System.out.println("[Log]" + methodName + " Processing time is " + (endTime - startTime) + "ns");
		return obj;
		
	}

}
