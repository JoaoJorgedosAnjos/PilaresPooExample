public class Carro extends Veiculo {
    //Encapsulamento
    //Só tenho um metodo publico, que vai ser acessado pelo usuario
    //os outros dois são privados e só podem ser acessdos dentro da classe

    //Herança
    //classe extends (classe que vamos pegar os atributos)
    //Dessa forma não precisar reescrever os mesmo atributos, getter e setters para carro e moto
    //Com a classe veiculo podemos deixar os atributos em comum dentro dela e usar nas duas
    public void ligar(){
        conferirCambio();
        conferirCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void conferirCombustivel(){
        System.out.println("Conferindo combustivél");
    }
    private void conferirCambio(){
        System.out.println("Conferindo cambio em P");
    }
}
