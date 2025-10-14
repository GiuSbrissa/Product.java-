package br.sp.fatec.product.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.sp.fatec.product.entities.Product;
import jakarta.persistence.EntityNotFoundException;

@RestController  //gera codigo 
@RequestMapping("products") 
public class ProductController {

    private ArrayList<Product> list = new ArrayList<Product>();
    //apareceu o "new" significa que eu estou criando um objeto a partir de uma classe 
    //tamanho inicial do Array é 0  
    //arraylist() -> metodo construtor por conta do parenteses 
    //toda vez que eu faço um new toda vez na frente vem metodo construtor 

    //metodo construtor pq tem o mesmo nome que a classe
    public ProductController() {
        list.add(new Product(1L, "product 1", "descripition1", 100.0));
        list.add(new Product(2L, "product 2", "descripition2", 200.0));
        list.add(new Product(3L, "product 3", "descripition3", 300.0));
    }
    //primeito endpoit -> devolve todos os produtos
    @GetMapping //com esse @ virou uma aplicação (metodos/protocolo HTTP)
    public List<Product> getProducts(){ //sozinho é apenas um método (sem o @)
        return list;
    }
        //segundo endpoit -> devolve os produtos pelo id
        @GetMapping("{id}") //tem que casar o ("{X}") como @PathVariable long X
    public Product getProductById(@PathVariable long id) {
        return list.stream() //programação funcional -> jeito de manipular a lista 
                 .filter( p -> p.getId() == id) //so passa pelo filtro o produto que bater com o id
                 .findFirst() //pega a primeira ocorrencia que bate com o id
                 .orElseThrow( () -> new EntityNotFoundException("Não cadastrado")); // se achar devolve o produto, se não devolve a mensagem de erro 
    }
}
//uma entidade vai ser algo que vai estar amarrado com as tabelas do banco de dados 