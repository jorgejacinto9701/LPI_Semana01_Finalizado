package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Frame;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class FrmInicio extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuItem mntmCliente;
	private JMenuItem mntmVisitante;
	private JMenuItem mntmVisita;
	private JMenuItem mntmConsultaVisita;
	private JMenuItem mntmReporteDeuda;
	
	//paso1
	private FrmCliente frmCliente = new FrmCliente();
	private FrmVisita frmVisita = new FrmVisita();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
					//UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
					UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
					FrmInicio frame = new FrmInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmInicio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmInicio.class.getResource("/iconos/Address book.gif")));
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Sistema de gesti\u00F3n de edificios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1140, 560);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAdministracion = new JMenu("Administraci\u00F3n");
		mnAdministracion.setIcon(new ImageIcon(FrmInicio.class.getResource("/iconos/Add to basket.gif")));
		menuBar.add(mnAdministracion);
		
		mntmCliente = new JMenuItem("Cliente");
		mntmCliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.ALT_DOWN_MASK));
		mntmCliente.addActionListener(this);
		mntmCliente.setIcon(new ImageIcon(FrmInicio.class.getResource("/iconos/Bomb.gif")));
		mnAdministracion.add(mntmCliente);
		
		mntmVisitante = new JMenuItem("Visitante");
		mntmVisitante.addActionListener(this);
		mntmVisitante.setIcon(new ImageIcon(FrmInicio.class.getResource("/iconos/Remove from basket.gif")));
		mnAdministracion.add(mntmVisitante);
		
		mntmVisita = new JMenuItem("Visita");
		mntmVisita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.ALT_DOWN_MASK));
		mntmVisita.addActionListener(this);
		mntmVisita.setIcon(new ImageIcon(FrmInicio.class.getResource("/iconos/Genealogy.gif")));
		mnAdministracion.add(mntmVisita);
		
		JMenu mnConsultas = new JMenu("Consultas");
		mnConsultas.setIcon(new ImageIcon(FrmInicio.class.getResource("/iconos/Anchor.gif")));
		menuBar.add(mnConsultas);
		
		mntmConsultaVisita = new JMenuItem("Visitas diarias");
		mntmConsultaVisita.addActionListener(this);
		mntmConsultaVisita.setIcon(new ImageIcon(FrmInicio.class.getResource("/iconos/Bar chart.gif")));
		mnConsultas.add(mntmConsultaVisita);
		
		JMenu mnReportes = new JMenu("Reportes");
		mnReportes.setIcon(new ImageIcon(FrmInicio.class.getResource("/iconos/Bookmark.gif")));
		menuBar.add(mnReportes);
		
		mntmReporteDeuda = new JMenuItem("Reportes de deudas");
		mntmReporteDeuda.addActionListener(this);
		mntmReporteDeuda.setIcon(new ImageIcon(FrmInicio.class.getResource("/iconos/Unordered list.gif")));
		mnReportes.add(mntmReporteDeuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.activeCaption);
		
		//Paso2
		desktopPane.add(frmCliente);
		desktopPane.add(frmVisita);
		
		contentPane.add(desktopPane, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmReporteDeuda) {
			actionPerformedMntmNewMenuItem_4JMenuItem(e);
		}
		if (e.getSource() == mntmConsultaVisita) {
			actionPerformedMntmNewMenuItem_3JMenuItem(e);
		}
		if (e.getSource() == mntmVisita) {
			actionPerformedMntmNewMenuItem_2JMenuItem(e);
		}
		if (e.getSource() == mntmVisitante) {
			actionPerformedMntmNewMenuItem_1JMenuItem(e);
		}
		if (e.getSource() == mntmCliente) {
			actionPerformedMntmNewMenuItemJMenuItem(e);
		}
	}
	
	protected void actionPerformedMntmNewMenuItemJMenuItem(ActionEvent e) {
		//paso3
		frmCliente.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_1JMenuItem(ActionEvent e) {
	}
	protected void actionPerformedMntmNewMenuItem_2JMenuItem(ActionEvent e) {
		//paso3
		frmVisita.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_3JMenuItem(ActionEvent e) {
	}
	protected void actionPerformedMntmNewMenuItem_4JMenuItem(ActionEvent e) {
	}
}
