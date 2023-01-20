package com.example.clienteWebflux.controller;

import com.example.clienteWebflux.dto.Anime;
import com.example.clienteWebflux.service.ClientWebfluxService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("animes")
@Slf4j
public class ClientWebFluxController {

    private final ClientWebfluxService clientWebfluxService;
    @GetMapping
    public List<Anime> getAllAnimesFromSources(){
        return clientWebfluxService.getAnimes();
    }
}
