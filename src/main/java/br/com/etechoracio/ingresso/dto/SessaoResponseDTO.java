package br.com.etechoracio.ingresso.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record SessaoResponseDTO
        (Long id,
         LocalDate data,
         LocalTime horario,
         Long filme,
         double preco,
         String sala
        )
{ }
