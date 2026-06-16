package br.com.etechoracio.ingresso.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "TBL_SESSAO")
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_SESSAO")
    private long id;

    @Column (name = "NR_DATA")
    private LocalDate data;

    @Column (name = "NR_HORARIO")
    private LocalTime horario;

    @ManyToOne
    @JoinColumn(name = "ID_FILME")
    private Filme filme;

    @Column (name = "NR_PRECO")
    private double preco;

    @Column (name = "TX_SALA")
    private String sala;




}
