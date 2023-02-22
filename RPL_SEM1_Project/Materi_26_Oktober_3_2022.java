package RPL_SEM1_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.*;
public class Materi_26_Oktober_3_2022 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[]args)throws Exception{
String pes,pesawat;
int tik;
double dis,total,harga;

BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Masukan Nama Pesawat[Garuda/Lion/Batavia");
pes = x.readLine();
System.out.println("Masukan Banyak Tiket Yang Dibeli      :");
tik = Integer.parseInt(x.readLine());
if(pes.equalsIgnoreCase("Garuda")){
    if(tik < 100){
        pesawat ="Garuda";
        harga =400000;
        total=harga;
        dis=0;
    }
    else{
        pesawat ="Garuda";
        harga = 400000;
        dis=0.5*harga;
        total=harga-dis;
    }
}
else if(pes.equalsIgnoreCase("Lion")){
    if(tik <= 50){
        pesawat="Lion";
        harga = 300000;
        total=harga;
        dis=0;
    }

else{
    pesawat ="Lion";
    harga=300000;
    dis=0.1*harga;
    total=harga=dis;
}
}
else if(pes.equalsIgnoreCase("Batavia")){
    if(tik <= 20){
    pesawat="Batavia";
    harga=200000;
    total=harga;
    dis=0;

}
else{
    pesawat= "Batavia";
    harga=200000;
    dis=0*harga;
    total=harga-dis;
}
}
else{
    pesawat = "Tidak Ada Data";
    harga=total=dis=0;
}
System.out.println("Nama Pesawat   :" + pesawat);
System.out.println("Harga Tiket    :" + harga);
System.out.println("Diskon         :" + dis);
System.out.println("Total          :" + total);
    }
}

