package com.backend.magicosfc.app.modulos.medicos;

import jakarta.persistence.*;

@Entity
@Table (name = "medicos")
public class Medico {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idMedico;

    @Column (name = "nombre")
    String nombre;

    @Column (name = "apellido")
    String apellido;

    @Column (name = "sexo")
    String sexo;

    @Column (name = "edad")
    Long edad;

    @Column (name = "profesion")
    String profesion;

    @Column (name = "num_colegiado")
    String numColegiado;

}
