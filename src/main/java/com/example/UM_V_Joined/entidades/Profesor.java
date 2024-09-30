package com.example.UM_V_Joined.entidades;

import com.example.UM_V_Joined.enumeraciones.Titulos;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@SuperBuilder
public class Profesor extends Persona{
    @NonNull
    private int cantHijos;


    private LocalDate fechaIngreso;

    @Column( name = "sueldo", precision = 10 , scale = 2)
    private BigDecimal sueldo;

    private Titulos titulo;
}
