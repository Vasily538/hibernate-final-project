package com.javarush.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "country", schema = "world")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "code", length = 3, nullable = false)
    private String code;
    @Column(name = "code_2", length = 2, nullable = false)
    private String code_2;
    @Column(name = "name", length = 52, nullable = false)
    private String name;
    @Column(name = "continent", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Continent continent;
    @Column(name = "region", length = 26, nullable = false)
    private String region;
    @Column(name = "surface_area", nullable = false)
    private BigDecimal surfaceArea;
    @Column(name = "indep_year")
    private short indepYear;
    @Column(name = "population", nullable = false)
    private int population;
    @Column(name = "life_expectancy")
    private BigDecimal lifeExpectancy;
    @Column(name = "gnp")
    private BigDecimal gnp;
    @Column(name = "gnpo_id")
    private BigDecimal gnpoId;
    @Column(name = "local_name", length = 45, nullable = false)
    private String localName;
    @Column(name = "government_form", length = 45, nullable = false)
    private String governmentForm;
    @Column(name = "head_of_state", length = 60)
    private String headOfState;
    @OneToOne
    @JoinColumn(name = "id")
    private City capital;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    private Set<CountryLanguage> languages;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode_2() {
        return code_2;
    }

    public void setCode_2(String code_2) {
        this.code_2 = code_2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public BigDecimal getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(BigDecimal surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public short getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(short indepYear) {
        this.indepYear = indepYear;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public BigDecimal getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(BigDecimal lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public BigDecimal getGnp() {
        return gnp;
    }

    public void setGnp(BigDecimal gnp) {
        this.gnp = gnp;
    }

    public BigDecimal getGnpoId() {
        return gnpoId;
    }

    public void setGnpoId(BigDecimal gnpoId) {
        this.gnpoId = gnpoId;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public Set<CountryLanguage> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<CountryLanguage> languages) {
        this.languages = languages;
    }
}
