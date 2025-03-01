/*
 * ProbIA15JFrame.java
 *
 * Created on 9 de marzo de 2007, 15:42
 */

package org.example.IA.probIA15;

/**
 *
 * @author  bejar
 */


import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.example.aima.search.framework.GraphSearch;
import org.example.aima.search.framework.Problem;
import org.example.aima.search.framework.Search;
import org.example.aima.search.framework.SearchAgent;
import org.example.aima.search.framework.TreeSearch;
import org.example.aima.search.informed.AStarSearch;
import org.example.aima.search.uninformed.BreadthFirstSearch;
import org.example.aima.search.uninformed.DepthLimitedSearch;
import org.example.aima.search.uninformed.IterativeDeepeningSearch;
import org.example.aima.search.informed.IterativeDeepeningAStarSearch;


public class ProbIA15JFrame extends javax.swing.JFrame {
    
    /** Creates new form ProbIA15JFrame */
    public ProbIA15JFrame() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Ejecutar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(jLabel1.getFont());
        jLabel1.setText("Problema 15");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(jTextArea1.getFont());
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Ejecutar.setFont(Ejecutar.getFont());
        Ejecutar.setText("Ejecutar");
        Ejecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EjecutarMouseClicked(evt);
            }
        });

        Salir.setFont(Salir.getFont());
        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(162, 162, 162)
                        .add(Ejecutar)
                        .add(23, 23, 23)
                        .add(Salir))
                    .add(layout.createSequentialGroup()
                        .add(196, 196, 196)
                        .add(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel1)
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 370, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Salir)
                    .add(Ejecutar))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
// TODO add your handling code here:
                     dispose();       
    }//GEN-LAST:event_SalirMouseClicked

    private void EjecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EjecutarMouseClicked
// TODO add your handling code here:
       ProbIA15Board IAP15=new ProbIA15Board();
        IAP15BreadthFirstSearch(IAP15);
        IAP15DepthLimitedSearch(IAP15,7); 
        IAP15IterativeDeepeningSearch(IAP15);
        IAP15IterativeDeepeningAStarSearchH1(IAP15);
        IAP15IterativeDeepeningAStarSearchH2(IAP15);
        IAP15AStarSearchH1(IAP15);
        IAP15AStarSearchH2(IAP15);
    }//GEN-LAST:event_EjecutarMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProbIA15JFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ejecutar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
 
       private void IAP15BreadthFirstSearch(ProbIA15Board IAP15) {
        jTextArea1.append("\nIA15 Breadth First  -->\n\n");
        try {
            Problem problem =  new Problem(IAP15,new ProbIA15SuccessorFunction(), new ProbIA15GoalTest());
            Search search =  new BreadthFirstSearch(new TreeSearch());
            SearchAgent agent = new SearchAgent(problem,search);
            
            System.out.println();
            printActions(agent.getActions());
            printInstrumentation(agent.getInstrumentation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void IAP15IterativeDeepeningSearch(ProbIA15Board IAP15) {
        jTextArea1.append("\nIA15 Iterative Deepening  -->\n\n");
        try {
            Problem problem =  new Problem(IAP15,new ProbIA15SuccessorFunction(), new ProbIA15GoalTest());
            Search search =  new IterativeDeepeningSearch();
            SearchAgent agent = new SearchAgent(problem,search);
            
            System.out.println();
            printActions(agent.getActions());
            printInstrumentation(agent.getInstrumentation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     private void IAP15IterativeDeepeningAStarSearchH1(ProbIA15Board IAP15) {
        jTextArea1.append("\nIA15 Iterative Deepening AStar H1 -->\n\n");
        try {
            Problem problem =  new Problem(IAP15,new ProbIA15SuccessorFunction(), new ProbIA15GoalTest(),new ProbIA15HeuristicFunction());
            Search search =  new IterativeDeepeningAStarSearch();
            SearchAgent agent = new SearchAgent(problem,search);
            
            System.out.println();
            printActions(agent.getActions());
            printInstrumentation(agent.getInstrumentation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

      private void IAP15IterativeDeepeningAStarSearchH2(ProbIA15Board IAP15) {
        jTextArea1.append("\nIA15 Iterative Deepening AStar H2 -->\n\n");
        try {
            Problem problem =  new Problem(IAP15,new ProbIA15SuccessorFunction(), new ProbIA15GoalTest(),new ProbIA15HeuristicFunction2());
            Search search =  new IterativeDeepeningAStarSearch();
            SearchAgent agent = new SearchAgent(problem,search);
            
            System.out.println();
            printActions(agent.getActions());
            printInstrumentation(agent.getInstrumentation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   private void IAP15DepthLimitedSearch(ProbIA15Board IAP15,int limit) {
        jTextArea1.append("\nIA15 Depth Limited Search  -->\n\n");
        try {
            Problem problem =  new Problem(IAP15,new ProbIA15SuccessorFunction(), new ProbIA15GoalTest());
            Search search =  new DepthLimitedSearch(limit);
            SearchAgent agent = new SearchAgent(problem,search);
            
            System.out.println();
            printActions(agent.getActions());
            printInstrumentation(agent.getInstrumentation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void IAP15AStarSearchH1(ProbIA15Board TSPB) {
        jTextArea1.append("\nIA15 AStar H1  -->\n\n");
        try {
            Problem problem =  new Problem(TSPB,new ProbIA15SuccessorFunction(), new ProbIA15GoalTest(),new ProbIA15HeuristicFunction());
            Search search =  new AStarSearch(new GraphSearch());
            SearchAgent agent = new SearchAgent(problem,search);
            
            System.out.println();
            printActions(agent.getActions());
            printInstrumentation(agent.getInstrumentation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        private void IAP15AStarSearchH2(ProbIA15Board TSPB) {
        jTextArea1.append("\nIA15 AStar H2  -->\n\n");
        try {
            Problem problem =  new Problem(TSPB,new ProbIA15SuccessorFunction(), new ProbIA15GoalTest(),new ProbIA15HeuristicFunction2());
            Search search =  new AStarSearch(new GraphSearch());
            SearchAgent agent = new SearchAgent(problem,search);
            
            System.out.println();
            printActions(agent.getActions());
            printInstrumentation(agent.getInstrumentation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    	private void printInstrumentation(Properties properties) {
		Iterator keys = properties.keySet().iterator();
                jTextArea1.append("\n\n");
		while (keys.hasNext()) {
			String key = (String) keys.next();
			String property = properties.getProperty(key);
			jTextArea1.append(key + " : " + property+"\n");
		}
                jTextArea1.append("\n\n");
	}

  private void printActions(List actions) {
        for (int i = 0; i < actions.size(); i++) {
            String action = (String) actions.get(i);
           // System.out.println(action);
           jTextArea1.append(action+"\n");
        }
    }
     
}
