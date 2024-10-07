package mechanic;

import transport.Transport;

public class Mechanic {
    private String fio;
    private String company;

    public Mechanic(String fio, String company) {
        this.fio = fio;
        this.company = company;
    }

    public void carryOutMaintenance(Transport<?> transport) {
        System.out.println("Произведено ТО автомобиля " + transport.getMark());
    }

    public void fixTheCar(Transport<?> transport) {
        System.out.println("Произведён ремонт автомобиля " + transport.getMark());
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Механик: " +
                fio + ", компания: " +
                company;
    }
}
