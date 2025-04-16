package com.github.marciokleber.springresttemplate.service;

import com.github.marciokleber.springresttemplate.domain.Citacao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CitacaoService {

    private final List<Citacao> citacaos = new ArrayList<Citacao>();

    CitacaoService(){
        citacaos.add(new Citacao(1L, "A vida é como andar de bicicleta. Para manter o equilíbrio, você precisa se manter em movimento.", "Albert Einstein"));
        citacaos.add(new Citacao(2L, "O sucesso é ir de fracasso em fracasso sem perder o entusiasmo.", "Winston Churchill"));
        citacaos.add(new Citacao(3L, "A única maneira de fazer um excelente trabalho é amar o que você faz.", "Steve Jobs"));
        citacaos.add(new Citacao(4L, "Penso, logo existo.", "René Descartes"));
        citacaos.add(new Citacao(5L, "Não espere por oportunidades extraordinárias. Agarre ocasiões comuns e as torne grandes.", "Orison Swett Marden"));
        citacaos.add(new Citacao(6L, "A persistência é o caminho do êxito.", "Charles Chaplin"));
        citacaos.add(new Citacao(7L, "Se você quer alcançar a grandeza, pare de pedir permissão.", "Desconhecido"));
        citacaos.add(new Citacao(8L, "A mente que se abre a uma nova ideia jamais voltará ao seu tamanho original.", "Albert Einstein"));
        citacaos.add(new Citacao(9L, "Não é o mais forte que sobrevive, nem o mais inteligente, mas o que melhor se adapta às mudanças.", "Charles Darwin"));
        citacaos.add(new Citacao(10L, "Você deve ser a mudança que deseja ver no mundo.", "Mahatma Gandhi"));
    }

    public List<Citacao> findAll(){
        return citacaos;
    }

    public Citacao findById(Long id) throws Exception {
        return citacaos.stream()
                .filter(c -> Objects.equals(c.getId(), id))
                .findFirst()
                .orElseThrow(() -> new Exception("Citação não encontrada com id: " + id));
    }
}
