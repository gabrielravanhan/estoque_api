package br.com.gabriel.estoque_api.service;

import br.com.gabriel.estoque_api.model.Categoria;
import br.com.gabriel.estoque_api.repository.CategoriaRepository;
import br.com.gabriel.estoque_api.service.Exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> listarTodasCategorias() {
        return categoriaRepository.findAll();
    }

    public Categoria encontrarCategoria(long id) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);

        return categoria.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado!!! id: " + id + " Tipo: " + Categoria.class.getName()
        ));
    }

    public Categoria salvarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}
