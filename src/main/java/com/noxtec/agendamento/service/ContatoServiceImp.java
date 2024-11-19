package com.noxtec.agendamento.service;

import com.noxtec.agendamento.dto.request.RequestContatoDTO;
import com.noxtec.agendamento.dto.response.ResponseContatoDTO;
import com.noxtec.agendamento.model.Contato;
import com.noxtec.agendamento.repository.ContatoRepository;
import com.noxtec.agendamento.util.ContatoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Primary
@RequiredArgsConstructor
public class ContatoServiceImp implements ContatoService {

    private final ContatoRepository contatoRepository;

    private final ContatoMapper contatoMapper;

    @Override
    public ResponseContatoDTO findById(Long id) {

       try {
           Contato contato = returnContato(id);
           return contatoMapper.toResponseContatoDto(contato);
       } catch (Exception e) {
           return null;
       }

    }

    @Override
    public List<ResponseContatoDTO> findAll() {

        return  contatoMapper.contatoDTOS(contatoRepository.findAll());

    }

    @Override
    public ResponseContatoDTO create(RequestContatoDTO requestContatoDTO) {

        Contato contato = contatoMapper.toContato(requestContatoDTO);

        return contatoMapper.toResponseContatoDto(contatoRepository.save(contato));
    }

    @Override
    public ResponseContatoDTO update(Long id, RequestContatoDTO requestContatoDTO) {

        Contato contato = returnContato(id);

        contatoMapper.updateContatoData(contato, requestContatoDTO);

        return contatoMapper.toResponseContatoDto(contatoRepository.save(contato));

    }

    @Override
    public String deleteById(Long id) {

        try {
            Contato contato = returnContato(id);
            contatoRepository.deleteById(id);
            return "Contato removido com sucesso!";
        }catch (Exception e){
            return "Contato não encontrado na base de dados!";
        }

    }

    private Contato returnContato(Long id){
        return contatoRepository.findById(id).orElseThrow(() -> new RuntimeException("O contato não foi achado na sua lista."));
    }
}
