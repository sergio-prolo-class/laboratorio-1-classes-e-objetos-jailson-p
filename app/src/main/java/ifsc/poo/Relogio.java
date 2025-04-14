package ifsc.poo;

public class Relogio {
    //Item 4.1 - Readme.me - Atributos
    private byte hora;
    private byte minuto;
    private byte segundo;

    //Item 4.2 - Readme.me - criar metodo (void) ajustaHora(byte hora, byte minuto, byte segundo)
    public void ajustaHora(byte hora,byte minuto,byte segundo){
        this.hora       = hora;
        this.minuto     = minuto;
        this.segundo    = segundo;
        borrowTime();
    }

    //Item 4.2 - Readme.me - criar metodo (String) getHora()
    public String getHora()     {return this.getHora12(false);}

    //Item 4.2 - Readme.me - criar metodo (void) avancaHora()
    public void avancaHora()    {this.hora++;}

    //Item 4.2 - Readme.me - criar metodo (void) avancaMinuto()
    public void avancaMinuto()  {this.minuto++; }

    //Item 4.2 - Readme.me - criar metodo (void) avancaSegundo()
    public void avancaSegundo() {this.segundo++;}

    //Métodos auxiliares abaixo

    //Item 4.2(e) - Readme.me - Resolução para os formatos XXpm XXm XXs e XX:XX:XX
    public String getHora12(boolean h12){
        borrowTime();
        String  h = doisDigitos(this.hora) ,
                m = (h12) ? doisDigitos(this.minuto) + "m "  : doisDigitos(this.minuto) + ":",
                s = (h12) ? doisDigitos(this.segundo) + "s " : doisDigitos(this.segundo);
        if(this.hora > (byte) 11 && h12){
            h = doisDigitos((byte) (this.hora - ((byte) 12))) +"pm ";
        }
        else if (h12)  h = h + "am ";
        else h +=  ":";
        return h + m + s;
    }

    //transfere o excedente para o campo mais significativo
    private void borrowTime(){
        while (this.segundo > (byte) 59){
            avancaMinuto();
            this.segundo -= (byte) 60;
        }
        while (this.minuto > (byte) 59){
            avancaHora();
            this.minuto -= (byte) 60;
        }
        while (this.hora > (byte) 23) {
            this.hora -= (byte) 24;
        }
    }

    //Ajusta o texto para dois dígitos
    private String doisDigitos(byte unidade){
        String  unidadet = String.valueOf(unidade);
        if(unidadet.length() < 2) unidadet = "0" + unidadet;
        return unidadet;
    }
}
