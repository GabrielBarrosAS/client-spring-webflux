package com.example.clienteWebflux.service.datasource.impl;

import com.example.clienteWebflux.converters.impl.DatasourceWebfluxOneConverter;
import com.example.clienteWebflux.dto.Anime;
import com.example.clienteWebflux.dto.GenericDatasourceResponse;
import com.example.clienteWebflux.integrations.DatasourceWebfluxOne;
import com.example.clienteWebflux.service.datasource.interfaces.GenericDatasourceWebflux;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DatasourceWebfluxOneService implements GenericDatasourceWebflux {

    private final DatasourceWebfluxOne datasourceWebfluxOne;

    private final DatasourceWebfluxOneConverter datasourceWebfluxOneConverter;

    @Override
    public List<Anime> converterGenericDatasourceResponsesToAnimes(List<GenericDatasourceResponse> genericDatasourceResponseList) {

        return datasourceWebfluxOneConverter.datasourceResponsesToAnimes(genericDatasourceResponseList);

    }

    @Override
    public List<GenericDatasourceResponse> getAnimes() {
        return datasourceWebfluxOne.getAnimes();
    }
}
