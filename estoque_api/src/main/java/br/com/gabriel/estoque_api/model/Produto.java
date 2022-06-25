package br.com.gabriel.estoque_api.model;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String nomeproduto;

    @ManyToOne
    @JoinColumn(name = "categoria")
    private Categoria categoria;


}
