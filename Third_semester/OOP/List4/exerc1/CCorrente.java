/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List4.exerc1;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class CCorrente {
    private int numero;
    private double saldo;
    
    public CCorrente(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public void creditar(double valor){
        this.saldo += valor;
    }
    
    public void debitar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public  double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    @Override
    public String toString(){
        return "Conta: " + this.numero + ". Saldo: " + this.saldo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.numero;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CCorrente other = (CCorrente) obj;
        return this.numero == other.numero;
    }
}