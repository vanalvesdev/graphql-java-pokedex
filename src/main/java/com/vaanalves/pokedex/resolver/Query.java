package com.vaanalves.pokedex.resolver;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.vaanalves.pokedex.model.Ability;
import com.vaanalves.pokedex.model.Pokemon;
import com.vaanalves.pokedex.model.Type;
import com.vaanalves.pokedex.repository.AbilityRepository;
import com.vaanalves.pokedex.repository.PokemonRepository;
import com.vaanalves.pokedex.repository.TypeRepository;

public class Query implements GraphQLRootResolver {

	public List<Pokemon> pokemons(Integer offset, Integer limit) {
		return PokemonRepository.getInstance().getAll(offset, limit);
    }
	
	public List<Ability> abilities(Integer offset, Integer limit) {
		return AbilityRepository.getInstance().getAll(offset, limit);
	}
	
	public List<Type> types(Integer offset, Integer limit) {
		return TypeRepository.getInstance().getAll(offset, limit);
	}
	
	public Pokemon pokemon(Integer id) {
		return PokemonRepository.getInstance().getById(id);
	}
}
