package clases;

public abstract class Persona {

    private String NombreCompleto;
    private int edad;
    private char sexo;

    public Persona(String NombreCompleto, int edad, char sexo) {
        this.NombreCompleto = NombreCompleto;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public abstract void RealizaUnaAccion();

    @Override
    public abstract String toString();
}
