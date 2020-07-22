class ConcreteCreator2 extends Creator {
    public Product factoryMethod() {
    
    return new ConcreteProduct2();
    
    }
    
    public void operation2(Product product) {
    
    ConcreteProduct1 product2 = (ConcreteProduct)product;
    
    // productに施す処理を記述
    
    }
    public void operation2(Product product) {
    
    ConcreteProduct1 product2 = (ConcreteProduct)product;
    
    // productに施す処理を記述
    
    }
}