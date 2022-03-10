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
    @Column(nullable = false)
    private Long id;
    @Setter
    private Long regiaoAvaliada;
    @Setter
    private Long quantidadeDeExames;

    public Regiao(Long regiaoAvaliada, Long quantidadeDeExames) {
        this.regiaoAvaliada = regiaoAvaliada;
        this.quantidadeDeExames = quantidadeDeExames;
    }
}
