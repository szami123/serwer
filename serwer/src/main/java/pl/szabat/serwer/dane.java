package pl.szabat.serwer;

import java.time.LocalDate;

public class dane {

private Long id;
private String model;
private String marka;
private LocalDate productionYear;

    public dane() {
    }

    public dane(Long id, String marka, String model, LocalDate productionYear) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.productionYear = productionYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() { return marka; }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(LocalDate productionYear) {
        this.productionYear = productionYear;
    }
}
