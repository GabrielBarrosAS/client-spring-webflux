package com.example.clienteWebflux.converters.impl;

import com.example.clienteWebflux.converters.interfaces.GenericDatasourceWebfluxConverter;
import com.example.clienteWebflux.dto.Anime;
import com.example.clienteWebflux.dto.GenericDatasourceResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DatasourceWebfluxTwoConverter implements GenericDatasourceWebfluxConverter {


    @Override
    public List<Anime> datasourceResponsesToAnimes(List<GenericDatasourceResponse> genericDatasourceResponseList) {

        return genericDatasourceResponseList.stream().map(GenericDatasourceResponse::getT2).collect(Collectors.toList());

    }
}
