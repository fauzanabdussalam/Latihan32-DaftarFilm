/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan32.daftarfilm;

/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : Menampilkan daftar film
 *
 */
public class PBO10K10119901Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Film film = new Film();
        
        film.nowPlaying("Venom", "Action, Horror, Scifi", 8.5, 120);
        film.nowPlaying("Small Foot", "Animation", 9.0, 96);
        film.nowPlaying("Crazy Rich Asian", "Comedy", 7.8, 119);
        film.nowPlaying("Asih", "Horror", 6.0, 100);
    }
    
}
