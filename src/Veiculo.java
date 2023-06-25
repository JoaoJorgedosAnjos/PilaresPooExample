/*Abastração
Para a classe ser abstrada ela precisa ter "abstract" antes do class name
Abstrada porque eu não sei como uma das coisas ou as coisas acontecem
Nesse exemplo vamos usar o metodo ligar()
Todos os veiculos precisam ligar, mas, o processo, a mecanica é diferente

*/

public abstract class Veiculo {
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    //Abstração
    //Uma unica finalidade com comportamentos diferentes
    //O carro e a moto ligam, mas, de formas diferentes
    public abstract void ligar();
}
