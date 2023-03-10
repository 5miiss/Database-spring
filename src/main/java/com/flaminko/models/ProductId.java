package com.flaminko.models;
// Generated Feb 28, 2023, 5:27:47 PM by Hibernate Tools 6.2.0.CR1


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * ProductId generated by hbm2java
 */
@Embeddable
public class ProductId  implements java.io.Serializable {


     private int categoryId;
     private int categoryParentId;
     private int id;

    public ProductId() {
    }

    public ProductId(int categoryId, int categoryParentId, int id) {
       this.categoryId = categoryId;
       this.categoryParentId = categoryParentId;
       this.id = id;
    }
   


    @Column(name="category_id", nullable=false)
    public int getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }


    @Column(name="category_parent_id", nullable=false)
    public int getCategoryParentId() {
        return this.categoryParentId;
    }
    
    public void setCategoryParentId(int categoryParentId) {
        this.categoryParentId = categoryParentId;
    }


    @Column(name="id", nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ProductId) ) return false;
		 ProductId castOther = ( ProductId ) other; 
         
		 return (this.getCategoryId()==castOther.getCategoryId())
 && (this.getCategoryParentId()==castOther.getCategoryParentId())
 && (this.getId()==castOther.getId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCategoryId();
         result = 37 * result + this.getCategoryParentId();
         result = 37 * result + this.getId();
         return result;
   }   


}


