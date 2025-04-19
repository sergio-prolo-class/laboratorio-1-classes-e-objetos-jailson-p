package ifsc.poo;

public class Relogio {
    //Item 4.1 - Readme.me - Atributos
    private byte hora;
    private byte minuto;
    private byte segundo;

    public Relogio(byte hora, byte minuto, byte segundo){ ajustaHora(hora,minuto,segundo); }
    public Relogio(byte hora, byte minuto)              { ajustaHora(hora,minuto,(byte) 0); }
    public Relogio(byte hora)                           { ajustaHora(hora,(byte) 0,(byte) 0); }

    //Item 4.2 - Readme.me - criar metodo (void) ajustaHora(byte hora, byte minuto, byte segundo)
    public void ajustaHora(byte hora,byte minuto,byte segundo){
        if(hora >= (byte) 0 && minuto >= (byte) 0 && segundo >= (byte) 0){
            this.hora    = hora;
            this.minuto  = minuto;
            this.segundo = segundo;
        }
        else this.hora = this.minuto = this.segundo = (byte) 0;
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

    //Met. que sincroniza um relógio com outro
    public void sincronizarCom(Relogio outro){
        this.hora     = outro.hora;
        this.minuto   = outro.minuto ;
        this.segundo  = outro.segundo;
   }
   //Mét. que retorna diferença em segundos de dois relógios
   public int diferencaSeg(Relogio outro){
        return this.emSegundos() - outro.emSegundos();
   }
   //Método aux para retornar o relógio em segundos
   public int emSegundos(){
        return this.segundo + this.minuto*60 + this.hora*3600 ;
   }
   //Ajusta o texto para dois dígitos
   private String doisDigitos(byte unidade){
       String  unidadet = String.valueOf(unidade);
       if(unidadet.length() < 2) unidadet = "0" + unidadet;
       return unidadet;
   }
}