package es.studium.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	@Qualifier("viaje1")
    private Viaje viaje1;

	
	@Autowired
	@Qualifier("viaje2")
    private Viaje viaje2;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(" ");
		System.out.println("El bean "+viaje1.toString()+" ha sido creado correctamente.");
		
		System.out.println(" ");
		System.out.println("El bean "+viaje2.toString()+" ha sido creado correctamente.");
	}

}
