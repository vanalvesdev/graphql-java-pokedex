package com.vaanalves.pokedex.servlet;

import javax.servlet.annotation.WebServlet;

import com.coxautodev.graphql.tools.SchemaParser;
import com.vaanalves.pokedex.resolver.PokemonResolver;
import com.vaanalves.pokedex.resolver.Query;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8278376476930926825L;

	public GraphQLEndpoint() {
		super(buildSchema());
	}

	private static GraphQLSchema buildSchema() {
		 return SchemaParser.newParser()
				 .file("schema.graphql")
				 .resolvers(
						 new Query(),
						 new PokemonResolver())
				 .build()
				 .makeExecutableSchema();
	}


}
