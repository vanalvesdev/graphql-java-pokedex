package com.vaanalves.pokedex.repository;

import java.util.ArrayList;
import java.util.List;

import com.vaanalves.pokedex.model.Pokemon;


public class PokemonRepository {

	private List<Pokemon> list;
	public static final PokemonRepository INSTANCE = new PokemonRepository();

	private PokemonRepository() {
		list = new ArrayList<Pokemon>();
	}
	
	public static PokemonRepository getInstance() {
		return INSTANCE;
	}
	
	
	public List<Pokemon> getAll(Integer offset, Integer limit) {
		if(offset != null && limit != null)
			return this.list.subList(offset, offset + limit);
		return this.list;
	}
}
