package carrera;


/**
 *
 * @author Pablo
 * @fecha 7 nov 2023 23:21:30
 * @company Ciclo superior de informatica
 */
class asignaturas {

    private String nombre, curso;
    private int codigo;

    public asignaturas(String nombre, String curso, int codigo) {
        this.nombre = nombre;
        this.curso = curso;
        this.codigo = codigo;
    }

    public void getNombre() {
        System.out.println("Asignatura: " + nombre);
    }

    public void getCurso() {
        System.out.println("Curso: " + curso);
    }

    public void getCodigo() {
        System.out.println("Codigo: " + codigo);
    }
}

public class Carrera {

    public static void main(String[] args) {
        asignaturas asignatura1 = new asignaturas("Matematicas", "1", 1017);
        asignatura1.getNombre();
        asignatura1.getCurso();
        asignatura1.getCodigo();
    }

}
