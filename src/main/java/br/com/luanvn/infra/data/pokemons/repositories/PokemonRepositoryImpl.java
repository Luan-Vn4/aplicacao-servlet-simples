package br.com.luanvn.infra.data.pokemons.repositories;

import br.com.luanvn.domain.pokemons.models.Pokemon;
import br.com.luanvn.domain.pokemons.repositories.PokemonRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Optional;

// TODO implementação de PokemonRepository
@ApplicationScoped
public class PokemonRepositoryImpl implements PokemonRepository {

    @Override
    public Pokemon save(Pokemon pokemon) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pokemon update(Pokemon pokemon) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Pokemon> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Optional<Pokemon> findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
