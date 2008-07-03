package yaprnn.gui.view;

public class SubsamplingView extends javax.swing.JFrame {

    private static final long serialVersionUID = -625701668194648904L;
	
    public SubsamplingView() {
        initComponents();
    }

    public javax.swing.JComboBox getOptionZoom() {
        return optionZoom;
    }

    public javax.swing.JButton getButtonProcess() {
        return buttonProcess;
    }

    public javax.swing.JLabel getLabelSubsamplingAfter() {
        return labelPreviewSubsampled;
    }

    public javax.swing.JLabel getLabelSubsamplingBefore() {
        return labelPreview;
    }

    public javax.swing.JSpinner getOptionOverlap() {
        return optionOverlap;
    }

    public javax.swing.JSpinner getOptionResolution() {
        return optionResolution;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        labelPreview = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        labelPreviewSubsampled = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        optionResolution = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        optionOverlap = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        optionZoom = new javax.swing.JComboBox();
        buttonProcess = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Subsampling");
        setResizable(false);

        jSplitPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Preview"));
        jSplitPane1.setDividerLocation(220);

        jScrollPane1.setViewportView(labelPreview);

        jSplitPane1.setLeftComponent(jScrollPane1);

        jScrollPane2.setViewportView(labelPreviewSubsampled);

        jSplitPane1.setRightComponent(jScrollPane2);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Settings"));

        jLabel1.setText("Resolution:");

        optionResolution.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(200), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel2.setText("Overlap %:");

        optionOverlap.setModel(new javax.swing.SpinnerNumberModel(10, 0, 100, 1));

        jLabel3.setText("Zoom:");

        optionZoom.setEditable(true);
        optionZoom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0.5", "1.0", "2.0", "4.0", "8.0", "16.0" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionZoom, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionResolution, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionOverlap, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(optionZoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1)
                .addComponent(jLabel2)
                .addComponent(optionResolution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3)
                .addComponent(optionOverlap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        buttonProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yaprnn/gui/view/iconProcessAll.png"))); // NOI18N
        buttonProcess.setText("Process");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                    .addComponent(buttonProcess, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonProcess)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel labelPreview;
    private javax.swing.JLabel labelPreviewSubsampled;
    private javax.swing.JSpinner optionOverlap;
    private javax.swing.JSpinner optionResolution;
    private javax.swing.JComboBox optionZoom;
    // End of variables declaration//GEN-END:variables

}
