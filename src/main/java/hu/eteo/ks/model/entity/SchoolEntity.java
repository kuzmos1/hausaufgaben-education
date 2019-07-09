package hu.eteo.ks.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity(name= "school")
public class SchoolEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "schoolName")
    private String schoolName;

    @Column(name= "preis")
    private int preis;

    @Column(name = "address")
    private String address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private StudentEntity student;

    public SchoolEntity(){

    }

    public SchoolEntity(String schoolName, int preis, String address) {
        this.schoolName = schoolName;
        this.preis = preis;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolEntity that = (SchoolEntity) o;
        return preis == that.preis &&
                Objects.equals(id, that.id) &&
                Objects.equals(schoolName, that.schoolName) &&
                Objects.equals(address, that.address) &&
                Objects.equals(student, that.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, schoolName, preis, address, student);
    }

    @Override
    public String toString() {
        return "SchoolEntity{" +
                "id=" + id +
                ", schoolName='" + schoolName + '\'' +
                ", preis=" + preis +
                ", address='" + address + '\'' +
                ", student=" + student +
                '}';
    }
}
