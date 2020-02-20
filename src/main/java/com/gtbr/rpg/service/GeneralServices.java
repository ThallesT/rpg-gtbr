package com.gtbr.rpg.service;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import javassist.bytecode.ByteArray;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.util.ArrayUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import static java.util.Arrays.setAll;

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

    public static String decodificaImagem(Byte[] byteImg){
        byte[] bytes = new byte[byteImg.length];

        for(int i = 0; i < byteImg.length; i++){
            bytes[i] = byteImg[i];
        }
        String stringFoto = Base64.encodeBase64String(bytes);
        return stringFoto;
    }

    public static Byte[] codificaImagem(String string){
        String str = string.substring(string.indexOf(",")+1);
        str.trim();
        byte[] bytes = Base64.decodeBase64(str);
        Byte[] byteArray = new Byte[bytes.length];
        setAll(byteArray, n -> bytes[n]);
        return byteArray;
    }




}
