package br.com.youtube.customer.entity;

import java.util.function.Function;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.bytebuddy.asm.Advice.This;

@Entity
@Table(name ="customer")
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")    
    private Long id;
    
    @Column(name = "name",nullable = false)
    private String name;
    
    @Column(name = "document",nullable = false)
    private String document;

    public <R> R map(Function<Customer,R>func){
        return func.aplly(this);
    }
    
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
    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }
    
}
