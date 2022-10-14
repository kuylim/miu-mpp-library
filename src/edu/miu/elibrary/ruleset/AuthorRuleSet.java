package edu.miu.elibrary.ruleset;

import edu.miu.elibrary.ui.AuthorView;
import edu.miu.elibrary.ui.BookView;

import java.awt.*;

public class AuthorRuleSet implements RuleSet {

    @Override
    public void applyRules(Component ob) throws RuleException {
        AuthorView window = (AuthorView) ob;

        if (!validateAuthorForm(window)) {
            throw new RuleException("You must enter required field");
        }
    }

    boolean validateAuthorForm(AuthorView window) {
        return !window.getTxtFirstName().isEmpty()
                && !window.getTxtLastname().isEmpty()
                && !window.getTxtPhoneNumber().isEmpty()
                && !window.getTxtStreet().isEmpty()
                && !window.getTxtCity().isEmpty()
                && !window.getTxtState().isEmpty()
                && !window.getTxtZip().isEmpty();
    }

}
