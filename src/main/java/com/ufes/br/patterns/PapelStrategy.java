package com.ufes.br.patterns;

public enum PapelStrategy {
    CONTEXTO,    // A classe que usa a estratégia (ex: CarrinhoDeCompras)
    INTERFACE,   // O contrato em si (ex: PagamentoStrategy)
    CONCRETA     // A implementação real (ex: PayPalPagamento, BoletoPagamento)
}