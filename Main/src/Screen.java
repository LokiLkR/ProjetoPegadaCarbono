import javax.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Screen extends JFrame {
    JTextField carro;
    JTextField caminhao;
    JTextField atividade;
    JTextField fator;
    public Screen() {
        setTitle("Pegada de Carbono");
        setVisible(true);
        setSize(1600, 1200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        //Titulos e subTitulos
        JLabel title = new JLabel("PEGADA DE CARBONO");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(new Color(29, 67, 3));
        title.setBounds(this.getX() / 2, 0, 800, 120);

        //Botões
        JButton jButton = new JButton(" 1. Quais os efeitos dos gasses do efeito estufa?");
        jButton.setBounds(0,80,500,70);
        jButton.setFont(new Font ("Arial", Font.BOLD, 20));
        jButton.setForeground(new Color (10,10,10));
        jButton.setBackground(new Color(111, 198, 32));

        JButton jButton1 = new JButton(" 2. O que é protocolo GHG3?");
        jButton1.setBounds(0,160,500,70);
        jButton1.setFont(new Font ("Arial", Font.BOLD, 20));
        jButton1.setForeground(new Color (10,10,10));
        jButton1.setBackground(new Color(25, 133, 92));

        JButton jButton2 = new JButton(" 3. Link do protocolo GHG3:");
        jButton2.setBounds(0,240,500,70);
        jButton2.setFont(new Font ("Arial", Font.BOLD, 20));
        jButton2.setForeground(new Color (10,10,10));
        jButton2.setBackground(new Color(111, 198, 32));

        JButton jButton3 = new JButton(" 4. Crédito de Carbono:");
        jButton3.setBounds(0,320,500,70);
        jButton3.setFont(new Font ("Arial", Font.BOLD, 20));
        jButton3.setForeground(new Color (10,10,10));
        jButton3.setBackground(new Color(25, 133, 92));

        JButton jButton4 = new JButton(" 5. Cotação do Crédito de Carbono:");
        jButton4.setBounds(0,400,500,70);
        jButton4.setFont(new Font ("Arial", Font.BOLD, 20));
        jButton4.setForeground(new Color (10,10,10));
        jButton4.setBackground(new Color(111, 198, 32));

        add (jButton);
        add (jButton1);
        add (jButton2);
        add (jButton3);
        add (jButton4);

        jButton.addActionListener(this::option1);
        jButton1.addActionListener(this::option2);
        jButton2.addActionListener(this::option3);
        jButton3.addActionListener(this::option4);
        jButton4.addActionListener(this::option5);

        // Titulos
        JLabel title1 = new JLabel("CALCULO RAPIDO");
        title1.setFont(new Font("Arial", Font.BOLD, 40));
        title1.setForeground(new Color(18, 44, 3));
        title1.setBounds(750, 120, 800, 120);

        JLabel title2 = new JLabel("Calculo Carro:");
        title2.setFont(new Font("Arial", Font.BOLD, 20));
        title2.setForeground(new Color(12, 241, 13));
        title2.setBounds(800, 200, 800, 120);

        JLabel title3 = new JLabel("Calculo Caminhão:");
        title3.setFont(new Font("Arial", Font.BOLD, 20));
        title3.setForeground(new Color(12, 241, 13));
        title3.setBounds(800, 280, 800, 120);

        JLabel title4 = new JLabel("CALCULO POR ATIVIDADE");
        title4.setFont(new Font("Arial", Font.BOLD, 40));
        title4.setForeground(new Color(18, 44, 3));
        title4.setBounds(750, 360, 800, 120);

        JLabel title5 = new JLabel("Consumo da Atividade:");
        title5.setFont(new Font("Arial", Font.BOLD, 20));
        title5.setForeground(new Color(12, 241, 13));
        title5.setBounds(800, 460, 800, 120);

        JLabel title6 = new JLabel("Atividade por Hora:");
        title6.setFont(new Font("Arial", Font.BOLD, 20));
        title6.setForeground(new Color(12, 241, 13));
        title6.setBounds(800, 540, 800, 120);

        add(title);
        add(title1);
        add(title2);
        add(title3);
        add(title4);
        add(title5);
        add(title6);

        //Caixa de Calculo Radido.
        JButton jButtoncarro = new JButton(" CALCULAR");
        jButtoncarro.setBounds(1250, 235, 200, 50);
        jButtoncarro.setFont(new Font("Arial", Font.BOLD, 20));
        jButtoncarro.setForeground(new Color(10, 10, 10));
        jButtoncarro.setBackground(new Color(237, 224, 61));
        jButtoncarro.addActionListener(this::pegadacarro);

        carro = new JTextField("Digite o uso Aqui!");
        carro.setBounds(1020, 235, 200, 50);
        carro.setFont(new Font("Arial", Font.BOLD, 20));

        JButton jButtoncaminhao = new JButton(" CALCULAR");
        jButtoncaminhao.setBounds(1250, 315, 200, 50);
        jButtoncaminhao.setFont(new Font("Arial", Font.BOLD, 20));
        jButtoncaminhao.setForeground(new Color(10, 10, 10));
        jButtoncaminhao.setBackground(new Color(237, 224, 61));
        jButtoncaminhao.addActionListener(this::pegadacaminhao);

        caminhao = new JTextField("Digite o uso Aqui!");
        caminhao.setBounds(1020, 315, 200, 50);
        caminhao.setFont(new Font("Arial", Font.BOLD, 20));

        JButton jButtonporhora = new JButton(" CALCULAR");
        jButtonporhora.setBounds(1250, 530, 200, 50);
        jButtonporhora.setFont(new Font("Arial", Font.BOLD, 20));
        jButtonporhora.setForeground(new Color(10, 10, 10));
        jButtonporhora.setBackground(new Color(237, 224, 61));
        jButtonporhora.addActionListener(this::pegadaporhora);

        atividade = new JTextField("Digite o uso Aqui!");
        atividade.setBounds(1020, 500, 200, 50);
        atividade.setFont(new Font("Arial", Font.BOLD, 20));

        fator = new JTextField("Digite o uso Aqui!");
        fator.setBounds(1020, 580, 200, 50);
        fator.setFont(new Font("Arial", Font.BOLD, 20));

        add(jButtonporhora);
        add(jButtoncaminhao);
        add(jButtoncarro);
        add(fator);
        add(atividade);
        add(carro);
        add(caminhao);
    }

    private void pegadaporhora(ActionEvent actionEvent) {
        Integer num3 = Integer.parseInt(atividade.getText());
        Integer num4 = Integer.parseInt(fator.getText());
        Integer Pegada3 =  (num3*num4);
        JOptionPane.showMessageDialog(null, Pegada3 + "Kg CO2e");
    }

    private void pegadacarro(ActionEvent actionEvent) {
        Integer num1 = Integer.parseInt(carro.getText());
        Integer Pegada = (int) (num1*0.96);

        JOptionPane.showMessageDialog(null, Pegada + "Kg CO2e");
    }
    private void pegadacaminhao(ActionEvent actionEvent) {
        Integer num2 = Integer.parseInt(caminhao.getText());
        Integer Pegada2 = (num2 * 4);

        JOptionPane.showMessageDialog(null,Pegada2 + "Kg CO2e");
    }



    private void option1(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null,"1. Os Gases de Efeito Estufa (GEE), são gases naturalmente presentes na atmosfera e que absorvem parte da radiação solar e refletido para superfície terrestre, dificultando que essa radiação volte ao espaço. Consequência: maoir eminência de desastres climaticos.");
    }
    private void option2(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "  2. O Protocolo GHG  é um pacote de padrões, orientações, ferramentas e treinamentos para que empresas e governos mensurem e gerenciem as emissões antropogênicas responsáveis pelo aquecimento global.");
    }
    private void option3(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null,"  3. https://ghgprotocol.org/sites/default/files/standards/ghg_protocol_portuguese.pdf");
    }
    private void option4(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "  4. O crédito de carbono funciona como um incentivo econômico para as empresas adotarem energias limpas. Companhias que impedem a emissão de 1 tonelada de CO2 geram esse crédito e podem vendê-lo para outras instituições que excederem o volume de emissão desse gás na atmosfera.");
    }
    private void option5(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null,"  5. R$ 456,03 ");
    }
    private void option6(ActionEvent actionEvent) {

    }
    }
