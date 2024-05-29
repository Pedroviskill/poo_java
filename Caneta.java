
package com.mycompany.aula4;

/**
 *
 * @author pedroviskill
 */
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public  Caneta(){ // metodo construtor
        this.tampar();
        this.cor="azul";
        this.modelo="BIC";
        this.ponta=0.5f;
        
        
    }
    
    
    
    public String getModelo(){
        return this.modelo;
    }
    
    
    public void setmodelo(String m){
        this.modelo=m;
    }
    
    public float getPonta(){
    return this.ponta;
    }
    
    public void setPonta(float p){
         this.ponta=p;
    }
    
    public void destampar(){
        this.tampada=false;
    }
    
    public void tampar(){
            this.tampada=true;
        }
     
    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println(" Modelo:"+ this.modelo);
        System.out.println("Ponta:"+this.ponta);
        System.out.println("Cor:"+this.cor);
        System.out.println("Tampada:"+ this.tampada);
    }
    
    
}
