package com.backend.magicosfc.app.modulos.usuarios;

import jakarta.persistence.*;

@Entity
@Table (name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idUsuario;

    @Column (name = "nombre")
    String nombre;

    @Column (name = "apellido")
    String apellido;

    @Column (name = "email")
    String email;

    @Column (name = "contrasena")
    String contrasena;

    @Column (name = "fecha_inicio")
    String fechaInicio;

}
