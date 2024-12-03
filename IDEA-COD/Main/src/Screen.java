import javax.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Screen extends JFrame {
    JTextField  carro;
    JTextField caminhao;
    public Screen() {
        setTitle("Pegada de Carbono");
        setVisible(true);
        setSize(1600, 1200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        //Titulos e subTitulos
        JLabel title = new JLabel("CALCULO DE PEGADA DE CARBONO");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setForeground(new Color(12, 241, 13));
        title.setBounds(this.getX() / 2, 0, 800, 120);

        //Botões
        JButton jButton = new JButton(" 1. Quais os efeitos dos gasses do efeito estufa?");
        jButton.setBounds(0,80,500,70);
        jButton.setFont(new Font ("Arial", Font.BOLD, 20));
        jButton.setForeground(new Color (10,10,10));
        jButton.setBackground(new Color(156, 239, 87));

        JButton jButton1 = new JButton(" 2. O que é protocolo GHG3?");
        jButton1.setBounds(0,160,500,70);
        jButton1.setFont(new Font ("Arial", Font.BOLD, 20));
        jButton1.setForeground(new Color (10,10,10));
        jButton1.setBackground(new Color(156, 239, 87));

        JButton jButton2 = new JButton(" 3. Link do protocolo GHG3:");
        jButton2.setBounds(0,240,500,70);
        jButton2.setFont(new Font ("Arial", Font.BOLD, 20));
        jButton2.setForeground(new Color (10,10,10));
        jButton2.setBackground(new Color(156, 239, 87));

        JButton jButton3 = new JButton(" 4. Crédito de Carbono:");
        jButton3.setBounds(0,320,500,70);
        jButton3.setFont(new Font ("Arial", Font.BOLD, 20));
        jButton3.setForeground(new Color (10,10,10));
        jButton3.setBackground(new Color(156, 239, 87));

        JButton jButton4 = new JButton(" 5. Cotação do Crédito de Carbono:");
        jButton4.setBounds(0,400,500,70);
        jButton4.setFont(new Font ("Arial", Font.BOLD, 20));
        jButton4.setForeground(new Color (10,10,10));
        jButton4.setBackground(new Color(156, 239, 87));

        JButton jButton5 = new JButton(" 6. Calculadora de Pegada de Carbono:");
        jButton5.setBounds(0,480,500,70);
        jButton5.setFont(new Font ("Arial", Font.BOLD, 20));
        jButton5.setForeground(new Color (10,10,10));
        jButton5.setBackground(new Color(156, 239, 87));

        add (jButton);
        add (jButton1);
        add (jButton2);
        add (jButton3);
        add (jButton4);
        add (jButton5);

        jButton.addActionListener(this::option1);
        jButton1.addActionListener(this::option2);
        jButton2.addActionListener(this::option3);
        jButton3.addActionListener(this::option4);
        jButton4.addActionListener(this::option5);
        jButton5.addActionListener(this::option6);
        //jButton6.addActionListener(this::option7);



        JLabel title1 = new JLabel("CALCULO RAPIDO");
        title1.setFont(new Font("Arial", Font.BOLD, 40));
        title1.setForeground(new Color(12, 241, 13));
        title1.setBounds(800, 120, 800, 120);

        JLabel title2 = new JLabel("CALCULO CARRO:");
        title2.setFont(new Font("Arial", Font.BOLD, 20));
        title2.setForeground(new Color(12, 241, 13));
        title2.setBounds(800, 200, 800, 120);

        JLabel title3 = new JLabel("CALCULO CAMINHÃO:");
        title3.setFont(new Font("Arial", Font.BOLD, 20));
        title3.setForeground(new Color(12, 241, 13));
        title3.setBounds(800, 280, 800, 120);

        add(title);
        add(title1);
        add(title2);
        add(title3);

        //Caixa de Calculo Radido.
        JButton jButtoncarro = new JButton(" CALCULAR");
        jButtoncarro.setBounds(1250, 235, 200, 50);
        jButtoncarro.setFont(new Font("Arial", Font.BOLD, 20));
        jButtoncarro.setForeground(new Color(10, 10, 10));
        jButtoncarro.setBackground(new Color(156, 239, 87));
        jButtoncarro.addActionListener(this::pegadacarro);

        carro = new JTextField("Digite o uso Aqui!");
        carro.setBounds(1020, 235, 200, 50);
        carro.setFont(new Font("Arial", Font.BOLD, 20));

        JButton jButtoncaminhao = new JButton(" CALCULAR");
        jButtoncaminhao.setBounds(1250, 315, 200, 50);
        jButtoncaminhao.setFont(new Font("Arial", Font.BOLD, 20));
        jButtoncaminhao.setForeground(new Color(10, 10, 10));
        jButtoncaminhao.setBackground(new Color(156, 239, 87));
        jButtoncaminhao.addActionListener(this::pegadacaminhao);

        caminhao = new JTextField("Digite o uso Aqui!");
        caminhao.setBounds(1020, 315, 200, 50);
        caminhao.setFont(new Font("Arial", Font.BOLD, 20));

        add(jButtoncaminhao);
        add(jButtoncarro);
        add(carro);
        add(caminhao);
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
        JOptionPane.showMessageDialog(null,"1. Os Gases de Efeito Estufa (GEE), são substâncias gasosas naturalmente presentes na atmosfera e que absorvem parte da radiação infravermelha emitida pelo Sol e refletida pela superfície terrestre, dificultando o escape desta radiação para o espaço. Sua consequência são: inundação das cidades costeiras, a desertificação de áreas férteis, o derretimento de massas glaciais e maoir eminência de desastres climaticos");
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
        System.out.println("");
        //Scanner scanner = new Scanner(System.in);
        System.out.print("  6. Digite a quantidade de Atividade (em Hora) por uso de Carro e de Caminhão: ");
        //double carro = scanner.nextInt();
        //double caminhao = scanner.nextInt();
        {
            //System.out.print(" Carro:" + (0.96 * carro) + "kg CO2e |");// 0.96 é a media de emissão padrão de CO2 de um carro
            //System.out.println(" Caminhão:" + (4 * caminhao) + "kg CO2e ");// 4 é a media de emissão padrão de CO2 para um caminhão
        }
        //private void option7 (ActionEvent actionEvent){
        }
    }
