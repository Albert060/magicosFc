package com.backend.magicosfc.app.modulos.entrenamientos;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "Entrenamientos")

public class Entrenamiento {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idEntrenamiento;

    @Column (name = "fecha")
    String fecha;

    @Column (name = "tipo")
    String tipo;

    @Column (name = "duracion")
    String duracion;

    @Column (name = "observaciones")
    String observaciones;

    @Column (name = "id_equipo")
    Long idEquipo;

}
