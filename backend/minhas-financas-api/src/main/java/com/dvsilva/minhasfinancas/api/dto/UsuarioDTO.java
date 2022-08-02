package com.dvsilva.minhasfinancas.api.dto;
// recebe e envia respostas das requisições
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
	
	private String nome;
	private String email;
	private String senha;
	
}