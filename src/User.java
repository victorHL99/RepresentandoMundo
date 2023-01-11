public class User {
  private String name;
  private String email;
  private String position;
  private String University;
  private int period;

  public void getInfoUser() {
    System.out.println("Nome: " + name);
    System.out.println("Email: " + email);
    System.out.println("Posição: " + position);
    System.out.println("Universidade: " + University);
    System.out.println("Período: " + period);
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getPosition() {
    return position;
  }

  public String getUniversity() {
    return University;
  }

  public int getPeriod() {
    return period;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public void setUniversity(String university) {
    this.University = university;
  }

  public void setPeriod(int period) {
    this.period = period;
  }

}
