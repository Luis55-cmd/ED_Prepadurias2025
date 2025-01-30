/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepa1;

/**
 *
 * @author Luis
 */
public class Funcion {
 
    public void Rellenar(int[] nums){
        for (int i=0;i<nums.length;i++){
            nums[i]=i*10;
            System.out.println(nums[i]);
        }
    }
    public void Contar(int num){
        
        //donde empieza, condicion,de cuanto en cuanto
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
    }
    
    
    
}
