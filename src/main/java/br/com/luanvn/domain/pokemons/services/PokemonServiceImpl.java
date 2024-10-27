package br.com.luanvn.domain.pokemons.services;

import br.com.luanvn.domain.pokemons.models.Pokemon;
import br.com.luanvn.domain.pokemons.repositories.PokemonRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class PokemonServiceImpl implements PokemonService {

    PokemonRepository pokemonRepository;

    @Inject
    public PokemonServiceImpl(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @Override
    public Pokemon create(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    @Override
    public Optional<Pokemon> findById(int id) {
        return pokemonRepository.findById(id);
    }

    @Override
    public List<Pokemon> findAll() {
        return pokemonRepository.findAll();
    }

    @Override
    public Pokemon update(Pokemon pokemon) {
        return pokemonRepository.update(pokemon);
    }

    @Override
    public void delete(int id) {
        pokemonRepository.deleteById(id);
    }

}
