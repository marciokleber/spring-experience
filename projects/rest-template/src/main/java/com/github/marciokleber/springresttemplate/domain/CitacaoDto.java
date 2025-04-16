package com.github.marciokleber.springresttemplate.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CitacaoDto(Long id, String citacao) {
}
