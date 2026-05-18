void main() {
    try {

        Estudiante e1 = new Estudiante("Carlos", 20, 8.5);
        e1.mostrarDatos();

        Estudiante e2 = new Estudiante("María", 18, 9.2);
        e2.mostrarDatos();

        Estudiante e3 = new Estudiante("Juan", -5, 7.0);
        e3.mostrarDatos();

    } catch (EdadInvalidaException e) {

        System.out.println("Se produjo un error:");
        System.out.println(e.getMessage());
    }
}
