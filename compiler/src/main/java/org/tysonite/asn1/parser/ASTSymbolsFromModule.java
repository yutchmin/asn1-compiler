/* Generated By:JJTree: Do not edit this line. ASTSymbolsFromModule.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.tysonite.asn1.parser;

public
class ASTSymbolsFromModule extends SimpleNode {
  public ASTSymbolsFromModule(int id) {
    super(id);
  }

  public ASTSymbolsFromModule(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=8708b7706b0265eae0823697d7c8d7d3 (do not edit this line) */