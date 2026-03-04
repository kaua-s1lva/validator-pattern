package com.ufes.br.patterns;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anotação para identificar classes pertencentes ao padrão Strategy.
 */
@Target(ElementType.TYPE) // Define que esta anotação só pode ser usada em Classes ou Interfaces
@Retention(RetentionPolicy.SOURCE) // DICA DE OURO PARA O TCC (Leia a explicação abaixo)
public @interface Strategy {
    
    // O nome do grupo para conectar as peças (ex: "CalculoFrete")
    String grupo();
    
    // O papel que esta classe exerce dentro do padrão
    PapelStrategy papel();
}