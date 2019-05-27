package com.kodilla.stream.first;

public class ExecuteSaySomething implements Executor{
   @Override
    public void process() {
      System.out.println("Ten tekst zostanie przekazany do klasy Processor");
   }
}
