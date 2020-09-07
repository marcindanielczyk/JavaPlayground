

class Person implements Comparable{

    private String firstName;
    private String lastName;

    public Person(String firstName,String lastName){

        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Object o){

        if (this == o){
            return 0;
        }

        Person person = (Person) o;

        if (this.lastName.equals(person.getLastName())){
            return this.firstName.compareTo(person.getFirstName());
        }

        return this.lastName.compareTo(person.getLastName());
    }
    public void setFirstName(String firstname) { this.firstName = firstname; }

    public void setLastName(String lastname) { this.lastName = lastname; }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        Person person = (Person) o;

        if (firstName != null ? !firstName.equals(person.firstName): person.firstName != null){
            return false;
        }
        return lastName != null ? lastName.equals(person.lastName) : person.lastName == null;
    }

    @Override
    public int hashCode(){

        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){

        return "Person(" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }
}
