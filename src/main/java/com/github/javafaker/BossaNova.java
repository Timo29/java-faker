package com.github.javafaker;

public class BossaNova {
    private final Faker faker;

    protected BossaNova(Faker faker){
        this.faker = faker;
    }

    public String artists(){
        return faker.fakeValuesService().resolve("bossa_nova.artists", this, faker);
    }

    public String songs(){
        return faker.fakeValuesService().resolve("bossa_nova.songs", this, faker);
    }
}