public class App {
    public static void main(String[] args) {

        User newUser = new User();
        Matter matter = new Matter();

        newUser.setName("Victor Hugo");
        newUser.setEmail("victor@teste.com");
        newUser.setPosition("Aluno");
        newUser.setUniversity("Universidade Federal de Lavras");
        newUser.setPeriod(8);

        System.out.println("Carregando Informações do Usuário: \n");
        newUser.getInfoUser();

        System.out.println("\n\nCarregando Matérias: \n");
        matter.getAllMatters();

    }
}
