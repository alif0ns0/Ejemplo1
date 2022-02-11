package calculadora;

import javax.swing.JOptionPane;


public class Calculadora {

    public static void main(String args[]) {
        String opciones[] = {"Sumar", "Multiplicar", "Salir"};
        int eleccion = 0;
        do {
            eleccion = JOptionPane.showOptionDialog(null, "Selecciona una opción", "Medio Calculadora", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, 0);

            switch (eleccion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Vamos a sumar 2 números enteros positivos\n"
                            + "por favor inserta dos números");
                    int sum1 = pedirNumero();
                    if (sum1 < 0) {
                        JOptionPane.showMessageDialog(null, "Has insertado un número no aceptado por el sistema", "Numero negativo", JOptionPane.ERROR_MESSAGE);
                    }
                    int sum2 = pedirNumero();

                    JOptionPane.showMessageDialog(null, "El resultado es: " + sumar(sum1, sum2));
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Vamos a calcular la de multiplicar de un número entre 1 y 20\n"
                            + "por favor inserta este número");
                    int num1 = pedirNumero();
                    JOptionPane.showMessageDialog(null, multiplicar(num1));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Esperamos tenerte pronto de vuelta");
                    break;
            }
        } while (eleccion != 2);
    }

    public static int pedirNumero() {
        int num = 0;
        boolean repetir = false;
        do {
            try {
                repetir = false;
                num = Integer.parseInt(JOptionPane.showInputDialog("Inserta un número"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No has insertado un número", "Numero incorrecto", JOptionPane.ERROR_MESSAGE);
                repetir=true;
            }
        } while (repetir);
        return num;
    }

    public static int sumar(int sum1, int sum2) {
        return sum1 + sum2;
    }

    public static String multiplicar(int num1) {
        String result = "";

        for (int i = 0; i < 10; i++) {
            result = result + num1 + " x " + i + "=" + num1 * i + "\n";
        }
        return result;
    }
}
