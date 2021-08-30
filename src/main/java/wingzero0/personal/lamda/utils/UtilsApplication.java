package wingzero0.personal.lamda.utils;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UtilsApplication implements ApplicationRunner {
	private static final Logger logger = LoggerFactory.getLogger(UtilsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UtilsApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("running");

		MyNumber2 one2 = new MyNumber2(BigDecimal.ONE);
		MyNumber2 two2 = new MyNumber2(one2, BigDecimal.valueOf(2.0));
		MyNumber2 three2 = new MyNumber2(two2, BigDecimal.valueOf(3.0));
		LamdaFunc.traversalElementMap(three2, LamdaFunc.doubleIt2).forEach(e -> {
			logger.info(String.format("convert by big decimal %f", e.doubleValue()));
		});
	}
}
