package br.sp.fatec.product.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "TBL_PRODUCT")
public class Product implements Serializable {
    //são atributos - todos são privados - tudo que é privado só é visto dentro da classe
    //a partir de uma classe eu crio um (ou mais) objetos
    //uma classe é formada por metodos e atributos  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description; 
    private Double price;

    //botão direito 
    //ação de código 
    //generate constructors 
    //criei o construtor para receber o que entra na classe construtora do ProductController.java -> public ProductController()
    public Product(){ //Long id, String name, String descripition, Double price) {
        //this.id = id;
        //this.name = name;
        //this.descripition = descripition;
        //this.price = price;
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
  

    
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    } 

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result +((id == null) ? 0 : id.hashCode());
        return result; 
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass () != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (id == null){
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


}
