package edu.miu.elibrary.ruleset;

import edu.miu.elibrary.exception.BookViewValidateType;
import edu.miu.elibrary.exception.RuleException;
import edu.miu.elibrary.ui.BookView;

import java.awt.*;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class BookRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		BookView window = (BookView) ob;

		if (window.getBookViewValidateType() == BookViewValidateType.BOOK_VIEW) {
			if (!validateAddNewBookForm(window)) {
				throw new RuleException("You must enter required field");
			}

			if (!validateISBN(window)) {
				throw new RuleException("ISBN must 6 or more than 6 digit");
			}

			validateNumberOfCopy(window);

			if (!validateSelectAuthor(window)) {
				throw new RuleException("Please select the author");
			}
		} else {
			if (!validateISBNSearch(window)) {
				throw new RuleException("ISBN must 6 or more than 6 digit");
			}

			validateNumberOfCopyExist(window);
		}
	}

	boolean validateAddNewBookForm(BookView window) {
		return !window.getIsbnText().isEmpty() && !window.getBookTitleText().isEmpty() && !window.getBookNumberOfCopy().isEmpty();
	}

	boolean validateSelectAuthor(BookView window) {
		return !(window.getAuthorSelectedList().size() == 0);
	}

	boolean validateISBN(BookView window) {
		String isbn = window.getIsbnText();
		return isbn.chars().count() >= 6;
	}

	void validateNumberOfCopy(BookView window) throws RuleException {
		String numberOfCopy = window.getBookNumberOfCopy();
		try {
			Integer.valueOf(numberOfCopy);
		}catch (Exception e) {
			throw new RuleException("You can input number of copy book as number only");
		}
	}

	boolean validateISBNSearch(BookView window) {
		String isbn = window.getTxtIsbnSearchText();
		return isbn.chars().count() >= 6;
	}

	void validateNumberOfCopyExist(BookView window) throws RuleException {
		String numberOfCopy = window.getBookNumberOfCopyExist();
		try {
			Integer.valueOf(numberOfCopy);
		}catch (Exception e) {
			throw new RuleException("You can input number of copy book as number only");
		}
	}
}
