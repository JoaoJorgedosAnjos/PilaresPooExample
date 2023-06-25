public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("787978979");
        //jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("4564654564");
        //z400.ligar();

        //Veiculo é classe generica
        //se eu usar z400 ou o jeep ele vai poder usar o metodo ligar, mas, vai usar dependedo de quem ele se basear
        //Comportamenteo vai ser mediante ao polimofismo de cada uma das classes que ela extende
        Veiculo coringa = z400;
        coringa.ligar();
    }
}
