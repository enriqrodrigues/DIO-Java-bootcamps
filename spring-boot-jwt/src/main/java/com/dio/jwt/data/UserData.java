package com.dio.jwt.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

//As anotações criam (pelo lombo) os métodos Getters, Setters e um construtor sem argumentos.
@Setter @Getter @NoArgsConstructor
public class UserData implements Serializable {
/*Serializable: O Java serializa (coloca em disco) tudo o que está em memória.
Se o servidor cair enquanto o usuário estiver logado, quando o servidor voltar,
o Java recuperará as informações e o usuário continuará logado. */

    private String userName;
    private String password;

}
