package com.example.clienteWebflux.service.datasource.impl;

import com.example.clienteWebflux.converters.impl.DatasourceWebfluxTwoConverter;
import com.example.clienteWebflux.dto.Anime;
import com.example.clienteWebflux.dto.GenericDatasourceResponse;
import com.example.clienteWebflux.integrations.DatasourceWebfluxTwo;
import com.example.clienteWebflux.service.datasource.interfaces.GenericDatasourceWebflux;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DatasourceWebfluxTwoService implements GenericDatasourceWebflux {

    private final DatasourceWebfluxTwo datasourceWebfluxTwo;

    private final DatasourceWebfluxTwoConverter datasourceWebfluxTwoConverter;

    @Override
    public List<Anime> converterGenericDatasourceResponsesToAnimes(List<GenericDatasourceResponse> genericDatasourceResponseList) {

        return datasourceWebfluxTwoConverter.datasourceResponsesToAnimes(genericDatasourceResponseList);

    }

    @Override
    public List<GenericDatasourceResponse> getAnimes() {
        return datasourceWebfluxTwo.getAnimes();
    }

}
