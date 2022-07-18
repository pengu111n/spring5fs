package chap02;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppContext {
	
	@Bean
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요");
		return g;
	}
}
