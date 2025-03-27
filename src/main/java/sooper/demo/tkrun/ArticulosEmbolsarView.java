package sooper.demo.tkrun;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;



public class ArticulosEmbolsarView {
	

	private ArticulosEmbolsarController controller;
	private JTable artEmbTable;
	private DefaultTableModel tableModel;
	
	
	
	 public ArticulosEmbolsarView(ArticulosEmbolsarController c2) {
			this.controller = controller;
			initialize();
			
	} 




	private void initialize() {
		
		
		
		JFrame frmArtEmb = new JFrame();
		frmArtEmb.setBounds(50, 50, 400, 500);	
		frmArtEmb.getContentPane().setLayout(null);
		
		JLabel titleLabel = new JLabel("Articulos a Embolsar");
		titleLabel.setBounds(10, 11, 364, 21);
		frmArtEmb.getContentPane().add(titleLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 39, 364, 377);
		frmArtEmb.getContentPane().add(scrollPane);
		
		artEmbTable = new JTable();
		tableModel = new DefaultTableModel(new Object[]{"idArticulo", "idContenedor"}, 0);
		artEmbTable.setModel(tableModel);
		scrollPane.setViewportView(artEmbTable);
		
		JButton añadirArtBtn = new JButton("Añadir Articulo");
		añadirArtBtn.setBounds(10, 427, 143, 23);
		frmArtEmb.getContentPane().add(añadirArtBtn);

		frmArtEmb.setVisible(true);
	
	}
}
