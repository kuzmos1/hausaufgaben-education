package hu.eteo.ks.model.dto;

import java.util.Objects;

public class SchoolDto {

    private String schoolName;
    private int preis;
    private String address;

    public SchoolDto(String schoolName, int preis, String address) {
        this.schoolName = schoolName;
        this.preis = preis;
        this.address = address;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolDto schoolDto = (SchoolDto) o;
        return preis == schoolDto.preis &&
                Objects.equals(schoolName, schoolDto.schoolName) &&
                Objects.equals(address, schoolDto.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, preis, address);
    }

    @Override
    public String toString() {
        return "SchoolDto{" +
                "schoolName='" + schoolName + '\'' +
                ", preis=" + preis +
                ", address='" + address + '\'' +
                '}';
    }
}
