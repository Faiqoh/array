/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author Faiqoh
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai [] = new int[3];
        nilai [0] = 70;
        nilai [1] = 80;
        nilai [2] = 65;
        double rata=0.0;
        for (int i = 0; i <nilai.length; i++)rata+=nilai[i];
        rata/=nilai.length;
        System.out.println("Nilai rata-rata = "+rata);
    }
    
}
