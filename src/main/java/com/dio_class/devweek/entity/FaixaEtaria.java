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
    @Column(nullable = false)
    private Long id;
    @Setter
    private Long faixaI;
    @Setter
    private Long faixaN;
    @Setter
    private String descricao;

    public FaixaEtaria(Long faixaI, Long faixaN, String descricao) {
        this.faixaI = faixaI;
        this.faixaN = faixaN;
        this.descricao = descricao;
    }
}
