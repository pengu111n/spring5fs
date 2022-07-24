package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspect.ExeTimeAspect;
import chap07.Calculator;
import chap07.RecCalculator;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppCtx {
	@Bean
	public ExeTimeAspect exeTimeAspect() {
		return new ExeTimeAspect();
	}
	
	// 설정 클래스
	// AOP 적용사 RecCalculator가 상속받은 Calculator 인터페이스를 이용해서 프록시 생성
	@Bean
	public Calculator calculator() {
		return new RecCalculator(); 
						
	}
	
	// 자바 코드:
	//"calculator" 빈의 실제 타입은 Calculator를 상속한 프록시 타입이므로
	//RecCalculator로 타입 변환을 할수 없기 때문에 익셉션 발생
	
}
