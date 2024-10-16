abstract class Animal {
    private String nome;

    public Animal (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void fazerSom();

    public void dormir() {
        System.out.println(nome + "está dormindo.");
    }
}