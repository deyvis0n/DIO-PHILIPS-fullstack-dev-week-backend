package com.dio_class.devweek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class FaixaEtaria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Setter @Column(name = "Faixa_i")
    private Long faixaI;
    @Setter @Column(name = "Faixa_n")
    private Long faixaN;
    @Setter @Column(name = "Descricao")
    private String descricao;

    public FaixaEtaria(Long faixaI, Long faixaN, String descricao) {
        this.faixaI = faixaI;
        this.faixaN = faixaN;
        this.descricao = descricao;
    }
}
