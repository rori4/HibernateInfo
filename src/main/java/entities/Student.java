package entities;

import java.time.LocalDate;

public class Student {
    private long id;
    private String name;
    private LocalDate registrationDate;

    public Student() {}

    public Student(String name, LocalDate registrationDate) {
        this.name = name;
        this.registrationDate = registrationDate;
    }

    public LocalDate getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
