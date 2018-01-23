package classes;
public class valida
{
    private String resultado = null;
    private Double dn1 = 0.0;
    private Double dn2 = 0.0;
    
    public String validar(String n1)
    {
        try
        {
            return String.valueOf(Integer.parseInt(n1));
        }
        catch (NumberFormatException e)
        {
            return String.valueOf(classes.variaveis.casasDecimais);
        }
    }
    public String validar(String n1, String n2)
    {
        try
        {
            dn1 = Double.parseDouble(n1);
            dn2 = Double.parseDouble(n2);
        }
        catch (NumberFormatException e)
        {
            return "Erro de conversão";
        }
        return resultado;
    }

    public Double getDn1()
    {
        return dn1;
    }

    public Double getDn2()
    {
        return dn2;
    }
}
