package com.flaminko.models;
// Generated Feb 28, 2023, 5:27:47 PM by Hibernate Tools 6.2.0.CR1


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * CreditCardsId generated by hbm2java
 */
@Embeddable
public class CreditCardsId  implements java.io.Serializable {


     private String number;
     private int userId;

    public CreditCardsId() {
    }

    public CreditCardsId(String number, int userId) {
       this.number = number;
       this.userId = userId;
    }
   


    @Column(name="number", nullable=false, length=60)
    public String getNumber() {
        return this.number;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }


    @Column(name="user_id", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CreditCardsId) ) return false;
		 CreditCardsId castOther = ( CreditCardsId ) other; 
         
		 return ( (this.getNumber()==castOther.getNumber()) || ( this.getNumber()!=null && castOther.getNumber()!=null && this.getNumber().equals(castOther.getNumber()) ) )
 && (this.getUserId()==castOther.getUserId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNumber() == null ? 0 : this.getNumber().hashCode() );
         result = 37 * result + this.getUserId();
         return result;
   }   


}


