package InterfacesUi;

import com.formdev.flatlaf.FlatIntelliJLaf;
import entities.UserData;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logicBd.HomeInstructorLogic;

/**
 *
 * @author Oscar
 */
public class HomeInstructor extends javax.swing.JFrame {

    private Long userId;

    public HomeInstructor(Long userId) {
        initComponents();
        
        FlatIntelliJLaf.setup();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.userId = userId;

        chargeInformation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        panelRound5 = new InterfacesUi.PanelRound();
        labelProfilePicture = new javax.swing.JLabel();
        labelNameUser = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelRound4 = new InterfacesUi.PanelRound();
        panelRound1 = new InterfacesUi.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        panelRound2 = new InterfacesUi.PanelRound();
        btEvents = new javax.swing.JButton();
        btCourses = new javax.swing.JButton();
        btAssists = new javax.swing.JButton();
        panelRound3 = new InterfacesUi.PanelRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(111, 168, 220));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btExit.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btExit.setText(" Exit");
        btExit.setToolTipText("Exit the program");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RIAP");

        panelRound5.setBackground(new java.awt.Color(111, 168, 220));
        panelRound5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelRound5.setForeground(new java.awt.Color(255, 255, 255));
        panelRound5.setRoundBottomLeft(15);
        panelRound5.setRoundBottomRight(15);
        panelRound5.setRoundTopLeft(15);
        panelRound5.setRoundTopRight(15);

        labelProfilePicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profileImg.png"))); // NOI18N

        labelNameUser.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        labelNameUser.setText("User Basic");

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelProfilePicture)
                .addGap(38, 38, 38)
                .addComponent(labelNameUser)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelProfilePicture)
                .addGap(29, 29, 29))
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelNameUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jLabel4))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imageCentral.png"))); // NOI18N

        panelRound1.setBackground(new java.awt.Color(174, 214, 241));
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopRight(30);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel1.setText("Actions");

        panelRound2.setBackground(new java.awt.Color(174, 214, 241));

        btEvents.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        btEvents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/event.png"))); // NOI18N
        btEvents.setText("  Events");
        btEvents.setToolTipText("Create a new event");
        btEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEventsActionPerformed(evt);
            }
        });

        btCourses.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        btCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/courses.png"))); // NOI18N
        btCourses.setText("  Courses");
        btCourses.setToolTipText("Review the courses in charge");
        btCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCoursesActionPerformed(evt);
            }
        });

        btAssists.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        btAssists.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/assist.png"))); // NOI18N
        btAssists.setText("  Assists");
        btAssists.setToolTipText("Review attendance");
        btAssists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAssistsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCourses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAssists, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addComponent(btEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btAssists, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelRound3.setPreferredSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(92, 92, 92))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void chargeInformation() {
        HomeInstructorLogic homeInstructorLogic = new HomeInstructorLogic();

        ArrayList<UserData> infoUser = homeInstructorLogic.getUserData(userId);

        if (!infoUser.isEmpty()) {
            UserData userData = infoUser.get(0);

            labelNameUser.setText(userData.getNameUser());

            ImageIcon profileImageIcon;
            if (userData.getProfilePicture() != null) {
                try {
                    URL imageURL = new URL(userData.getProfilePicture());
                    BufferedImage image = ImageIO.read(imageURL);
                    if (image != null) {
                        // (32x32)
                        java.awt.Image scaledImage = image.getScaledInstance(32, 32, java.awt.Image.SCALE_SMOOTH);
                        profileImageIcon = new ImageIcon(scaledImage);
                    } else {

                        // default
                        profileImageIcon = new ImageIcon(getClass().getResource("/images/profileImg.png"));
                    }
                } catch (IOException e) {
                    // default
                    profileImageIcon = new ImageIcon(getClass().getResource("/images/profileImg.png"));
                }
            } else {
                // default
                profileImageIcon = new ImageIcon(getClass().getResource("/images/profileImg.png"));
            }
            labelProfilePicture.setIcon(profileImageIcon);
        }
    }


    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed


    private void btEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEventsActionPerformed
        
        this.dispose();
        EventForm eventForm = new EventForm(this);
        eventForm.setVisible(true);

    }//GEN-LAST:event_btEventsActionPerformed

    private void btAssistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAssistsActionPerformed
       
       AttendanceApprentices attendanceApprentices = new AttendanceApprentices();
       attendanceApprentices.setVisible(true);
       
    }//GEN-LAST:event_btAssistsActionPerformed

    private void btCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCoursesActionPerformed
        
        CoursesInformation coursesInformation = new CoursesInformation();
        coursesInformation.setVisible(true);
        
    }//GEN-LAST:event_btCoursesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAssists;
    private javax.swing.JButton btCourses;
    private javax.swing.JButton btEvents;
    private javax.swing.JButton btExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNameUser;
    private javax.swing.JLabel labelProfilePicture;
    private InterfacesUi.PanelRound panelRound1;
    private InterfacesUi.PanelRound panelRound2;
    private InterfacesUi.PanelRound panelRound3;
    private InterfacesUi.PanelRound panelRound4;
    private InterfacesUi.PanelRound panelRound5;
    // End of variables declaration//GEN-END:variables
}
