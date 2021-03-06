package com.sofka.lab.Ejercicio16;

public class Persona {
    //    Atributos
    private final Character sexoDefecto = 'H';
    private final Integer pesoIdeal = -1;
    private final Integer bajoPeso = 0;
    private final Integer sobrePeso = 1;
    private Double peso;
    private Double altura;
    private Double imc;
    private String nombre;
    private String edad;
    private String dni;
    private String letras;
    private Character sexo;
    private Integer residuo;
    private Integer calculoDNI;

    //    Constructores
    public Persona() {
        this.nombre = "";
        this.edad = "";
        this.sexo = 'H';
        this.peso = 0.0;
        this.altura = 0.0;
        generaDNI();
    }

    public Persona(String nombre, String edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generaDNI();
    }

    public Persona(String nombre, String edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        peso = 0.0;
        altura = 0.0;
        generaDNI();
    }

    //    Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //    Metodos
    public int calcularIMC(double peso, double altura) {
        imc = peso / Math.pow(altura, 2);
        if (imc < 20) {
            return pesoIdeal;
        }
        if (20 <= imc && imc <= 25) {
            return bajoPeso;
        }
        return sobrePeso;
    }

    public void comprobacionDePeso(double peso, double altura) {
        switch (calcularIMC(peso, altura)) {
            case 0:
                System.out.println("Esta por debajo de su peso ideal");
                break;
            case 1:
                System.out.println("Tiene sobrepeso");
                break;
            default:
                System.out.println("Peso ideal");
                break;
        }
    }

    public boolean esMayorDeEdad() {
        if (Integer.parseInt(edad) >= 18) {
            return true;
        }
        return false;
    }

    public void comprobacionMayorDeEdad() {
        boolean b = esMayorDeEdad();
        if (b) {
            System.out.println("Es mayor de edad");
        }
        if (!(b)) {
            System.out.println("No es mayor de edad");
        }
    }

    private char comprobarSexo() {
        switch (sexo) {
            case 'H':
                break;
            case 'M':
                break;
            default:
                sexo = sexoDefecto;
                break;
        }
        return sexo;
    }

    private String generaDNI() {
        calculoDNI = (int) Math.round(Math.random() * 90000000);
        letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        residuo = calculoDNI % 23;
        dni = String.valueOf(calculoDNI) + letras.charAt(residuo);
        return dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "peso=" + peso +
                ", altura=" + altura +
                ", imc=" + imc +
                ", nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", dni='" + dni + '\'' +
                ", sexo=" + comprobarSexo() +
                '}';
    }
}
