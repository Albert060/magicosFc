package com.backend.magicosfc.app.modulos.partidos;

import jakarta.persistence.*;


@Entity
@Table (name = "partidos")
public class Partido {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idPartido;

    @Column (name = "rival")
    String rival;

    @Column (name = "lugar")
    String lugar;

    @Column (name = "fecha")
    String fecha;

    @Column (name = "hora")
    String hora;

}
