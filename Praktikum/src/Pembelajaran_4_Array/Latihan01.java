package Pembelajaran_4_Array;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan01 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matrixB = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            matrixA.add(new ArrayList<>());
            matrixB.add(new ArrayList<>());
        }

        JOptionPane.showMessageDialog(null, "Input Nilai Matriks A (2x2)");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog("Matriks A [" + i + "][" + j + "]:");
                matrixA.get(i).add(Integer.parseInt(input));
            }
        }

        JOptionPane.showMessageDialog(null, "Input Nilai Matriks B (2x2)");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog("Matriks B [" + i + "][" + j + "]:");
                matrixB.get(i).add(Integer.parseInt(input));
            }
        }

        String output = "Matriks A:\n" +
                matrixA.get(0).get(0) + "  " + matrixA.get(0).get(1) + "\n" +
                matrixA.get(1).get(0) + "  " + matrixA.get(1).get(1) + "\n\n" +
                "Matriks B:\n" +
                matrixB.get(0).get(0) + "  " + matrixB.get(0).get(1) + "\n" +
                matrixB.get(1).get(0) + "  " + matrixB.get(1).get(1);

        JOptionPane.showMessageDialog(null, output);
    }
}
