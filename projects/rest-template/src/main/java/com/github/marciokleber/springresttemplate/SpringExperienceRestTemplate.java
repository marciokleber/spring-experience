package com.github.marciokleber.springresttemplate;

import com.github.marciokleber.springresttemplate.domain.CitacaoDto;
import com.github.marciokleber.springresttemplate.service.CitacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class SpringExperienceRestTemplate implements CommandLineRunner {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CitacaoService citacaoService;
    private final String API_URL = "http://localhost:8080/rest-template/api/v1/citacao";

    public static void main(String[] args) {
        SpringApplication.run(SpringExperienceRestTemplate.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("SPRING EXPERIENCE REST TEMPLATE PROJECT");

        ResponseEntity<CitacaoDto[]> responseFindAll =
                restTemplate.getForEntity(API_URL, CitacaoDto[].class);
        System.out.println(Arrays.toString(responseFindAll.getBody()));

        ResponseEntity<CitacaoDto> responseFindById =
                restTemplate.getForEntity(API_URL + "/1", CitacaoDto.class);
        System.out.println(responseFindById.getBody());

    }
}
