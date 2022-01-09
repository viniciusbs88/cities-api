package com.github.viniciusbs88.citiesapi.countries.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Country {

    @Id
    private long id;
    @Column(name = "nome")
    private String name;
    @Column(name = "nome_pt")
    private String ptName;
    @Column(name = "sigla")
    private String code;
    @Column(name = "bacen")
    private Integer bacen;

    public Country() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPtName() {
        return ptName;
    }

    public String getCode() {
        return code;
    }

    public Integer getBacen() {
        return bacen;
    }
}
