package clases;

class Deportista extends Persona {

    private String deporte;

    public Deportista(String NombreCompleto, int edad, char sexo, String deporte) {
        super(NombreCompleto, edad, sexo);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public void RealizaUnaAccion() {
        System.out.println("El deportista ejecuta un deporte.");
    }

    @Override
    public String toString() {
        return "Nombre:" + getNombreCompleto() + "\n"
                + "Edad:" + getEdad() + "\n"
                + "Sexo:" + getSexo() + "\n"
                + "Deporte:" + getDeporte();
    }
}
