package ExerciseP2.Map;

import java.util.Objects;

public class Animal {
    private String KindOf;
    private String Name;
    public Animal() {
    }

    public Animal(String kindOf, String name) {
        KindOf = kindOf;
        Name = name;
    }

    public String getKindOf() {
        return KindOf;
    }

    public void setKindOf(String kindOf) {
        KindOf = kindOf;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(KindOf, animal.KindOf) &&
                Objects.equals(Name, animal.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name);
    }
}
