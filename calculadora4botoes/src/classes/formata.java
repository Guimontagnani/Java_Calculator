package classes;

import java.text.DecimalFormat;

public class formata
{
    public String formataNumero(Double n1)
    {
        String resultado = null;
        String casasDecimais = "0.";
        Integer i = 0;
        for (i = 0; i < classes.variaveis.casasDecimais; i++)
        {
            casasDecimais = casasDecimais + "#";
        }
        DecimalFormat df = new DecimalFormat(casasDecimais);
        resultado = df.format(n1);
        return resultado;
    }
}
