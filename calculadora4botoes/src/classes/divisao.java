package classes;
public class divisao
{
    classes.valida v = new classes.valida();
    classes.formata f = new classes.formata();
    public String dividir(String n1, String n2)
    {
        String resultado = "";
        resultado = v.validar(n1, n2);
        if (resultado == null)
        {
            try
            {
                //resultado = String.valueOf(v.getDn1() / v.getDn2());
                resultado = f.formataNumero(v.getDn1() / v.getDn2());
                if (v.getDn2() == 0) throw new ArithmeticException();
            }
            catch (ArithmeticException e)
            {
                resultado = "Divisão por zero";
            }
        }
        return resultado;
    }
}
