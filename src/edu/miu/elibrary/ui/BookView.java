/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.miu.elibrary.ui;

import edu.miu.elibrary.business.Author;
import edu.miu.elibrary.controller.BookController;
import edu.miu.elibrary.dataaccess.DataAccessFacade;
import edu.miu.elibrary.ruleset.BookViewValidateType;
import edu.miu.elibrary.ruleset.RuleException;
import edu.miu.elibrary.ruleset.RuleSet;
import edu.miu.elibrary.ruleset.RuleSetFactory;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Kuylim Tith
 */
public class BookView extends javax.swing.JPanel {

    private BookViewValidateType bookViewValidateType;
    private final BookController bookController;

    /**
     * Creates new form AddBookView
     */

    {
        DataAccessFacade dataAccessFacade = new DataAccessFacade();
        bookController = new BookController(dataAccessFacade);
    }
    public BookView() {
        initComponents();
        loadAuthorList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumberOfCopy = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAddAuthor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAuthors = new javax.swing.JList<>();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtIsbnSearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNumberOfCopyExist = new javax.swing.JTextField();
        btnSaveCopy = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtMaxCheckoutLength = new javax.swing.JTextField();

        jLabel1.setText("ISBN");

        jLabel2.setText("Title");

        jLabel3.setText("Number of Copy");

        jLabel4.setText("Author");

        btnAddAuthor.setText("Add Author");
        btnAddAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAuthorActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstAuthors);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel5.setText("ISBN");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Add book copy to existing book");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel7.setText("Number of Copy");

        btnSaveCopy.setText("Save");
        btnSaveCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCopyActionPerformed(evt);
            }
        });

        jLabel8.setText("Max Checkout Length");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(175, 175, 175)
                                        .addComponent(btnClear)
                                        .addGap(26, 26, 26))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSave)
                                    .addComponent(btnAddAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel8))
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNumberOfCopy, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(txtMaxCheckoutLength)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIsbnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(txtNumberOfCopyExist))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(btnSaveCopy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtMaxCheckoutLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumberOfCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(btnAddAuthor))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIsbnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNumberOfCopyExist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveCopy))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadAuthorList() {
        lstAuthors.setModel(bookController.getAuthorListModel());
    }
    private void btnAddAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAuthorActionPerformed
        // TODO add your handling code here:
    }

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearAddBookForm();
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        this.addBook();
    }

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        searchBook();
    }

    private void btnSaveCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCopyActionPerformed
        addBookCopy();
    }//GEN-LAST:event_btnSaveCopyActionPerformed

    void addBook() {
        RuleSet bookRuleSet = RuleSetFactory.getRuleSet(BookView.this);
        try {
            this.setBookViewValidateType(BookViewValidateType.BOOK_VIEW);
            bookRuleSet.applyRules(BookView.this);
            //if rules pass...
            //submit data
            try {
                String bookTitle = bookController.createNewBook(
                        txtIsbn.getText(),
                        txtTitle.getText(),
                        Integer.parseInt(txtNumberOfCopy.getText()),
                        lstAuthors.getSelectedValuesList()
                );
                JOptionPane.showMessageDialog(this,bookTitle + "added successfully");
                clearAddBookForm();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(BookView.this,
                        "Error: "+e.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch(RuleException e) {
            JOptionPane.showMessageDialog(BookView.this,
                    "Error: "+e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

    void addBookCopy() {
        RuleSet bookRuleSet = RuleSetFactory.getRuleSet(BookView.this);
        try {
            setBookViewValidateType(BookViewValidateType.BOOK_COPY_VIEW);
            bookRuleSet.applyRules(BookView.this);
            //if rules pass...
            //submit data
            try {
                boolean update = bookController.addBookCopy(Integer.parseInt(getBookNumberOfCopyExist()));
                if (update) {
                    clearAddBookCopyForm();
                    JOptionPane.showMessageDialog(this,"Add " + getBookNumberOfCopyExist() + "more successfully");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(BookView.this,
                        "Error: "+e.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch(RuleException e) {
            JOptionPane.showMessageDialog(BookView.this,
                    "Error: "+e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

    void searchBook() {
        try {
            String bookTitle = bookController.searchBy(getTxtIsbnSearchText()).getTitle();
            if (bookTitle != null) {
                txtNumberOfCopyExist.setEnabled(true);
            }
            JOptionPane.showMessageDialog(this,bookTitle + "is found");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(BookView.this,
                    "Error: "+e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(BookView.this,
                    "Error: "+ "Book with the ISBN you have entered is not found",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    void clearAddBookForm() {
        txtIsbn.setText("");
        txtNumberOfCopy.setText("");
        txtTitle.setText("");
        lstAuthors.clearSelection();
    }

    void clearAddBookCopyForm() {
        txtIsbnSearch.setText("");
        txtNumberOfCopyExist.setText("");
        txtNumberOfCopyExist.setEnabled(false);
    }

    public BookViewValidateType getBookViewValidateType() {
        return bookViewValidateType;
    }

    public void setBookViewValidateType(BookViewValidateType bookViewValidateType) {
        this.bookViewValidateType = bookViewValidateType;
    }

    public String getIsbnText() {
        return txtIsbn.getText();
    }

    public String getBookTitleText() {
        return txtTitle.getText();
    }

    public String getBookNumberOfCopy() {
        return txtNumberOfCopy.getText();
    }

    public String getBookNumberOfCopyExist() {
        return txtNumberOfCopyExist.getText();
    }

    public List<Author> getAuthorSelectedList() {
        return lstAuthors.getSelectedValuesList();
    }

    public String getTxtIsbnSearchText() {
        return txtIsbnSearch.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAuthor;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveCopy;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<Author> lstAuthors;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtIsbnSearch;
    private javax.swing.JTextField txtMaxCheckoutLength;
    private javax.swing.JTextField txtNumberOfCopy;
    private javax.swing.JTextField txtNumberOfCopyExist;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
