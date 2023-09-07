package doky.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Flux<String> flux = Flux.just("A");
		Flux<String> flux2 = flux.map(i -> "foo" + i);
		flux.subscribe(System.out::println);
	}

}
