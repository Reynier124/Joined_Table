package com.example.UM_V_Joined.repositorio;
import com.example.UM_V_Joined.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository <Persona, Long> {
}