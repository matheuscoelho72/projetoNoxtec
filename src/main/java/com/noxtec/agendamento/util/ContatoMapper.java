package com.noxtec.agendamento.util;

import com.noxtec.agendamento.dto.request.RequestContatoDTO;
import com.noxtec.agendamento.dto.response.ResponseContatoDTO;
import com.noxtec.agendamento.model.Contato;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ContatoMapper {

    public Contato toContato(RequestContatoDTO contatoDTO){

        return Contato.builder()
                .contato_nome(contatoDTO.getContato_nome())
                .contato_email(contatoDTO.getContato_email())
                .contato_celular(contatoDTO.getContato_celular())
                .contato_telefone(contatoDTO.getContato_telefone())
                .contato_sn_favorito(contatoDTO.getContato_sn_favorito())
                .contato_sn_ativo(contatoDTO.getContato_sn_ativo())
                .contato_dh_cad(contatoDTO.getContato_dh_cad()).build();

    }

    public ResponseContatoDTO toResponseContatoDto(Contato contato){

        return new ResponseContatoDTO(contato);
    }

    public List<ResponseContatoDTO> contatoDTOS(List<Contato> contatoList){
        return contatoList.stream().map(ResponseContatoDTO::new).collect(Collectors.toList());
    }

    public void updateContatoData(Contato contato, RequestContatoDTO contatoDTO){

        contato.setContato_nome(contatoDTO.getContato_nome());
        contato.setContato_email(contatoDTO.getContato_email());
        contato.setContato_celular(contatoDTO.getContato_celular());
        contato.setContato_telefone(contatoDTO.getContato_telefone());
        contato.setContato_sn_ativo(contatoDTO.getContato_sn_ativo());
        contato.setContato_sn_favorito(contatoDTO.getContato_sn_favorito());
        contato.setContato_dh_cad(contatoDTO.getContato_dh_cad());

    }

}
