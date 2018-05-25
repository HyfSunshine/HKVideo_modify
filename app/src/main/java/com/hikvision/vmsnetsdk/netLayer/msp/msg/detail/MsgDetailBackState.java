/*    */ package com.hikvision.vmsnetsdk.netLayer.msp.msg.detail;
/*    */ 
/*    */ import com.hikvision.vmsnetsdk.netLayer.msp.MspBackState;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MsgDetailBackState
/*    */   extends MspBackState
/*    */ {
/*    */   public static final int CODE_NO_DATA = 201;
/*    */   public static final int CODE_PARAM_ERROR = 205;
/*    */   public static final int CODE_SESSION_ERROR = 206;
/*    */   public static final int CODE_NO_SUPPORT = 207;
/*    */   public static final int CODE_EXCEPTION = 230;
/*    */   public static final int CODE_ERROR = 231;
/*    */   
/*    */   public boolean isSuccess()
/*    */   {
/* 22 */     if (this.code == 200) {
/* 23 */       return true;
/*    */     }
/* 25 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\vmsnetsdk.jar!\com\hikvision\vmsnetsdk\netLayer\msp\msg\detail\MsgDetailBackState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */