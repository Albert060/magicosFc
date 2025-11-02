package com.backend.magicosfc.app.modulos.cuerpoTecnico;

import jakarta.persistence.*;

@Entity
@Table(name = "cuerpoTecnico")

public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idTecnico;

    @Column (name = "nombre")
    String nombre;

    @Column (name = "apellido")
    String apellido;

    @Column (name = "sexo")
    String sexo;

    @Column (name = "edad")
    Long edad;

    @Column (name = "cargo")
    String cargo;

    @Column (name = "num_entrenador")
    String numEntrenador;

    @Column (name = "nacionalidad")
    String nacionalidad;

}














