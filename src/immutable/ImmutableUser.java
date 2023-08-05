package immutable;

import java.util.Objects;

public final class ImmutableUser {
    private final String firstName;
    private final String lastName;
    private final int age;


    public ImmutableUser(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ImmutableUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableUser that = (ImmutableUser) o;
        return age == that.age && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    public void processUser(ImmutableUser user) {
        // Обработка объекта user
        String fullName = user.getFirstName() + " " + user.getLastName();
        System.out.println("Processing user: " + fullName + ", Age: " + user.getAge());
    }

}