package es.cursosprhib.mediosdepago;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import es.cursosprhib.mediosdepago.servicio.ServicioConfig;

@SpringBootApplication
@Import({ServicioConfig.class})
public class MainApp {

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	}

}
