/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan32.daftarfilm;

/**
 *
 * @author User
 */
public class Film 
{
    public static void nowPlaying(String filmName, String filmGenre, Double filmRating, int filmDuration)
    {
        System.out.println("Judul Film \t : "+filmName);
        System.out.println("Genre Film \t : "+filmGenre);
        System.out.println("Rating Film \t : "+filmRating);
        System.out.println("Duration Film \t : "+filmDuration+" menit \n");
    }
}
