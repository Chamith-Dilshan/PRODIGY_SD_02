package org.example.pages;

import org.example.ui_components.BaseButton;
import org.example.ui_components.BaseLable;
import org.example.ui_components.BasePanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuccessPanel {
    private final BasePanel successPanelOutside = new BasePanel();
    private final BasePanel successPanelInside = new BasePanel();
    private final BasePanel imagePanel = new BasePanel();
    private final BasePanel messagePanel = new BasePanel();
    private final BasePanel infoPanel = new BasePanel();
    private final BaseLable successLabel = new BaseLable("Success");
    private final BaseLable attemptsLabel = new BaseLable("Number of Attempts - ");
    private final BaseButton playAgainButton = new BaseButton("Play Again!");
    private final BaseButton cancelButton = new BaseButton("Cancel");
    public SuccessPanel(JPanel cardPanel,int numberOfAttempts){
        //Add Image icon
        ImageIcon icon = new ImageIcon("src/main/resources/images/success.png");
        Image image = icon.getImage(); // transform it
        Image newimg = image.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        icon = new ImageIcon(newimg);  // transform it back
        JLabel imageLabel = new JLabel(icon);
        imagePanel.add(imageLabel);

        //Set Layout
        successPanelInside.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
        successPanelOutside.setLayout(new BorderLayout(100,100));

        //set Border
        successPanelInside.setBorder(new BorderUIResource.LineBorderUIResource(Color.BLACK,10));
        successPanelOutside.setBorder(new EmptyBorder(60, 60, 60, 60));

        //Add components to the Message panel
        messagePanel.add(successLabel);
        successLabel.setFont(new Font("Source Code Pro",Font.BOLD,25));

        //Add components to the info panel
        infoPanel.add(attemptsLabel);
        attemptsLabel.setFont(new Font("Source Code Pro",Font.BOLD,16));
        attemptsLabel.setText("Number of Attempts - " +numberOfAttempts);

        //Add components to the inside Panel
        successPanelInside.add(imagePanel);
        successPanelInside.add(messagePanel);
        successPanelInside.add(infoPanel);
        successPanelInside.add(playAgainButton);
        successPanelInside.add(cancelButton);
        playAgainButton.setPreferredSize(new Dimension(150,40));
        playAgainButton.setPreferredSize(new Dimension(150,40));

        //Center components
        successLabel.setHorizontalAlignment(SwingConstants.CENTER);
        attemptsLabel.setHorizontalAlignment(SwingConstants.CENTER);

        successPanelOutside.add(successPanelInside, BorderLayout.CENTER);

        playAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                cardLayout.show(cardPanel,"StartPanel");
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    public JPanel getSuccessPanel() {
        return successPanelOutside;
    }
}
