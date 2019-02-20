package com.vaanalves.pokedex.model;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {
	private Integer id;
	private String name;
	private double height;
	private double weight;
	private List<Integer> abilitiesIds;
	private List<Integer> typesIds;
	private BigDecimal padrao ;
}
