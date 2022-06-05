package com.promineotech.jeep.entity;

import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {
  private String customer;
  private JeepModel model;
  private String trim;
  private int doors;
  private String color;
  private String engine;
  private String tire;

  private List<String> options;
}
