package com.example.clienteWebflux.service;

import com.example.clienteWebflux.dto.Anime;
import com.example.clienteWebflux.service.datasource.impl.DatasourceWebfluxOneService;
import com.example.clienteWebflux.service.datasource.impl.DatasourceWebfluxTwoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Log4j2
public class ClientWebfluxService {

    private final DatasourceWebfluxOneService datasourceWebfluxOneService;
    private final DatasourceWebfluxTwoService datasourceWebfluxTwoService;

    public ClientWebfluxService(DatasourceWebfluxOneService datasourceWebfluxOneService, DatasourceWebfluxTwoService datasourceWebfluxTwoService) {
        this.datasourceWebfluxOneService = datasourceWebfluxOneService;
        this.datasourceWebfluxTwoService = datasourceWebfluxTwoService;
    }

    public List<Anime> getAllAnimes() {

        log.info("Iniciando busca de todos os animes");

        List<Anime> animesDatasourceOne = datasourceWebfluxOneService.getAnimes();

        List<Anime> animesDatasourceTwo = datasourceWebfluxTwoService.getAnimes();

        log.info("Processamento finalizado");

        return convertToSingleList(animesDatasourceOne,animesDatasourceTwo);
    }

    public List<Anime> getAnimesDatasourceOne() {

        log.info("Iniciando busca de todos os animes");

        List<Anime> animesDatasourceOne = datasourceWebfluxOneService.getAnimes();

        log.info("Processamento finalizado");

        return animesDatasourceOne;
    }

    public List<Anime> getAnimesDatasourceTwo() {

        log.info("Iniciando busca de todos os animes");

        List<Anime> animesDatasourceTwo = datasourceWebfluxTwoService.getAnimes();

        log.info("Processamento finalizado");

        return animesDatasourceTwo;
    }

    private List<Anime> convertToSingleList(List<Anime> animesDatasourceOne, List<Anime> animesDatasourceTwo) {
        return Stream.concat(animesDatasourceOne.stream(),animesDatasourceTwo.stream()).collect(Collectors.toList());
    }

}
