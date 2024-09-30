package com.example.UM_V_Joined;

import com.example.UM_V_Joined.entidades.Alumno;
import com.example.UM_V_Joined.entidades.Profesor;
import com.example.UM_V_Joined.enumeraciones.Especialidades;
import com.example.UM_V_Joined.enumeraciones.Titulos;
import com.example.UM_V_Joined.repositorio.AlumnoRepository;
import com.example.UM_V_Joined.repositorio.PersonaRepository;
import com.example.UM_V_Joined.repositorio.ProfesorRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class UmVJoinedApplication {
	private static final Logger logger = LoggerFactory.getLogger(UmVJoinedApplication.class);

	@Autowired
	private PersonaRepository personaRepository;
	@Autowired
	private ProfesorRepository profesorRepository;
	@Autowired
	private AlumnoRepository alumnoRepository;

	public static void main(String[] args) {
		SpringApplication.run(UmVJoinedApplication.class, args);
		System.out.println("funcionando");
	}

	@Bean
	@Transactional
	CommandLineRunner init(PersonaRepository personaRepository,
						   AlumnoRepository alumnoRepository,
						   ProfesorRepository profesorRepository) {
		return args -> {
			// Creo un objeto alumno
			Profesor pro1 = Profesor.builder()
					.nombre("Alberto")
					.apellido("Cortez")
					.fechaIngreso(LocalDate.of(2022, 1, 1))
					.cantHijos(2)
					.titulo(Titulos.MASTER)
					.sueldo(new BigDecimal("123.45"))
					.build();

			// Lo grabo a través del repositorio de Spring
			profesorRepository.save(pro1);

			Alumno al1 = Alumno.builder()
					.nombre("Marcelo")
					.apellido("Lopez")
					.legajo(44890)
					.especialidad(Especialidades.BACHILLER)
					.build();

			// Lo grabo a través del repositorio de Spring
			alumnoRepository.save(al1);
		};
	};
};
