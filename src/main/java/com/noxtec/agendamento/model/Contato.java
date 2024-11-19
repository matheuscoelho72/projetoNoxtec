package com.noxtec.agendamento.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "contato")
@Getter
@Setter
@NoArgsConstructor
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contato_id", nullable = false, unique = true, updatable = false)
    @Setter(AccessLevel.NONE)
    private long contato_id;

    @Column(name = "contato_nome", nullable = false)
    private String contato_nome;

    @Column(name = "contato_email")
    private String contato_email;

    @Column(name = "contato_celular", nullable = false)
    private String contato_celular;

    @Column(name = "contato_telefone")
    private String contato_telefone;

    @Column(name = "contato_sn_favorito", nullable = false)
    private String contato_sn_favorito;

    @Column(name = "contato_sn_ativo", nullable = false)
    private String contato_sn_ativo;

    @Column(name = "contato_dh_cad", nullable = false)
    private Timestamp contato_dh_cad;

    @Builder
    public Contato(long contato_id, String contato_nome, String contato_email, String contato_celular, String contato_telefone, String contato_sn_favorito, String contato_sn_ativo, Timestamp contato_dh_cad) {
        this.contato_id = contato_id;
        this.contato_nome = contato_nome;
        this.contato_email = contato_email;
        this.contato_celular = contato_celular;
        this.contato_telefone = contato_telefone;
        this.contato_sn_favorito = contato_sn_favorito;
        this.contato_sn_ativo = contato_sn_ativo;
        this.contato_dh_cad = contato_dh_cad;
    }

}
