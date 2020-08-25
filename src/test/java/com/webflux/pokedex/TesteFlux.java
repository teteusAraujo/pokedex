package com.webflux.pokedex;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;

public class TesteFlux {
	@Test
	public void texFlux1() {
		Flux.empty();
	}

	@Test
	public void testFlux2() {
		Flux<String> flux = Flux.just("Pokemon");
		flux.subscribe(System.out::println);
	}

	@Test
	void testFlux3() {
		Flux<String> flux = Flux.just("Sharizard", "Blastoise", "Pixachu");
		flux.subscribe(System.out::println);
	}

}
