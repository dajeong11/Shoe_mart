import javax.swing.SwingUtilities;

public class run {
	

	
	public static void main(String[] args) {
		User.initializeDatabase();
		SwingUtilities.invokeLater(() -> {
            new LoginRegisterPage();
        });
		// TODO Auto-generated method stub

	}

}
