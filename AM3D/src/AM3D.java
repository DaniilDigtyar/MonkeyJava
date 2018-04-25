import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Canvas;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;

public class AM3D extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	ArrayList<Treballdor> LlistaTreballadors = new ArrayList();
	ArrayList<Impresora> LlistaImpresores= new ArrayList();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
				
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AM3D window = new AM3D();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AM3D() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 820, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**
		 * Barra de menu
		 */
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		/**
		 * Menu
		 */
		JMenu mnArxiu = new JMenu("Arxiu");
		menuBar.add(mnArxiu);
		/**
		 * textArea per Treballadors
		 */
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBounds(25, 119, 769, 330);
		frame.getContentPane().add(textArea);
		
		/**
		 * textArea per Impresores
		 */
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(25, 119, 769, 330);
		textArea.setLineWrap(true);
		frame.getContentPane().add(textArea_1);
		
		
		
		JButton btnOrdenarPerNomTreballador = new JButton("Ordenar per nom");
		btnOrdenarPerNomTreballador.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String contingut="";
				Collections.sort(LlistaTreballadors, new CompareNomTreballador());
				textArea.setText("");
				Iterator <Treballdor> itr;
				itr=LlistaTreballadors.iterator();
				while(itr.hasNext()){
					contingut = contingut + itr.next() + "\n";
				}
				textArea.setText(contingut);
				
			}
			
		});
		btnOrdenarPerNomTreballador.setBounds(25, 52, 162, 29);
		
		
		
		frame.getContentPane().add(btnOrdenarPerNomTreballador);
		
		JButton btnOrdenarPerNomImpresora = new JButton("Ordenar per nom");
		btnOrdenarPerNomImpresora.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			
				String contingut ="";
				Collections.sort(LlistaImpresores, new CompareNomImpresores());
				textArea_1.setText("");
				Iterator <Impresora> itr;
				itr=LlistaImpresores.iterator();
				
				while(itr.hasNext()) {
					contingut= contingut + itr.next() + "\n";
				}
				textArea_1.setText(contingut);
			}
			
			
			
		});
		btnOrdenarPerNomImpresora.setBounds(25, 52, 162, 29);
		frame.getContentPane().add(btnOrdenarPerNomImpresora);
		
		JButton btnOrdenarPerEstat = new JButton("Ordenar per Estat");
		btnOrdenarPerEstat.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String contingut ="";
				Collections.sort(LlistaImpresores, new CompareEstatImpresores());
				textArea_1.setText("");
				Iterator <Impresora> itr;
				itr=LlistaImpresores.iterator();
				
				while(itr.hasNext()) {
					contingut= contingut + itr.next() + "\n";
				}
				textArea_1.setText(contingut);
			}
			
		});
		btnOrdenarPerEstat.setBounds(197, 52, 153, 29);
		frame.getContentPane().add(btnOrdenarPerEstat);
		
		
		JLabel lblNewLabel = new JLabel("Dni | Nom | Cognom");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(30, 99, 291, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codi impresora | Nom assignat | Estat | Marca | Model | Bobina carregada");
		lblNewLabel_1.setBounds(30, 99, 427, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(25, 92, 769, 29);
		frame.getContentPane().add(panel);
		
		textArea.show(false);
		textArea_1.show(false);
		btnOrdenarPerNomTreballador.show(false);
		btnOrdenarPerNomImpresora.show(false);
		btnOrdenarPerEstat.show(false);
		lblNewLabel.show(false);
		lblNewLabel_1.show(false);
		panel.show(false);
		
		
		JMenuItem mntmCargarImpresores = new JMenuItem("Cargar Impresores");
		mntmCargarImpresores.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				LlistaImpresores.clear();
				lblNewLabel.show(false);
				lblNewLabel_1.show(true);
				btnOrdenarPerNomImpresora.show(true);
				btnOrdenarPerEstat.show(true);
				btnOrdenarPerNomTreballador.show(false);
				textArea.show(false);
				textArea_1.show(true);
				panel.show(true);
				
				File ficher;
				String linia;
				String contingut="";
				
				ficher = openFile();

				textArea_1.setText("");
				try {
					FileReader fr = new FileReader(ficher);
					BufferedReader br = new BufferedReader(fr);
					while((linia=br.readLine())!=null){
						List <String> l=Arrays.asList(linia.split("\\|"));
						
						Impresora p = new Impresora(l.get(0),l.get(1),l.get(2),l.get(3),l.get(4),l.get(5));
						System.out.println(p);
						LlistaImpresores.add(p);
						
					}
					fr.close();
					br.close();
					Iterator <Impresora> itr;
					itr=LlistaImpresores.iterator();
					while(itr.hasNext()){
						contingut = contingut + itr.next() + "\n";
					}

					
				} catch (IOException o) {
					// TODO Auto-generated catch block
					o.printStackTrace();
				}finally{
					textArea_1.setText("");
					textArea_1.setText(contingut);
				}			
			}
			
		});
		mnArxiu.add(mntmCargarImpresores);
		
		
		
		JMenuItem mntmCargarTreballadors = new JMenuItem("Cargar Treballadors");
		mntmCargarTreballadors.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				LlistaTreballadors.clear();
				lblNewLabel.show(true);
				lblNewLabel_1.show(false);
				btnOrdenarPerNomImpresora.show(false);
				btnOrdenarPerNomTreballador.show(true);
				btnOrdenarPerEstat.show(false);
				textArea.show(true);
				textArea_1.show(false);
				panel.show(true);
				
				File ficher;
				String linia;
				String contingut="";
				
				ficher = openFile();

				textArea.setText("");
				try {
					FileReader fr = new FileReader(ficher);
					BufferedReader br = new BufferedReader(fr);
					while((linia=br.readLine())!=null){
						List <String> l=Arrays.asList(linia.split("\\|"));
						
						Treballdor p = new Treballdor(l.get(0),l.get(1),l.get(2));
						System.out.println(p);
						LlistaTreballadors.add(p);
			
					}
					fr.close();
					br.close();
					Iterator <Treballdor> itr;
					itr=LlistaTreballadors.iterator();
					while(itr.hasNext()){
						contingut = contingut + itr.next() + "\n";
					}		
				} catch (IOException o) {
					// TODO Auto-generated catch block
					o.printStackTrace();
				}finally{
					textArea.setText("");
					textArea.setText(contingut);
				}
			}
			
		});
		mnArxiu.add(mntmCargarTreballadors);
		
		JMenuItem mntmSortir = new JMenuItem("Sortir");
		mntmSortir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnArxiu.add(mntmSortir);
				
				
		
		frame.getContentPane().setLayout(null);
		
		JButton btnTreballadors = new JButton("Treballadors");
		btnTreballadors.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.show(true);
				textArea_1.show(false);
				btnOrdenarPerNomTreballador.show(true);
				btnOrdenarPerNomImpresora.show(false);
				btnOrdenarPerEstat.show(false);
				lblNewLabel.show(true);
				lblNewLabel_1.show(false);
				panel.show(true);
				
			}
			
		});
		btnTreballadors.setBounds(0, 0, 107, 23);
		frame.getContentPane().add(btnTreballadors);
		
		JButton btnImpresores = new JButton("Impresores");
		btnImpresores.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea.show(false);
				textArea_1.show(true);
				btnOrdenarPerNomTreballador.show(false);
				btnOrdenarPerNomImpresora.show(true);
				btnOrdenarPerEstat.show(true);
				lblNewLabel.show(false);
				lblNewLabel_1.show(true);
				panel.show(true);
			}
			
		});
		btnImpresores.setBounds(105, 0, 107, 23);
		frame.getContentPane().add(btnImpresores);

	}
	public File saveFile(){
		File file;
		JFileChooser fileChooser2=new JFileChooser();
		fileChooser2.showSaveDialog(this);
		file=fileChooser2.getSelectedFile();
		return file;
	}
	
	public File openFile(){
		JFileChooser fileChooser=new JFileChooser();
		File file;
		fileChooser.showOpenDialog(this);
		file=fileChooser.getSelectedFile();
		return file;
		
	}
}

