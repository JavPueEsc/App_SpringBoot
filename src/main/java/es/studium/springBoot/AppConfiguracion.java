package es.studium.springBoot;

import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguracion {

	//Viaje 1
	@Bean
	@Qualifier("tripulacion1")
    List<Tripulacion> tripulacion1() {
        return List.of(
            new Tripulacion("Javier", "conductor"),
            new Tripulacion("Laura", "asistente"),
            new Tripulacion("José", "mozo")
        );
    }
	
	@Bean
	@Qualifier("pasajeros1")
    Set<Pasajero> pasajeros1() {
        return Set.of(
            new Pasajero("Luisa", 10),
            new Pasajero("Roberto", 20),
            new Pasajero("Lola", 30)
        );
    }
	
    @Bean
    @Qualifier("tren1")
    Tren tren1(@Qualifier("tripulacion1")List<Tripulacion> tripulacion1) {return new Tren("Ave S-102", 316, tripulacion1);}
    
    @Bean
    @Qualifier("viaje1")
    Viaje viaje1(@Qualifier("tren1") Tren tren1, @Qualifier("pasajeros1")Set<Pasajero> pasajeros1) {
       return new Viaje("Excursión por Zaragoza y Lleida", "Madrid","Lleida", tren1,pasajeros1);}
	
  //Viaje 2
    @Bean
    @Qualifier("tripulacion2")
    List<Tripulacion> tripulacion2() {
        return List.of(
            new Tripulacion("Carmen", "conductora"),
            new Tripulacion("Alfonso", "asistente"),
            new Tripulacion("Carlota", "moza")
        );
    }
  	
    @Bean
    @Qualifier("pasajeros2")
    Set<Pasajero> pasajeros2() {
        return Set.of(
            new Pasajero("Lucas", 11),
            new Pasajero("Raquel", 22),
            new Pasajero("Santiago", 33)
        );
    }
  	
    @Bean
    @Qualifier("tren2")
    Tren tren2(@Qualifier("tripulacion2") List<Tripulacion> tripulacion2) {
        return new Tren("Talgo 250", 250, tripulacion2);
    }
    @Bean
    @Qualifier("viaje2")
    Viaje viaje2(@Qualifier("tren2") Tren tren2, @Qualifier("pasajeros2") Set<Pasajero> pasajeros2) {
        return new Viaje("Excursión por la costa Mediterránea", "Murcia", "Barcelona", tren2, pasajeros2);
    }
  	
}
