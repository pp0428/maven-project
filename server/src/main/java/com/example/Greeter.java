package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  
  /**
   * @param semeone the name
   * @return greeting string
   ***/
  public final String  greet(String  final someone) {
    return String.format("Hello, %s!", someone);
  }
}
