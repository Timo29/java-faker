package com.github.javafaker;

public class SimpleNetworkServerComps {
    private final Faker faker;

    protected SimpleNetworkServerComps(Faker faker){
        this.faker = faker;
    }

    public String components(){
        return faker.fakeValuesService().resolve("simple_network_server_components.components", this, faker);
    }

    public String manufacturers(){
        return faker.fakeValuesService().resolve("simple_network_server_components.manufacturers", this, faker);
    }

    public String models(){
        return faker.fakeValuesService().resolve("simple_network_server_components.models", this, faker);
    }

    public String software(){
        return faker.fakeValuesService().resolve("simple_network_server_components.software", this, faker);
    }

    public String ups_models(){
        return faker.fakeValuesService().resolve("simple_network_server_components.usp_models", this, faker);
    }
}