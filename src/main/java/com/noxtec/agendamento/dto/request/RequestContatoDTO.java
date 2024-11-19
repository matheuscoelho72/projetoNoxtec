package com.noxtec.agendamento.dto.request;

import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class RequestContatoDTO {

    private String contato_nome;

    private String contato_email;

    private String contato_celular;

    private String contato_telefone;

    private String contato_sn_favorito;

    private String contato_sn_ativo;

    private Timestamp contato_dh_cad;
}
