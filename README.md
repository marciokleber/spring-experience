### Projeto laboral para testes dos projetos do ecossitema java e spring

> "O projeto foi construido atraves de uma aplicação spring boot default e
> organizada em package/project com sua propria classe  principal(entrypoint)
> anotada com <b>@SpringBootApplication</b> e um profile maven respectivo"
> 
> O starter de cada package/project é executado pelo comando:
> > ```
> > mvn spring-boot:run -P<profile>
>> ```
> tendo um profile default <i><b>main</b></i>.

### Backlog
> "A aplicação foi remodelada para a arquitetura de multi-modulos/multi-project"
> Cada modulo representa um sub-projeto.
> sendo executado pelo comando:
> > ```
> > mvn clean spring-boot:run -pl <modulo>
>> ```
> sendo o projeto pai um agregador <i><b>(sendo removido o escopo do spring)</b></i>.