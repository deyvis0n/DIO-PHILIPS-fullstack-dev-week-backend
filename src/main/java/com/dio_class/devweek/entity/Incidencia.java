package com.dio_class.devweek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Incidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Setter
    private Integer regiaoId;
    @Setter
    private Integer mes;
    @Setter
    private Long faixaId;
    @Setter
    private Integer quantidadeDeExames;

    public Incidencia(Integer regiaoId, Integer mes, Long faixaId, Integer quantidadeDeExames) {
        this.regiaoId = regiaoId;
        this.mes = mes;
        this.faixaId = faixaId;
        this.quantidadeDeExames = quantidadeDeExames;
    }
}
