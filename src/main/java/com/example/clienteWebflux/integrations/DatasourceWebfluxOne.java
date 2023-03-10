package com.example.clienteWebflux.integrations;

import com.example.clienteWebflux.dto.Anime;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "DataSourcesOne", url = "${webservices.datasource.one.service}")
public interface DatasourceWebfluxOne{

    @GetMapping
    List<Anime> getAnimes();

}
