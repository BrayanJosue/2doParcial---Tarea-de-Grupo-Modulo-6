package clases;

class Doctor extends Persona {

    private String especialidad;

    public Doctor(String NombreCompleto, int edad, char sexo, String especialidad) {
        super(NombreCompleto, edad, sexo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void RealizaUnaAccion() {
        System.out.println("El Doctor atiende un paciente");
    }

    @Override
    public String toString() {
        return "Nombre:" + getNombreCompleto() + "\n"
                + "Edad:" + getEdad() + "\n"
                + "Sexo:" + getSexo() + "\n"
                + "Especialidad:" + getEspecialidad();
    }
}
