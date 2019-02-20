package com.vaanalves.pokedex.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.vaanalves.pokedex.model.Ability;
import com.vaanalves.pokedex.model.Pokemon;
import com.vaanalves.pokedex.model.Type;


public class PokemonRepository {

	private List<Pokemon> list;
	private static final PokemonRepository INSTANCE = new PokemonRepository();

	private PokemonRepository() {
		list = new ArrayList<Pokemon>();
		int id = 1;
		list.add(Pokemon.builder().id(id++).name("bulbasaur").padrao(BigDecimal.valueOf(5454.05)).height(0.7).weight(6.9).typesIds(getTypesId("grass", "poison")).abilitiesIds(getAbilitiesId("overgrow", "chlorophyll")).build());
		list.add(Pokemon.builder().id(id++).name("ivysaur").height(1).weight(13).typesIds(getTypesId("grass", "poison")).abilitiesIds(getAbilitiesId("overgrow", "chlorophyll")).build());
		list.add(Pokemon.builder().id(id++).name("venusaur").height(2).weight(100).typesIds(getTypesId("grass", "poison")).abilitiesIds(getAbilitiesId("overgrow", "chlorophyll")).build());
		list.add(Pokemon.builder().id(id++).name("charmander").height(0.6).weight(8.5).typesIds(getTypesId("fire")).abilitiesIds(getAbilitiesId("blaze", "solar-powder")).build());
		list.add(Pokemon.builder().id(id++).name("charmeleon").height(1.1).weight(19).typesIds(getTypesId("fire")).abilitiesIds(getAbilitiesId("blaze", "solar-powder")).build());
		list.add(Pokemon.builder().id(id++).name("charizard").height(1.7).weight(90.5).typesIds(getTypesId("fire", "dragon")).abilitiesIds(getAbilitiesId("blaze", "solar-powder")).build());
		list.add(Pokemon.builder().id(id++).name("squirtle").height(0.5).weight(9).typesIds(getTypesId("water")).abilitiesIds(getAbilitiesId("torrent", "rain-dish")).build());
		list.add(Pokemon.builder().id(id++).name("wartortle").height(1).weight(22.5).typesIds(getTypesId("water")).abilitiesIds(getAbilitiesId("torrent", "rain-dish")).build());
		list.add(Pokemon.builder().id(id++).name("blastoise").height(1.6).weight(85.5).typesIds(getTypesId("water")).abilitiesIds(getAbilitiesId("torrent", "rain-dish")).build());
	}
	
	public static PokemonRepository getInstance() {
		return INSTANCE;
	}
	
	
	public List<Pokemon> getAll(Integer offset, Integer limit) {
		if(offset != 0 && limit != 0)
			return this.list.subList(offset, offset + limit);
		return this.list;
	}
	
	public Pokemon getById(Integer id) {
		return this.list.stream()
					.filter(p -> p.getId().equals(id))
					.findFirst()
					.orElse(null);
	}
	
	private List<Integer> getAbilitiesId(String... names) {
		List<String> list = Arrays.asList(names);
		return AbilityRepository.getInstance().getAll(0, 0)
						.stream()
						.filter(a -> list.contains(a.getName()))
						.map(Ability::getId)
						.collect(Collectors.toList());
	}
	
	private List<Integer> getTypesId(String... types) {
		List<String> list = Arrays.asList(types);
		return TypeRepository.getInstance().getAll(0, 0)
						.stream()
						.filter(a -> list.contains(a.getName()))
						.map(Type::getId)
						.collect(Collectors.toList());
	}
}
