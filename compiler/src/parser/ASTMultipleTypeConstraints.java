/* Generated By:JJTree: Do not edit this line. ASTMultipleTypeConstraints.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTMultipleTypeConstraints extends SimpleNode {
  public ASTMultipleTypeConstraints(int id) {
    super(id);
  }

  public ASTMultipleTypeConstraints(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=626487aa0646a2e96a477262e43092ab (do not edit this line) */