/* Generated By:JJTree: Do not edit this line. ASTSymbolsFromModuleList.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.tysonite.asn1.parser;

public
class ASTSymbolsFromModuleList extends SimpleNode {
  public ASTSymbolsFromModuleList(int id) {
    super(id);
  }

  public ASTSymbolsFromModuleList(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=b78c57db208a8191bfcfd7ec82184a81 (do not edit this line) */
