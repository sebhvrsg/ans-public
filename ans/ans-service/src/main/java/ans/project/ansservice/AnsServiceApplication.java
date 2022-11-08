package ans.project.ansservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class AnsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnsServiceApplication.class, args);
		// pushing on a branch ongoing 2
		// transition in JIRA
	}

}
