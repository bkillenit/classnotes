/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author BlaineKillen
 */
public class CalculatorUI extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorUI
     */
    public CalculatorUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        subtract = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        Mystery = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("0");

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("0");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        subtract.setText("-");
        subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformed(evt);
            }
        });

        Clear.setText("C");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        equals.setText("=");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        multiply.setText("*");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        Mystery.setText("?");
        Mystery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MysteryActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(31, 31, 31)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(layout.createSequentialGroup()
                                    .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                    .add(jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(18, 18, 18)
                                    .add(jButton6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createSequentialGroup()
                                    .add(jButton7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(jButton10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(layout.createSequentialGroup()
                                            .add(jButton8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(18, 18, 18)
                                            .add(jButton9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                        .add(31, 31, 31)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(subtract, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Clear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(add, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(equals, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jTextField1))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(multiply, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(divide, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Mystery, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(17, 17, 17)
                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(27, 27, 27)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Clear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(add, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(multiply, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(subtract, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(divide, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(equals, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Mystery, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String display, operator, sign;
    
    int result;
    
    int calcnum1, calcnum2; 
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        
        //get the current value
        display = jTextField1.getText();
        
        
        //add the number in
        if (display.equals("0"))
        {
            display = "9";
            operator = "no";
        }
        
        else
        {
            if (operator.equals("yes"))
            {
            calcnum1 = Integer.parseInt(display);
            operator = "no";
            display = "9";      
            }   
           
            else
            {    
            display = display + "9"; 
            }
        }
            
        jTextField1.setText(display);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //get the current value
        display = jTextField1.getText();
        
        
        //add the number in
        if (display.equals("0"))
        {
            display = "3";
            operator = "no";
        }
        
        else
        {
            if (operator.equals("yes"))
            {
            calcnum1 = Integer.parseInt(display);
            operator = "no";
            display = "3";      
            }   
           
            else
            {    
            display = display + "3"; 
            }
        }
            
        jTextField1.setText(display);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //get the current value
        display = jTextField1.getText();
        
        
        //add the number in
        if (display.equals("0"))
        {
            display = "1";
            operator = "no";
        }
        
        else
        {
            if (operator.equals("yes"))
            {
            calcnum1 = Integer.parseInt(display);
            operator = "no";
            display = "1";      
            }   
           
            else
            {    
            display = display + "1"; 
            }
        }
            
        jTextField1.setText(display);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //get the current value
        display = jTextField1.getText();
        
        
        //add the number in
        if (display.equals("0"))
        {
            display = "2";
            operator = "no";
        }
        
        else
        {
            if (operator.equals("yes"))
            {
            calcnum1 = Integer.parseInt(display);
            operator = "no";
            display = "2";      
            }   
           
            else
            {    
            display = display + "2"; 
            }
        }
            
        jTextField1.setText(display);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //get the current value
        display = jTextField1.getText();
        
        
        //add the number in
        if (display.equals("0"))
        {
            display = "4";
            operator = "no";
        }
        
        else
        {
            if (operator.equals("yes"))
            {
            calcnum1 = Integer.parseInt(display);
            operator = "no";
            display = "4";      
            }   
           
            else
            {    
            display = display + "4"; 
            }
        }
            
        jTextField1.setText(display);
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //get the current value
        display = jTextField1.getText();
        
        
        //add the number in
        if (display.equals("0"))
        {
            display = "5";
            operator = "no";
        }
        
        else
        {
            if (operator.equals("yes"))
            {
            calcnum1 = Integer.parseInt(display);
            operator = "no";
            display = "5";      
            }   
           
            else
            {    
            display = display + "5"; 
            }
        }
            
        jTextField1.setText(display);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //get the current value
        display = jTextField1.getText();
        
        
        //add the number in
        if (display.equals("0"))
        {
            display = "6";
            operator = "no";
        }
        
        else
        {
            if (operator.equals("yes"))
            {
            calcnum1 = Integer.parseInt(display);
            operator = "no";
            display = "6";      
            }   
           
            else
            {    
            display = display + "6"; 
            }
        }
            
        jTextField1.setText(display);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //get the current value
        display = jTextField1.getText();
        
        
        //add the number in
        if (display.equals("0"))
        {
            display = "7";
            operator = "no";
        }
        
        else
        {
            if (operator.equals("yes"))
            {
            calcnum1 = Integer.parseInt(display);
            operator = "no";
            display = "7";      
            }   
           
            else
            {    
            display = display + "7"; 
            }
        }
            
        jTextField1.setText(display);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        //get the current value
        display = jTextField1.getText();
        
        
        //add the number in
        if (display.equals("0"))
        {
            display = "8";
            operator = "no";
        }
        
        else
        {
            if (operator.equals("yes"))
            {
            calcnum1 = Integer.parseInt(display);
            operator = "no";
            display = "8";      
            }   
           
            else
            {    
            display = display + "8"; 
            }
        }
            
        jTextField1.setText(display);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        //get the current value
        display = jTextField1.getText();
        
        
        //add the number in
        if (display.equals("0"))
        {
            display = "0";
            operator = "no";
        }
        
        else
        {
            if (operator.equals("yes"))
            {
            calcnum1 = Integer.parseInt(display);
            operator = "no";
            display = "0";      
            }   
           
            else
            {    
            display = display + "0"; 
            }
        }
            
        jTextField1.setText(display);
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        //checks memory for operation
         //check memory to see if any operator exist and performs operation
        //check if calcnum2 is full or not
        
        if ( (calcnum1 == 0) || (sign.equals("=")) )
        {
           calcnum1 = Integer.parseInt(display); 
           operator = "yes";
        }
        
        else
        {
            calcnum2 = Integer.parseInt(display);                
                
                if (sign.equals("+"))
                    {
                        result = calcnum1 + calcnum2; 
                    }
             
                if (sign.equals("-"))
                    {
                        result = calcnum1 - calcnum2;
                    }
                if (sign.equals("/"))
                    {
                        result = calcnum1 / calcnum2;
                    }
                
               if (sign.equals("*"))
                    {
                        result = calcnum1 * calcnum2;
                    }
               
               if (sign.equals("?"))
                    {
                        if (calcnum2 > calcnum1  )
                        {
                            result = (calcnum2 / 3) + 1;
                        }
                        else
                        {
                           result =  calcnum1 - 1;
                        }
                    }
               
               operator = "yes";
               
               calcnum1 = result;
        }          
        
        //convert to string and display
        
        display = String.valueOf(result);
        
        
        jTextField1.setText(display); 
        sign = "+";
        
    }//GEN-LAST:event_addActionPerformed

    private void subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractActionPerformed
        //test whats in memory
        //check memory to see if any operator exist and performs operation
        //check if calcnum2 is full or not
        
        if ( (calcnum1 == 0) || (sign.equals("=")) )
        {
           calcnum1 = Integer.parseInt(display); 
           operator = "yes";
        }
        else
        {
            calcnum2 = Integer.parseInt(display);                
                
                if (sign.equals("+"))
                    {
                        result = calcnum1 + calcnum2; 
                    }
             
                if (sign.equals("-"))
                    {
                        result = calcnum1 - calcnum2;
                    }
                if (sign.equals("/"))
                    {
                        result = calcnum1 / calcnum2;
                    }
                
               if (sign.equals("*"))
                    {
                        result = calcnum1 * calcnum2;
                    }
               
               if (sign.equals("?"))
                    {
                        if (calcnum2 > calcnum1  )
                        {
                            result = (calcnum2 / 3) + 1;
                        }
                        else
                        {
                           result =  calcnum1 - 1;
                        }
                    }
               
               operator = "yes";
               
               calcnum1 = result;
        }          
        
        //convert to string and display
        
        display = String.valueOf(result);
        
        
        jTextField1.setText(display); 
        sign = "-"; 
       
        
    }//GEN-LAST:event_subtractActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        
        // TODO add your handling code here:
        //check memory to see if any operator exist and performs operation
        //check if calcnum2 is full or not
        
        if ( (calcnum1 == 0) || (sign.equals("=")))
        {
           calcnum1 = Integer.parseInt(display); 
           operator = "yes";
        }
        
        else
        {
            calcnum2 = Integer.parseInt(display);                
                
                if (sign.equals("+"))
                    {
                        result = calcnum1 + calcnum2; 
                    }
             
                if (sign.equals("-"))
                    {
                        result = calcnum1 - calcnum2;
                    }
                if (sign.equals("/"))
                    {
                        result = calcnum1 / calcnum2;
                    }
                
               if (sign.equals("*"))
                    {
                        result = calcnum1 * calcnum2;
                    }
               if (sign.equals("?"))
                    {
                        if (calcnum2 > calcnum1  )
                        {
                            result = (calcnum2 / 3) + 1;
                        }
                        else
                        {
                           result =  calcnum1 - 1;
                        }
                    }
               
               operator = "yes";
               
               calcnum1 = result;
        }          
        
        //convert to string and display
        
        display = String.valueOf(result);
        
        
        jTextField1.setText(display); 
        sign = "*";
        
        
    }//GEN-LAST:event_multiplyActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
        
        // TODO add your handling code here:
        //check if calcnum2 is full or not
        if ( calcnum1 == 0)
        {
           calcnum1 = Integer.parseInt(display); 
        }
        else
        {
            calcnum2 = Integer.parseInt(display);                
                
                if (sign.equals("+"))
                    {
                        result = calcnum1 + calcnum2; 
                    }
             
                if (sign.equals("-"))
                    {
                        result = calcnum1 - calcnum2;
                    }
                if (sign.equals("/"))
                    {
                        result = calcnum1 / calcnum2;
                    }
                
                if (sign.equals("*"))
                    {
                        result = calcnum1 * calcnum2;
                    }
                
                if (sign.equals("?"))
                    {
                        if (calcnum2 > calcnum1  )
                        {
                            result = (calcnum2 / 3) + 1;
                        }
                        else
                        {
                            result =  calcnum1 - 1;
                        }
                    }
         }    
         
          //convert, store to memory, and display
          calcnum1 = result;
          calcnum2 = 0; 
          display = String.valueOf(result);
          jTextField1.setText(display);
          
          operator = "yes";
          
          //reset sign
          sign = "=";
        
    }//GEN-LAST:event_equalsActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        
        //clear all variables
        operator = "no";
        calcnum1 = 0;
        calcnum2 = 0;        
        display = "0";
        result = 0;
        sign = "0";
        
        //reset display
        jTextField1.setText(display);
        
    }//GEN-LAST:event_ClearActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        
        //check memory to see if any operator exist and performs operation
         //check memory to see if any operator exist and performs operation
        //check if calcnum2 is full or not
        
        if ( (calcnum1 == 0) || (sign.equals("=")) )
        {
           calcnum1 = Integer.parseInt(display); 
           operator = "yes";
        }
        else
        {
            calcnum2 = Integer.parseInt(display);                
                
                if (sign.equals("+"))
                    {
                        result = calcnum1 + calcnum2; 
                    }
             
                if (sign.equals("-"))
                    {
                        result = calcnum1 - calcnum2;
                    }
                if (sign.equals("/"))
                    {
                        result = calcnum1 / calcnum2;
                    }
                
               if (sign.equals("*"))
                    {
                        result = calcnum1 * calcnum2;
                    }
               
               if (sign.equals("?"))
                    {
                        if (calcnum2 > calcnum1  )
                        {
                            result = (calcnum2 / 3) + 1;
                        }
                        else
                        {
                           result =  calcnum1 - 1;
                        }
                    }
               
               operator = "yes";
               
               calcnum1 = result;
        }          
        
        //convert to string and display
        
        display = String.valueOf(result);
        
        
        jTextField1.setText(display); 
        sign = "/";
    }//GEN-LAST:event_divideActionPerformed

    private void MysteryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MysteryActionPerformed
        // TODO add your handling code here:
        if ( (calcnum1 == 0) || (sign.equals("=")) )
        {
           calcnum1 = Integer.parseInt(display); 
           operator = "yes";
        }
        else
        {
            calcnum2 = Integer.parseInt(display);                
                
                if (sign.equals("+"))
                    {
                        result = calcnum1 + calcnum2; 
                    }
             
                if (sign.equals("-"))
                    {
                        result = calcnum1 - calcnum2;
                    }
                if (sign.equals("/"))
                    {
                        result = calcnum1 / calcnum2;
                    }
                
               if (sign.equals("*"))
                    {
                        result = calcnum1 * calcnum2;
                    }
               
               if (sign.equals("?"))
                    {
                        if (calcnum2 > calcnum1  )
                        {
                            result = (calcnum2 / 3) + 1;
                        }
                        else
                        {
                           result =  calcnum1 - 1;
                        }
                    }
               
               operator = "yes";
               
               calcnum1 = result;
        }          
        
        display = String.valueOf(result);
        
        
        jTextField1.setText(display); 
        sign = "?";
    }//GEN-LAST:event_MysteryActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CalculatorUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Mystery;
    private javax.swing.JButton add;
    private javax.swing.JButton divide;
    private javax.swing.JButton equals;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton multiply;
    private javax.swing.JButton subtract;
    // End of variables declaration//GEN-END:variables
}
