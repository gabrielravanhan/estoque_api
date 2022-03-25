package br.com.gabriel.estoque_api.model;

import javax.persistence.*;

@Entity
@Table(name="categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nomecurso;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }
}
