import java.text.SimpleDateFormat;
import java.util.Date;

public class Mensagem {

    public static String saudacao(){
        String mensagem = new String();
        String horaText = new SimpleDateFormat("HH").format(new Date());
        int hora = Integer.parseInt(horaText);

        if(hora > 0 && hora < 6 )
            mensagem = "Boa noite";
        if(hora > 6 && hora < 12)
            mensagem = "Boa dia";
        if(hora > 12 && hora < 18)
            mensagem = "Boa tarde";
        if(hora > 18 && hora < 24 )
            mensagem = "Boa noite";

        return mensagem;
    }
}
