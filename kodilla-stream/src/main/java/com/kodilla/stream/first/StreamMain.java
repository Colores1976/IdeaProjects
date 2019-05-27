package com.kodilla.stream.first;

public class StreamMain {
    public static void main(String[] args){
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("no e");
        processor.execute(codeToExecute);

        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        processor.execute(()-> System.out.println("no i co mi zrobisz"));
    }
}
