public class Bichinho {
  private String nome = "Bug";
  private int fome = 90;
  private int energia = 70;
  private int felicidade = 60;
  private boolean doente = false;

  public void alimentar()
  {
    fome = limitar(fome - 30);
    felicidade = limitar(felicidade + 5);
    atualizarDoenca();
  }
  
  public void brincar()
  {
    if (doente) {
      System.out.println(nome + " está doente e se recusa a brincar.");
      return;
    }
   felicidade = limitar(felicidade + 20);
   energia = limitar(energia - 15);
   fome = limitar(fome + 10);
   atualizarDoenca();
  }

  public void dormir()
  {
   energia = 100;
   fome = limitar(fome + 20);
   atualizarDoenca();
  }

  public boolean estaFeliz()
  {
    if(felicidade >= 70)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public void status()
  {
    System.out.println("Nome: " + nome);
    System.out.println("Fome: " + fome);
    System.out.println("Energia: " + energia);
    System.out.println("Felicidade: " + felicidade);
    System.out.println("Doente: " + doente);
  }

private int limitar(int valor)
{
    if (valor < 0)
    {
        return 0;
    }

    if (valor > 100)
    {
        return 100;
    }

    return valor;
}

  private void atualizarDoenca() {
   doente = fome == 100;
}

}