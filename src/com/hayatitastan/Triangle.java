package com.hayatitastan;

/**
 * Created by Dr. Hayati TASTAN on 6.10.2022
 **/

public class Triangle {
  double base;
  double height;

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public double getArea() {
    return (this.base * this.height) / 2;
  }
}
