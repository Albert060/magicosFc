package com.backend.magicosfc.app.modulos.torneos;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table (name = "torneos")
public class Torneo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idTorneo;

    @Column (name = "nombre")
    String nombre;

    @Column (name = "anio")
    Long anio;

    @Column (name = "fecha_inicio")
    String fechaInicio;

}
