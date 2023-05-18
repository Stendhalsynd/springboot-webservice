package com.springboot.book.springbootwebservice.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
//@AllArgsConstructor
public class HelloResponseDto {

  private final String name;
  private final int amount;

//  public HelloResponseDto (String name, int amount) {
//    this.name = name;
//    this.amount = amount;
//  }
}