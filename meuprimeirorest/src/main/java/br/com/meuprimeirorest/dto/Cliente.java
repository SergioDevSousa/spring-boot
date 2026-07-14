package br.com.meuprimeirorest.dto;

import jakarta.annotation.Nonnull;
import org.jspecify.annotations.NonNull;

public class Cliente {

    @Nonnull
    private String nome;
    private String sobrenome;
    private Integer idade;

    public @NonNull String getNome() {
        return nome;
    }

    public void setNome(@NonNull String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}