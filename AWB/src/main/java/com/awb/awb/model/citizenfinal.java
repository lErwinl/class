package com.awb.awb.model;

import sun.invoke.empty.Empty;

public class citizenfinal {

    private Integer Id=1;
    private String Name="Ricardo Soto Muñoz";
    private Boolean Enabled=Boolean.FALSE;
    private Boolean Vaccinated=Boolean.TRUE;
    private String Vaccination="...";
    private String Brand="Pfizer";
    private Integer Date=1628605800;
    private String Penalty="....";
    private Integer Pdate=12364342;
    private String Reason="Multado por no andar con mascarilla";

    @Override
    public String toString() {
        return "citizenfinal{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Enabled=" + Enabled +
                ", Vaccinated=" + Vaccinated +
                ", Vaccination='" + Vaccination + '\'' +
                ", Brand='" + Brand + '\'' +
                ", Date=" + Date +
                ", Penalty='" + Penalty + '\'' +
                ", Pdate=" + Pdate +
                ", Reason='" + Reason + '\'' +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Boolean getEnabled() {
        return Enabled;
    }

    public void setEnabled(Boolean enabled) {
        Enabled = enabled;
    }

    public Boolean getVaccinated() {
        return Vaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        Vaccinated = vaccinated;
    }

    public String getVaccination() {
        return Vaccination;
    }

    public void setVaccination(String vaccination) {
        Vaccination = vaccination;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public Integer getDate() {
        return Date;
    }

    public void setDate(Integer date) {
        Date = date;
    }

    public String getPenalty() {
        return Penalty;
    }

    public void setPenalty(String penalty) {
        Penalty = penalty;
    }

    public Integer getPdate() {
        return Pdate;
    }

    public void setPdate(Integer pdate) {
        Pdate = pdate;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public citizenfinal(Integer id, String name, Boolean enabled, Boolean vaccinated, String vaccination, String brand, Integer date, String penalty, Integer pdate, String reason) {
        Id = id;
        Name = name;
        Enabled = enabled;
        Vaccinated = vaccinated;
        Vaccination = vaccination;
        Brand = brand;
        Date = date;
        Penalty = penalty;
        Pdate = pdate;
        Reason = reason;
    }
}
