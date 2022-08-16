package com.example.cadastro;

import java.util.Objects;

public class Formulario {

    private String nome;
    private String phone;
    private String email;
    private String genero;
    private String cidade;
    private Boolean ingressaEmail;

    public Formulario(){}

    public Formulario(String nome, String phone, String email, String genero, String cidade, Boolean ingressaEmail) {
        this.nome = nome;
        this.phone = phone;
        this.email = email;
        this.genero = genero;
        this.cidade = cidade;
        this.ingressaEmail = ingressaEmail;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Boolean getIngressaEmail() {
        return ingressaEmail;
    }

    public void setIngressaEmail(Boolean ingressaEmail) {
        this.ingressaEmail = ingressaEmail;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "nome='" + nome + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", genero='" + genero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", ingressaEmail=" + ingressaEmail +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Formulario that = (Formulario) o;
        return Objects.equals(nome, that.nome) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email) && Objects.equals(genero, that.genero) && Objects.equals(cidade, that.cidade) && Objects.equals(ingressaEmail, that.ingressaEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, phone, email, genero, cidade, ingressaEmail);
    }
}
