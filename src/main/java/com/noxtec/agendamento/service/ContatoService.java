package com.noxtec.agendamento.service;

import com.noxtec.agendamento.dto.request.RequestContatoDTO;
import com.noxtec.agendamento.dto.response.ResponseContatoDTO;

import java.util.List;

public interface ContatoService {

    ResponseContatoDTO findById(Long id);

    List<ResponseContatoDTO> findAll();

    ResponseContatoDTO create(RequestContatoDTO requestContatoDTO);

    ResponseContatoDTO update(Long id, RequestContatoDTO requestContatoDTO);

    String deleteById(Long id);
}
