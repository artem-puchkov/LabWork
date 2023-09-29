package LabWork5;

import javax.swing.*;
import java.awt.*;

public class Task1 extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> {
            Task1 footballMatch = new Task1();
            footballMatch.setVisible(true);
        });
    }

    private int milanScore = 0;
    private int madridScore = 0;
    private final JLabel resultLabel;
    private final JLabel lastScorerLabel;
    private final JLabel winnerLabel;

    public Task1() {
        super("Football Match");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new GridLayout(4, 2));

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        milanButton.addActionListener( e ->  {
            milanScore++;
            updateLabels("AC Milan");
        });

        madridButton.addActionListener( e ->  {
            madridScore++;
            updateLabels("Real Madrid");
        });

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
    }

    private void updateLabels(String lastScorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }
}

