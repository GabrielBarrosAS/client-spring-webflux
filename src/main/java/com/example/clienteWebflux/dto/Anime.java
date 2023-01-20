package com.example.clienteWebflux.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
public class Anime {
    private Integer id;
    private String name;
    private String source;
}

