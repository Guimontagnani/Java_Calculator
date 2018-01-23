package classes;
public  class multiplicacao
{
    classes.valida v = new classes.valida();
    classes.formata f = new classes.formata();
    public String multiplicar(String n1, String n2)
    {
        String resultado = "";
        resultado = v.validar(n1, n2);
        if (resultado == null)
            //resultado = String.valueOf(v.getDn1() * v.getDn2());
            resultado = f.formataNumero(v.getDn1() * v.getDn2());
        return resultado;
    }
}
