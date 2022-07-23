package aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CasheAspect {
	
	private Map<Long, Object> cache = new HashMap<>();
	
	@Pointcut("execution(public * chap07 ..*(long))")
	public void cacheTarget() {}
	
	@Around("cacheTarget()")
	public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
		Long num = (Long)joinPoint.getArgs()[0];
		if(cache.containsKey(num))
	}
}
