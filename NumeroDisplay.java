

public class NumeroDisplay
{
    private int limite; //estoy modificando
    private int valor;
    
    //***************************************************************
    
    public NumeroDisplay (int limiteDeConteo)
    {
        limite= limiteDeConteo;
        valor=0;
    }
    
    //*****************************************************************
    
    public int getValor()
    {
        return valor;
    }
    
    //********************************************************************
    
    public String getDisplayValor()
    {
        if(valor<10){
            return "0"+ valor;
        }
        else{
            return "" + valor;
        }
    }
    
    //*******************************************************************
    
    
    public void setValor(int valorDeIngreso)
    {
        if((valorDeIngreso >= 0)&&(valorDeIngreso <= limite)){
            valor= valorDeIngreso;
        }
    }
    
    //********************************************************************
    
    public void incrementar()
    {
        valor = (valor + 1)% limite;
    
    }
    
    
    }
