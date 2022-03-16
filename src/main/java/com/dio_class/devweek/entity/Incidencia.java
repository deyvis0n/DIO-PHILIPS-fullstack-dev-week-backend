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
    @Column(name = "id", nullable = false)
    private Long id;
    @Setter @Column(name = "Regiao_id")
    private Integer regiaoId;
    @Setter @Column(name = "Mes")
    private Integer mes;
    @Setter @Column(name = "Faixa_id")
    private Long faixaId;
    @Setter @Column(name = "Qnt_exames")
    private Integer quantidadeDeExames;

    public Incidencia(Integer regiaoId, Integer mes, Long faixaId, Integer quantidadeDeExames) {
        this.regiaoId = regiaoId;
        this.mes = mes;
        this.faixaId = faixaId;
        this.quantidadeDeExames = quantidadeDeExames;
    }
}
