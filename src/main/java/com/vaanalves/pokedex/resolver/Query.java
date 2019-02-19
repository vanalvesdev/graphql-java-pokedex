package com.vaanalves.pokedex.resolver;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.vaanalves.pokedex.model.Pokemon;
import com.vaanalves.pokedex.repository.PokemonRepository;

public class Query implements GraphQLRootResolver {

	private PokemonRepository pokemonRepository;
	
	public List<Pokemon> pokemons(Integer offset, Integer limit) {
		return pokemonRepository.getAll(offset, limit);
    }
}
