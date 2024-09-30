package com.example.UM_V_Joined.repositorio;
import com.example.UM_V_Joined.entidades.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository <Profesor,Long >{
}
