package com.backend.magicosfc.app.modulos.resultados;

import jakarta.persistence.*;

@Entity
@Table (name = "resultadosPartidos")
public class Resultado {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idResultado;

    @Column (name = "goles_locales")
    Long golesLocales;

    @Column (name = "goles_visitante")
    Long golesVisitante;

    @Column (name = "vencedor")
    String vencedor;

    @Column (name = "id_partido")
    Long idPartido;

}
