package com.example.clienteWebflux.service.datasource.interfaces;

import com.example.clienteWebflux.dto.Anime;
import com.example.clienteWebflux.dto.GenericDatasourceResponse;

import java.util.List;

public interface GenericDatasourceWebflux {

    List<GenericDatasourceResponse> getAnimes();

    List<Anime> converterGenericDatasourceResponsesToAnimes(List<GenericDatasourceResponse> genericDatasourceResponseList);

}
