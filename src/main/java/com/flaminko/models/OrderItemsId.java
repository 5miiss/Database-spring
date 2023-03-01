package com.flaminko.models;
// Generated Feb 28, 2023, 5:27:47 PM by Hibernate Tools 6.2.0.CR1


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * OrderItemsId generated by hbm2java
 */
@Embeddable
public class OrderItemsId  implements java.io.Serializable {


     private int orderDetailsId;
     private int orderDetailsUserId;

    public OrderItemsId() {
    }

    public OrderItemsId(int orderDetailsId, int orderDetailsUserId) {
       this.orderDetailsId = orderDetailsId;
       this.orderDetailsUserId = orderDetailsUserId;
    }
   


    @Column(name="order_details_id", nullable=false)
    public int getOrderDetailsId() {
        return this.orderDetailsId;
    }
    
    public void setOrderDetailsId(int orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }


    @Column(name="order_details_user_id", nullable=false)
    public int getOrderDetailsUserId() {
        return this.orderDetailsUserId;
    }
    
    public void setOrderDetailsUserId(int orderDetailsUserId) {
        this.orderDetailsUserId = orderDetailsUserId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OrderItemsId) ) return false;
		 OrderItemsId castOther = ( OrderItemsId ) other; 
         
		 return (this.getOrderDetailsId()==castOther.getOrderDetailsId())
 && (this.getOrderDetailsUserId()==castOther.getOrderDetailsUserId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getOrderDetailsId();
         result = 37 * result + this.getOrderDetailsUserId();
         return result;
   }   


}

