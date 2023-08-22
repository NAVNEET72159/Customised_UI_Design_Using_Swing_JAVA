package Component;

import event.EventMenuSelected;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import model.Model_Menu;

public class Menu extends javax.swing.JPanel {

    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
        listMenu2.addEventMenuSelected(event);
    }
    
    public Menu() {
        initComponents();
        setOpaque(true);
        listMenu2.setOpaque(false);
        init();
    }
    
    private void init(){
        listMenu2.addItem(new Model_Menu("1", "Dashboard", Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("2", "UI Elements", Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("3", "Comonents", Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("4", "Forms Stuff", Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("5", "Date Table", Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));
        listMenu2.addItem(new Model_Menu("", "My Data", Model_Menu.MenuType.TITLE));
        listMenu2.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));
        listMenu2.addItem(new Model_Menu("6", "Icons", Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("7", "Sample Page", Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("8", "Extra", Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("9", "More", Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("10", "Logout", Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        listMenu2 = new swing.ListMenu<>();

        panelMoving.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N
        jLabel2.setText("SMS");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(listMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics graphics) {
        Graphics2D g2 = (Graphics2D)graphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#1CB5E0"), 0, getHeight(), Color.decode("#000046"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(graphics);
    }
    
    private int x;
    private int y;

    public void initMoving(JFrame frame) {
        panelMoving.addMouseListener(new MouseAdapter() { 
            @Override
            public void mouseClicked(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }  
        });
        
        panelMoving.addMouseMotionListener(new MouseMotionAdapter() { 
            @Override
            public void mouseDragged(MouseEvent me) {
                frame.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }  
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private swing.ListMenu<String> listMenu2;
    private javax.swing.JPanel panelMoving;
    // End of variables declaration//GEN-END:variables
}
