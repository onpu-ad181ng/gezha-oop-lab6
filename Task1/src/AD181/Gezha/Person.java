package AD181.Gezha;

public abstract class Person {
  private String surname = "";
  private String name = "";
  private int age = 0;

  Person(String surname, String name, int age) {
    this.setSurname(surname);
    this.setName(name);
    this.setAge(age);
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSurname() {
    return this.surname;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public abstract String printInfo();
}
