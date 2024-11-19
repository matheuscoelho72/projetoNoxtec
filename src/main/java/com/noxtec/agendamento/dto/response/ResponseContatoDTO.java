package com.noxtec.agendamento.dto.response;

import com.noxtec.agendamento.model.Contato;
import jakarta.annotation.Nullable;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class ResponseContatoDTO {

    private long contato_id;


    private String contato_nome;

    private String contato_email;

    private String contato_celular;

    private String contato_telefone;

    private String contato_sn_favorito;

    private String contato_sn_ativo;

    private Timestamp contato_dh_cad;

    public ResponseContatoDTO(Contato contato) {

        this.contato_id = contato.getContato_id();
        this.contato_nome = contato.getContato_nome();
        this.contato_email = contato.getContato_email();
        this.contato_celular = contato.getContato_celular();
        this.contato_telefone = contato.getContato_telefone();
        this.contato_sn_favorito = contato.getContato_sn_favorito();
        this.contato_sn_ativo = contato.getContato_sn_ativo();
        this.contato_dh_cad = contato.getContato_dh_cad();

    }

}
