package com.flaminko.models;
// Generated Feb 28, 2023, 5:27:47 PM by Hibernate Tools 6.2.0.CR1


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="user"
    ,catalog="flamingoo"
    , uniqueConstraints = @UniqueConstraint(columnNames="username") 
)
public class User  implements java.io.Serializable {


     private int id;
     private String username;
     private String password;
     private String firstName;
     private String lastName;
     private String gender;
     private String email;
     private String phone;
     private String isAdmin;
     private Set<CreditCards> creditCardses = new HashSet<CreditCards>(0);
     private Set<Product> products = new HashSet<Product>(0);
     private Set<Addresses> addresseses = new HashSet<Addresses>(0);
     private Set<OrderDetails> orderDetailses = new HashSet<OrderDetails>(0);

    public User() {
    }

	
    public User( String username, String password, String firstName, String lastName, String gender, String email, String phone, String isAdmin) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.isAdmin = isAdmin;
    }
    public User( String username, String password, String firstName, String lastName, String gender, String email, String phone, String isAdmin, Set<CreditCards> creditCardses, Set<Product> products, Set<Addresses> addresseses, Set<OrderDetails> orderDetailses) {
       this.username = username;
       this.password = password;
       this.firstName = firstName;
       this.lastName = lastName;
       this.gender = gender;
       this.email = email;
       this.phone = phone;
       this.isAdmin = isAdmin;
       this.creditCardses = creditCardses;
       this.products = products;
       this.addresseses = addresseses;
       this.orderDetailses = orderDetailses;
    }
   
     @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="username", unique=true, nullable=false, length=45)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="password", nullable=false, length=45)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="first_name", nullable=false, length=45)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="last_name", nullable=false, length=45)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="gender", nullable=false, length=45)
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    
    @Column(name="email", nullable=false, length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="phone", nullable=false, length=45)
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @Column(name="isAdmin", nullable=false, length=45)
    public String getIsAdmin() {
        return this.isAdmin;
    }
    
    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<CreditCards> getCreditCardses() {
        return this.creditCardses;
    }
    
    public void setCreditCardses(Set<CreditCards> creditCardses) {
        this.creditCardses = creditCardses;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="users_has_product", catalog="flamingoo", joinColumns = { 
        @JoinColumn(name="users_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="product_id", nullable=false, updatable=false), 
        @JoinColumn(name="product_category_id", nullable=false, updatable=false), 
        @JoinColumn(name="product_category_parent_id", nullable=false, updatable=false) })
    public Set<Product> getProducts() {
        return this.products;
    }
    
    public void setProducts(Set<Product> products) {
        this.products = products;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<Addresses> getAddresseses() {
        return this.addresseses;
    }
    
    public void setAddresseses(Set<Addresses> addresseses) {
        this.addresseses = addresseses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<OrderDetails> getOrderDetailses() {
        return this.orderDetailses;
    }
    
    public void setOrderDetailses(Set<OrderDetails> orderDetailses) {
        this.orderDetailses = orderDetailses;
    }




}


