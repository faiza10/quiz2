/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author entercomp
 */
public class Node {
     //mendeklarasikan atribut
    String nim, nama, jurusan, prodi;
    double ipk;
    Node prev, next;

    //menambahkan konstruktor berparameter
    Node (Node prev, String nim, String nama, String jurusan, String prodi, double ipk , Node next){
        this.prev = prev;
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.prodi = prodi;
        this.ipk = ipk;
        this.next = next;
    }
}
