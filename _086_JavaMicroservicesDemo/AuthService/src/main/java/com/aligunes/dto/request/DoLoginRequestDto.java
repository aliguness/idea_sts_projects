package com.aligunes.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Kaydederken kullanıcıdan alınacak bilgileri içeren DTO
@Builder // bir sınıftan nesne türetmeyi sağlar.
@Data //get set metodlarını otomatik tanımlar.
@NoArgsConstructor //boş constructor oluşturur.
@AllArgsConstructor //dolu constructor oluşturur.
public class DoLoginRequestDto {

  private   String username;
  private   String password;

}
