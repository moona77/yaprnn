package yaprnn.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MenuSubsamplingAction implements ActionListener {

	private GUI gui;

	MenuSubsamplingAction(GUI gui) {
		this.gui = gui;
		setEnabled(false);
		gui.getView().getMenuSubsampling().addActionListener(this);
	}

	
	void setEnabled(boolean enabled) {
		gui.getView().getMenuSubsampling().setEnabled(enabled);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

}