package paqueteDos;

/**
 *
 * @author Daniel
 */
public class EntidadHospitalitaria {

    private Ciudad ciudad;
    private Medico[] medicos;
    private Enfermero[] enfermeros;
    private String hospital;
    private int numeroEspecialidades;
    private double sueldos;
    private String direccion;

    public EntidadHospitalitaria(String h, String d, Ciudad c, int es, Medico[] m, Enfermero[] e) {
        hospital = h;
        direccion = d;
        numeroEspecialidades = es;
        ciudad = c;
        medicos = m;
        enfermeros = e;
    }

    public void establecerNombreHospital(String n) {
        hospital = n;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }

    public void calcularNumeroEspecialidades() {
        numeroEspecialidades = obtenerMedicos().length + obtenerEnfermeros().length;
    }

    public void establecerMedicos(Medico[] n) {
        medicos = n;
    }

    public void establecerEnfermeros(Enfermero[] n) {
        enfermeros = n;
    }

    public void calcularSueldo() {
        for (int i = 0; i < obtenerMedicos().length; i++) {
            sueldos = sueldos + obtenerMedicos()[i].obtenerSueldo();
        }
        for (int j = 0; j < obtenerEnfermeros().length; j++) {
            sueldos = sueldos + obtenerEnfermeros()[j].obtenerSueldo();
        }
    }

    public void establecerDireccion(String n) {
        direccion = n;
    }

    public String obtenerNombreHospital() {
        return hospital;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroEspecialidades() {
        return numeroEspecialidades;
    }

    public Medico[] obtenerMedicos() {
        return medicos;
    }

    public Enfermero[] obtenerEnfermeros() {
        return enfermeros;
    }

    public double obtenerSueldo() {
        return sueldos;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format("HOSPITAL %s\n"
                + "Dirección: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Número de especialidades: %d\n",
                obtenerNombreHospital().toUpperCase(),
                obtenerDireccion(),
                obtenerCiudad().obtenerNombre(),
                obtenerCiudad().obtenerProvincia(),
                obtenerNumeroEspecialidades());

        cadena = String.format("%sListado de médicos\n", cadena);

        for (int i = 0; i < obtenerMedicos().length; i++) {

            cadena = String.format("%s- %s - sueldo: %.2f - %s\n",
                    cadena,
                    obtenerMedicos()[i].obtenerNombre(),
                    obtenerMedicos()[i].obtenerSueldo(),
                    obtenerMedicos()[i].obtenerEspecialidad());
        }

        cadena = String.format("%s\nListado de enfermeros(as)\n", cadena);

        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n",
                    cadena,
                    obtenerEnfermeros()[i].obtenerNombre(),
                    obtenerEnfermeros()[i].obtenerSueldo(),
                    obtenerEnfermeros()[i].obtenerTipo());
        }

        cadena = String.format("%s\nTotal de sueldos a pagar por mes: %.0f",
                cadena,
                obtenerSueldo());

        return cadena;

    }
}
