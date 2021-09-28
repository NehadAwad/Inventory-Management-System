
package inventorymanagement;

public class HomeScreen {
    public static void main(String[] args) {
           
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
}
