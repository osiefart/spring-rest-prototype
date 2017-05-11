package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;

@SpringBootApplication
@EnableDiscoveryClient
@EnableStubRunnerServer
@AutoConfigureStubRunner
public class FinapiMockApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinapiMockApplication.class, args);
	}
}
