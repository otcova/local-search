/*
 * ProbTSPJFrame.java
 *
 * Created on 4 de agosto de 2005, 23:18
 */

package org.example.IA.probTSP;

import java.util.List;

import org.example.aima.search.framework.Problem;
import org.example.aima.search.framework.Search;
import org.example.aima.search.framework.SearchAgent;
import org.example.aima.search.informed.HillClimbingSearch;
import org.example.aima.search.informed.SimulatedAnnealingSearch;

import javax.swing.text.NumberFormatter;
import javax.swing.text.DefaultFormatterFactory;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 *
 * @author  javier
 */
public class ProbTSPJFrame extends javax.swing.JFrame {
    
    /**
     *
     */
    private static final long serialVersionUID = -8877491224336005353L;
    private int nc;
    
    /** Creates new form ProbTSPJFrame */
    public ProbTSPJFrame() {
        
        
        numForm=DecimalFormat.getInstance();
        numForm.setParseIntegerOnly(true);
        numForm.setGroupingUsed(false);
        nfor=new NumberFormatter(numForm);
        nfor.setAllowsInvalid(false);
        formSeed = new DefaultFormatterFactory(nfor,nfor,nfor);
        
        
        numForm=DecimalFormat.getNumberInstance();
        numForm.setParseIntegerOnly(false);
        ((DecimalFormat) numForm).applyPattern("#####.#######");
        ((DecimalFormat) numForm).setDecimalSeparatorAlwaysShown(true);
        numForm.setGroupingUsed(false);
        nfor=new NumberFormatter(numForm);
        nfor.setAllowsInvalid(false);
        formLambda= new DefaultFormatterFactory(nfor,nfor,nfor);
        
        initComponents();
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        HillClimbingL = new javax.swing.JLabel();
        AnnealingL = new javax.swing.JLabel();
        annealingTA = new java.awt.TextArea();
        hillClimbTA = new java.awt.TextArea();
        ciudadesL = new java.awt.Label();
        ejecutarB = new javax.swing.JButton();
        CiudadesS = new javax.swing.JSlider();
        ejecutarPrB = new javax.swing.JButton();
        SemillaL = new javax.swing.JLabel();
        SemillaTF = new javax.swing.JFormattedTextField(new Integer(1));
        AnnealingPL = new javax.swing.JLabel();
        NiterL = new javax.swing.JLabel();
        NiterS = new javax.swing.JSlider();
        LambdaL = new javax.swing.JLabel();
        ParKS = new javax.swing.JSlider();
        ParKL = new javax.swing.JLabel();
        LambdaFT = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Travelling Salesman Problem");

        HillClimbingL.setText("Hill Climbing");

        AnnealingL.setText("Simulated Annealing");

        annealingTA.setColumns(40);
        annealingTA.setEditable(false);
        annealingTA.setRows(30);

        hillClimbTA.setColumns(37);
        hillClimbTA.setEditable(false);
        hillClimbTA.setName("hillClimbingTA"); // NOI18N
        hillClimbTA.setRows(30);

        ciudadesL.setText("Num Ciudades:");

        ejecutarB.setText("Ejecutar Prob Aleatorio");
        ejecutarB.setActionCommand(" Ejecutar");
        ejecutarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ejecutarBMousePressed(evt);
            }
        });

        CiudadesS.setMajorTickSpacing(5);
        CiudadesS.setMaximum(40);
        CiudadesS.setMinimum(10);
        CiudadesS.setMinorTickSpacing(5);
        CiudadesS.setPaintLabels(true);
        CiudadesS.setPaintTicks(true);
        CiudadesS.setSnapToTicks(true);
        CiudadesS.setToolTipText("Elige el n�mero de ciudades");
        CiudadesS.setValue(10);

        ejecutarPrB.setText("Ejecutar Prob Espec�fico");
        ejecutarPrB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarPrBActionPerformed(evt);
            }
        });

        SemillaL.setText("Semilla:");

        SemillaTF.setFormatterFactory(formSeed);
        SemillaTF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        AnnealingPL.setText("Parametros Annealing");

        NiterL.setText("Num It:");

        NiterS.setMajorTickSpacing(1000);
        NiterS.setMaximum(10000);
        NiterS.setMinimum(1000);
        NiterS.setMinorTickSpacing(1000);
        NiterS.setOrientation(javax.swing.JSlider.VERTICAL);
        NiterS.setPaintLabels(true);
        NiterS.setPaintTicks(true);
        NiterS.setSnapToTicks(true);
        NiterS.setToolTipText("Numero de iteraciones total");

        LambdaL.setText("Lambda");

        ParKS.setMajorTickSpacing(1);
        ParKS.setMaximum(20);
        ParKS.setMinimum(1);
        ParKS.setMinorTickSpacing(1);
        ParKS.setOrientation(javax.swing.JSlider.VERTICAL);
        ParKS.setPaintLabels(true);
        ParKS.setPaintTicks(true);
        ParKS.setSnapToTicks(true);
        ParKS.setToolTipText("Lambda");
        ParKS.setValue(5);

        ParKL.setText("K");

        LambdaFT.setFormatterFactory(formLambda);
        LambdaFT.setToolTipText("Parametro Lambda");
        LambdaFT.setValue(new Double(0.01));

        jMenu1.setText("Menu");

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/door_out.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(hillClimbTA, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 313, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(annealingTA, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 317, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(NiterL)
                                    .add(NiterS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                        .add(ParKL)
                                        .add(21, 21, 21))
                                    .add(layout.createSequentialGroup()
                                        .add(ParKS, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(LambdaFT, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(LambdaL)))
                            .add(AnnealingPL)))
                    .add(layout.createSequentialGroup()
                        .add(149, 149, 149)
                        .add(ejecutarB)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(ejecutarPrB)
                        .add(22, 22, 22)
                        .add(SemillaL)
                        .add(27, 27, 27)
                        .add(SemillaTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(180, 180, 180)
                        .add(ciudadesL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(19, 19, 19)
                        .add(CiudadesS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(109, 109, 109)
                        .add(HillClimbingL)
                        .add(233, 233, 233)
                        .add(AnnealingL)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(CiudadesS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(ciudadesL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(19, 19, 19)
                        .add(HillClimbingL))
                    .add(layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(AnnealingL)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(AnnealingPL)
                        .add(25, 25, 25)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(NiterL)
                            .add(LambdaL)
                            .add(ParKL))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(15, 15, 15)
                                .add(NiterS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 69, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(LambdaFT, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(ParKS, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)))))
                    .add(annealingTA, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, hillClimbTA, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
                .add(24, 24, 24)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ejecutarPrB)
                    .add(SemillaL)
                    .add(SemillaTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(ejecutarB, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
// TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_SalirActionPerformed
    
    private void ejecutarPrBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarPrBActionPerformed
// TODO add your handling code here:
        try{
            
            
            int sm=numForm.parse(SemillaTF.getText()).intValue();
            nc=CiudadesS.getValue();
            hillClimbTA.setText("");
            annealingTA.setText("");
            ProbTSPBoard TSPB=new ProbTSPBoard(nc,sm);
            TSPHillClimbingSearch(TSPB,hillClimbTA);
            TSPSimulatedAnnealingSearch(TSPB,annealingTA);
        } catch (ParseException e) {}
    }//GEN-LAST:event_ejecutarPrBActionPerformed
    
    private void ejecutarBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ejecutarBMousePressed
// TODO add your handling code here:
        
        nc=CiudadesS.getValue();
        hillClimbTA.setText("");
        annealingTA.setText("");
        ProbTSPBoard TSPB=new ProbTSPBoard(nc);
        TSPHillClimbingSearch(TSPB,hillClimbTA);
        TSPSimulatedAnnealingSearch(TSPB,annealingTA);
    }//GEN-LAST:event_ejecutarBMousePressed
        
    private void TSPHillClimbingSearch(ProbTSPBoard TSPB, java.awt.TextArea a) {
        //System.out.println("\nTSP HillClimbing  -->");
        try {
            Problem problem =  new Problem(TSPB,new ProbTSPSuccessorFunction(), new ProbTSPGoalTest(),new ProbTSPHeuristicFunction());
            Search search =  new HillClimbingSearch();
            SearchAgent agent = new SearchAgent(problem,search);
            
            //System.out.println();
            printActions(agent.getActions(),a);
            // printInstrumentation(agent.getInstrumentation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void TSPSimulatedAnnealingSearch(ProbTSPBoard TSPB, java.awt.TextArea a) {
        //System.out.println("\nTSP Simulated Annealing  -->");
        try {
            Problem problem =  new Problem(TSPB,new ProbTSPSuccessorFunctionSA(), new ProbTSPGoalTest(),new ProbTSPHeuristicFunction());
            SimulatedAnnealingSearch search =  new SimulatedAnnealingSearch(NiterS.getValue(),1000,ParKS.getValue(),numForm.parse(LambdaFT.getText()).doubleValue());
            //search.traceOn();
            SearchAgent agent = new SearchAgent(problem,search);
            
            printActions(agent.getActions(),a);
            //printInstrumentation(agent.getInstrumentation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void printActions(List actions, java.awt.TextArea a) {
        for (int i = 0; i < actions.size(); i++) {
            String action = (String) actions.get(i);
            // System.out.println(action);
            a.append(action+"\n");
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProbTSPJFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnnealingL;
    private javax.swing.JLabel AnnealingPL;
    private javax.swing.JSlider CiudadesS;
    private javax.swing.JLabel HillClimbingL;
    private javax.swing.JFormattedTextField LambdaFT;
    private javax.swing.JLabel LambdaL;
    private javax.swing.JLabel NiterL;
    private javax.swing.JSlider NiterS;
    private javax.swing.JLabel ParKL;
    private javax.swing.JSlider ParKS;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JLabel SemillaL;
    private javax.swing.JFormattedTextField SemillaTF;
    private java.awt.TextArea annealingTA;
    private java.awt.Label ciudadesL;
    private javax.swing.JButton ejecutarB;
    private javax.swing.JButton ejecutarPrB;
    private java.awt.TextArea hillClimbTA;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
    private NumberFormat numForm;
    private NumberFormatter nfor;
    private DefaultFormatterFactory formSeed;
    private DefaultFormatterFactory formLambda;
    
}
