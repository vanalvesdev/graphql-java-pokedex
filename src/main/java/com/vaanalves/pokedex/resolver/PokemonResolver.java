package com.vaanalves.pokedex.resolver;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.vaanalves.pokedex.model.Ability;
import com.vaanalves.pokedex.model.Pokemon;
import com.vaanalves.pokedex.model.Type;
import com.vaanalves.pokedex.repository.AbilityRepository;
import com.vaanalves.pokedex.repository.TypeRepository;

public class PokemonResolver implements GraphQLResolver<Pokemon>{

	
	public List<Ability> abilities(Pokemon pokemon) {
		return AbilityRepository.getInstance().getByIds(pokemon.getAbilitiesIds());
	}
	
	public List<Type> types(Pokemon pokemon) {
		return TypeRepository.getInstance().getByIds(pokemon.getAbilitiesIds());
	}
}
