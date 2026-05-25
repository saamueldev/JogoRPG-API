package com.rpgturnos.autenticacao.dto;

public record PerfilResponse(
        Long usuarioId,
        String nome,
        String email
) {
}
