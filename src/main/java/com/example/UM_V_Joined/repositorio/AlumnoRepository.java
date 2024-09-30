package com.example.UM_V_Joined.repositorio;

import com.example.UM_V_Joined.entidades.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository <Alumno, Long> {
}