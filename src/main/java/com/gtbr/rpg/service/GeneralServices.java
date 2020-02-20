package com.gtbr.rpg.service;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component
public class GeneralServices {


    public static String gerarHash(String senha) {
        MessageDigest algorithm;
        try {
            algorithm = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
        byte[] messageDigest = algorithm.digest(senha.getBytes(StandardCharsets.UTF_8));
        StringBuilder hexString = new StringBuilder();
        for (byte b : messageDigest) {
            hexString.append(String.format("%02X", 0xFF & b));
        }
        senha = hexString.toString();
        return senha;
    }

    public static Boolean validaConfirmaSenha(String senha, String confirmaSenha){
        if (senha.equals(confirmaSenha) && !senha.equals("")){
            return true;
        }else {
            return false;
        }
    }

    public static String decodificaImagem(MultipartFile file) throws IOException {
        byte[] img = file.getBytes();
        String stringFoto = Base64.encodeBase64String(img);

        return stringFoto;
    }

    public static String decodificaImagem(byte[] byteImg){

        String stringFoto = Base64.encodeBase64String(byteImg);

        return stringFoto;
    }

    public static byte[] codificaImagem(String string){
        String str = string.substring(string.indexOf(",")+1);
        str.trim();
        byte[] bytes = Base64.decodeBase64(str);
        return bytes;
    }




}
