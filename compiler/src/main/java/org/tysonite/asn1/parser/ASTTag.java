/* Generated By:JJTree: Do not edit this line. ASTTag.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.tysonite.asn1.parser;

public
class ASTTag extends SimpleNode {
  public ASTTag(int id) {
    super(id);
  }

  public ASTTag(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=b7ffd703db52bbd6f4462aa6897eb61a (do not edit this line) */
