package com.vaanalves.pokedex.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.vaanalves.pokedex.model.Ability;

public class AbilityRepository {

	private List<Ability> list;
	private static final AbilityRepository INSTANCE = new AbilityRepository();

	private AbilityRepository() {
		list = new ArrayList<Ability>();
	}
	
	public static AbilityRepository getInstance() {
		return INSTANCE;
	}
	
	
	public List<Ability> getAll(Integer offset, Integer limit) {
		if(offset != null && limit != null)
			return this.list.subList(offset, offset + limit);
		return this.list;
	}
	
	public List<Ability> getByIds(List<Integer> ids) {
		return this.list.stream()
					.filter(a -> ids.contains(a.getId()))
					.collect(Collectors.toList());
	}
}
