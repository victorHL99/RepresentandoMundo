public class Matter {

  private String[] nameMatters = { "Cálculo", "Física", "Álgebra Linear", "Química" };

  public void getAllMatters() {
    for (int i = 0; i < nameMatters.length; i++) {
      System.out.println(nameMatters[i]);
    }
  }
}
