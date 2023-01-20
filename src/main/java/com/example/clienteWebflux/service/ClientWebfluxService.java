package com.example.clienteWebflux.service;

import com.example.clienteWebflux.dto.Anime;
import com.example.clienteWebflux.dto.GenericDatasourceResponse;
import com.example.clienteWebflux.service.datasource.impl.DatasourceWebfluxOneService;
import com.example.clienteWebflux.service.datasource.impl.DatasourceWebfluxTwoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ClientWebfluxService {

    private final DatasourceWebfluxOneService datasourceWebfluxOneService;
    private final DatasourceWebfluxTwoService datasourceWebfluxTwoService;

    public ClientWebfluxService(DatasourceWebfluxOneService datasourceWebfluxOneService, DatasourceWebfluxTwoService datasourceWebfluxTwoService) {
        this.datasourceWebfluxOneService = datasourceWebfluxOneService;
        this.datasourceWebfluxTwoService = datasourceWebfluxTwoService;
    }

    public List<Anime> getAnimes() {

        List<GenericDatasourceResponse> genericDatasourceResponseOne = datasourceWebfluxOneService.getAnimes();
        List<Anime> animesDatasourceOne = datasourceWebfluxOneService.converterGenericDatasourceResponsesToAnimes(genericDatasourceResponseOne);

        List<GenericDatasourceResponse> genericDatasourceResponseTwo = datasourceWebfluxTwoService.getAnimes();
        List<Anime> animesDatasourceTwo = datasourceWebfluxTwoService.converterGenericDatasourceResponsesToAnimes(genericDatasourceResponseTwo);

        return convertToSingleList(animesDatasourceOne,animesDatasourceTwo);
    }

    private List<Anime> convertToSingleList(List<Anime> animesDatasourceOne, List<Anime> animesDatasourceTwo) {
        return Stream.concat(animesDatasourceOne.stream(),animesDatasourceTwo.stream()).collect(Collectors.toList());
    }

}
