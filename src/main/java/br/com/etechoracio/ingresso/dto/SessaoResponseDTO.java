package br.com.etechoracio.ingresso.dto;



import java.time.LocalDate;
import java.time.LocalTime;

public record SessaoResponseDTO
        (Long Id,
         LocalDate Data,
         LocalTime Horario,
         double Preco,
         String Sala,
         Long Id_Filme
        )
{ }
