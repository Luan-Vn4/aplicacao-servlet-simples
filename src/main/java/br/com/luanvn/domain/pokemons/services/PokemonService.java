package br.com.luanvn.domain.pokemons.services;

import br.com.luanvn.domain.pokemons.models.Pokemon;

import java.util.List;
import java.util.Optional;

public interface PokemonService {

    Pokemon create(Pokemon pokemon);

    Optional<Pokemon> findById(int id);

    List<Pokemon> findAll();

    Pokemon update(Pokemon pokemon);

    void delete(int id);

}
