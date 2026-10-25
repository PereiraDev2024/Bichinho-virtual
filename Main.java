public class Main {
    public static void main(String[] args) {
      Bichinho bug = new Bichinho();

        System.out.println("INICIO DO DIA");
        bug.status();
        System.out.println("-------------");

        System.out.println("Hora de brincar:");
        bug.brincar();
        bug.status();
        System.out.println("-------------");

        System.out.println("Tentando brincar novamente:");
        bug.brincar();
        System.out.println("-------------");

        System.out.println("Hora de comer:");
        bug.alimentar();
        bug.status();
        System.out.println("-------------");

        System.out.println("Hora de dormir:");
        bug.dormir();
        bug.status();
        System.out.println("-------------");

        System.out.println("O bichinho está feliz? " + bug.estaFeliz());
    }
}
