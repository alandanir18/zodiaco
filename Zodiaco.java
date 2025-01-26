package com.mycompany.zodiaco;
import javax.swing.JOptionPane;

public class Zodiaco {
    public static void main(String[] args) {
        String diaStr = JOptionPane.showInputDialog("Introduce tu día de nacimiento (1-31):");
        int dia = Integer.parseInt(diaStr);

        String mesStr = JOptionPane.showInputDialog("Introduce tu mes de nacimiento (1-12):");
        int mes = Integer.parseInt(mesStr);

        boolean fechaValida = true;

        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            fechaValida = false;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            fechaValida = false;
        } else if (mes == 2 && dia > 29) {
            fechaValida = false;
        } else if (mes == 2 && dia == 29) {
            fechaValida = false; // Aquí puedes agregar validación para años bisiestos si lo necesitas.
        }

        String signo = "";

        if (fechaValida) {
            if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
                signo = "Acuario";
            } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
                signo = "Piscis";
            } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
                signo = "Aries";
            } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
                signo = "Tauro";
            } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
                signo = "Géminis";
            } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
                signo = "Cáncer";
            } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
                signo = "Leo";
            } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
                signo = "Virgo";
            } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
                signo = "Libra";
            } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
                signo = "Escorpio";
            } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
                signo = "Sagitario";
            } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
                signo = "Capricornio";
            }
            JOptionPane.showMessageDialog(null, "Tu signo zodiacal es: " + signo);
        } else {
            JOptionPane.showMessageDialog(null, "Fecha inválida. Por favor, introduce una fecha correcta.");
        }
    }
}
