package com.vaanalves.pokedex.repository;

import java.util.ArrayList;
import java.util.List;

import com.vaanalves.pokedex.model.Type;

public class TypeRepository {

	private List<Type> list;
	private static final TypeRepository INSTANCE = new TypeRepository();

	private TypeRepository() {
		list = new ArrayList<Type>();
	}
	
	public static TypeRepository getInstance() {
		return INSTANCE;
	}
	
	
	public List<Type> getAll(Integer offset, Integer limit) {
		if(offset != null && limit != null)
			return this.list.subList(offset, offset + limit);
		return this.list;
	}
}
