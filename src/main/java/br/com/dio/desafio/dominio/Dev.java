package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private  String nome;
    private Set<Conteudo> conteudosIscristos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosCocluidos = new LinkedHashSet<>();

    public void increverBootcamp(Bootcamp bootcamp){}

    public void progredir()  {}

    public void calcularTotalXp() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIscristos() {
        return conteudosIscristos;
    }

    public void setConteudosIscristos(Set<Conteudo> conteudosIscristos) {
        this.conteudosIscristos = conteudosIscristos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosIscristos, dev.conteudosIscristos) && Objects.equals(conteudosCocluidos, dev.conteudosCocluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIscristos, conteudosCocluidos);
    }

    public Set<Conteudo> getConteudosCocluidos() {
        return conteudosCocluidos;


    }

    public void setConteudosCocluidos(Set<Conteudo> conteudosCocluidos) {
        this.conteudosCocluidos = conteudosCocluidos;
    }
}
