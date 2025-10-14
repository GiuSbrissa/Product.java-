package br.sp.fatec.product.entities;

public class Product {
    //são atributos - todos são privados - tudo que é privado só é visto dentro da classe
    //a partir de uma classe eu crio um (ou mais) objetos
    //uma classe é formada por metodos e atributos  
    private Long id;
    private String name;
    private String descripition; 
    private Double price;

    //botão direito 
    //ação de código 
    //generate constructors 
    //criei o construtor para receber o que entra na classe construtora do ProductController.java -> public ProductController()
    public Product(Long id, String name, String descripition, Double price) {
        this.id = id;
        this.name = name;
        this.descripition = descripition;
        this.price = price;
    }
    //botão direito 
    //surce action ou ação de código 
    //generate getters and setters 
    //seleciona todos os atributos que eu criei a cima e clica em "OK"
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescripition() {
        return descripition;
    }
    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    } 
}
