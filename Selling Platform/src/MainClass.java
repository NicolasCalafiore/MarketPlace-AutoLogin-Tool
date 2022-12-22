
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.formdev.flatlaf.FlatLightLaf;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

import io.github.bonigarcia.wdm.WebDriverManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingUtilities;

import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JComboBox;



public class MainClass {
	volatile static boolean pauseState = false;
	volatile static boolean historyPauseState = false;
	volatile static boolean sellingPauseState = false;
	volatile static boolean accountPauseState = false;
	private static JTextField textField;
	private static JTextField textField_1;
	
	
	
	public static void main (String args[]) throws InterruptedException, IOException {
				 

		
		
		windowInitialization();
		

	}

	static void windowInitialization() throws InterruptedException, IOException {
		FlatLightLaf.setup();
		

		
		
		JFrame frame = new JFrame("Multi-Platform Selling");
		frame.setBounds(0, 0, 1200,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel backgroundPanel = new JPanel();
		backgroundPanel.setBackground(new Color(135, 206, 250));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(backgroundPanel, GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(backgroundPanel, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
		);
		
		JPanel leftSideBar = new JPanel();
		leftSideBar.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		leftSideBar.setBackground(new Color(135, 206, 250));
		
		JPanel cardBoard = new JPanel();
		cardBoard.setBackground(new Color(135, 206, 250));
		GroupLayout gl_backgroundPanel = new GroupLayout(backgroundPanel);
		gl_backgroundPanel.setHorizontalGroup(
			gl_backgroundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_backgroundPanel.createSequentialGroup()
					.addComponent(leftSideBar, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addGap(0)
					.addComponent(cardBoard, GroupLayout.DEFAULT_SIZE, 1096, Short.MAX_VALUE))
		);
		gl_backgroundPanel.setVerticalGroup(
			gl_backgroundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_backgroundPanel.createSequentialGroup()
					.addGroup(gl_backgroundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(leftSideBar, GroupLayout.PREFERRED_SIZE, 759, Short.MAX_VALUE)
						.addComponent(cardBoard, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(Color.WHITE);
		GroupLayout gl_leftSideBar = new GroupLayout(leftSideBar);
		gl_leftSideBar.setHorizontalGroup(
			gl_leftSideBar.createParallelGroup(Alignment.LEADING)
				.addComponent(sidePanel, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
		);
		gl_leftSideBar.setVerticalGroup(
			gl_leftSideBar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_leftSideBar.createSequentialGroup()
					.addComponent(sidePanel, GroupLayout.PREFERRED_SIZE, 761, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(61, Short.MAX_VALUE))
		);
		sidePanel.setLayout(new GridLayout(8, 0, 0, 10));
		
		ImageIcon userIcon = new ImageIcon("lib/Resources/icons8_Male_User_128px.png"); 
		ImageIcon sellIcon = new ImageIcon("lib/Resources/icons8_return_purchase_80px.png"); 
		ImageIcon settingsIcon = new ImageIcon("lib/Resources/icons8_user_settings_48px.png"); 
		ImageIcon historyIcon = new ImageIcon("lib/Resources/icons8_historical_48px.png");
		
		JPanel cardboard_selling = new JPanel();
		cardboard_selling.setBackground(new Color(135, 206, 250));
		cardBoard.add(cardboard_selling, "name_92297407167100");
		
		JPanel selling_titlePanel = new JPanel();
		selling_titlePanel.setBackground(new Color(135, 206, 250));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(160, 160, 160)), "Select Websites", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(135, 206, 250));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(160, 160, 160)), "General Information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panel_3 = new JPanel();
		panel_3.setVisible(false);
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(160, 160, 160)), "Facebook", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBackground(new Color(135, 206, 250));
		GroupLayout gl_cardboard_selling = new GroupLayout(cardboard_selling);
		gl_cardboard_selling.setHorizontalGroup(
			gl_cardboard_selling.createParallelGroup(Alignment.LEADING)
				.addComponent(selling_titlePanel, GroupLayout.DEFAULT_SIZE, 1102, Short.MAX_VALUE)
				.addGroup(gl_cardboard_selling.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 577, GroupLayout.PREFERRED_SIZE)
					.addGap(350))
				.addGroup(gl_cardboard_selling.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(790, Short.MAX_VALUE))
		);
		gl_cardboard_selling.setVerticalGroup(
			gl_cardboard_selling.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cardboard_selling.createSequentialGroup()
					.addComponent(selling_titlePanel, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_cardboard_selling.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addGap(222))
		);
		

		char expandKey = '\u00bb';
		ArrayList<String> fbm_categoryFirstLayerArr = new ArrayList<String>();
		fbm_categoryFirstLayerArr.add("Antiques & Collectibles " + expandKey);
		fbm_categoryFirstLayerArr.add("Arts & Crafts " + expandKey);
		fbm_categoryFirstLayerArr.add("Auto Parts & Accessories " + expandKey);
		fbm_categoryFirstLayerArr.add("Baby Products " + expandKey);
		fbm_categoryFirstLayerArr.add("Books, Movies & Music " + expandKey);
		fbm_categoryFirstLayerArr.add("Cell Phones & Accessories " + expandKey);
		fbm_categoryFirstLayerArr.add("Clothing, Shoes & Accessories " + expandKey);
		fbm_categoryFirstLayerArr.add("Electronics " + expandKey);
		fbm_categoryFirstLayerArr.add("Furniture " + expandKey);
		fbm_categoryFirstLayerArr.add("Health & Beauty " + expandKey);
		fbm_categoryFirstLayerArr.add("Home & Kitchen " + expandKey);
		fbm_categoryFirstLayerArr.add("Jewelry & Watches " + expandKey);
		fbm_categoryFirstLayerArr.add("Miscellaneous");
		fbm_categoryFirstLayerArr.add("Music Instruments " + expandKey);
		fbm_categoryFirstLayerArr.add("Office Supplies " + expandKey);
		fbm_categoryFirstLayerArr.add("Patio & Garden " + expandKey);
		fbm_categoryFirstLayerArr.add("Pet Supplies " + expandKey);
		fbm_categoryFirstLayerArr.add("Sporting Goods " + expandKey);
		fbm_categoryFirstLayerArr.add("Tools & Home Improvement " + expandKey);
		fbm_categoryFirstLayerArr.add("Toys & Games " + expandKey);
		fbm_categoryFirstLayerArr.add("Bags & Luggage " + expandKey);
		fbm_categoryFirstLayerArr.add("Video Games & Consoles " + expandKey);
		
		ArrayList<String> fbm_categoryAntiquesCollectible = new ArrayList<String>();
		fbm_categoryAntiquesCollectible.add("Antique & Collectible Appliances " + expandKey);
		fbm_categoryAntiquesCollectible.add("Antique & Collectible Electronics " + expandKey);
		fbm_categoryAntiquesCollectible.add("Antique & Collectible Furniture " + expandKey);
		fbm_categoryAntiquesCollectible.add("Antique & Collectible Furniture " + expandKey);
		fbm_categoryAntiquesCollectible.add("Antique & Collectible Home Goods ");
		fbm_categoryAntiquesCollectible.add("Antique & Collectible Stamps ");
		fbm_categoryAntiquesCollectible.add("Antique & Collectible Toys ");
		fbm_categoryAntiquesCollectible.add("Coins & Paper Money " + expandKey);
		fbm_categoryAntiquesCollectible.add("Paper Ephemera " + expandKey);
		fbm_categoryAntiquesCollectible.add("Sports Memorabilia " + expandKey);
		
		ArrayList<String> fbm_categoryArtsCrafts = new ArrayList<String>();
		fbm_categoryArtsCrafts.add("Art Supplies " + expandKey);
		fbm_categoryArtsCrafts.add("Beading & Jewelry Making " + expandKey);
		fbm_categoryArtsCrafts.add("Craft Supplies " + expandKey);
		fbm_categoryArtsCrafts.add("Needlecrafts & Yarn " + expandKey);
		fbm_categoryArtsCrafts.add("Sewing " + expandKey);
	
		ArrayList<String> fbm_categoryAutoPartsAccessories = new ArrayList<String>();
		fbm_categoryAutoPartsAccessories.add("Automotive Tools");
		fbm_categoryAutoPartsAccessories.add("Boat Parts & Accessories");
		fbm_categoryAutoPartsAccessories.add("Car Parts & Accessoires");
		fbm_categoryAutoPartsAccessories.add("Motorcycle Parts & Accessories");
		fbm_categoryAutoPartsAccessories.add("Powersports Parts & Accessories");
		fbm_categoryAutoPartsAccessories.add("RV & Camper Parts & Accessories");
		fbm_categoryAutoPartsAccessories.add("Trailer Parts & Accessories");
		fbm_categoryAutoPartsAccessories.add("Other Auto Parts & Accessories");
		
		ArrayList<String> fbm_categoryBabyProducts = new ArrayList<String>();
		fbm_categoryBabyProducts.add("Activity Centers & Entertainers " + expandKey);
		fbm_categoryBabyProducts.add("Baby Bathing " + expandKey);
		fbm_categoryBabyProducts.add("Baby Carriers " + expandKey);
		fbm_categoryBabyProducts.add("Baby Clothing & Shoes " + expandKey);
		fbm_categoryBabyProducts.add("Baby Health " + expandKey);
		fbm_categoryBabyProducts.add("Baby Safety " + expandKey);
		fbm_categoryBabyProducts.add("Baby Toys " + expandKey);
		fbm_categoryBabyProducts.add("Car Seats & Acccessories " + expandKey);
		fbm_categoryBabyProducts.add("Diapering " + expandKey);
		fbm_categoryBabyProducts.add("Feeding " + expandKey);
		fbm_categoryBabyProducts.add("Nursery Bedding " + expandKey);
		fbm_categoryBabyProducts.add("Nursery Furniture " + expandKey);
		fbm_categoryBabyProducts.add("Potty Training " + expandKey);
		fbm_categoryBabyProducts.add("Strollers & Accessories " + expandKey);
		
		ArrayList<String> fbm_categoryBooksMoviesMusic = new ArrayList<String>();
		fbm_categoryBooksMoviesMusic.add("Books");
		fbm_categoryBooksMoviesMusic.add("Magazines & Catalogs");
		fbm_categoryBooksMoviesMusic.add("Movies & TV Shows");
		fbm_categoryBooksMoviesMusic.add("Music");
		fbm_categoryBooksMoviesMusic.add("Newspaper");
		fbm_categoryBooksMoviesMusic.add("Other Books, Movies & Music");
		
		ArrayList<String> fbm_categoryCellPhonesAccessories = new ArrayList<String>();
		fbm_categoryCellPhonesAccessories.add("Cell Phone Accessories " + expandKey);
		fbm_categoryCellPhonesAccessories.add("Cell Phones");
		fbm_categoryCellPhonesAccessories.add("Smart Watch Accessories " + expandKey);
		fbm_categoryCellPhonesAccessories.add("Smart Watches");
		
		ArrayList<String> fbm_categoryClothingShoesAccessories = new ArrayList<String>();
		fbm_categoryClothingShoesAccessories.add("Baby Clothing & Shoes " + expandKey);
		fbm_categoryClothingShoesAccessories.add("Kids Clothing & Shoes " + expandKey);
		fbm_categoryClothingShoesAccessories.add("Mens Accessories " + expandKey);
		fbm_categoryClothingShoesAccessories.add("Mens Clothing " + expandKey);
		fbm_categoryClothingShoesAccessories.add("Mens Shoes " + expandKey);
		fbm_categoryClothingShoesAccessories.add("Womens Accessories " + expandKey);
		fbm_categoryClothingShoesAccessories.add("Womens Clothing " + expandKey);
		fbm_categoryClothingShoesAccessories.add("Womens Handbags " + expandKey);
		fbm_categoryClothingShoesAccessories.add("Womens Shoes " + expandKey);
		fbm_categoryClothingShoesAccessories.add("Jewelry & Watches " + expandKey);
		
		ArrayList<String> fbm_categoryElectronics = new ArrayList<String>();
		fbm_categoryElectronics.add("Batteries & Power");
		fbm_categoryElectronics.add("Blank Media");
		fbm_categoryElectronics.add("Cameras & Acceessories");
		fbm_categoryElectronics.add("Cell Phones & Accessories");
		fbm_categoryElectronics.add("Computers, Laptops & Tablets");
		fbm_categoryElectronics.add("Home Audio & Video");
		fbm_categoryElectronics.add("Home Security & Automation");
		fbm_categoryElectronics.add("Networking & Servers");
		fbm_categoryElectronics.add("Portable Audio & Video");
		fbm_categoryElectronics.add("Printers & Scanners");
		fbm_categoryElectronics.add("Pro Audio Equipment");
		fbm_categoryElectronics.add("Software");
		fbm_categoryElectronics.add("Video Games & Consoles");
		
		ArrayList<String> fbm_categoryFurniture = new ArrayList<String>();
		fbm_categoryFurniture.add("Bedroom Furniture");
		fbm_categoryFurniture.add("Dining Room Furniture");
		fbm_categoryFurniture.add("Living Room Furniture");
		fbm_categoryFurniture.add("Nursery Furniture");
		fbm_categoryFurniture.add("Office Furniture");
		fbm_categoryFurniture.add("Outdoor Furniture");
		fbm_categoryFurniture.add("Armoires & Wardrobes");
		fbm_categoryFurniture.add("Beds & Bed Frames");
		fbm_categoryFurniture.add("Benches");
		fbm_categoryFurniture.add("Bookcases");
		fbm_categoryFurniture.add("Coffee Tables");
		fbm_categoryFurniture.add("Dressers");
		fbm_categoryFurniture.add("Mattresses");
		fbm_categoryFurniture.add("Sofas, Loveseats & Sectionals");
		fbm_categoryFurniture.add("TV Stands");
		fbm_categoryFurniture.add("Wall Shelves & Ledges");
		
		ArrayList<String> fbm_categoryHealthBeauty = new ArrayList<String>();
		fbm_categoryHealthBeauty.add("Beauty");
		fbm_categoryHealthBeauty.add("Health Care");
		fbm_categoryHealthBeauty.add("Message");
		fbm_categoryHealthBeauty.add("Oral Care");
		fbm_categoryHealthBeauty.add("Shaving & Hair Removal");
		fbm_categoryHealthBeauty.add("Vision Care");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JComboBox fbm_categoryFouthLayerCombo = new JComboBox();
		JComboBox fbm_categoryThirdLayerCombo = new JComboBox();
		JComboBox<String> fbm_categorySecondLayerCombo = new JComboBox<String>();
		JComboBox<String> fbm_categoryRootCombo = new JComboBox<String>();
		
		fbm_categoryRootCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fbm_categorySecondLayerCombo.removeAllItems();
				String rootCategory = fbm_categoryRootCombo.getSelectedItem().toString();
				System.out.println("rootCategory: " + rootCategory);;
				int rootIdentifier = 0;
				
				for(int x = 0; x < fbm_categoryFirstLayerArr.size() - 1; x++) {
					if(fbm_categoryFirstLayerArr.get(x).equals(rootCategory)) break;
					else rootIdentifier++;
				}
				
				System.out.println("rootIdentifier: " + rootIdentifier);
				if(rootIdentifier == 0) {
					for (String x : fbm_categoryAntiquesCollectible) {
						fbm_categorySecondLayerCombo.addItem(x);
					}
					
				}
				System.out.println("rootIdentifier: " + rootIdentifier);
				if(rootIdentifier == 1) {
					for (String x : fbm_categoryArtsCrafts) {
						fbm_categorySecondLayerCombo.addItem(x);
					}
					
				}
				
				
			}
		});
		
		
		
		
		for(int x = 0; x < fbm_categoryFirstLayerArr.size(); x++) {
			fbm_categoryRootCombo.addItem(fbm_categoryFirstLayerArr.get(x));
		}
		
		
		
		
		
		
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(fbm_categorySecondLayerCombo, 0, 270, Short.MAX_VALUE)
						.addComponent(fbm_categoryRootCombo, 0, 270, Short.MAX_VALUE)
						.addComponent(fbm_categoryThirdLayerCombo, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
						.addComponent(fbm_categoryFouthLayerCombo, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(fbm_categoryRootCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(fbm_categorySecondLayerCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(fbm_categoryThirdLayerCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(fbm_categoryFouthLayerCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		JLabel lblNewLabel = new JLabel("Title:");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		
		JLabel lblGeneralDetails = new JLabel("General Details");
		lblGeneralDetails.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(160, 160, 160)), "Condition", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setLayout(new GridLayout(5, 1, 0, 5));
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Still in Package");
		panel_2.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("Never Used");
		panel_2.add(chckbxNewCheckBox_2_1);
		
		JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("Like New");
		panel_2.add(chckbxNewCheckBox_3_1);
		
		JCheckBox chckbxFair = new JCheckBox("Fair");
		panel_2.add(chckbxFair);
		
		JCheckBox chckbxNewCheckBox_4_1 = new JCheckBox("Used");
		panel_2.add(chckbxNewCheckBox_4_1);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JCheckBox fbmCB = new JCheckBox("Facebook Marketplace");
		fbmCB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fbmCB.isSelected()) {
					panel_3.setVisible(true);
				}
				else {
					panel_3.setVisible(false);
				}
			}
		});
		panel.add(fbmCB);
		
		JCheckBox cCB = new JCheckBox("Craigslist");
		panel.add(cCB);
		
		JCheckBox eCB = new JCheckBox("Ebay");
		panel.add(eCB);
		
		JCheckBox ndCB = new JCheckBox("NextDoor");
		panel.add(ndCB);
		
		JCheckBox fCB = new JCheckBox("Facebook");
		panel.add(fCB);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				EdgeOptions chromeOptions = new EdgeOptions();
				WebDriverManager.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				driver.manage().window().minimize();
				//offerupLogin(driver);
				String title = textField.getText();
				String price = textField_1.getText();
				
				if(eCB.isSelected()) {
					ebayLogin(driver);
				}
				if(cCB.isSelected()) {
					craigslistLogin(driver);
				}
				if(ndCB.isSelected()) {
					nextDoor(driver);
				}
				if(fbmCB.isSelected()) {
					facebookLogin(driver, title, price);
				}
				
				
				
				
				
				
				
				
				
				}catch(Exception webDriverError) {}
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
						.addComponent(lblGeneralDetails)
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 10, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblPrice)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton))
						.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(lblGeneralDetails, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(new GridLayout(5, 1, 0, 5));
		
		
		selling_titlePanel.setLayout(new BoxLayout(selling_titlePanel, BoxLayout.X_AXIS));
		
		JLabel titlePanel_TitleJlabel = new JLabel("<html> &nbsp; Upload & Publish </html>");
		titlePanel_TitleJlabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 21));
		selling_titlePanel.add(titlePanel_TitleJlabel);
		titlePanel_TitleJlabel.setBorder(null);
		
		JLabel titlePanel_NullJlabel = new JLabel("                                                                                                                                                                                                                                                                                                       ");
		selling_titlePanel.add(titlePanel_NullJlabel);
		cardboard_selling.setLayout(gl_cardboard_selling);
		backgroundPanel.setLayout(gl_backgroundPanel);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);


		
		
		JButton nullButton1 = new JButton("");
		sidePanel.add(nullButton1);
		nullButton1.setVisible(false);
		
		JButton nullButton2 = new JButton("");
		sidePanel.add(nullButton2);
		nullButton2.setVisible(false);
		
		JButton accountButton = new JButton(userIcon);//
		accountButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sidePanel.add(accountButton);
		accountButton.setBackground(Color.white);
		accountButton.setBorderPainted(false);
		accountButton.setFocusPainted(false);
		accountButton.setContentAreaFilled(false);

		JButton sellButton = new JButton(sellIcon);
		sellButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	    		cardBoard.removeAll();
	    		cardBoard.add(cardboard_selling);
	    		cardBoard.repaint();
	    		cardBoard.revalidate();
			}
		});
		sidePanel.add(sellButton);
		
		sellButton.setBackground(Color.white);
		sellButton.setBorderPainted(false);
		sellButton.setFocusPainted(false);
		sellButton.setContentAreaFilled(false);
	
		
		
		JButton accountsButton = new JButton(settingsIcon);
		accountsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sidePanel.add(accountsButton);
		
		accountsButton.setBackground(Color.white);
		accountsButton.setBorderPainted(false);
		accountsButton.setFocusPainted(false);
		accountsButton.setContentAreaFilled(false);

		JButton listButton = new JButton(historyIcon);
		listButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sidePanel.add(listButton);
		leftSideBar.setLayout(gl_leftSideBar);
		
		listButton.setBackground(Color.white);
		listButton.setBorderPainted(false);
		listButton.setFocusPainted(false);
		listButton.setContentAreaFilled(false);
		
		cardBoard.setLayout(new CardLayout(0, 0));
		

		
		
		
		
		
		
		
	
		 
			class settingsRollover implements Runnable {
			   public void run(){
		    	   while(true) {
		    	   while(pauseState) {
			    	   ImageIcon frame1 = new ImageIcon("lib/Animations/linkedAccounts/1.png");
			    	   ImageIcon frame2 = new ImageIcon("lib/Animations/linkedAccounts/2.png");
			    	   ImageIcon frame3 = new ImageIcon("lib/Animations/linkedAccounts/3.png");
			    	   ImageIcon frame4 = new ImageIcon("lib/Animations/linkedAccounts/4.png");
			    	   ImageIcon frame5 = new ImageIcon("lib/Animations/linkedAccounts/5.png");
			    	   ImageIcon frame6 = new ImageIcon("lib/Animations/linkedAccounts/6.png");
			    	   ImageIcon frame7 = new ImageIcon("lib/Animations/linkedAccounts/7.png");
			    	   ImageIcon frame8 = new ImageIcon("lib/Animations/linkedAccounts/8.png");
			    	   ImageIcon frame9 = new ImageIcon("lib/Animations/linkedAccounts/9.png");
			    	   ImageIcon frame10 = new ImageIcon("lib/Animations/linkedAccounts/10.png");
			    	   ImageIcon frame11 = new ImageIcon("lib/Animations/linkedAccounts/11.png");
			    	   ImageIcon frame12 = new ImageIcon("lib/Animations/linkedAccounts/12.png");
			    	   ImageIcon frame13 = new ImageIcon("lib/Animations/linkedAccounts/13.png");
			    	   ImageIcon frame14 = new ImageIcon("lib/Animations/linkedAccounts/14.png");
			    	   ImageIcon frame15 = new ImageIcon("lib/Animations/linkedAccounts/15.png");
			    	   ImageIcon frame16 = new ImageIcon("lib/Animations/linkedAccounts/16.png");
			    	   ImageIcon frame17 = new ImageIcon("lib/Animations/linkedAccounts/17.png");
			    	   
			    	   int x = 10;
			    	   try {
			    	    accountsButton.setIcon(frame1);
						Thread.sleep(x);
			    	    accountsButton.setIcon(frame2);
						Thread.sleep(x);
			    	    accountsButton.setIcon(frame3);
						Thread.sleep(x);
			    	    accountsButton.setIcon(frame4);
						Thread.sleep(x);
			    	    accountsButton.setIcon(frame5);
						Thread.sleep(x);
			    	    //lblNewLabel_2.setIcon(frame6);
						//Thread.sleep(x);
			    	    accountsButton.setIcon(frame7);
						Thread.sleep(x);
			    	    accountsButton.setIcon(frame8);
						Thread.sleep(x);
			    	    accountsButton.setIcon(frame9);
						Thread.sleep(x);
			    	    accountsButton.setIcon(frame10);
						Thread.sleep(x);
			    	    accountsButton.setIcon(frame11);
						Thread.sleep(x);
			    	    accountsButton.setIcon(frame12);
						Thread.sleep(x);
			    	    accountsButton.setIcon(frame13);
						Thread.sleep(x);
			    	    accountsButton.setIcon(frame14);
						Thread.sleep(x);
			    	    accountsButton.setIcon(frame15);
						Thread.sleep(x);
			    	    accountsButton.setIcon(frame16);
						Thread.sleep(x);
			    	    accountsButton.setIcon(frame17);
						Thread.sleep(x);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	   pauseState = false;
			    	 
		    		   
		    	   }
		    	   }
		       }
		       }
			 
  		Thread settingsRolloverAnimation = new Thread(new settingsRollover());
		//settingsRolloverAnimation.start();

		accountsButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						pauseState = true;
					}
				});
		
		sellButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				sellingPauseState = true;
			}
		});
		
		listButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				historyPauseState = true;
			}
		});

		accountButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				accountPauseState = true;
			}
		});
		
		
			 class historyRollover implements Runnable {
			   public void run(){
		    	   while(true) {
		    	   while(historyPauseState) {
			    	   ImageIcon frame1 = new ImageIcon("lib/Animations/history/1.png");
			    	   ImageIcon frame2 = new ImageIcon("lib/Animations/history/2.png");
			    	   ImageIcon frame3 = new ImageIcon("lib/Animations/history/3.png");
			    	   ImageIcon frame4 = new ImageIcon("lib/Animations/history/4.png");
			    	   ImageIcon frame5 = new ImageIcon("lib/Animations/history/5.png");
			    	   ImageIcon frame6 = new ImageIcon("lib/Animations/history/6.png");
			    	   ImageIcon frame7 = new ImageIcon("lib/Animations/history/7.png");
			    	   ImageIcon frame8 = new ImageIcon("lib/Animations/history/8.png");
			    	   ImageIcon frame9 = new ImageIcon("lib/Animations/history/9.png");
			    	   ImageIcon frame10 = new ImageIcon("lib/Animations/history/10.png");
			    	   ImageIcon frame11 = new ImageIcon("lib/Animations/history/11.png");
			    	   ImageIcon frame12 = new ImageIcon("lib/Animations/history/12.png");
			    	   ImageIcon frame13 = new ImageIcon("lib/Animations/history/13.png");
			    	   ImageIcon frame14 = new ImageIcon("lib/Animations/history/14.png");
			    	   ImageIcon frame15 = new ImageIcon("lib/Animations/history/15.png");
			    	   ImageIcon frame16 = new ImageIcon("lib/Animations/history/16.png");
			    	   ImageIcon frame17 = new ImageIcon("lib/Animations/history/17.png");
			    	   ImageIcon frame18 = new ImageIcon("lib/Animations/history/18.png");
			    	   ImageIcon frame19 = new ImageIcon("lib/Animations/history/19.png");
			    	   ImageIcon frame20 = new ImageIcon("lib/Animations/history/20.png");
			    	   ImageIcon frame21 = new ImageIcon("lib/Animations/history/21.png");
			    	   ImageIcon frame22 = new ImageIcon("lib/Animations/history/22.png");
			    	   ImageIcon frame23 = new ImageIcon("lib/Animations/history/23.png");
			    	   ImageIcon frame24 = new ImageIcon("lib/Animations/history/24.png");
			    	   
			    	   int x = 25;
			    	   try {
			    		   listButton.setIcon(frame1);
						Thread.sleep(x);
			    	    listButton.setIcon(frame2);
						Thread.sleep(x);
			    	    listButton.setIcon(frame3);
						Thread.sleep(x);
			    	    listButton.setIcon(frame4);
						Thread.sleep(x);
			    	    listButton.setIcon(frame5);
						Thread.sleep(x);
			    	    listButton.setIcon(frame6);
						Thread.sleep(x);
			    	    listButton.setIcon(frame7);
						Thread.sleep(x);
			    	    listButton.setIcon(frame8);
						Thread.sleep(x);
			    	    listButton.setIcon(frame9);
						Thread.sleep(x);
			    	    listButton.setIcon(frame10);
						Thread.sleep(x);
			    	    listButton.setIcon(frame11);
						Thread.sleep(x);
			    	    listButton.setIcon(frame12);
						Thread.sleep(x);
			    	    listButton.setIcon(frame13);
						Thread.sleep(x);
			    	    listButton.setIcon(frame14);
						Thread.sleep(x);
			    	    listButton.setIcon(frame15);
						Thread.sleep(x);
			    	    listButton.setIcon(frame16);
						Thread.sleep(x);
			    	    listButton.setIcon(frame17);
						Thread.sleep(x);
			    	    listButton.setIcon(frame18);
						Thread.sleep(x);
			    	    listButton.setIcon(frame19);
						Thread.sleep(x);
			    	    listButton.setIcon(frame20);
						Thread.sleep(x);
			    	    listButton.setIcon(frame21);
						Thread.sleep(x);
			    	    listButton.setIcon(frame22);
						Thread.sleep(x);
			    	    listButton.setIcon(frame23);
						Thread.sleep(x);
			    	    listButton.setIcon(frame24);
						Thread.sleep(x);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	   historyPauseState = false;
			    	 
		    		   
		    	   }
		    	   }
		       }
		       }
		  		Thread historyRollover = new Thread(new historyRollover());
			 //	historyRollover.start();
			 
			 class sellingRollover implements Runnable {
				   public void run(){
			    	   while(true) {
			    	   while(sellingPauseState) {
				    	   ImageIcon frame1 = new ImageIcon("lib/Animations/selling/1.png");
				    	   ImageIcon frame2 = new ImageIcon("lib/Animations/selling/2.png");
				    	   ImageIcon frame3 = new ImageIcon("lib/Animations/selling/3.png");
				    	   ImageIcon frame4 = new ImageIcon("lib/Animations/selling/4.png");
				    	   ImageIcon frame5 = new ImageIcon("lib/Animations/selling/5.png");
				    	   ImageIcon frame6 = new ImageIcon("lib/Animations/selling/6.png");
				    	   ImageIcon frame7 = new ImageIcon("lib/Animations/selling/7.png");
				    	   ImageIcon frame8 = new ImageIcon("lib/Animations/selling/8.png");
				    	   ImageIcon frame9 = new ImageIcon("lib/Animations/selling/9.png");
				    	   ImageIcon frame10 = new ImageIcon("lib/Animations/selling/10.png");
				    	   ImageIcon frame11 = new ImageIcon("lib/Animations/selling/11.png");
				    	   ImageIcon frame12 = new ImageIcon("lib/Animations/selling/12.png");
				    	   ImageIcon frame13 = new ImageIcon("lib/Animations/selling/13.png");
				    	   ImageIcon frame14 = new ImageIcon("lib/Animations/selling/14.png");
				    	   ImageIcon frame15 = new ImageIcon("lib/Animations/selling/15.png");
				    	   ImageIcon frame16 = new ImageIcon("lib/Animations/selling/16.png");
				    	   ImageIcon frame17 = new ImageIcon("lib/Animations/selling/17.png");
				    	   ImageIcon frame18 = new ImageIcon("lib/Animations/selling/18.png");
				    	   ImageIcon frame19 = new ImageIcon("lib/Animations/selling/19.png");
				    	   ImageIcon frame20 = new ImageIcon("lib/Animations/selling/20.png");
				    	   ImageIcon frame21 = new ImageIcon("lib/Animations/selling/21.png");
				    	   ImageIcon frame22 = new ImageIcon("lib/Animations/selling/22.png");
				    	   ImageIcon frame23 = new ImageIcon("lib/Animations/selling/23.png");
				    	   ImageIcon frame24 = new ImageIcon("lib/Animations/selling/24.png");
				    	   ImageIcon frame25 = new ImageIcon("lib/Animations/selling/25.png");
				    	   ImageIcon frame26 = new ImageIcon("lib/Animations/selling/26.png");
				    	   ImageIcon frame27 = new ImageIcon("lib/Animations/selling/27.png");
				    	   ImageIcon frame28 = new ImageIcon("lib/Animations/selling/28.png");
				    	   ImageIcon frame29 = new ImageIcon("lib/Animations/selling/29.png");
				    	   ImageIcon frame30 = new ImageIcon("lib/Animations/selling/30.png");
				    	   ImageIcon frame31 = new ImageIcon("lib/Animations/selling/31.png");
				    	   ImageIcon frame32 = new ImageIcon("lib/Animations/selling/32.png");
				    	   ImageIcon frame33 = new ImageIcon("lib/Animations/selling/33.png");
				    	   ImageIcon frame34 = new ImageIcon("lib/Animations/selling/34.png");
				    	   ImageIcon frame35 = new ImageIcon("lib/Animations/selling/35.png");
				    	   ImageIcon frame36 = new ImageIcon("lib/Animations/selling/36.png");
				    	   ImageIcon frame37 = new ImageIcon("lib/Animations/selling/37.png");
				    	   ImageIcon frame38 = new ImageIcon("lib/Animations/selling/38.png");
				    	   ImageIcon frame39 = new ImageIcon("lib/Animations/selling/39.png");
				    	   ImageIcon frame40 = new ImageIcon("lib/Animations/selling/40.png");

				    	   ImageIcon frame41 = new ImageIcon("lib/Animations/selling/41.png");
				    	   ImageIcon frame42 = new ImageIcon("lib/Animations/selling/42.png");
				    	   ImageIcon frame43 = new ImageIcon("lib/Animations/selling/43.png");
				    	   ImageIcon frame44 = new ImageIcon("lib/Animations/selling/44.png");
				    	   ImageIcon frame45 = new ImageIcon("lib/Animations/selling/45.png");
				    	   ImageIcon frame46 = new ImageIcon("lib/Animations/selling/46.png");
				    	   ImageIcon frame47 = new ImageIcon("lib/Animations/selling/47.png");
				    	   ImageIcon frame48 = new ImageIcon("lib/Animations/selling/48.png");
				    	   ImageIcon frame49 = new ImageIcon("lib/Animations/selling/49.png");
				    	   ImageIcon frame50 = new ImageIcon("lib/Animations/selling/50.png");
				    	   ImageIcon frame51 = new ImageIcon("lib/Animations/selling/51.png");
				    	   ImageIcon frame52 = new ImageIcon("lib/Animations/selling/52.png");
				    	   ImageIcon frame53 = new ImageIcon("lib/Animations/selling/53.png");
				    	   ImageIcon frame54 = new ImageIcon("lib/Animations/selling/54.png");
				    	   ImageIcon frame55 = new ImageIcon("lib/Animations/selling/55.png");
				    	   ImageIcon frame56 = new ImageIcon("lib/Animations/selling/56.png");
				    	   ImageIcon frame57 = new ImageIcon("lib/Animations/selling/57.png");
				    	   ImageIcon frame58 = new ImageIcon("lib/Animations/selling/58.png");
				    	   ImageIcon frame59 = new ImageIcon("lib/Animations/selling/59.png");
				    	   ImageIcon frame60 = new ImageIcon("lib/Animations/selling/60.png");
				    	   ImageIcon frame61 = new ImageIcon("lib/Animations/selling/61.png");
				    	   ImageIcon frame62 = new ImageIcon("lib/Animations/selling/62.png");
				    	   ImageIcon frame63 = new ImageIcon("lib/Animations/selling/63.png");
				    	   ImageIcon frame64 = new ImageIcon("lib/Animations/selling/64.png");
				    	   ImageIcon frame65 = new ImageIcon("lib/Animations/selling/65.png");
				    	   ImageIcon frame66 = new ImageIcon("lib/Animations/selling/66.png");
				    	   
				    	   ImageIcon frame67 = new ImageIcon("lib/Animations/selling/67.png");
				    	   ImageIcon frame68 = new ImageIcon("lib/Animations/selling/68.png");
				    	   ImageIcon frame69 = new ImageIcon("lib/Animations/selling/69.png");
				    	   ImageIcon frame70 = new ImageIcon("lib/Animations/selling/70.png");
				    	   ImageIcon frame71 = new ImageIcon("lib/Animations/selling/71.png");
				    	   ImageIcon frame72 = new ImageIcon("lib/Animations/selling/72.png");
				    	   ImageIcon frame73 = new ImageIcon("lib/Animations/selling/73.png");
				    	   ImageIcon frame74 = new ImageIcon("lib/Animations/selling/74.png");
				    	   ImageIcon frame75 = new ImageIcon("lib/Animations/selling/75.png");
				    	   ImageIcon frame76 = new ImageIcon("lib/Animations/selling/76.png");
				    	   ImageIcon frame77 = new ImageIcon("lib/Animations/selling/77.png");
				    	   ImageIcon frame78 = new ImageIcon("lib/Animations/selling/78.png");
				    	   ImageIcon frame79 = new ImageIcon("lib/Animations/selling/79.png");
				    	   ImageIcon frame80 = new ImageIcon("lib/Animations/selling/80.png");
				    	   ImageIcon frame81 = new ImageIcon("lib/Animations/selling/81.png");
				    	   ImageIcon frame82 = new ImageIcon("lib/Animations/selling/82.png");
				    	   ImageIcon frame83 = new ImageIcon("lib/Animations/selling/83.png");
				    	   ImageIcon frame84 = new ImageIcon("lib/Animations/selling/84.png");
				    	   ImageIcon frame85 = new ImageIcon("lib/Animations/selling/85.png");
				    	   ImageIcon frame86 = new ImageIcon("lib/Animations/selling/86.png");
				    	   ImageIcon frame87 = new ImageIcon("lib/Animations/selling/87.png");
				    	   ImageIcon frame88 = new ImageIcon("lib/Animations/selling/88.png");
				    	   ImageIcon frame89 = new ImageIcon("lib/Animations/selling/89.png");
				    	   ImageIcon frame90 = new ImageIcon("lib/Animations/selling/90.png");
				    	   ImageIcon frame91 = new ImageIcon("lib/Animations/selling/91.png");
				    	   ImageIcon frame92 = new ImageIcon("lib/Animations/selling/92.png");
				    	   
				    	   ImageIcon frame93 = new ImageIcon("lib/Animations/selling/93.png");
				    	   ImageIcon frame94 = new ImageIcon("lib/Animations/selling/94.png");
				    	   ImageIcon frame95 = new ImageIcon("lib/Animations/selling/95.png");
				    	   ImageIcon frame96 = new ImageIcon("lib/Animations/selling/96.png");
				    	   ImageIcon frame97 = new ImageIcon("lib/Animations/selling/97.png");
				    	   ImageIcon frame98 = new ImageIcon("lib/Animations/selling/98.png");
				    	   ImageIcon frame99 = new ImageIcon("lib/Animations/selling/99.png");
				    	   ImageIcon frame100 = new ImageIcon("lib/Animations/selling/100.png");
				    	   ImageIcon frame101 = new ImageIcon("lib/Animations/selling/101.png");
				    	   ImageIcon frame102 = new ImageIcon("lib/Animations/selling/102.png");
				    	   ImageIcon frame103 = new ImageIcon("lib/Animations/selling/103.png");
				    	   ImageIcon frame104 = new ImageIcon("lib/Animations/selling/104.png");
				    	   ImageIcon frame105 = new ImageIcon("lib/Animations/selling/105.png");
				    	   ImageIcon frame106 = new ImageIcon("lib/Animations/selling/106.png");
				    	   ImageIcon frame107 = new ImageIcon("lib/Animations/selling/107.png");
				    	   ImageIcon frame108 = new ImageIcon("lib/Animations/selling/108.png");
				    	   ImageIcon frame109 = new ImageIcon("lib/Animations/selling/109.png");
				    	   ImageIcon frame110 = new ImageIcon("lib/Animations/selling/110.png");
				    	   ImageIcon frame111 = new ImageIcon("lib/Animations/selling/111.png");
				    	   ImageIcon frame112 = new ImageIcon("lib/Animations/selling/112.png");
				    	   ImageIcon frame113 = new ImageIcon("lib/Animations/selling/113.png");
				    	   ImageIcon frame114 = new ImageIcon("lib/Animations/selling/114.png");
				    	   ImageIcon frame115 = new ImageIcon("lib/Animations/selling/115.png");
				    	   ImageIcon frame116 = new ImageIcon("lib/Animations/selling/116.png");
				    	   ImageIcon frame117 = new ImageIcon("lib/Animations/selling/117.png");
				    	   ImageIcon frame118 = new ImageIcon("lib/Animations/selling/118.png");
				    	   
				    	   ImageIcon frame119 = new ImageIcon("lib/Animations/selling/119.png");
				    	   ImageIcon frame120 = new ImageIcon("lib/Animations/selling/120.png");
				    	   ImageIcon frame121 = new ImageIcon("lib/Animations/selling/121.png");
				    	   ImageIcon frame122 = new ImageIcon("lib/Animations/selling/122.png");
				    	   ImageIcon frame123 = new ImageIcon("lib/Animations/selling/123.png");
				    	   ImageIcon frame124 = new ImageIcon("lib/Animations/selling/124.png");
				    	   ImageIcon frame125 = new ImageIcon("lib/Animations/selling/125.png");
				    	   ImageIcon frame126 = new ImageIcon("lib/Animations/selling/126.png");
				    	   ImageIcon frame127 = new ImageIcon("lib/Animations/selling/127.png");
				    	   ImageIcon frame128 = new ImageIcon("lib/Animations/selling/128.png");
				    	   ImageIcon frame129 = new ImageIcon("lib/Animations/selling/129.png");
				    	   ImageIcon frame130 = new ImageIcon("lib/Animations/selling/130.png");
				    	   ImageIcon frame131 = new ImageIcon("lib/Animations/selling/131.png");
				    	   ImageIcon frame132 = new ImageIcon("lib/Animations/selling/132.png");
				    	   ImageIcon frame133 = new ImageIcon("lib/Animations/selling/133.png");
				    	   ImageIcon frame134 = new ImageIcon("lib/Animations/selling/134.png");
				    	   ImageIcon frame135 = new ImageIcon("lib/Animations/selling/135.png");
				    	   ImageIcon frame136 = new ImageIcon("lib/Animations/selling/136.png");
				    	   ImageIcon frame137 = new ImageIcon("lib/Animations/selling/137.png");
				    	   ImageIcon frame138 = new ImageIcon("lib/Animations/selling/138.png");
				    	   ImageIcon frame139 = new ImageIcon("lib/Animations/selling/139.png");
				    	   ImageIcon frame140 = new ImageIcon("lib/Animations/selling/140.png");
				    	   ImageIcon frame141 = new ImageIcon("lib/Animations/selling/141.png");
				    	   ImageIcon frame142 = new ImageIcon("lib/Animations/selling/142.png");
				    	   ImageIcon frame143 = new ImageIcon("lib/Animations/selling/143.png");
				    	   ImageIcon frame144 = new ImageIcon("lib/Animations/selling/144.png");
				    	  
				    	   ImageIcon frame145 = new ImageIcon("lib/Animations/selling/145.png");
				    	   ImageIcon frame146= new ImageIcon("lib/Animations/selling/146.png");
				    	   ImageIcon frame147 = new ImageIcon("lib/Animations/selling/147.png");
				    	   ImageIcon frame148 = new ImageIcon("lib/Animations/selling/148.png");
				    	   ImageIcon frame149 = new ImageIcon("lib/Animations/selling/149.png");
				    	   ImageIcon frame150 = new ImageIcon("lib/Animations/selling/150.png");
				    	   ImageIcon frame151 = new ImageIcon("lib/Animations/selling/151.png");
				    	   ImageIcon frame152 = new ImageIcon("lib/Animations/selling/152.png");
				    	   

				    	   int x = 30;
				    	   try {
					       sellButton.setIcon(frame1);
					       Thread.sleep(x);
				    	   sellButton.setIcon(frame2);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame3);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame4);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame5);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame6);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame7);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame8);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame9);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame10);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame11);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame12);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame13);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame14);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame15);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame16);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame17);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame18);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame19);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame20);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame21);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame22);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame23);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame24);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame25);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame26);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame27);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame28);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame29);
				    	   Thread.sleep(x);
				    	   sellButton.setIcon(frame30);
				    	   Thread.sleep(x);

					       //lblNewLabel_1.setIcon(frame31);
					      // Thread.sleep(x);
					       sellButton.setIcon(frame1);
					       Thread.sleep(x);
				    	  /* lblNewLabel_1.setIcon(frame32);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame33);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame34);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame35);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame36);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame37);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame38);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame39);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame40);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame41);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame42);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame43);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame44);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame45);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame46);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame47);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame48);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame49);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame50);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame51);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame52);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame53);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame54);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame55);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame56);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame57);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame58);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame59);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame60);
				    	   Thread.sleep(x);
				    	   
					       /*lblNewLabel_1.setIcon(frame61);
					       Thread.sleep(x);/*
				    	   lblNewLabel_1.setIcon(frame62);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame63);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame64);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame65);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame66);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame67);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame68);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame69);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame70);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame71);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame72);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame73);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame74);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame75);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame76);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame77);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame78);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame79);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame80);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame81);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame82);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame83);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame84);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame85);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame86);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame87);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame88);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame89);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame90);
				    	   Thread.sleep(x);
				    	   
					       lblNewLabel_1.setIcon(frame91);
					       Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame92);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame93);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame94);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame95);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame96);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame97);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame98);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame99);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame90);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame91);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame92);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame93);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame94);
				    	   Thread.sleep(x);
				    	  // lblNewLabel_1.setIcon(frame95);
				    	  // Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame96);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame97);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame98);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame99);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame100);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame101);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame102);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame103);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame104);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame105);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame106);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame107);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame108);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame109);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame110);
				    	   Thread.sleep(x);
				    	   
					       lblNewLabel_1.setIcon(frame111);
					       Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame112);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame113);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame114);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame115);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame116);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame117);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame118);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame119);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame120);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame121);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame122);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame123);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame124);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame125);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame126);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame127);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame128);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame129);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame130);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame131);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame132);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame133);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame134);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame135);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame136);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame137);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame138);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame139);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame140);
				    	   Thread.sleep(x);
							
					       lblNewLabel_1.setIcon(frame141);
					       Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame142);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame143);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame144);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame145);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame146);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame147);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame148);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame149);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame150);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame151);
				    	   Thread.sleep(x);
				    	   lblNewLabel_1.setIcon(frame152);
				    	   Thread.sleep(x); */
				    	  

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				    	   sellingPauseState = false;
				    	 
			    		   
			    	   }
			    	   }
			       }
			       }
				 Thread sellingRollover = new Thread(new sellingRollover());
				 //sellingRollover.start();

			 class accountRollover implements Runnable {
					   public void run(){
				    	   while(true) {
				    	   while(accountPauseState) {
					    	   ImageIcon frame1 = new ImageIcon("lib/Animations/account/1.png");
					    	   ImageIcon frame2 = new ImageIcon("lib/Animations/account/2.png");
					    	   ImageIcon frame3 = new ImageIcon("lib/Animations/account/3.png");
					    	   ImageIcon frame4 = new ImageIcon("lib/Animations/account/4.png");
					    	   ImageIcon frame5 = new ImageIcon("lib/Animations/account/5.png");
					    	   ImageIcon frame6 = new ImageIcon("lib/Animations/account/6.png");
					    	   ImageIcon frame7 = new ImageIcon("lib/Animations/account/7.png");
					    	   ImageIcon frame8 = new ImageIcon("lib/Animations/account/8.png");
					    	   ImageIcon frame9 = new ImageIcon("lib/Animations/account/9.png");
					    	   ImageIcon frame10 = new ImageIcon("lib/Animations/account/10.png");
					    	   ImageIcon frame11 = new ImageIcon("lib/Animations/account/11.png");
					    	   ImageIcon frame12 = new ImageIcon("lib/Animations/account/12.png");
					    	   ImageIcon frame13 = new ImageIcon("lib/Animations/account/13.png");
					    	   ImageIcon frame14 = new ImageIcon("lib/Animations/account/14.png");
					    	   ImageIcon frame15 = new ImageIcon("lib/Animations/account/15.png");
					    	   ImageIcon frame16 = new ImageIcon("lib/Animations/account/16.png");
					    	   ImageIcon frame17 = new ImageIcon("lib/Animations/account/17.png");
					    	   ImageIcon frame18 = new ImageIcon("lib/Animations/account/18.png");
					    	   ImageIcon frame19 = new ImageIcon("lib/Animations/account/19.png");
					    	   ImageIcon frame20 = new ImageIcon("lib/Animations/account/20.png");
					    	   ImageIcon frame21 = new ImageIcon("lib/Animations/account/21.png");
					    	   ImageIcon frame22 = new ImageIcon("lib/Animations/account/22.png");
					    	   ImageIcon frame23 = new ImageIcon("lib/Animations/account/23.png");
					    	   ImageIcon frame24 = new ImageIcon("lib/Animations/account/24.png");
					    	   ImageIcon frame25 = new ImageIcon("lib/Animations/account/25.png");
					    	   ImageIcon frame26 = new ImageIcon("lib/Animations/account/26.png");
					    	   ImageIcon frame27 = new ImageIcon("lib/Animations/account/27.png");
					    	   ImageIcon frame28 = new ImageIcon("lib/Animations/account/28.png");
					    	   ImageIcon frame29 = new ImageIcon("lib/Animations/account/29.png");
					    	   ImageIcon frame30 = new ImageIcon("lib/Animations/account/30.png");
					    	   ImageIcon frame31 = new ImageIcon("lib/Animations/account/31.png");
					    	   int x = 10;
					    	   try {
					    		   accountButton.setIcon(frame1);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame2);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame3);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame4);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame5);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame6);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame7);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame8);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame9);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame10);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame11);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame12);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame13);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame14);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame15);
								Thread.sleep(x);	
					    	    accountButton.setIcon(frame16);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame17);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame18);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame19);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame20);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame21);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame22);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame23);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame24);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame25);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame26);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame27);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame28);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame29);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame30);
								Thread.sleep(x);
					    	    accountButton.setIcon(frame31);
								Thread.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					    	   accountPauseState = false;
					    	 
				    		   
				    	   }
				    	   }
				       }
				       }
				Thread accountRollover = new Thread(new accountRollover());
				//accountRollover.start();
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
				
	}
	static void facebookLogin(WebDriver driver, String title, String price) throws InterruptedException {
			driver.get("https://www.facebook.com/marketplace");
			Thread.sleep(2000);
			
			WebElement element_emailTextbox = driver.findElement(By.xpath("//*[@id='email']"));
			element_emailTextbox.sendKeys("8133272817");
			
			WebElement element_passswordTextbox = driver.findElement(By.xpath("//*[@id='pass']"));
			element_passswordTextbox.sendKeys("Caracas55");
			
			driver.findElement(By.name("login")).click(); 
			Thread.sleep(2000);
			
			driver.get("https://www.facebook.com/marketplace/create/item");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\nicol\\Desktop\\Untitled.png");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"jsc_c_x\"]")).sendKeys(title);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"jsc_c_z\"]")).sendKeys(price);
			
			
			
			
			
			
			
			
	}
	static void offerupLogin(WebDriver driver) throws InterruptedException {
		 	Thread.sleep(2000);
		 	driver.get("https://www.offerup.com");
		 	Thread.sleep(2000);
			System.out.println("Checkpoint 1");
			//driver.findElement(By.className("gLFyf gsfi")).click();
			
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/header/div[2]/div[1]/div[2]/div/div/button/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[4]/div/div[1]/div/button[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[4]/div/div[1]/div/button[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"auth-login-dialog-email-field\"]")).sendKeys("Nicolasacalafiore@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"auth-login-dialog-password-field\"]")).sendKeys("Caracas55");
			Thread.sleep(2000);	
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[5]/div/div[1]/form/div/div[5]/button")).click();
			Thread.sleep(2000);

				try {
					 boolean t = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[5]/div/div[2]/p[1]/a[1]")).isDisplayed();
				      if (t) {
				    	 Scanner scanner = new Scanner(System.in);
				         System.out.println("Verification is needed | Continue until complete withh all steps of verification (Captcha and/or SMS Code");
				         while(true) {
				         System.out.println("[1] Completed [2] Cancel");
				         int input = scanner.nextInt();
				         if(input == 1) {
				        	 break;
				         }
				         else {
				        	 
				         }
				         }
				      } else {
				         System.out.println("Captcha Verification is not needed");
				      }} catch (Exception ElementNotFound) {System.out.println("Element not found " );}


				
						try {
							 boolean t = driver.findElement(By.id("Lock and key")).isDisplayed();
						      if (t) {
						         System.out.println("Phone Verification Image  Element is displayed");
						         System.out.println("Phone Verification is needed");
						      } else {
						         System.out.println("Phone Verification Image  is not displayed");
						      }} catch (Exception ElementNotFound) {System.out.println("Element not found " );}

			
	 }
	static void ebayLogin(WebDriver driver) throws InterruptedException {
		 	driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&amp;ru=https%3A%2F%2Fwww.ebay.com%2F\" _sp=\"m570.l1524");
			System.out.println("Checkpoint 1");
			Thread.sleep(2000);
			
			try {
				 boolean t = driver.findElement(By.xpath("//*[@id=\"CentralArea\"]/div[6]")).isDisplayed();
			      if (t) {
			    	 Scanner scanner = new Scanner(System.in);
			         System.out.println("Verification is needed | Continue until complete withh all steps of verification (Captcha and/or SMS Code");
			         while(true) {
			         System.out.println("[1] Completed [2] Cancel");
			         int input = scanner.nextInt();
			         if(input == 1) {
			        	 break;
			         }
			         else {
			        	 
			         }
			         }
			      } else {
			         System.out.println("Captcha Verification is not needed");
			      }} catch (Exception ElementNotFound) {System.out.println("Element not found " );}
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("Nicolasacalafiore@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"signin-continue-btn\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Caracas55");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"sgnBt\"]")).click();
			

			
	 }
	static void craigslistLogin(WebDriver driver) throws InterruptedException {
			driver.get("https://accounts.craigslist.org/login?rp=%2Flogin%2Fhome&rt=L");
			System.out.println("Checkpoint 1");
			Thread.sleep(2000);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"inputEmailHandle\"]")).sendKeys("Nicolasacalafiore@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("Venezuela1!?!");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	 }
	static void nextDoor(WebDriver driver) throws InterruptedException {
		 driver.get("https://nextdoor.com/login/");
			System.out.println("Checkpoint 1");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"id_email\"]")).sendKeys("nicocalafiore@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("Caracas55");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"signin_button\"]")).click();
			

			/*WebDriver driver2 = new EdgeDriver();
			driver2.get("https://www.gmail.com");
			Thread.sleep(2000);
			driver2.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("nicocalafiore");
			Thread.sleep(2000);
			driver2.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
			
			Thread.sleep(2000);
			driver2.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Ncalafiore1!");
			Thread.sleep(2000);
			driver2.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
			Thread.sleep(2000);
			List<WebElement> unreademail = driver.findElements(By.className("zE"));



			System.out.println("Total No. of Unread Mails: " + unreademail.size());

			// real logic starts here

			for(int i=0;i<unreademail.size();i++){

			System.out.println(unreademail.get(i).getText());

			}

			unreademail.get(0).click(); */ // Email bot;
			
			
		
	 }
}
