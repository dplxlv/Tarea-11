void main() {

    ParteA datos = new ParteA();
    System.out.println("------------Parte A------------");
    System.out.println("byte: " + datos.valorByte);
    System.out.println("short: " + datos.valorShort);
    System.out.println("int: " + datos.valorInt);
    System.out.println("long: " + datos.valorLong);
    System.out.println("float: " + datos.valorFloat);
    System.out.println("double: " + datos.valorDouble);

    ParteB datos2 = new ParteB();
    System.out.println("------------Parte B------------");
    System.out.println("double original: " + datos2.numero);
    System.out.println("float: " + datos2.numeroFloat);
    System.out.println("int: " + datos2.numeroInt);
    System.out.println("short: " + datos2.numeroShort);
    System.out.println("byte: " + datos2.numeroByte);

    ParteC datos3 = new ParteC();
    System.out.println("------------Parte C------------");
    System.out.println("int: " + datos3.entero);
    System.out.println("double: " + datos3.decimal);
    System.out.println("boolean: " + datos3.bandera);
    System.out.println("String 1: " + datos3.s1);
    System.out.println("String 2: " + datos3.s2);
    System.out.println("String 3: " + datos3.s3);

    System.out.println("------------Parte D------------");
    Animal animal = new Perro();

    if (animal instanceof Perro) {
        Perro perro = (Perro) animal;
        perro.ladrar();
    }
}
