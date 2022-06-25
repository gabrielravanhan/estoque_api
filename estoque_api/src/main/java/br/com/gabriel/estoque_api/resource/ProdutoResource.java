package br.com.gabriel.estoque_api.resource;

import br.com.gabriel.estoque_api.model.Produto;
import br.com.gabriel.estoque_api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/todos")
    public List<Produto> listarTodosProdutos() {
        return produtoRepository.findAll(Sort.by("nomeproduto").ascending());
    }
}
