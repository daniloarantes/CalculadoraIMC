/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author danilo.asilv10
 */
public class Calculadora {

    private Double peso;
    private Double altura;
    private Double imc;
    private String situacao;

    public Calculadora(Double peso, Double altura) {
        this.peso = peso;
        this.altura = altura;
        calculaIMC();
        defineSituacao();
    }

    private void calculaIMC() {
        imc = peso / Math.pow(altura, 2);
    }

    private void defineSituacao() {

        if (imc < 17) {
            situacao = "Muito abaixo do peso";
        } else if (imc >= 17 && imc < 18.5) {
            situacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            situacao = "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            situacao = "Acima do peso";
        } else if (imc >= 30 && imc < 35) {
            situacao = "Obesidade I";
        } else if (imc >= 35 && imc < 40) {
            situacao = "Obesidade II";
        } else {
            situacao = "Obesidade III";
        }
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @return the altura
     */
    public Double getAltura() {
        return altura;
    }

    /**
     * @return the imc
     */
    public Double getImc() {
        return imc;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

}
