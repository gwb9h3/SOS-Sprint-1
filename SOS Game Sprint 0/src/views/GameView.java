package views;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class GameView extends JFrame{
	
	private JRadioButton selector1, selector2, selector3, selector4;
	private JCheckBox check1;
	private ButtonGroup g1,g2;
	
	public GameView() {
		setTitle("SOS Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		//Top panel
		JPanel topPanel = new JPanel();
		topPanel.add(new JLabel("Check to play against CPU"));
		check1 = new JCheckBox();
		topPanel.add(check1);
		String title1 = "SOS Game";
		Border border1 = BorderFactory.createTitledBorder(title1);
		topPanel.setBorder(border1);
		
		//Left panel
		JPanel leftPanel = new JPanel(new GridLayout(3,1));
		String title2 = "";
		Border border2 = BorderFactory.createTitledBorder(title2);
		leftPanel.setBorder(border2);
		leftPanel.add(new JLabel("Blue Player"));
		selector1 = new JRadioButton("S");
		selector2 = new JRadioButton("O");
		leftPanel.add(selector1);
		leftPanel.add(selector2);
		g1 = new ButtonGroup();
		g1.add(selector1);
		g1.add(selector2);
		
		//Right panel
		JPanel rightPanel = new JPanel(new GridLayout(3,1));
		String title3 = "";
		Border border3 = BorderFactory.createTitledBorder(title3);
		rightPanel.setBorder(border3);
		rightPanel.add(new JLabel("Red Player"));
		selector3 = new JRadioButton("S");
		selector4 = new JRadioButton("O");
		rightPanel.add(selector3);
		rightPanel.add(selector4);
		g2 = new ButtonGroup();
		g2.add(selector3);
		g2.add(selector4);
		
		add(topPanel,BorderLayout.NORTH);
		add(leftPanel,BorderLayout.WEST);
		add(rightPanel,BorderLayout.EAST);
		pack();
	}
	
}
