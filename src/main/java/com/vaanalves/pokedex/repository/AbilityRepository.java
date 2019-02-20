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
		int id = 1;
		list.add(Ability.builder().id(id++).name("chlorophyll").build());
		list.add(Ability.builder().id(id++).name("overgrow").build());
		list.add(Ability.builder().id(id++).name("thick-fat").build());
		list.add(Ability.builder().id(id++).name("blaze").build());
		list.add(Ability.builder().id(id++).name("solar-power").build());
		list.add(Ability.builder().id(id++).name("torrent").build());
		list.add(Ability.builder().id(id++).name("rain-dish").build());
		list.add(Ability.builder().id(id++).name("shield-dust").build());
		list.add(Ability.builder().id(id++).name("run-away").build());
		list.add(Ability.builder().id(id++).name("shed-skin").build());
		list.add(Ability.builder().id(id++).name("compound-eyes").build());
		list.add(Ability.builder().id(id++).name("tinted-lens").build());
		list.add(Ability.builder().id(id++).name("shield-dust").build());
		list.add(Ability.builder().id(id++).name("swarm").build());
		list.add(Ability.builder().id(id++).name("sniper").build());
		list.add(Ability.builder().id(id++).name("keen-eye").build());
		list.add(Ability.builder().id(id++).name("tangled-feet").build());
		list.add(Ability.builder().id(id++).name("big-pecks").build());
		list.add(Ability.builder().id(id++).name("guts").build());
		list.add(Ability.builder().id(id++).name("hustle").build());
		list.add(Ability.builder().id(id++).name("gluttony").build());
		list.add(Ability.builder().id(id++).name("intimidate").build());
		list.add(Ability.builder().id(id++).name("unnerve").build());
		list.add(Ability.builder().id(id++).name("static").build());
		list.add(Ability.builder().id(id++).name("lightning-rod").build());
		list.add(Ability.builder().id(id++).name("surge-surfer").build());
		list.add(Ability.builder().id(id++).name("sand-veil").build());
		list.add(Ability.builder().id(id++).name("sand-rush").build());
		list.add(Ability.builder().id(id++).name("snow-cloak").build());
		list.add(Ability.builder().id(id++).name("slush-rush").build());
		list.add(Ability.builder().id(id++).name("poison-point").build());
		list.add(Ability.builder().id(id++).name("rivalry").build());
		list.add(Ability.builder().id(id++).name("sheer-force").build());
		list.add(Ability.builder().id(id++).name("cute-charm").build());
		list.add(Ability.builder().id(id++).name("magic-guard").build());
		list.add(Ability.builder().id(id++).name("friend-guard").build());
		list.add(Ability.builder().id(id++).name("flash-fire").build());
		list.add(Ability.builder().id(id++).name("drought").build());
		list.add(Ability.builder().id(id++).name("snow-warning").build());
		list.add(Ability.builder().id(id++).name("inner-focus").build());
		list.add(Ability.builder().id(id++).name("infiltrator").build());
		list.add(Ability.builder().id(id++).name("stench").build());
		list.add(Ability.builder().id(id++).name("effect-spore").build());
		list.add(Ability.builder().id(id++).name("healer").build());
		list.add(Ability.builder().id(id++).name("dry-skin").build());
		list.add(Ability.builder().id(id++).name("damp").build());
		list.add(Ability.builder().id(id++).name("wonder-skin").build());
		list.add(Ability.builder().id(id++).name("arena-trap").build());
		list.add(Ability.builder().id(id++).name("sand-force").build());
		list.add(Ability.builder().id(id++).name("tangling-hair").build());
		list.add(Ability.builder().id(id++).name("pickup").build());
		list.add(Ability.builder().id(id++).name("technician").build());
		list.add(Ability.builder().id(id++).name("rattled").build());
		list.add(Ability.builder().id(id++).name("limber").build());
		list.add(Ability.builder().id(id++).name("fur-coat").build());
		list.add(Ability.builder().id(id++).name("cloud-nine").build());
		list.add(Ability.builder().id(id++).name("swift-swin").build());
		list.add(Ability.builder().id(id++).name("vital-spirit").build());
		list.add(Ability.builder().id(id++).name("anger-point").build());
		list.add(Ability.builder().id(id++).name("defiant").build());
		list.add(Ability.builder().id(id++).name("justified").build());
		list.add(Ability.builder().id(id++).name("water-absorb").build());
		list.add(Ability.builder().id(id++).name("drizzle").build());
		list.add(Ability.builder().id(id++).name("synchronize").build());
		list.add(Ability.builder().id(id++).name("no-guard").build());
		list.add(Ability.builder().id(id++).name("steadfast").build());
		list.add(Ability.builder().id(id++).name("clear-body").build());
		list.add(Ability.builder().id(id++).name("liquid-ooze").build());
		list.add(Ability.builder().id(id++).name("rock-head").build());
		list.add(Ability.builder().id(id++).name("sturdy").build());
		list.add(Ability.builder().id(id++).name("magnet-pull").build());
		list.add(Ability.builder().id(id++).name("galvanize").build());
		list.add(Ability.builder().id(id++).name("run-away").build());
		list.add(Ability.builder().id(id++).name("flame-body").build());
		list.add(Ability.builder().id(id++).name("oblivious").build());
		list.add(Ability.builder().id(id++).name("own-tempo").build());
		list.add(Ability.builder().id(id++).name("regenerator").build());
		list.add(Ability.builder().id(id++).name("analytic").build());
		list.add(Ability.builder().id(id++).name("early-bird").build());
		list.add(Ability.builder().id(id++).name("hydration").build());
		list.add(Ability.builder().id(id++).name("ice-body").build());
		list.add(Ability.builder().id(id++).name("sticky-hold").build());
		list.add(Ability.builder().id(id++).name("poison-touch").build());
		list.add(Ability.builder().id(id++).name("power-of-alchemy").build());
		list.add(Ability.builder().id(id++).name("shell-armor").build());
		list.add(Ability.builder().id(id++).name("skill-link").build());
		list.add(Ability.builder().id(id++).name("overcoat").build());
		list.add(Ability.builder().id(id++).name("levitate").build());
		list.add(Ability.builder().id(id++).name("cursed-body").build());
		list.add(Ability.builder().id(id++).name("weak-armor").build());
		list.add(Ability.builder().id(id++).name("insomnia").build());
		list.add(Ability.builder().id(id++).name("forewarn").build());
		list.add(Ability.builder().id(id++).name("hyper-cutter").build());
		list.add(Ability.builder().id(id++).name("soundproof").build());
		list.add(Ability.builder().id(id++).name("aftermath").build());
		list.add(Ability.builder().id(id++).name("harvest").build());
		list.add(Ability.builder().id(id++).name("battle-armor").build());
		list.add(Ability.builder().id(id++).name("reckless").build());
		list.add(Ability.builder().id(id++).name("unburden").build());
		list.add(Ability.builder().id(id++).name("iron-fist").build());
		list.add(Ability.builder().id(id++).name("natural-cure").build());
		list.add(Ability.builder().id(id++).name("serene-grace").build());
		list.add(Ability.builder().id(id++).name("leaf-guard").build());
		list.add(Ability.builder().id(id++).name("scrappy").build());
		list.add(Ability.builder().id(id++).name("water-veil").build());
		list.add(Ability.builder().id(id++).name("illuminate").build());
		list.add(Ability.builder().id(id++).name("filter").build());
		list.add(Ability.builder().id(id++).name("light-metal").build());
		list.add(Ability.builder().id(id++).name("dry-skin").build());
		list.add(Ability.builder().id(id++).name("static").build());
		list.add(Ability.builder().id(id++).name("motor-drive").build());
		list.add(Ability.builder().id(id++).name("mold-breaker").build());
		list.add(Ability.builder().id(id++).name("moxie").build());
		list.add(Ability.builder().id(id++).name("aerilate").build());
		list.add(Ability.builder().id(id++).name("imposter").build());
		list.add(Ability.builder().id(id++).name("adaptability").build());
		list.add(Ability.builder().id(id++).name("anticipation").build());
		list.add(Ability.builder().id(id++).name("volt-absorb").build());
		list.add(Ability.builder().id(id++).name("quick-feet").build());
		list.add(Ability.builder().id(id++).name("magic-bounce").build());
		list.add(Ability.builder().id(id++).name("pixilate").build());
		list.add(Ability.builder().id(id++).name("trace").build());
		list.add(Ability.builder().id(id++).name("download").build());
		list.add(Ability.builder().id(id++).name("pressure").build());
		list.add(Ability.builder().id(id++).name("marvel-scale").build());
		list.add(Ability.builder().id(id++).name("multiscale").build());
	}
	
	public static AbilityRepository getInstance() {
		return INSTANCE;
	}
	
	
	public List<Ability> getAll(Integer offset, Integer limit) {
		if(offset != 0 && limit != 0)
			return this.list.subList(offset, offset + limit);
		return this.list;
	}
	
	public List<Ability> getByIds(List<Integer> ids) {
		return this.list.stream()
					.filter(a -> ids.contains(a.getId()))
					.collect(Collectors.toList());
	}
}
