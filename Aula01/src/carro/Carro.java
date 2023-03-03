package carro;

public class Carro {
    int qtdRodas;
    int velocidadeMax;
    int rendimentoGasolina;
    Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }
}
