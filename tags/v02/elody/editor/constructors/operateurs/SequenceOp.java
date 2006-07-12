package grame.elody.editor.constructors.operateurs;

import grame.elody.lang.TExpMaker;
import grame.elody.lang.texpression.expressions.TExp;

import java.awt.Image;

public class SequenceOp extends Operateur {
	public SequenceOp (Image img) 	{ super (img); name = "Seq"; }
   	public TExp compose(TExpMaker maker, TExp e1, TExp e2) {
  		return maker.createSeq(e1, e2);
    }
}
