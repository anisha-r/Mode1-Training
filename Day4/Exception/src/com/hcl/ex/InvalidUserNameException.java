package com.hcl.ex;

public class InvalidUserNameException extends Exception {
  public InvalidUserNameException(String error) {
    super(error);
  }
}