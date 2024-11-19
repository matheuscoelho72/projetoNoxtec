package com.noxtec.agendamento.controller;

import com.noxtec.agendamento.dto.request.RequestContatoDTO;
import com.noxtec.agendamento.dto.response.ResponseContatoDTO;
import com.noxtec.agendamento.service.ContatoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/contato")
@RequiredArgsConstructor
public class ContatoController {

    private final ContatoService contatoService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ResponseContatoDTO> findById(@PathVariable(name = "id") Long id) {

        return ResponseEntity.ok().body(contatoService.findById(id));

    }

    @GetMapping
    public ResponseEntity<List<ResponseContatoDTO>> findAll() {

        return ResponseEntity.ok().body(contatoService.findAll());

    }

    @PostMapping
    public ResponseEntity<ResponseContatoDTO> save(@RequestBody RequestContatoDTO contatoDTO) { //, UriComponentsBuilder uriBuilder) {

        ResponseContatoDTO contatoDto = contatoService.create(contatoDTO);

        //URI uri = uriBuilder.path("/contato/{id}").buildAndExpand(contatoDto.getContato_id()).toUri();

        return ResponseEntity.ok().body(contatoDto);

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ResponseContatoDTO> update(@RequestBody RequestContatoDTO contatoDTO, @PathVariable(name = "id") Long id) {

        return ResponseEntity.ok().body(contatoService.update(id, contatoDTO));

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable(name = "id") Long id) {

        return ResponseEntity.ok().body(contatoService.deleteById(id));

    }

}