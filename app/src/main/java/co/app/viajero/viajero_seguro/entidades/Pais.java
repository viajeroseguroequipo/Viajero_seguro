package co.app.viajero.viajero_seguro.entidades;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

/**
 * Created by tecno on 1/07/2019.
 */

public class Pais {

    private String pais;
    private String dato;
    //private Integer documento;
    private String cod;
    private String idioma;
    private String moneda;
    private String requisitos;
    private Bitmap imagen;
    private String rutaImagen;
    private String ida;
    private String ids;
    private String idt;
    private String idc;


    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    /*    public Integer getDocumento() {
            return documento;
        }
    */

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;

        try {
            byte[] byteCode= Base64.decode(dato,Base64.DEFAULT);
            //this.imagen= BitmapFactory.decodeByteArray(byteCode,0,byteCode.length);

            int alto=100;//alto en pixeles
            int ancho=150;//ancho en pixeles

            Bitmap foto= BitmapFactory.decodeByteArray(byteCode,0,byteCode.length);
            this.imagen=Bitmap.createScaledBitmap(foto,alto,ancho,true);


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Bitmap getImagen() {
        return imagen;
    }

    public void setImagen(Bitmap imagen) {
        this.imagen = imagen;
    }

     /*public void setDocumento(Integer documento) {
        this.documento = documento;
    }
*/

    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {this.cod = cod;}

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIdioma() {
        return idioma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getMoneda() {
        return moneda;
    }
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getRequisitos() { return requisitos;  }
    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getIda() {
        return ida;
    }
    public void setIda(String ida) {
        this.ida = ida;
    }

    public String getIds() {
        return ids;
    }
    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getIdt() {
        return idt;
    }
    public void setIdt(String idt) {
        this.idt = idt;
    }

    public String getIdc() {
        return idc;
    }
    public void setIdc(String idc) {
        this.idc = idc;
    }
}


