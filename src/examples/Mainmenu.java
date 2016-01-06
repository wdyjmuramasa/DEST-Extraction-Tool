
package examples;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Mainmenu extends javax.swing.JFrame {
    

    
    public Mainmenu() {
        initComponents();
        myinitComponents();
    }
    private void myinitComponents(){
        this.setLocationRelativeTo(null);

        try{
        Image img = ImageIO.read(getClass().getResource("resources/gear.jpg"));
        Buttonsettings.setIcon(new ImageIcon(img));
        }catch (Exception ex)
        {
            
        }


    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Tabmodules = new javax.swing.JTabbedPane();
        Moduleclusteringfaculty = new javax.swing.JPanel();
        cfPanelcourse = new javax.swing.JPanel();
        cfCBcoursename = new javax.swing.JCheckBox();
        cfPanelprof = new javax.swing.JPanel();
        cfCBprofname = new javax.swing.JCheckBox();
        cfPanellog = new javax.swing.JPanel();
        cfCBweek1 = new javax.swing.JCheckBox();
        cfCBweek2 = new javax.swing.JCheckBox();
        cfCBweek3 = new javax.swing.JCheckBox();
        cfCBweek4 = new javax.swing.JCheckBox();
        cfCBweek12 = new javax.swing.JCheckBox();
        cfCBweek5 = new javax.swing.JCheckBox();
        cfCBweek6 = new javax.swing.JCheckBox();
        cfCBweek7 = new javax.swing.JCheckBox();
        cfCBweek8 = new javax.swing.JCheckBox();
        cfCBweek10 = new javax.swing.JCheckBox();
        cfCBweek11 = new javax.swing.JCheckBox();
        cfCBweek9 = new javax.swing.JCheckBox();
        cfCBtotal = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        cfPanelactivities = new javax.swing.JPanel();
        cfCBassign = new javax.swing.JCheckBox();
        cfCBquiz = new javax.swing.JCheckBox();
        cfCBforum = new javax.swing.JCheckBox();
        cfCBfile = new javax.swing.JCheckBox();
        cfCBlabel = new javax.swing.JCheckBox();
        cfButton = new javax.swing.JButton();
        Buttonallfacultycluster = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        csButton = new javax.swing.JButton();
        Buttonallstudentcluster = new javax.swing.JButton();
        csPanelcourse = new javax.swing.JPanel();
        cscbid = new javax.swing.JCheckBox();
        cscbstudentid = new javax.swing.JCheckBox();
        cscbcourse = new javax.swing.JCheckBox();
        csPanelactivity = new javax.swing.JPanel();
        cscbassignsubmit = new javax.swing.JCheckBox();
        cscbassignratio = new javax.swing.JCheckBox();
        cscbassignfaculty = new javax.swing.JCheckBox();
        cscbquizanswer = new javax.swing.JCheckBox();
        cscbquizfaculty = new javax.swing.JCheckBox();
        cscbquizratio = new javax.swing.JCheckBox();
        cscbquizreview = new javax.swing.JCheckBox();
        cscbquizattempt = new javax.swing.JCheckBox();
        cscbforumpost = new javax.swing.JCheckBox();
        cscbforumfaculty = new javax.swing.JCheckBox();
        cscbforumratio = new javax.swing.JCheckBox();
        cscbresource = new javax.swing.JCheckBox();
        cscbassignview = new javax.swing.JCheckBox();
        csPanellog = new javax.swing.JPanel();
        cscbwk1 = new javax.swing.JCheckBox();
        cscbwk4 = new javax.swing.JCheckBox();
        cscbwk7 = new javax.swing.JCheckBox();
        cscbwk2 = new javax.swing.JCheckBox();
        cscbwk3 = new javax.swing.JCheckBox();
        cscbtotal = new javax.swing.JCheckBox();
        cscbwk5 = new javax.swing.JCheckBox();
        cscbwk6 = new javax.swing.JCheckBox();
        cscbwk8 = new javax.swing.JCheckBox();
        cscbwk9 = new javax.swing.JCheckBox();
        cscbwk12 = new javax.swing.JCheckBox();
        cscbwk10 = new javax.swing.JCheckBox();
        cscbwk11 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        associationButton = new javax.swing.JButton();
        Buttonallassociate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cbassocourse = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        cbassoquiz = new javax.swing.JCheckBox();
        cbassoassign = new javax.swing.JCheckBox();
        cbassoforum = new javax.swing.JCheckBox();
        cbassoreso = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        cbassocourseview = new javax.swing.JCheckBox();
        cbassolog = new javax.swing.JCheckBox();
        cbassoactivity = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        Buttonexit = new javax.swing.JButton();
        Buttonsettings = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/gear.jpg"))); // NOI18N
        jLabel1.setLabelFor(this);
        jLabel1.getAccessibleContext().setAccessibleParent(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Summarization Module");
        setPreferredSize(new java.awt.Dimension(1055, 720));
        setResizable(false);

        cfCBcoursename.setText("Course Name");

        org.jdesktop.layout.GroupLayout cfPanelcourseLayout = new org.jdesktop.layout.GroupLayout(cfPanelcourse);
        cfPanelcourse.setLayout(cfPanelcourseLayout);
        cfPanelcourseLayout.setHorizontalGroup(
            cfPanelcourseLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cfPanelcourseLayout.createSequentialGroup()
                .addContainerGap()
                .add(cfCBcoursename)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        cfPanelcourseLayout.setVerticalGroup(
            cfPanelcourseLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, cfPanelcourseLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .add(cfCBcoursename)
                .add(26, 26, 26))
        );

        cfCBprofname.setText("Professor Name");

        org.jdesktop.layout.GroupLayout cfPanelprofLayout = new org.jdesktop.layout.GroupLayout(cfPanelprof);
        cfPanelprof.setLayout(cfPanelprofLayout);
        cfPanelprofLayout.setHorizontalGroup(
            cfPanelprofLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cfPanelprofLayout.createSequentialGroup()
                .addContainerGap()
                .add(cfCBprofname)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        cfPanelprofLayout.setVerticalGroup(
            cfPanelprofLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cfPanelprofLayout.createSequentialGroup()
                .addContainerGap()
                .add(cfCBprofname)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cfCBweek1.setText("First Week");

        cfCBweek2.setText("Second Week");

        cfCBweek3.setText("Third Week");

        cfCBweek4.setText("Fourth Week");

        cfCBweek12.setText("Twelfth Week");

        cfCBweek5.setText("Fifth Week");

        cfCBweek6.setText("Sixth Week");

        cfCBweek7.setText("Seventh Week");

        cfCBweek8.setText("Eight Week");

        cfCBweek10.setText("Tenth Week");

        cfCBweek11.setText("Eleventh Week");

        cfCBweek9.setText("Ninth Week");

        cfCBtotal.setText("Total Logs");

        org.jdesktop.layout.GroupLayout cfPanellogLayout = new org.jdesktop.layout.GroupLayout(cfPanellog);
        cfPanellog.setLayout(cfPanellogLayout);
        cfPanellogLayout.setHorizontalGroup(
            cfPanellogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cfPanellogLayout.createSequentialGroup()
                .addContainerGap()
                .add(cfPanellogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cfPanellogLayout.createSequentialGroup()
                        .add(cfPanellogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(cfCBweek1)
                            .add(cfCBweek2)
                            .add(cfCBweek3)
                            .add(cfCBweek4))
                        .add(33, 33, 33)
                        .add(cfPanellogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(cfCBweek5)
                            .add(cfCBweek6)
                            .add(cfCBweek7)
                            .add(cfCBweek8))
                        .add(44, 44, 44)
                        .add(cfPanellogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(cfCBweek12, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(cfCBweek11)
                            .add(cfCBweek10)
                            .add(cfCBweek9))
                        .add(79, 79, 79))
                    .add(cfPanellogLayout.createSequentialGroup()
                        .add(cfCBtotal)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        cfPanellogLayout.setVerticalGroup(
            cfPanellogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cfPanellogLayout.createSequentialGroup()
                .addContainerGap()
                .add(cfPanellogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cfCBweek1)
                    .add(cfCBweek5)
                    .add(cfCBweek9))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cfPanellogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cfCBweek2)
                    .add(cfCBweek6)
                    .add(cfCBweek10))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cfPanellogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cfCBweek3)
                    .add(cfCBweek7)
                    .add(cfCBweek11))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cfPanellogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cfCBweek4)
                    .add(cfCBweek8)
                    .add(cfCBweek12))
                .add(18, 18, 18)
                .add(cfCBtotal)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cfCBassign.setText("Assignment");

        cfCBquiz.setText("Quiz");

        cfCBforum.setText("Forum");

        cfCBfile.setText("Files");

        cfCBlabel.setText("Label");

        org.jdesktop.layout.GroupLayout cfPanelactivitiesLayout = new org.jdesktop.layout.GroupLayout(cfPanelactivities);
        cfPanelactivities.setLayout(cfPanelactivitiesLayout);
        cfPanelactivitiesLayout.setHorizontalGroup(
            cfPanelactivitiesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cfPanelactivitiesLayout.createSequentialGroup()
                .addContainerGap()
                .add(cfPanelactivitiesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cfCBforum)
                    .add(cfPanelactivitiesLayout.createSequentialGroup()
                        .add(cfPanelactivitiesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(cfCBassign)
                            .add(cfCBquiz))
                        .add(18, 18, 18)
                        .add(cfPanelactivitiesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(cfCBlabel)
                            .add(cfCBfile))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cfPanelactivitiesLayout.setVerticalGroup(
            cfPanelactivitiesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cfPanelactivitiesLayout.createSequentialGroup()
                .addContainerGap()
                .add(cfPanelactivitiesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cfCBassign)
                    .add(cfCBfile))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(cfPanelactivitiesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cfCBquiz)
                    .add(cfCBlabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(cfCBforum)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cfButton.setText("Generate Clustering Table");
        cfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfButtonActionPerformed(evt);
            }
        });

        Buttonallfacultycluster.setText("Select All");
        Buttonallfacultycluster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonallfacultyclusterActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Faculty");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Student");

        csButton.setText("Generate Clustering Table");
        csButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csButtonActionPerformed(evt);
            }
        });

        Buttonallstudentcluster.setText("Select All");
        Buttonallstudentcluster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonallstudentclusterActionPerformed(evt);
            }
        });

        cscbid.setText("ID");

        cscbstudentid.setText("StudentID");

        cscbcourse.setText("Course");

        org.jdesktop.layout.GroupLayout csPanelcourseLayout = new org.jdesktop.layout.GroupLayout(csPanelcourse);
        csPanelcourse.setLayout(csPanelcourseLayout);
        csPanelcourseLayout.setHorizontalGroup(
            csPanelcourseLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(csPanelcourseLayout.createSequentialGroup()
                .addContainerGap()
                .add(cscbid)
                .add(18, 18, 18)
                .add(cscbstudentid)
                .add(18, 18, 18)
                .add(cscbcourse)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        csPanelcourseLayout.setVerticalGroup(
            csPanelcourseLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(csPanelcourseLayout.createSequentialGroup()
                .addContainerGap()
                .add(csPanelcourseLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cscbid)
                    .add(cscbstudentid)
                    .add(cscbcourse))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cscbassignsubmit.setText("Assignment Submitted");

        cscbassignratio.setText("Assignment Ratio");

        cscbassignfaculty.setText("Assignment by Faculty");

        cscbquizanswer.setText("Quiz Answered ");

        cscbquizfaculty.setText("Quiz by Faculty");

        cscbquizratio.setText("Quiz Ratio");

        cscbquizreview.setText("Quiz Review");

        cscbquizattempt.setText("Quiz Attempt");

        cscbforumpost.setText("Forum Post");

        cscbforumfaculty.setText("Forum by Faculty");

        cscbforumratio.setText("Forum Ratio");

        cscbresource.setText("Resources");

        cscbassignview.setText("Assignment View");

        org.jdesktop.layout.GroupLayout csPanelactivityLayout = new org.jdesktop.layout.GroupLayout(csPanelactivity);
        csPanelactivity.setLayout(csPanelactivityLayout);
        csPanelactivityLayout.setHorizontalGroup(
            csPanelactivityLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(csPanelactivityLayout.createSequentialGroup()
                .addContainerGap()
                .add(csPanelactivityLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cscbassignfaculty)
                    .add(cscbassignsubmit)
                    .add(cscbassignratio)
                    .add(cscbassignview))
                .add(18, 18, 18)
                .add(csPanelactivityLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cscbquizattempt)
                    .add(csPanelactivityLayout.createSequentialGroup()
                        .add(csPanelactivityLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(cscbquizanswer)
                            .add(cscbquizfaculty)
                            .add(cscbquizratio)
                            .add(cscbquizreview, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(csPanelactivityLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(cscbresource, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(cscbforumratio)
                            .add(cscbforumfaculty)
                            .add(cscbforumpost))))
                .addContainerGap())
        );
        csPanelactivityLayout.setVerticalGroup(
            csPanelactivityLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(csPanelactivityLayout.createSequentialGroup()
                .addContainerGap()
                .add(csPanelactivityLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cscbassignsubmit)
                    .add(cscbquizanswer)
                    .add(cscbforumpost))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(csPanelactivityLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cscbassignfaculty)
                    .add(cscbquizfaculty)
                    .add(cscbforumfaculty))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(csPanelactivityLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cscbassignratio)
                    .add(cscbquizratio)
                    .add(cscbforumratio))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(csPanelactivityLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cscbquizreview)
                    .add(cscbresource)
                    .add(cscbassignview))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cscbquizattempt)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cscbwk1.setText("Week 1");

        cscbwk4.setText("Week 4");

        cscbwk7.setText("Week 7");

        cscbwk2.setText("Week 2");

        cscbwk3.setText("Week 3");

        cscbtotal.setText("Total Logs");

        cscbwk5.setText("Week 5");

        cscbwk6.setText("Week 6");

        cscbwk8.setText("Week 8");

        cscbwk9.setText("Week 9");

        cscbwk12.setText("Week 12");

        cscbwk10.setText("Week 10");

        cscbwk11.setText("Week 11");

        org.jdesktop.layout.GroupLayout csPanellogLayout = new org.jdesktop.layout.GroupLayout(csPanellog);
        csPanellog.setLayout(csPanellogLayout);
        csPanellogLayout.setHorizontalGroup(
            csPanellogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(csPanellogLayout.createSequentialGroup()
                .addContainerGap()
                .add(csPanellogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(csPanellogLayout.createSequentialGroup()
                        .add(cscbwk1)
                        .add(18, 18, 18)
                        .add(cscbwk4)
                        .add(18, 18, 18)
                        .add(cscbwk7)
                        .add(18, 18, 18)
                        .add(cscbwk10))
                    .add(csPanellogLayout.createSequentialGroup()
                        .add(cscbwk2)
                        .add(18, 18, 18)
                        .add(cscbwk5)
                        .add(18, 18, 18)
                        .add(cscbwk8)
                        .add(18, 18, 18)
                        .add(cscbwk11))
                    .add(csPanellogLayout.createSequentialGroup()
                        .add(cscbwk3)
                        .add(18, 18, 18)
                        .add(cscbwk6)
                        .add(18, 18, 18)
                        .add(cscbwk9)
                        .add(18, 18, 18)
                        .add(cscbwk12))
                    .add(cscbtotal))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        csPanellogLayout.setVerticalGroup(
            csPanellogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(csPanellogLayout.createSequentialGroup()
                .addContainerGap()
                .add(csPanellogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cscbwk1)
                    .add(cscbwk4)
                    .add(cscbwk7)
                    .add(cscbwk10))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(csPanellogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cscbwk2)
                    .add(cscbwk5)
                    .add(cscbwk8)
                    .add(cscbwk11))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(csPanellogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cscbwk3)
                    .add(cscbwk6)
                    .add(cscbwk9)
                    .add(cscbwk12))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cscbtotal)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout ModuleclusteringfacultyLayout = new org.jdesktop.layout.GroupLayout(Moduleclusteringfaculty);
        Moduleclusteringfaculty.setLayout(ModuleclusteringfacultyLayout);
        ModuleclusteringfacultyLayout.setHorizontalGroup(
            ModuleclusteringfacultyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(ModuleclusteringfacultyLayout.createSequentialGroup()
                .add(ModuleclusteringfacultyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(ModuleclusteringfacultyLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(ModuleclusteringfacultyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(ModuleclusteringfacultyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(ModuleclusteringfacultyLayout.createSequentialGroup()
                                    .add(ModuleclusteringfacultyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(cfPanelcourse, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(cfPanelprof, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(cfPanelactivities, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, cfPanellog, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 425, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(ModuleclusteringfacultyLayout.createSequentialGroup()
                                .add(42, 42, 42)
                                .add(Buttonallfacultycluster)
                                .add(48, 48, 48)
                                .add(cfButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 205, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(ModuleclusteringfacultyLayout.createSequentialGroup()
                        .add(155, 155, 155)
                        .add(jLabel2)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(ModuleclusteringfacultyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(ModuleclusteringfacultyLayout.createSequentialGroup()
                        .add(207, 207, 207)
                        .add(jLabel5))
                    .add(ModuleclusteringfacultyLayout.createSequentialGroup()
                        .add(66, 66, 66)
                        .add(Buttonallstudentcluster)
                        .add(37, 37, 37)
                        .add(csButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 205, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(ModuleclusteringfacultyLayout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(ModuleclusteringfacultyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(csPanelcourse, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, csPanellog, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, csPanelactivity, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        ModuleclusteringfacultyLayout.setVerticalGroup(
            ModuleclusteringfacultyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jSeparator2)
            .add(ModuleclusteringfacultyLayout.createSequentialGroup()
                .add(ModuleclusteringfacultyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(ModuleclusteringfacultyLayout.createSequentialGroup()
                        .add(25, 25, 25)
                        .add(jLabel2))
                    .add(ModuleclusteringfacultyLayout.createSequentialGroup()
                        .add(24, 24, 24)
                        .add(jLabel5)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(ModuleclusteringfacultyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(ModuleclusteringfacultyLayout.createSequentialGroup()
                        .add(cfPanelcourse, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cfPanelprof, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(cfPanelactivities, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cfPanellog, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(ModuleclusteringfacultyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cfButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Buttonallfacultycluster))
                .add(94, 94, 94))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, ModuleclusteringfacultyLayout.createSequentialGroup()
                .add(68, 68, 68)
                .add(csPanelcourse, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(csPanelactivity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(csPanellog, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(18, 18, 18)
                .add(ModuleclusteringfacultyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(csButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Buttonallstudentcluster))
                .add(96, 96, 96))
        );

        cfPanelcourse.setBorder(BorderFactory.createTitledBorder("Course"));
        cfPanelprof.setBorder(BorderFactory.createTitledBorder("Professor"));
        cfPanellog.setBorder(BorderFactory.createTitledBorder("Logs"));
        cfPanelactivities.setBorder(BorderFactory.createTitledBorder("Course Acivities"));
        csPanelcourse.setBorder(BorderFactory.createTitledBorder("Student Info"));
        csPanelactivity.setBorder(BorderFactory.createTitledBorder("Student Activity"));
        csPanellog.setBorder(BorderFactory.createTitledBorder("Student Logs"));

        Tabmodules.addTab("Clustering Tab", Moduleclusteringfaculty);

        associationButton.setText("Generate Association Table");
        associationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                associationButtonActionPerformed(evt);
            }
        });

        Buttonallassociate.setText("Select All");
        Buttonallassociate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonallassociateActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Show Courses"));
        jPanel2.setName("Show Courses"); // NOI18N

        cbassocourse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbassocourse.setText("Courses");
        cbassocourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbassocourseActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(cbassocourse)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(cbassocourse)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Activity on the following"));
        jPanel3.setName("Show Courses"); // NOI18N

        cbassoquiz.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbassoquiz.setText("Quiz");

        cbassoassign.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbassoassign.setText("Assignment");

        cbassoforum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbassoforum.setText("Forum");

        cbassoreso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbassoreso.setText("Resource");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cbassoquiz)
                    .add(cbassoassign)
                    .add(cbassoforum)
                    .add(cbassoreso))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(cbassoquiz)
                .add(18, 18, 18)
                .add(cbassoassign)
                .add(18, 18, 18)
                .add(cbassoforum)
                .add(18, 18, 18)
                .add(cbassoreso)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Frequency"));
        jPanel4.setName("Show Courses"); // NOI18N

        cbassocourseview.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbassocourseview.setText("Course View");

        cbassolog.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbassolog.setText("Total Logs");

        cbassoactivity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbassoactivity.setText("MOODLE Activity");

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cbassocourseview)
                    .add(cbassolog)
                    .add(cbassoactivity))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(cbassocourseview)
                .add(18, 18, 18)
                .add(cbassolog)
                .add(18, 18, 18)
                .add(cbassoactivity)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Student");
        jLabel3.setToolTipText("");
        jLabel3.setOpaque(true);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(356, 356, 356)
                .add(jLabel3)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(Buttonallassociate)
                        .add(55, 55, 55)
                        .add(associationButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 205, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(73, 73, 73)
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 78, Short.MAX_VALUE)
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel3)
                .add(29, 29, 29)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 143, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(associationButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Buttonallassociate))
                .add(27, 27, 27))
        );

        jLabel3.getAccessibleContext().setAccessibleName("");

        Tabmodules.addTab("Association Tab", jPanel1);

        Buttonexit.setText("Exit Tool");
        Buttonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonexitActionPerformed(evt);
            }
        });

        Buttonsettings.setText("DB CONNECT");
        Buttonsettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonsettingsActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(Tabmodules, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 894, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Buttonexit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 119, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Buttonsettings, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 119, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(Buttonsettings, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(459, 459, 459)
                        .add(Buttonexit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(Tabmodules, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 564, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 String 
            host ,
            dbName ,
            username,
            password,
            query ,
            clustutable,
            clufactable,
            assstutable;
    String 
            url = host+dbName+"?user="+username+"&password="+password;
    String[] info = new String[6];
    
    String topText = "";
    boolean cancelOp = false, isDefault = true;
    public JTable source;
    String cellData;
    
    String courseView,
                assignLate,
                assignAll,
               assignView,
                quizView,
                quizPass,
                quizAttempt,
                forumView,
                resourceView,
                log1,
                log2,
                log3,
                log4,
                log5,
                log6,
                log7,
                log8,
                log9,
                log10,
                log11,
                log12,
                logView;
    
   
    
    private void ButtonsettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonsettingsActionPerformed
        Handlersettings settings = new Handlersettings();
        settings.setVisible(true);
        //this.setVisible(false);
        settings.setLocationRelativeTo(null);
    }//GEN-LAST:event_ButtonsettingsActionPerformed

    private void ButtonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonexitActionPerformed
       this.dispose();
       System.exit(0);
    }//GEN-LAST:event_ButtonexitActionPerformed

    private void ButtonallassociateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonallassociateActionPerformed
        // TODO add your handling code here:
        
        cbassocourse.setSelected(true);
        cbassocourseview.setSelected(true);
        cbassoassign.setSelected(true);
        cbassoquiz.setSelected(true);
        cbassoforum.setSelected(true);
        cbassoreso.setSelected(true);
        cbassolog.setSelected(true);
        cbassoactivity.setSelected(true);
    }//GEN-LAST:event_ButtonallassociateActionPerformed

    String assocourse,assocourseview,assoassign,assoquiz,assoforum,assoreso,assolog,assoactivity;
    
    private void getassovalue()
    {
        assocourse=getassocoursestud();
        assocourseview=getassocourseviewstud();
        assoassign=getassoassignstud();
        assoquiz=getassoquizstud();
        assoforum=getassoforumstud();
        assoreso=getassoresourcestud();
        assolog=getassologstud();
        assoactivity=getassoactivitystud();
    }
    
    private void associationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_associationButtonActionPerformed
try{
            BufferedReader br = new BufferedReader(new FileReader("settings.txt"));
            try {

                host = br.readLine();
                dbName = br.readLine();
                username = br.readLine();
                password = br.readLine();
                clustutable = br.readLine();
                clufactable = br.readLine();
                assstutable = br.readLine();

            } finally {
                br.close();
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(source, "IO Error : " + e, "IO Error", JOptionPane.ERROR_MESSAGE);
        }

        getassovalue();

        info[0] = host;
        info[1] = dbName;
        info[2] = username;
        info[3] = password;
        query = "select `Student ID`"
                +assocourse
                +assocourseview
                +assoassign
                +assoquiz
                +assoforum
                +assoreso
                +assolog
                +assoactivity+
                 " from `"
        +assstutable+"`";
        System.out.printf(query);
        info[4] = query;
        url = host+dbName+"?user="+username+"&password="+password;
        info[5] = url;

        Handlertable table = new Handlertable(info);
        this.setVisible(false);
        table.setVisible(true);
        table.setLocationRelativeTo(null);
    }//GEN-LAST:event_associationButtonActionPerformed

    private void ButtonallstudentclusterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonallstudentclusterActionPerformed
        // TODO add your handling code here:
        cscbid.setSelected(true);
        cscbstudentid.setSelected(true);
        cscbcourse.setSelected(true);
        cscbassignsubmit.setSelected(true);
        cscbassignfaculty.setSelected(true);
        cscbassignratio.setSelected(true);
        cscbquizanswer.setSelected(true);
        cscbquizfaculty.setSelected(true);
        cscbquizratio.setSelected(true);
        cscbforumpost.setSelected(true);
        cscbforumfaculty.setSelected(true);
        cscbforumratio.setSelected(true);
        cscbresource.setSelected(true);
        cscbquizreview.setSelected(true);
        cscbassignview.setSelected(true);
        cscbquizattempt.setSelected(true);
        cscbwk1.setSelected(true);
        cscbwk2.setSelected(true);
        cscbwk3.setSelected(true);
        cscbwk4.setSelected(true);
        cscbwk5.setSelected(true);
        cscbwk6.setSelected(true);
        cscbwk7.setSelected(true);
        cscbwk8.setSelected(true);
        cscbwk9.setSelected(true);
        cscbwk10.setSelected(true);
        cscbwk11.setSelected(true);
        cscbwk12.setSelected(true);
        cscbtotal.setSelected(true);
    }//GEN-LAST:event_ButtonallstudentclusterActionPerformed

    private void csButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csButtonActionPerformed
        // TODO add your handling code here:
        try{
            BufferedReader br = new BufferedReader(new FileReader("settings.txt"));
            try {

                host = br.readLine();
                dbName = br.readLine();
                username = br.readLine();
                password = br.readLine();
                clustutable = br.readLine();
                clufactable = br.readLine();
                assstutable = br.readLine();

            } finally {
                br.close();
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(source, "IO Error : " + e, "IO Error", JOptionPane.ERROR_MESSAGE);
        }

        getcsValue();

        info[0] = host;
        info[1] = dbName;
        info[2] = username;
        info[3] = password;
        query = "select `ID`"
        +csstudentid
        +cscourse
        +csassignsubmit
        +csassignfaculty
        +csassignratio
        +csassignview
        +csquizanswer
        +csquizfaculty
        +csquizratio
        +csforumpost
        +csforumfaculty
        +csforumratio
        +csresource
        +csquizview
        +csquizattempt
        +cswk3
        +cswk4
        +cswk5
        +cswk6
        +cswk7
        +cswk8
        +cswk9
        +cswk10
        +cswk11
        +cswk12
        +cstotal+

        " from `"
        +clustutable+"`";
        System.out.printf(query);
        info[4] = query;
        url = host+dbName+"?user="+username+"&password="+password;
        info[5] = url;

        Handlertable table = new Handlertable(info);
        this.setVisible(false);
        table.setVisible(true);
        table.setLocationRelativeTo(null);
    }//GEN-LAST:event_csButtonActionPerformed

    private void ButtonallfacultyclusterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonallfacultyclusterActionPerformed
        // TODO add your handling code here:
        cfCBcoursename.setSelected(true);
        cfCBprofname.setSelected(true);
        cfCBassign.setSelected(true);
        cfCBquiz.setSelected(true);
        cfCBforum.setSelected(true);
        cfCBfile.setSelected(true);
        cfCBweek1.setSelected(true);
        cfCBweek2.setSelected(true);
        cfCBweek3.setSelected(true);
        cfCBweek4.setSelected(true);
        cfCBweek5.setSelected(true);
        cfCBweek6.setSelected(true);
        cfCBweek7.setSelected(true);
        cfCBweek8.setSelected(true);
        cfCBweek9.setSelected(true);
        cfCBweek10.setSelected(true);
        cfCBweek11.setSelected(true);
        cfCBweek12.setSelected(true);
        cfCBtotal.setSelected(true);
        cfCBlabel.setSelected(true);
    }//GEN-LAST:event_ButtonallfacultyclusterActionPerformed

    private void cfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfButtonActionPerformed
        try{
            BufferedReader br = new BufferedReader(new FileReader("settings.txt"));
            try {

                host = br.readLine();
                dbName = br.readLine();
                username = br.readLine();
                password = br.readLine();
                clustutable = br.readLine();
                clufactable = br.readLine();
                assstutable = br.readLine();
            } finally {
                br.close();
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(source, "IO Error : " + e, "IO Error", JOptionPane.ERROR_MESSAGE);
        }

        cfassignValue();

        info[0] = host;
        info[1] = dbName;
        info[2] = username;
        info[3] = password;
        query = "select `Course Code`"
        +cfcoursename
        +cfprof
        +cfwk1
        +cfwk2
        +cfwk3
        +cfwk4
        +cfwk5
        +cfwk6
        +cfwk7
        +cfwk8
        +cfwk9
        +cfwk10
        +cfwk11
        +cfwk12
        +cfwktotal
        +cfassign
        +cfquiz
        +cfforum
        +cffile
        +cflabel+
        " from `"
        +clufactable+"`";
        System.out.printf(query);
        info[4] = query;
        url = host+dbName+"?user="+username+"&password="+password;
        info[5] = url;

        Handlertable table = new Handlertable(info);
        this.setVisible(false);
        table.setVisible(true);
        table.setLocationRelativeTo(null);
    }//GEN-LAST:event_cfButtonActionPerformed

    private void cbassocourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbassocourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbassocourseActionPerformed

    //Association methods starts here :: 22 methods
    
     public String getassocoursestud()
     {
          String attributeName="";
    if(cbassocourse.isSelected()==true)
    {
        attributeName=",`Courses`";
    }
    return attributeName;
     }
    public String getassocourseviewstud()
     {
          String attributeName="";
    if(cbassocourseview.isSelected()==true)
    {
        attributeName=",`Course View`";
    }
    return attributeName;
     }
    public String getassoassignstud()
     {
          String attributeName="";
    if(cbassoassign.isSelected()==true)
    {
        attributeName=",`Assignment`";
    }
    return attributeName;
     }
    public String getassoquizstud()
     {
          String attributeName="";
    if(cbassoquiz.isSelected()==true)
    {
        attributeName=",`Quiz`";
    }
    return attributeName;
     }
    public String getassoforumstud()
     {
          String attributeName="";
    if(cbassoforum.isSelected()==true)
    {
        attributeName=",`Forum`";
    }
    return attributeName;
     }
    public String getassoresourcestud()
     {
          String attributeName="";
    if(cbassoforum.isSelected()==true)
    {
        attributeName=",`Resource`";
    }
    return attributeName;
     }
    public String getassologstud()
     {
          String attributeName="";
    if(cbassolog.isSelected()==true)
    {
        attributeName=",`Total Logs`";
    }
    return attributeName;
     }
    public String getassoactivitystud()
     {
          String attributeName="";
    if(cbassoactivity.isSelected()==true)
    {
        attributeName=",`MOODLE Activity`";
    }
    return attributeName;
     }
     /*private void assignVariables(){
         courseView=checkboxcourseview();
        assignView=checkboxassignview();
        assignLate=checkboxassignlate();
        assignAll=checkboxassignall();
        quizView=checkboxquizview();
        quizAttempt=checkboxquizattempt();
        quizPass=checkboxquizpass();
        forumView=checkboxforumview();
        resourceView=checkboxresourceview();
        log1=cblog1();
        log2=cblog2();
        log3=cblog3();
        log4=cblog4();
        log5=cblog5();
        log6=cblog6();
        log7=cblog7();
        log8=cblog8();
        log9=cblog9();
        log10=cblog10();
        log11=cblog11();
        log12=cblog12();
        logView=cblogview();
     }*/
     
    //Association methods ends here... 
     //Clustering Faculty
      String cfcoursename ,
            cfprof ,
            cfwk1,
            cfwk2,
            cfwk3,
            cfwk4,
            cfwk5,
            cfwk6,
            cfwk7,
            cfwk8,
            cfwk9,
            cfwk10,
            cfwk11,
            cfwk12,
            cfwktotal,
            cfquiz,
            cfassign,
            cfforum,
            cffile,
            cflabel;
      
     public String getcfCBcoursename()
     {
         String attributeName="";
    if(cfCBcoursename.isSelected()==true)
    {
        attributeName=",`Course Name`";
    }
    return attributeName;
     }
     public String getcfCBprof()
     {
         String attributeName="";
    if(cfCBprofname.isSelected()==true)
    {
        attributeName=",`Professor`";
    }
    return attributeName;
     }
     public String getcfCBweek1()
     {
         String attributeName="";
    if(cfCBweek1.isSelected()==true)
    {
        attributeName=",`1st`";
    }
    return attributeName;
     }
     public String getcfCBweek2()
     {
         String attributeName="";
    if(cfCBweek2.isSelected()==true)
    {
        attributeName=",`2nd`";
    }
    return attributeName;
     }
     public String getcfCBweek3()
     {
         String attributeName="";
    if(cfCBweek3.isSelected()==true)
    {
        attributeName=",`3rd`";
    }
    return attributeName;
     }
     public String getcfCBweek4()
     {
         String attributeName="";
    if(cfCBweek4.isSelected()==true)
    {
        attributeName=",`4th`";
    }
    return attributeName;
     }
     public String getcfCBweek5()
     {
         String attributeName="";
    if(cfCBweek5.isSelected()==true)
    {
        attributeName=",`5th`";
    }
    return attributeName;
     }
     public String getcfCBweek6()
     {
         String attributeName="";
    if(cfCBweek6.isSelected()==true)
    {
        attributeName=",`6th`";
    }
    return attributeName;
     }
     public String getcfCBweek7()
     {
         String attributeName="";
    if(cfCBweek7.isSelected()==true)
    {
        attributeName=",`7th`";
    }
    return attributeName;
     }
     public String getcfCBweek8()
     {
         String attributeName="";
    if(cfCBweek8.isSelected()==true)
    {
        attributeName=",`8th`";
    }
    return attributeName;
     }
     public String getcfCBweek9()
     {
         String attributeName="";
    if(cfCBweek9.isSelected()==true)
    {
        attributeName=",`9th`";
    }
    return attributeName;
     }
     public String getcfCBweek10()
     {
         String attributeName="";
    if(cfCBweek10.isSelected()==true)
    {
        attributeName=",`10th`";
    }
    return attributeName;
     }
     public String getcfCBweek11()
     {
         String attributeName="";
    if(cfCBweek11.isSelected()==true)
    {
        attributeName=",`11th`";
    }
    return attributeName;
     }
     public String getcfCBweek12()
     {
         String attributeName="";
    if(cfCBweek12.isSelected()==true)
    {
        attributeName=",`12th`";
    }
    return attributeName;
     }
     public String getcfCBtotal()
     {
         String attributeName="";
    if(cfCBtotal.isSelected()==true)
    {
        attributeName=",`Total`";
    }
    return attributeName;
     }
     public String getcfCBquiz()
     {
         String attributeName="";
    if(cfCBquiz.isSelected()==true)
    {
        attributeName=",`Quizzes`";
    }
    return attributeName;
     }
     public String getcfCBassign()
     {
         String attributeName="";
    if(cfCBassign.isSelected()==true)
    {
        attributeName=",`Assignments`";
    }
    return attributeName;
     }
     public String getcfCBforum()
     {
         String attributeName="";
    if(cfCBforum.isSelected()==true)
    {
        attributeName=",`Forums`";
    }
    return attributeName;
     }
     public String getcfCBfiles()
     {
         String attributeName="";
    if(cfCBfile.isSelected()==true)
    {
        attributeName=",`Files`";
    }
    return attributeName;
     }
     public String getcfCBlabel()
     {
         String attributeName="";
    if(cfCBlabel.isSelected()==true)
    {
        attributeName=",`Labels`";
    }
    return attributeName;
     }
     
     public void cfassignValue()
     {
         cfcoursename=getcfCBcoursename();
         cfprof=getcfCBprof();
         cfwk1=getcfCBweek1();
         cfwk2=getcfCBweek2();
         cfwk3=getcfCBweek3();
         cfwk4=getcfCBweek4();
         cfwk5=getcfCBweek5();
         cfwk6=getcfCBweek6();
         cfwk7=getcfCBweek7();
         cfwk8=getcfCBweek8();
         cfwk9=getcfCBweek9();
         cfwk10=getcfCBweek10();
         cfwk11=getcfCBweek11();
         cfwk12=getcfCBweek12();
         cfwktotal=getcfCBtotal();
         cfassign=getcfCBassign();
         cfquiz=getcfCBquiz();
         cfforum=getcfCBforum();
         cffile=getcfCBfiles();
         cflabel=getcfCBlabel();
     }
     
     //Clustering Faculty Ends
     
     //Clustering Student
     String
             csstudentid,
             cscourse,
             csassignsubmit,
             csassignfaculty,
             csassignratio,
             csassignview,
             csquizanswer,
             csquizfaculty,
             csquizratio,
             csforumpost,
             csforumfaculty,
             csforumratio,
             csresource,
             csquizview,
             csquizattempt,
             cswk1,
             cswk2,
             cswk3,
             cswk4,
             cswk5,
             cswk6,
             cswk7,
             cswk8,
             cswk9,
             cswk10,
             cswk11,
             cswk12,
             cstotal;
     public void getcsValue()
     {
         csstudentid=getcsstudentid();
         cscourse=getcscourse();
         csassignsubmit=getcsassignsubmit();
         csassignfaculty=getcsassignfaculty();
             csassignratio=getcsassignratio();
             csassignview=getcsassignview();
             csquizanswer=getcsquizanswer();
             csquizfaculty=getcsquizfaculty();
             csquizratio=getcsquizratio();
             csforumpost=getcsforumpost();
             csforumfaculty=getcsforumfaculty();
             csforumratio=getcsforumratio();
             csresource=getcsresource();
             csquizview=getcsquizreview();
             csquizattempt=getcsquizattempt();
             cswk1=getcswk1();
             cswk2=getcswk2();
             cswk3=getcswk3();
             cswk4=getcswk4();
             cswk5=getcswk5();
             cswk6=getcswk6();
             cswk7=getcswk7();
             cswk8=getcswk8();
             cswk9=getcswk9();
             cswk10=getcswk10();
             cswk11=getcswk11();
             cswk12=getcswk12();
             cstotal=getcstotal();
     }
     public String getcscourse()
     {
          String attributeName="";
    if(cscbcourse.isSelected()==true)
    {
        attributeName=",`COURSE`";
    }
    return attributeName;
     }
     public String getcsstudentid()
     {
          String attributeName="";
    if(cscbid.isSelected()==true)
    {
        attributeName=",`StudentId`";
    }
    return attributeName;
     }
     public String getcsassignsubmit()
     {
          String attributeName="";
    if(cscbassignsubmit.isSelected()==true)
    {
        attributeName=",`Total_Assignments_Submitted`";
    }
    return attributeName;
     }
     public String getcsassignfaculty()
     {
          String attributeName="";
    if(cscbassignfaculty.isSelected()==true)
    {
        attributeName=",`Assignment_Set_By_Faculty`";
    }
    return attributeName;
     }
     public String getcsassignratio()
     {
          String attributeName="";
    if(cscbassignratio.isSelected()==true)
    {
        attributeName=",`Ratio_of_Assignment`";
    }
    return attributeName;
     }
     public String getcsquizanswer()
     {
          String attributeName="";
    if(cscbquizanswer.isSelected()==true)
    {
        attributeName=",`Total_Quiz_Answered`";
    }
    return attributeName;
     }
     public String getcsquizfaculty()
     {
          String attributeName="";
    if(cscbquizfaculty.isSelected()==true)
    {
        attributeName=",`Quiz_Set_By_Faculty`";
    }
    return attributeName;
     }
     public String getcsquizratio()
     {
          String attributeName="";
    if(cscbquizratio.isSelected()==true)
    {
        attributeName=",`Ratio_of_Quiz`";
    }
    return attributeName;
     }
     public String getcsforumpost()
     {
          String attributeName="";
    if(cscbforumpost.isSelected()==true)
    {
        attributeName=",`Total_Forum_Posts`";
    }
    return attributeName;
     }
     public String getcsforumfaculty()
     {
          String attributeName="";
    if(cscbforumfaculty.isSelected()==true)
    {
        attributeName=",`Forum_Set_By_Faculty`";
    }
    return attributeName;
     }
     public String getcsforumratio()
     {
          String attributeName="";
    if(cscbforumratio.isSelected()==true)
    {
        attributeName=",`Ratio_of_Forums`";
    }
    return attributeName;
     }
     public String getcsresource()
     {
          String attributeName="";
    if(cscbresource.isSelected()==true)
    {
        attributeName=",`Resource_View`";
    }
    return attributeName;
     }
     public String getcsquizreview()
     {
          String attributeName="";
    if(cscbquizreview.isSelected()==true)
    {
        attributeName=",`Quiz_Review`";
    }
    return attributeName;
     }
     public String getcsquizattempt()
     {
          String attributeName="";
    if(cscbquizattempt.isSelected()==true)
    {
        attributeName=",`Quiz_Attempt`";
    }
    return attributeName;
     }
     public String getcsassignview()
     {
          String attributeName="";
    if(cscbassignview.isSelected()==true)
    {
        attributeName=",`Assign_View`";
    }
    return attributeName;
     }
     public String getcswk1()
     {
          String attributeName="";
    if(cscbwk1.isSelected()==true)
    {
        attributeName=",`Week_1`";
    }
    return attributeName;
     }
     public String getcswk2()
     {
          String attributeName="";
    if(cscbwk2.isSelected()==true)
    {
        attributeName=",`Week_2`";
    }
    return attributeName;
     }
     public String getcswk3()
     {
          String attributeName="";
    if(cscbwk3.isSelected()==true)
    {
        attributeName=",`Week_3`";
    }
    return attributeName;
     }
     public String getcswk4()
     {
          String attributeName="";
    if(cscbwk4.isSelected()==true)
    {
        attributeName=",`Week_4`";
    }
    return attributeName;
     }
     public String getcswk5()
     {
          String attributeName="";
    if(cscbwk5.isSelected()==true)
    {
        attributeName=",`Week_5`";
    }
    return attributeName;
     }
     public String getcswk6()
     {
          String attributeName="";
    if(cscbwk6.isSelected()==true)
    {
        attributeName=",`Week_6`";
    }
    return attributeName;
     }
     public String getcswk7()
     {
          String attributeName="";
    if(cscbwk7.isSelected()==true)
    {
        attributeName=",`Week_7`";
    }
    return attributeName;
     }
     public String getcswk8()
     {
          String attributeName="";
    if(cscbwk8.isSelected()==true)
    {
        attributeName=",`Week_8`";
    }
    return attributeName;
     }
     public String getcswk9()
     {
          String attributeName="";
    if(cscbwk9.isSelected()==true)
    {
        attributeName=",`Week_9`";
    }
    return attributeName;
     }
     public String getcswk10()
     {
          String attributeName="";
    if(cscbwk10.isSelected()==true)
    {
        attributeName=",`Week_10`";
    }
    return attributeName;
     }
     public String getcswk11()
     {
          String attributeName="";
    if(cscbwk11.isSelected()==true)
    {
        attributeName=",`Week_11`";
    }
    return attributeName;
     }
     public String getcswk12()
     {
          String attributeName="";
    if(cscbwk12.isSelected()==true)
    {
        attributeName=",`Week_12`";
    }
    return attributeName;
     }
     public String getcstotal()
     {
          String attributeName="";
    if(cscbtotal.isSelected()==true)
    {
        attributeName=",`Total_Logs`";
    }
    return attributeName;
     }
     
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Mainmenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonallassociate;
    private javax.swing.JButton Buttonallfacultycluster;
    private javax.swing.JButton Buttonallstudentcluster;
    private javax.swing.JButton Buttonexit;
    private javax.swing.JButton Buttonsettings;
    private javax.swing.JPanel Moduleclusteringfaculty;
    private javax.swing.JTabbedPane Tabmodules;
    private javax.swing.JButton associationButton;
    private javax.swing.JCheckBox cbassoactivity;
    private javax.swing.JCheckBox cbassoassign;
    private javax.swing.JCheckBox cbassocourse;
    private javax.swing.JCheckBox cbassocourseview;
    private javax.swing.JCheckBox cbassoforum;
    private javax.swing.JCheckBox cbassolog;
    private javax.swing.JCheckBox cbassoquiz;
    private javax.swing.JCheckBox cbassoreso;
    private javax.swing.JButton cfButton;
    private javax.swing.JCheckBox cfCBassign;
    private javax.swing.JCheckBox cfCBcoursename;
    private javax.swing.JCheckBox cfCBfile;
    private javax.swing.JCheckBox cfCBforum;
    private javax.swing.JCheckBox cfCBlabel;
    private javax.swing.JCheckBox cfCBprofname;
    private javax.swing.JCheckBox cfCBquiz;
    private javax.swing.JCheckBox cfCBtotal;
    private javax.swing.JCheckBox cfCBweek1;
    private javax.swing.JCheckBox cfCBweek10;
    private javax.swing.JCheckBox cfCBweek11;
    private javax.swing.JCheckBox cfCBweek12;
    private javax.swing.JCheckBox cfCBweek2;
    private javax.swing.JCheckBox cfCBweek3;
    private javax.swing.JCheckBox cfCBweek4;
    private javax.swing.JCheckBox cfCBweek5;
    private javax.swing.JCheckBox cfCBweek6;
    private javax.swing.JCheckBox cfCBweek7;
    private javax.swing.JCheckBox cfCBweek8;
    private javax.swing.JCheckBox cfCBweek9;
    private javax.swing.JPanel cfPanelactivities;
    private javax.swing.JPanel cfPanelcourse;
    private javax.swing.JPanel cfPanellog;
    private javax.swing.JPanel cfPanelprof;
    private javax.swing.JButton csButton;
    private javax.swing.JPanel csPanelactivity;
    private javax.swing.JPanel csPanelcourse;
    private javax.swing.JPanel csPanellog;
    private javax.swing.JCheckBox cscbassignfaculty;
    private javax.swing.JCheckBox cscbassignratio;
    private javax.swing.JCheckBox cscbassignsubmit;
    private javax.swing.JCheckBox cscbassignview;
    private javax.swing.JCheckBox cscbcourse;
    private javax.swing.JCheckBox cscbforumfaculty;
    private javax.swing.JCheckBox cscbforumpost;
    private javax.swing.JCheckBox cscbforumratio;
    private javax.swing.JCheckBox cscbid;
    private javax.swing.JCheckBox cscbquizanswer;
    private javax.swing.JCheckBox cscbquizattempt;
    private javax.swing.JCheckBox cscbquizfaculty;
    private javax.swing.JCheckBox cscbquizratio;
    private javax.swing.JCheckBox cscbquizreview;
    private javax.swing.JCheckBox cscbresource;
    private javax.swing.JCheckBox cscbstudentid;
    private javax.swing.JCheckBox cscbtotal;
    private javax.swing.JCheckBox cscbwk1;
    private javax.swing.JCheckBox cscbwk10;
    private javax.swing.JCheckBox cscbwk11;
    private javax.swing.JCheckBox cscbwk12;
    private javax.swing.JCheckBox cscbwk2;
    private javax.swing.JCheckBox cscbwk3;
    private javax.swing.JCheckBox cscbwk4;
    private javax.swing.JCheckBox cscbwk5;
    private javax.swing.JCheckBox cscbwk6;
    private javax.swing.JCheckBox cscbwk7;
    private javax.swing.JCheckBox cscbwk8;
    private javax.swing.JCheckBox cscbwk9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
