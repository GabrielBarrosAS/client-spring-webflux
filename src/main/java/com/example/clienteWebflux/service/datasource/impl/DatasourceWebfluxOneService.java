package com.example.clienteWebflux.service.datasource.impl;

import com.example.clienteWebflux.dto.Anime;
import com.example.clienteWebflux.integrations.DatasourceWebfluxOne;
import com.example.clienteWebflux.service.datasource.interfaces.GenericDatasourceWebflux;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DatasourceWebfluxOneService implements GenericDatasourceWebflux {

    private final DatasourceWebfluxOne datasourceWebfluxOne;

    @Override
    public List<Anime> getAnimes() {
        return datasourceWebfluxOne.getAnimes();
    }
}
