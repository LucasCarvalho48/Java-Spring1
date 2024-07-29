package padroes.projetos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "padroes.projetos.service")
public class PadroesProjetosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetosSpringApplication.class, args);
	}

}
