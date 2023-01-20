package com.example.clienteWebflux.integrations;

import com.example.clienteWebflux.dto.GenericDatasourceResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "DataSourcesTwo", url = "${webservices.datasource.two.service}")
public interface DatasourceWebfluxTwo {

    @GetMapping
    List<GenericDatasourceResponse> getAnimes();

}
