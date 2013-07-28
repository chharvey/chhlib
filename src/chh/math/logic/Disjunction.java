package chh.math.logic;

/**
 * The Disjunction is a binary operator on two propositions.
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Disjunction extends Proposition {
	/**
	 * Constructs a new Disjunction object.
	 * @param p the first proposition
	 * @param q  the second proposition
	 */
	public Disjunction(Proposition p, Proposition q) {
		super(p.value()==Proposition.Constant.TRUE || p.value()==Proposition.Constant.TRUE ? Proposition.Constant.TRUE : Proposition.Constant.FALSE);
	}
}
