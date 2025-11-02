package com.backend.magicosfc.app.modulos.estadisticas;

import jakarta.persistence.*;

@Entity
@Table (name = "estadisticaJugador")
public class Estadistica {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idEstadistica;

    @Column (name = "goles")
    Long goles;

    @Column (name = "asistencias")
    Long asistencias;

    @Column (name = "tarjetas")
    Long tarjetas;

    @Column (name = "minutos_jugados")
    Long minutosJugados;

    @Column (name = "id_jugador")
    Long idJugador;

    @Column (name = "id_partido")
    Long idPartido;

}
