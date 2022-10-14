package edu.miu.elibrary.ruleset;

import edu.miu.elibrary.exception.RuleException;

import java.awt.*;

public interface RuleSet {
	public void applyRules(Component ob) throws RuleException;
}
