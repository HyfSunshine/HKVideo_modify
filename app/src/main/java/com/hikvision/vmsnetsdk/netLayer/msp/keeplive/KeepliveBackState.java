/*    */ package com.hikvision.vmsnetsdk.netLayer.msp.keeplive;
/*    */ 
/*    */ import com.hikvision.vmsnetsdk.netLayer.msp.MspBackState;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class KeepliveBackState
/*    */   extends MspBackState
/*    */ {
/*    */   public static final int CODE_SESSION_ERROR = 206;
/*    */   public static final int CODE_EXCEPTION = 230;
/*    */   public static final int CODE_ERROR = 231;
/*    */   
/*    */   public boolean isSuccess()
/*    */   {
/* 19 */     if (this.code == 200) {
/* 20 */       return true;
/*    */     }
/* 22 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\vmsnetsdk.jar!\com\hikvision\vmsnetsdk\netLayer\msp\keeplive\KeepliveBackState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */