/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.twodarray;

/**
 *
 * @author admin
 */
public class TwoDarray {

    public static void main(String[] args) {
        int marks [][] ={
            {45,33,89},
            {90,77,60},
            {78,88,40},    
        };
    for (int i = 0;i < marks.length; i++){
    for (int j = 0; j < marks [i].length; j++){
            System.out.print(marks [i][j]+" ");
    }

        System.out.println();
    }
}
}
