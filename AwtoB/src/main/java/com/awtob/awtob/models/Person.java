package com.awtob.awtob.models;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class Person {
    @Id
    private int id;
    @Column
    private int citizenId;
    @Column
    private String reason;
    @Column
    private String name;
    @Column
    private Boolean enabled;
    @Column
    private Boolean vaccinated;
    @Column
    private Date vaccination;
    @Column
    private String Brand;
    @Column
    private int datebrand;
    @Column
    private String penalty;
    @Column
    private int datepenalty;


    // Sub clases - Objetos diferentes.

    // Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(int citizenId) {
        this.citizenId = citizenId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public Date getVaccination() {
        return vaccination;
    }

    public void setVaccination(Date vaccination) {
        this.vaccination = vaccination;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getDatebrand() {
        return datebrand;
    }

    public void setDatebrand(int datebrand) {
        this.datebrand = datebrand;
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

    public int getDatepenalty() {
        return datepenalty;
    }

    public void setDatepenalty(int datepenalty) {
        this.datepenalty = datepenalty;
    }

}