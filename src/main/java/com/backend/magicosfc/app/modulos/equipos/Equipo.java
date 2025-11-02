package com.backend.magicosfc.app.modulos.equipos;

import jakarta.persistence.*;

@Entity
@Table (name = "equipos")
public class Equipo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idEquipo;

    @Column (name = "nombre")
    String nombre;

    @Column (name = "estadio")
    String estadio;

    @Column (name = "ciudad")
    String ciudad;

    @Column (name = "pais")
    String pais;

    @Column (name = "ano_fundacion")
    String anoFundacion;

}
