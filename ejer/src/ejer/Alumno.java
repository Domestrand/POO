package ejer;

public class Alumno {
    private String nombres;
    private String apellidos;
    private int ciclo;
    private double pensionAnterior;
    private int cursos;
    private String carrera;
    private double promedio;

    public Alumno(String nombres, String apellidos, int ciclo, double pensionAnterior, int cursos, String carrera, double promedio) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ciclo = ciclo;
        this.pensionAnterior = pensionAnterior;
        this.cursos = cursos;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public double getPensionAnterior() {
        return pensionAnterior;
    }

    public void setPensionAnterior(double pensionAnterior) {
        this.pensionAnterior = pensionAnterior;
    }

    public int getCursos() {
        return cursos;
    }

    public void setCursos(int cursos) {
        this.cursos = cursos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public double calcularNuevaPension() {
        if (promedio > 18.5) {
            return pensionAnterior * 0.85;
        } else if (promedio > 16.5) {
            return pensionAnterior * 0.90;
        } else if (promedio > 14.5) {
            return pensionAnterior;
        } else {
            return pensionAnterior * 1.20;
        }
    }

    public String obtenerTurno() {
        if (ciclo == 1 || ciclo == 2) {
            return "Manana";
        } else if (ciclo == 3 || ciclo == 4) {
            return "Tarde";
        } else {
            return "Noche";
        }
    }

    public String obtenerLocal() {
        if (carrera.equalsIgnoreCase("Ing. de Sistemas Computacionales")) {
            return "San Isidro";
        } else if (carrera.equalsIgnoreCase("Administracion") || carrera.equalsIgnoreCase("Contabilidad")) {
            return "Av. Ejercito";
        } else {
            return "Virtualidad";
        }
    }

    public void actualizarCursos() {
        if (cursos == 4 && promedio > 16) {
            cursos += 1;
        } else if (cursos == 6 && promedio <= 14.5) {
            cursos -= 2;
        } else if (carrera.equalsIgnoreCase("Derecho")) {
            cursos = 5;
        }
    }
}
