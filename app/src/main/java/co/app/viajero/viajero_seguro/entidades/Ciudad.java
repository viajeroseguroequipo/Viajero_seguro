package co.app.viajero.viajero_seguro.entidades;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

/**
 * Created by tecno on 1/07/2019.
 */

public class Ciudad{

    //private Integer documento;
        private String c1;
        private String c2;
        private String c3;
        private String c4;
        private String c5;
        private String c6;
        private String c7;
        private String c8;
        private String c9;
        private String c10;
        private String c11;
        private String c12;
        private String c13;
        private String c14;
        private String c15;
        private String c16;
        private String c17;
        private String c18;
    private String c19;
    private String c20;
    private String c21;
    private String c22;
    private String c23;
    private String c24;
    private String c25;
    private String c26;
    private String c27;
    private String c28;
    private String c29;
    private String c30;
    private String c31;
    private String c32;
    private String c33;
    private String c34;
        private String dato;
        private Bitmap imagen;
        private String rutaImagen;


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

    public String getC1() {
            return c1;
        }
    public void setC1(String c1) {this.c1 = c1;}
    public String getC2() {
        return c2;
    }
    public void setC2(String c2) {this.c2 = c2;}
    public String getC3() {
        return c3;
    }
    public void setC3(String c3) {this.c3 = c3;}
    public String getC4() {return c4;}
    public void setC4(String c4) {this.c4 = c4;}
    public String getC5() {return c5;}
    public void setC5(String c5) {this.c5 = c5;}
    public String getC6() {return c6;}
    public void setC6(String c6) {this.c6 = c6;}
    public String getC7() {return c7;}
    public void setC7(String c7) {this.c7 = c7;}
    public String getC8() {return c8;}
    public void setC8(String c8) {this.c8 = c8;}
    public String getC9() {return c9;}
    public void setC9(String c9) {this.c9 = c9;}
    public String getC10() {return c10;}
    public void setC10(String c10) {this.c10 = c10;}
    public String getC11() {return c11;}
    public void setC11(String c11) {this.c11 = c11;}
    public String getC12() {return c12;}
    public void setC12(String c12) {this.c12 = c12;}
    public String getC13() {return c13;}
    public void setC13(String c13) {this.c13 = c13;}
    public String getC14() {return c14;}
    public void setC14(String c14) {this.c14 = c14;}
    public String getC15() {return c15;}
    public void setC15(String c15) {this.c15 = c15;}
    public String getC16() {return c16;}
    public void setC16(String c16) {this.c16 = c16;}
    public String getC17() {return c17;}
    public void setC17(String c17) {this.c17 = c17;}
    public String getC18() {return c18;}
    public void setC18(String c18) {this.c18 = c18;}
    public String getC19() {return c19;}
    public void setC19(String c19) {this.c19 = c19;}
    public String getC20() {return c20;}
    public void setC20(String c20) {this.c20 = c20;}
    public String getC21() {return c21;}
    public void setC21(String c21) {this.c21 = c21;}
    public String getC22() {return c22;}
    public void setC22(String c22) {this.c22 = c22;}
    public String getC23() {return c23;}
    public void setC23(String c23) {this.c23 = c23;}
    public String getC24() {return c24;}
    public void setC24(String c24) {this.c24 = c24;}
    public String getC25() {return c25;}
    public void setC25(String c25) {this.c25 = c25;}
    public String getC26() {return c26;}
    public void setC26(String c26) {this.c26 = c26;}
    public String getC27() {return c27;}
    public void setC27(String c27) {this.c27 = c27;}
    public String getC28() {return c28;}
    public void setC28(String c28) {this.c28 = c28;}
    public String getC29() {return c29;}
    public void setC29(String c29) {this.c29 = c29;}
    public String getC30() {return c30;}
    public void setC30(String c30) {this.c30 = c30;}
    public String getC31() {return c31;}
    public void setC31(String c31) {this.c31 = c31;}
    public String getC32() {return c32;}
    public void setC32(String c32) {this.c32 = c32;}
    public String getC33() {return c33;}
    public void setC33(String c33) {this.c33 = c33;}
    public String getC34() {return c34;}
    public void setC34(String c34) {this.c34 = c34;}

}



