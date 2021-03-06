/* Generated By:JJTree: Do not edit this line. ASTSetOrSequenceOfType.java Version 6.1 */
 /* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.tysonite.asn1.parser;

public class ASTSetOrSequenceOfType extends SimpleNode {

   public static final int SEQUENCE = 0;
   public static final int SET = 1;
   int choosenType = -1;

   public ASTSetOrSequenceOfType(int id) {
      super(id);
   }

   public ASTSetOrSequenceOfType(AsnParser p, int id) {
      super(p, id);
   }

   public void setType(int type) {
      choosenType = type;
   }

   public boolean isSequence() {
      return choosenType == SEQUENCE;
   }

   public boolean isSet() {
      return choosenType == SET;
   }

   /**
    * Accept the visitor. *
    */
   public Object jjtAccept(AsnParserVisitor visitor, Object data) {

      return visitor.visit(this, data);
   }
}
/* JavaCC - OriginalChecksum=8d6ae0ae6f9ce35f94c8f82632e002ab (do not edit this line) */
