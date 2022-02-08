package repasopoo;

public class Coche {
 private int ruedas;
 private int largo;
  private int ancho;
 private int motor;
 private int peso_plataforma;
 private String color;
 int peso_total;
 boolean asientos_cueros,climatizador;
 
 public Coche(){
     ruedas=4;
     largo=2000;
     ancho=300;
     motor=1600;
     peso_plataforma= 500;
     color= "azul";
 }
    public int dame_largo(){
        return largo;
    }
         
    public int getRuedas() {
        return ruedas;
    }



    public int getAncho() {
        return ancho;
    }

    public int getMotor() {
        return motor;
    }

    public int getPeso() {
        return peso_plataforma;
    }
    public void establece_color2(){
       color= "negro";
    }
    public void estable_color(String color_coche){
        color= color_coche;
    }
    public String dime_color(){
        return "El color del coche es " + color;
    }
    public String dime_datosgenerales(){
    return "El auto tiene " + ruedas + "ruedas y un peso de la plataforma de " + peso_plataforma + " kgs" ;
    }
    public void configura_asientos(String asientos_cueros){
        if (asientos_cueros.equalsIgnoreCase("si")){
//  if (asientos_cueros=="si"){
            this.asientos_cueros= true;
        }else{
            this.asientos_cueros= false;
        }
    }
    public String dime_asientos(){
        if (asientos_cueros==true){
            return "El coche tiene asiento de cuero";
        } else {
            return "El coche tiene asiento de tela";
        }
    }
    public void configura_climatizador(String climatizador){
         if (climatizador=="si"){
            this.climatizador= true;
        }else{
            this.climatizador= false;
        }
    }
    public String dime_climatizador(){
                if (climatizador==true){
            return "El coche tiene climatizador";
        } else {
            return "El coche no tiene climatizador";
        }
    }
}
