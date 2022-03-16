package com.dio_class.devweek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Regiao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Setter @Column(name = "regiao")
    private Long regiaoAvaliada;
    @Setter @Column(name = "total_exames")
    private Long totalDeExames;

    public Regiao(Long regiaoAvaliada, Long quantidadeDeExames) {
        this.regiaoAvaliada = regiaoAvaliada;
        this.totalDeExames = quantidadeDeExames;
    }
}
