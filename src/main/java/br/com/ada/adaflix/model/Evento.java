package br.com.ada.adaflix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Evento {
    @Id
    @GeneratedValue
    private Long id;
    private String cnpj;
    private String empresa;
    private String nome;
    private String descricao;
    private LocalDateTime data;
    private String local;
    private Double preco;
    private Long capacidade;
    private LocalDateTime inicioVendas;
    private LocalDate fimVendas;

    public Evento(Long id, String cnpj, String empresa, String nome, String descricao, LocalDateTime data, String local, Double preco, Long capacidade, LocalDateTime inicioVendas, LocalDate fimVendas) {
        this.id = id;
        this.cnpj = cnpj;
        this.empresa = empresa;
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.local = local;
        this.preco = preco;
        this.capacidade = capacidade;
        this.inicioVendas = inicioVendas;
        this.fimVendas = fimVendas;
    }
    public Evento(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Long getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Long capacidade) {
        this.capacidade = capacidade;
    }

    public LocalDateTime getInicioVendas() {
        return inicioVendas;
    }

    public void setInicioVendas(LocalDateTime inicioVendas) {
        this.inicioVendas = inicioVendas;
    }

    public LocalDate getFimVendas() {
        return fimVendas;
    }

    public void setFimVendas(LocalDate fimVendas) {
        this.fimVendas = fimVendas;
    }
}
