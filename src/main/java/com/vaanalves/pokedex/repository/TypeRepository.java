package com.vaanalves.pokedex.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.vaanalves.pokedex.model.Type;

public class TypeRepository {

	private List<Type> list;
	private static final TypeRepository INSTANCE = new TypeRepository();

	private TypeRepository() {
		int id = 1;
		list = new ArrayList<Type>();
		list.add(Type.builder().id(id++).name("normal").build());
		list.add(Type.builder().id(id++).name("fighting").build());
		list.add(Type.builder().id(id++).name("flying").build());
		list.add(Type.builder().id(id++).name("poison").build());
		list.add(Type.builder().id(id++).name("ground").build());
		list.add(Type.builder().id(id++).name("rock").build());
		list.add(Type.builder().id(id++).name("bug").build());
		list.add(Type.builder().id(id++).name("ghost").build());
		list.add(Type.builder().id(id++).name("steel").build());
		list.add(Type.builder().id(id++).name("fire").build());
		list.add(Type.builder().id(id++).name("water").build());
		list.add(Type.builder().id(id++).name("grass").build());
		list.add(Type.builder().id(id++).name("electric").build());
		list.add(Type.builder().id(id++).name("psychic").build());
		list.add(Type.builder().id(id++).name("ice").build());
		list.add(Type.builder().id(id++).name("dragon").build());
		list.add(Type.builder().id(id++).name("dark").build());
		list.add(Type.builder().id(id++).name("fairy").build());
		list.add(Type.builder().id(id++).name("unknown").build());
		list.add(Type.builder().id(id++).name("shadow").build());
	}
	
	public static TypeRepository getInstance() {
		return INSTANCE;
	}
	
	
	public List<Type> getAll(Integer offset, Integer limit) {
		if(offset != 0 && limit != 0)
			return this.list.subList(offset, offset + limit);
		return this.list;
	}

	public List<Type> getByIds(List<Integer> ids) {
		return this.list.stream()
				.filter(a -> ids.contains(a.getId()))
				.collect(Collectors.toList());
	}
}
