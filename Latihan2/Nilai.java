package Latihan2;

public class Nilai {
int nim;
String nama;
int nilaiabsen;
int nilaitugas;
int nilaiuts;
int nilaiuas;
double nilaiakhir;
void cetaknilai() {
System.out.println("NIM		="+this.nim);
System.out.println("NAMA		="+this.nama); 
System.out.println("Nilai Absen	="+this.nilaiabsen*0.10);
System.out.println("Nilai Tugas	="+this.nilaitugas*0.20);
System.out.println("Nilai UTS	="+this.nilaiuts*0.30);
System.out.println("Nilai UAS	="+this.nilaiuas*0.40);
nilaiakhir = nilaiabsen*0.10 + nilaitugas*0.20 + nilaiuts*0.30 + nilaiuas*0.40;
System.out.println("Nilai Akhir	="+this.nilaiakhir);
}
}
