package com.backend.magicosfc.app.modulos.jugadores;

import jakarta.persistence.*;

@Entity
@Table (name = "jugadores")
public class Jugador {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idJugador;

    @Column (name = "nombre")
    String nombre;

    @Column (name = "apellido")
    String apellido;

    @Column (name = "sexo")
    String sexo;

    @Column (name = "edad")
    Long edad;

    @Column (name = "categoria")
    String categoria;

    @Column (name = "numero")
    Long numero;

    @Column (name = "posicion")
    String posicion;

    @Column (name = "estatura")
    double estatura;

    @Column (name = "nacionalidad")
    String nacionalidad;

    @Column (name = "pierna_dominante")
    String piernaDominante;

}
