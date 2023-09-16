/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sınav2;

import java.util.Scanner;

class ogrenci{
    double ogr_no,vize,not_ortalamasi;
    String hnot;
    public void gecmenotu_hesapla()            
    {       
        double gnotu=60;
        double dnotu=45;
        double fnotu;
        fnotu=(gnotu-vize*40/100)*100/60;        
        System.out.println("Direk Geçmesi İçin Final Notu : "+" "+fnotu);
        if (not_ortalamasi>2) 
        {
            fnotu=(dnotu-vize*40/100)*100/60;
        System.out.println("Ortalama İle Geçmesi İçin Final Notu :"+" "+fnotu);
        }
        
        
    }
    public void harfnotu_hesapla()
    {                  
       
       double fnotu;
       double gnotu;
        if ("AA".equals(hnot)) 
        {
            gnotu = 90;
            fnotu=(gnotu-vize*40/100)*100/60;
             System.out.println("AA Notu İle Geçmeniz İçin Almanız Gereken Minimum Not: " + fnotu);
        }
        else if ("BA".equals(hnot)) 
        {
            gnotu = 85;
            fnotu=(gnotu-vize*40/100)*100/60;
            System.out.println("BA Notu İle Geçmeniz İçin Almanız Gereken Minimum Not: " + fnotu);
        }
        else if ("BB".equals(hnot)) 
        {
            gnotu = 75;
            fnotu=(gnotu-vize*40/100)*100/60;
            System.out.println("BB Notu İle Geçmeniz İçin Almanız Gereken Minimum Not: " + fnotu);
        }
        else if ("CB".equals(hnot)) 
        {
            gnotu = 70;
            fnotu=(gnotu-vize*40/100)*100/60;
            System.out.println("CB Notu İle Geçmeniz İçin Almanız Gereken Minimum Not: " + fnotu);
        }
    }
}
  
public class Sınav2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ogrenci not = new ogrenci();
        Scanner deger = new Scanner(System.in);
        int tekrar =1;
        while(tekrar ==1)
        {
        System.out.print("Öğrenci Numarası Giriniz: ");
        not.ogr_no = deger.nextDouble();
        System.out.print("Vize Notu Giriniz:");
        not.vize=deger.nextDouble();        
        System.out.print("Not Ortalamasını Giriniz:");
        not.not_ortalamasi = deger.nextDouble();
        System.out.println("Hangi Harf Notu İle Geçmek İstersiniz?");      
                
          not.hnot=deger.next();          
        not.gecmenotu_hesapla();
        not.harfnotu_hesapla();
        
            System.out.println("Devam Etmek için 1,Çıkmak için 2 yi Tuşlayınız.");
            tekrar = deger.nextInt();
        }
        System.out.println("Çıktınız.");
       
        
    }   
    
}
