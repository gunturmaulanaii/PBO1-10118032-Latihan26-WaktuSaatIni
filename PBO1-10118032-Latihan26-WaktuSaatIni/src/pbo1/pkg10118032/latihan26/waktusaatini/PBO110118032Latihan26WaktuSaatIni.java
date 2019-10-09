/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan26.waktusaatini;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Guntur Maulana I
 * NAMA			: Guntur Maulana Ibrahim
 * KELAS		: IF-1
 * NIM			: 10118032
 * Deskripsi Program	: Melihat Waktu Saat Ini
 */
public class PBO110118032Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDateTime date = LocalDateTime.now();
	DateTimeFormatter dateFormatted = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");
	String formattedDate = date.format(dateFormatted);
	System.out.println(formattedDate);
    }
    
}
