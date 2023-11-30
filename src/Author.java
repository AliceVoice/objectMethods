public class Author {
    private String firstName;
    private String lastName;
    private String fullName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.firstName;
    }

    public String getFullName() {
        return this.fullName;
    }

    @Override
    public String toString() {
        return "Имя и фамилия автора: " + this.fullName;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author lebedeva = (Author) other;
        return fullName.equals(lebedeva.fullName);
    }

    public int hashCode() {
        return java.util.Objects.hash(fullName);
    }
}