package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;

    private static int numTV;

    public TV (Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        TV.numTV++;
    }

    public Marca getMarca(){
        return this.marca;
    }
    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public Control getControl(){
        return this.control;
    }
    public void setControl(Control control){
        this.control = control;
    }

    public int getPrecio(){
        return this.precio;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }

    public int getVolumen(){
        return this.volumen;
    }
    public void setVolumen(int volumen){
        if (this.estado == true){
            if (volumen >= 0 && volumen <=7){
                this.volumen = volumen;
            }
        }
    }

    public int getCanal(){
        return this.canal;
    }
    public void setCanal(int canal){
        if (this.estado == true){
            if (canal >= 1 && canal <= 120){
                this.canal = canal;
            }
        }
    }

    public static int getNumTV(){
        return numTV;
    }
    public static void setNumTv(int numTV){
        TV.numTV = numTV;
    }

    public void turnOn() {
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }

    public boolean getEstado(){
        return this.estado;
    }

    public void canalUp(){
        if (this.estado == true){
            if (this.canal >= 1 && this.canal < 120){
                this.canal++;
            }
        }
    }
    public void canalDown(){
        if (this.estado == true){
            if (this.canal > 1 && this.canal <= 120){
                this.canal--;
            }
        }
    }

    public void volumenUp(){
        if (this.estado == true){
            if (this.volumen >= 0 && this.volumen < 7){
                this.volumen++;
            }
        }
    }
    public void volumenDown(){
        if (this.estado == true){
            if (this.volumen > 0 && this.volumen <= 7){
                this.canal--;
            }
        }
    }



}
