package co.com.bancolombia.model.technology.gateways;

import co.com.bancolombia.model.technology.Technology;
import reactor.core.publisher.Mono;

public interface TechnologyRepository {

    Mono<Technology> createTechnology(Technology technology);
}
