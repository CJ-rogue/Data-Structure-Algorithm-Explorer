/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu.driven.program.of.data.structures;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Christian Jhames
 */
public class pageGraph extends javax.swing.JFrame {
    
    
    
 

        public pageGraph() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        changeGraph = new javax.swing.JButton();
        menuGraph = new javax.swing.JButton();
        exitGraph = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        operationsOnGraph = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        depthFirstSearch = new javax.swing.JButton();
        breadthFirstSearch = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabTraverse = new javax.swing.JPanel();
        labelOutputTraverse = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaGraphTraverse = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        tabSearch = new javax.swing.JPanel();
        enterButtonGraphSearch = new javax.swing.JButton();
        labelDatGraphSearch = new javax.swing.JLabel();
        spinnerDataGraphSearch = new javax.swing.JSpinner();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(135, 206, 250));

        jPanel4.setBackground(new java.awt.Color(135, 206, 250));
        jPanel4.setLayout(new java.awt.GridLayout(3, 1, 5, 15));

        changeGraph.setBackground(new java.awt.Color(10, 25, 49));
        changeGraph.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        changeGraph.setForeground(new java.awt.Color(255, 255, 255));
        changeGraph.setIcon(new javax.swing.ImageIcon(getClass().getResource("/change.png"))); // NOI18N
        changeGraph.setText("Change");
        changeGraph.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        changeGraph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changeGraphMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changeGraphMouseExited(evt);
            }
        });
        changeGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeGraphActionPerformed(evt);
            }
        });
        jPanel4.add(changeGraph);

        menuGraph.setBackground(new java.awt.Color(10, 25, 49));
        menuGraph.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        menuGraph.setForeground(new java.awt.Color(255, 255, 255));
        menuGraph.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
        menuGraph.setText("Menu");
        menuGraph.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        menuGraph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuGraphMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuGraphMouseExited(evt);
            }
        });
        menuGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGraphActionPerformed(evt);
            }
        });
        jPanel4.add(menuGraph);

        exitGraph.setBackground(new java.awt.Color(10, 25, 49));
        exitGraph.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        exitGraph.setForeground(new java.awt.Color(255, 255, 255));
        exitGraph.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        exitGraph.setText("Exit");
        exitGraph.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        exitGraph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitGraphMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitGraphMouseExited(evt);
            }
        });
        exitGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGraphActionPerformed(evt);
            }
        });
        jPanel4.add(exitGraph);

        jPanel6.setBackground(new java.awt.Color(135, 206, 250));
        jPanel6.setLayout(new java.awt.GridLayout(2, 2, 55, 0));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5700800.png"))); // NOI18N
        jLabel10.setText(" 2023 Christian Jhames De Los Reyes. All rights reserved.");
        jPanel6.add(jLabel10);

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/size5.png"))); // NOI18N
        jLabel13.setText("Colveta 2, Mambaling, Cebu City, Cebu, 6000, Philippines");
        jPanel6.add(jLabel13);

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/size2.png"))); // NOI18N
        jLabel12.setText(" christianjhamesdelosreyes@gmail.com");
        jPanel6.add(jLabel12);

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/size3.png"))); // NOI18N
        jLabel14.setText(" 0915-044-0670");
        jPanel6.add(jLabel14);

        jLabel11.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jLabel11.setText("A graph is a non-linear data structure consisting of a set of vertices (or nodes)");

        jLabel15.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jLabel15.setText("and a set of edges that connect pairs of vertices.");

        jLabel16.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jLabel16.setText("The edges can be directed or undirected, and may have weights or");

        jLabel17.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jLabel17.setText("labels that represent some kind of relationship between the vertices.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 463, 930, 230));

        jPanel3.setBackground(new java.awt.Color(10, 25, 49));

        operationsOnGraph.setBackground(new java.awt.Color(255, 255, 255));
        operationsOnGraph.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        operationsOnGraph.setForeground(new java.awt.Color(255, 255, 255));
        operationsOnGraph.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        operationsOnGraph.setText("Operations on Graph");

        jPanel5.setBackground(new java.awt.Color(10, 25, 49));
        jPanel5.setLayout(new java.awt.GridLayout(3, 1, 5, 35));

        depthFirstSearch.setBackground(new java.awt.Color(102, 204, 255));
        depthFirstSearch.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        depthFirstSearch.setText("Depth First Search (DFS)");
        depthFirstSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        depthFirstSearch.setPreferredSize(new java.awt.Dimension(87, 12));
        depthFirstSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                depthFirstSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                depthFirstSearchMouseExited(evt);
            }
        });
        depthFirstSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depthFirstSearchActionPerformed(evt);
            }
        });
        jPanel5.add(depthFirstSearch);

        breadthFirstSearch.setBackground(new java.awt.Color(102, 204, 255));
        breadthFirstSearch.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        breadthFirstSearch.setText("Breadth First Search (BFS)");
        breadthFirstSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        breadthFirstSearch.setPreferredSize(new java.awt.Dimension(87, 12));
        breadthFirstSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                breadthFirstSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                breadthFirstSearchMouseExited(evt);
            }
        });
        breadthFirstSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breadthFirstSearchActionPerformed(evt);
            }
        });
        jPanel5.add(breadthFirstSearch);

        search.setBackground(new java.awt.Color(102, 204, 255));
        search.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        search.setText("Search");
        search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search.setPreferredSize(new java.awt.Dimension(87, 12));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel5.add(search);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ezgif.com-resize (8).gif"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(operationsOnGraph)
                .addGap(55, 55, 55))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(operationsOnGraph)))
                .addGap(63, 63, 63)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -3, 490, 460));

        jTabbedPane1.setBackground(new java.awt.Color(10, 25, 49));

        tabTraverse.setBackground(new java.awt.Color(10, 25, 49));

        labelOutputTraverse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelOutputTraverse.setForeground(new java.awt.Color(255, 255, 255));
        labelOutputTraverse.setText("Output:");

        textAreaGraphTraverse.setEditable(false);
        textAreaGraphTraverse.setColumns(20);
        textAreaGraphTraverse.setRows(5);
        jScrollPane1.setViewportView(textAreaGraphTraverse);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ezgif.com-gif-maker (16).gif"))); // NOI18N

        javax.swing.GroupLayout tabTraverseLayout = new javax.swing.GroupLayout(tabTraverse);
        tabTraverse.setLayout(tabTraverseLayout);
        tabTraverseLayout.setHorizontalGroup(
            tabTraverseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTraverseLayout.createSequentialGroup()
                .addGroup(tabTraverseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabTraverseLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)
                        .addGap(0, 82, Short.MAX_VALUE))
                    .addGroup(tabTraverseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(tabTraverseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelOutputTraverse, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabTraverseLayout.setVerticalGroup(
            tabTraverseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTraverseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelOutputTraverse, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("tab1", tabTraverse);

        tabSearch.setBackground(new java.awt.Color(10, 25, 49));

        enterButtonGraphSearch.setBackground(new java.awt.Color(102, 204, 255));
        enterButtonGraphSearch.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        enterButtonGraphSearch.setText("Enter");
        enterButtonGraphSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        enterButtonGraphSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterButtonGraphSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enterButtonGraphSearchMouseExited(evt);
            }
        });
        enterButtonGraphSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonGraphSearchActionPerformed(evt);
            }
        });

        labelDatGraphSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelDatGraphSearch.setForeground(new java.awt.Color(255, 255, 255));
        labelDatGraphSearch.setText("Enter the data:");

        javax.swing.GroupLayout tabSearchLayout = new javax.swing.GroupLayout(tabSearch);
        tabSearch.setLayout(tabSearchLayout);
        tabSearchLayout.setHorizontalGroup(
            tabSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSearchLayout.createSequentialGroup()
                .addGroup(tabSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabSearchLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(tabSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDatGraphSearch)
                            .addComponent(spinnerDataGraphSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabSearchLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(enterButtonGraphSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        tabSearchLayout.setVerticalGroup(
            tabSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSearchLayout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(labelDatGraphSearch)
                .addGap(18, 18, 18)
                .addComponent(spinnerDataGraphSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(enterButtonGraphSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );

        jTabbedPane1.addTab("tab2", tabSearch);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, -33, 430, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        textAreaGraphTraverse.setText("");
        jTabbedPane1.setSelectedIndex(1);
        javax.swing.JOptionPane.showMessageDialog(pageGraph.this,"Please provide the data to be searched.");
    }//GEN-LAST:event_searchActionPerformed

    private void breadthFirstSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breadthFirstSearchActionPerformed
    textAreaGraphTraverse.setText("");
    jTabbedPane1.setSelectedIndex(0);

    // Get data from DataStore
    DataStore dataStore = DataStore.getInstance();
    int[] data = dataStore.getData();

    int numNodes = data.length;

    // Generate the adjacency matrix
    int[][] adjacencyMatrix = new int[numNodes][numNodes];
    for (int i = 0; i < numNodes; i++) {
        for (int j = 0; j < numNodes; j++) {
            if (i != j) {
                adjacencyMatrix[i][j] = (data[i] == data[j]) ? 1 : 0;
            }
        }
    }

    // Display the adjacency matrix
    textAreaGraphTraverse.append("Adjacency Matrix:\n");
    for (int i = 0; i < numNodes; i++) {
        for (int j = 0; j < numNodes; j++) {
            textAreaGraphTraverse.append(String.valueOf(adjacencyMatrix[i][j]));
            if (j != numNodes - 1) {
                textAreaGraphTraverse.append(", ");
            }
        }
        textAreaGraphTraverse.append("\n");
    }
    textAreaGraphTraverse.append("\n");

    // Perform breadth-first search (BFS)
    boolean[] visited = new boolean[numNodes];
    textAreaGraphTraverse.append("BFS Result:\n");
    for (int i = 0; i < numNodes; i++) {
        if (!visited[i]) {
            breadthFirstSearch(adjacencyMatrix, visited, i);
        }
    }

    javax.swing.JOptionPane.showMessageDialog(pageGraph.this, "Breadth First Search (BFS) Complete!");
    }//GEN-LAST:event_breadthFirstSearchActionPerformed

private void breadthFirstSearch(int[][] adjacencyMatrix, boolean[] visited, int startNode) {
    int numNodes = adjacencyMatrix.length;
    Queue<Integer> queue = new LinkedList<>();
    visited[startNode] = true;
    queue.offer(startNode);

    while (!queue.isEmpty()) {
        int node = queue.poll();
        textAreaGraphTraverse.append(String.valueOf(node));
        textAreaGraphTraverse.append(" ");

        for (int i = 0; i < numNodes; i++) {
            if (adjacencyMatrix[node][i] == 1 && !visited[i]) {
                visited[i] = true;
                queue.offer(i);
            }
        }
    }
}
    
    private void depthFirstSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depthFirstSearchActionPerformed
    textAreaGraphTraverse.setText("");
    jTabbedPane1.setSelectedIndex(0);

    // Get data from DataStore
    DataStore dataStore = DataStore.getInstance();
    int[] data = dataStore.getData();

    int numNodes = data.length;

    // Generate the adjacency matrix
    int[][] adjacencyMatrix = new int[numNodes][numNodes];
    for (int i = 0; i < numNodes; i++) {
        for (int j = 0; j < numNodes; j++) {
            if (i != j) {
                adjacencyMatrix[i][j] = (data[i] == data[j]) ? 1 : 0;
            }
        }
    }

    // Display the adjacency matrix
    textAreaGraphTraverse.append("Adjacency Matrix:\n");
    for (int i = 0; i < numNodes; i++) {
        for (int j = 0; j < numNodes; j++) {
            textAreaGraphTraverse.append(String.valueOf(adjacencyMatrix[i][j]));
            if (j != numNodes - 1) {
                textAreaGraphTraverse.append(", ");
            }
        }
        textAreaGraphTraverse.append("\n");
    }
    textAreaGraphTraverse.append("\n");

    // Perform depth-first search (DFS)
    boolean[] visited = new boolean[numNodes];
    textAreaGraphTraverse.append("DFS Result:\n");
    for (int i = 0; i < numNodes; i++) {
        if (!visited[i]) {
            depthFirstSearch(adjacencyMatrix, visited, i);
        }
    }

    javax.swing.JOptionPane.showMessageDialog(pageGraph.this, "Depth First Search (DFS) Complete!");    }//GEN-LAST:event_depthFirstSearchActionPerformed
    
    

private void depthFirstSearch(int[][] adjacencyMatrix, boolean[] visited, int node) {
    visited[node] = true;

    textAreaGraphTraverse.append(String.valueOf(node));
    textAreaGraphTraverse.append(" ");

    for (int i = 0; i < adjacencyMatrix.length; i++) {
        if (adjacencyMatrix[node][i] == 1 && !visited[i]) {
            depthFirstSearch(adjacencyMatrix, visited, i);
        }
    }
}

    
    private void enterButtonGraphSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonGraphSearchActionPerformed
    int data = (int) spinnerDataGraphSearch.getValue();

    // Get data from DataStore
    DataStore dataStore = DataStore.getInstance();
    int[] graphData = dataStore.getData();

    boolean found = false;
    for (int i = 0; i < graphData.length; i++) {
        if (graphData[i] == data) {
            found = true;
            break;
        }
    }

    if (found) {
        javax.swing.JOptionPane.showMessageDialog(null, "The value " + data + " is found in the graph.");
    } else {
        javax.swing.JOptionPane.showMessageDialog(null, "The value " + data + " is not found in the graph.");
 }
        
    }//GEN-LAST:event_enterButtonGraphSearchActionPerformed

    private void menuGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGraphActionPerformed
        close();
        page3_mainMenu pg3 = new page3_mainMenu();
        pg3.setVisible(true);       // TODO add your handling code here  // TODO add your handling code here:
    }//GEN-LAST:event_menuGraphActionPerformed

    private void changeGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeGraphActionPerformed
        close();
        page2 pg2 = new page2();
        pg2.setVisible(true);
    }//GEN-LAST:event_changeGraphActionPerformed

    private void exitGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitGraphActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitGraphActionPerformed

    private void changeGraphMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeGraphMouseEntered
    changeGraph.setForeground(new Color(0, 0, 0));
    changeGraph.setBackground(new Color(10,82,96));
    }//GEN-LAST:event_changeGraphMouseEntered

    private void changeGraphMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeGraphMouseExited
    changeGraph.setForeground(new Color(255, 255, 255));
    changeGraph.setBackground(new Color(10, 25, 49));
    }//GEN-LAST:event_changeGraphMouseExited

    private void menuGraphMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGraphMouseEntered
    menuGraph.setForeground(new Color(0, 0, 0));
    menuGraph.setBackground(new Color(10,82,96));
    }//GEN-LAST:event_menuGraphMouseEntered

    private void menuGraphMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGraphMouseExited
    menuGraph.setForeground(new Color(255, 255, 255));
    menuGraph.setBackground(new Color(10, 25, 49));
    }//GEN-LAST:event_menuGraphMouseExited

    private void exitGraphMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitGraphMouseEntered
    exitGraph.setForeground(new Color(0, 0, 0));
    exitGraph.setBackground(new Color(10,82,96));
    }//GEN-LAST:event_exitGraphMouseEntered

    private void exitGraphMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitGraphMouseExited
    exitGraph.setForeground(new Color(255, 255, 255));
    exitGraph.setBackground(new Color(10, 25, 49));
    }//GEN-LAST:event_exitGraphMouseExited

    private void depthFirstSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depthFirstSearchMouseEntered
    depthFirstSearch.setForeground(new Color(255, 255, 255));
    depthFirstSearch.setBackground(new Color(10, 25, 49));
    }//GEN-LAST:event_depthFirstSearchMouseEntered

    private void depthFirstSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depthFirstSearchMouseExited
    depthFirstSearch.setForeground(new Color(0, 0, 0));
    depthFirstSearch.setBackground(new Color(102,204,255));
    }//GEN-LAST:event_depthFirstSearchMouseExited

    private void breadthFirstSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_breadthFirstSearchMouseEntered
    breadthFirstSearch.setForeground(new Color(255, 255, 255));
    breadthFirstSearch.setBackground(new Color(10, 25, 49));
    }//GEN-LAST:event_breadthFirstSearchMouseEntered

    private void breadthFirstSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_breadthFirstSearchMouseExited
    breadthFirstSearch.setForeground(new Color(0, 0, 0));
    breadthFirstSearch.setBackground(new Color(102,204,255));
    }//GEN-LAST:event_breadthFirstSearchMouseExited

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
    search.setForeground(new Color(255, 255, 255));
    search.setBackground(new Color(10, 25, 49));
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
    search.setForeground(new Color(0, 0, 0));
    search.setBackground(new Color(102,204,255));
    }//GEN-LAST:event_searchMouseExited

    private void enterButtonGraphSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterButtonGraphSearchMouseEntered
    enterButtonGraphSearch.setForeground(new Color(255, 255, 255));
    enterButtonGraphSearch.setBackground(new Color(10, 25, 49));
    }//GEN-LAST:event_enterButtonGraphSearchMouseEntered

    private void enterButtonGraphSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterButtonGraphSearchMouseExited
    enterButtonGraphSearch.setForeground(new Color(0, 0, 0));
    enterButtonGraphSearch.setBackground(new Color(102,204,255));
    }//GEN-LAST:event_enterButtonGraphSearchMouseExited

 
    public void close(){
       WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
       Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pageGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pageGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pageGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pageGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pageGraph().setVisible(true);
                            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton breadthFirstSearch;
    private javax.swing.JButton changeGraph;
    private javax.swing.JButton depthFirstSearch;
    private javax.swing.JButton enterButtonGraphSearch;
    private javax.swing.JButton exitGraph;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelDatGraphSearch;
    private javax.swing.JLabel labelOutputTraverse;
    private javax.swing.JButton menuGraph;
    private javax.swing.JLabel operationsOnGraph;
    private javax.swing.JButton search;
    private javax.swing.JSpinner spinnerDataGraphSearch;
    private javax.swing.JPanel tabSearch;
    private javax.swing.JPanel tabTraverse;
    private javax.swing.JTextArea textAreaGraphTraverse;
    // End of variables declaration//GEN-END:variables
}
