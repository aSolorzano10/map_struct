package dbo;

import java.util.Objects;

public class PersonDbo {

    private Integer id;

    private String name;

    private String lastName;

    public PersonDbo(Integer id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDbo personDbo = (PersonDbo) o;
        return id.equals(personDbo.id) &&
                name.equals(personDbo.name) &&
                lastName.equals(personDbo.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName);
    }

    @Override
    public String toString() {
        return "PersonDbo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
