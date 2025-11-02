package com.backend.magicosfc.app.modulos.utileros;

import jakarta.persistence.*;

@Entity
@Table (name = "utileros")
public class Utilero {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idUtilero;

    @Column (name = "nombre")
    String nombre;

    @Column (name = "apellido")
    String apellido;

    @Column (name = "sexo")
    String sexo;

    @Column (name = "edad")
    Long edad;

    @Column (name = "fecha_inicio")
    String fechaIncio;

}
