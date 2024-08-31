package Latihan1;

public class Mahasiswa {
String nama;
int npm;
String jurusan;
void detail()
{
System.out.println("nama 	: "+ this.nama);
System.out.println("npm 	: "+ this.npm);
System.out.println("jurusan : "+ this.jurusan);
}
void membaca() {
	System.out.println("Mahasiswa membaca");
}
void nyontek() {
	System.out.println("Mahasiswa nyontek");
}
void modifikasi() {
	System.out.println("Mahasiswa modifikasi");
}
}
