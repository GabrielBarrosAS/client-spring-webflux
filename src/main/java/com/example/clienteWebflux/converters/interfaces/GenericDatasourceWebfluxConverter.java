package com.example.clienteWebflux.converters.interfaces;

import com.example.clienteWebflux.dto.Anime;
import com.example.clienteWebflux.dto.GenericDatasourceResponse;

import java.util.List;

public interface GenericDatasourceWebfluxConverter {

    List<Anime> datasourceResponsesToAnimes(List<GenericDatasourceResponse> genericDatasourceResponseList);

}
