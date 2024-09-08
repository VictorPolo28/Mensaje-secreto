package com.example;

public class Main {
    public static void main(String[] args) {
        String mensajeCodificado  = "H0l4  MUnD0,  3st0  3s  Un  m3ns4j3  s3cr3t0" ;
        mensajeCodificado = mensajeCodificado.replace('0' ,'o' );
        System.out.println(mensajeCodificado);

        mensajeCodificado = mensajeCodificado.replace('3' ,'e' );
        System.out.println(mensajeCodificado);

        mensajeCodificado = mensajeCodificado.replace('4' ,'a' );
        System.out.println(mensajeCodificado);

        String mensajeDecodificado =mensajeCodificado ;
        mensajeDecodificado = mensajeCodificado.trim();
        System.out.println(mensajeDecodificado);

        mensajeDecodificado = mensajeCodificado.replaceAll(mensajeCodificado, mensajeDecodificado);

        mensajeDecodificado = mensajeDecodificado.toUpperCase();
        System.out.println(mensajeDecodificado);
    }
}