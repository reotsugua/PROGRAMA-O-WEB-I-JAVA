package carro;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Motor motor = new Motor();
        motor.cambio = "AUTOMATICO";
        motor.potencia = 200;
        motor.versao = 2023;

        Motor motor2 = new Motor();
        motor2.cambio = "MANUAL";
        motor2.potencia = 90;
        motor2.versao = 1999;

        Carro carro = new Carro(motor2);
        carro.qtdRodas = 4;
        carro.velocidadeMax = 220;
        carro.rendimentoGasolina = 9;

        System.out.println("Versão do motor do carro criado: " + carro.getMotor().versao);

    }
}
