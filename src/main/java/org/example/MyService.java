package org.example;

public class MyService {
    private MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public void performService() {
        myRepository.doSomething();
    }
}


