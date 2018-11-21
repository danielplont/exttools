/*
	This file is part of the OdinMS Maple Story Server
    Copyright (C) 2008 Patrick Huy <patrick.huy@frz.cc> 
                       Matthias Butz <matze@odinms.de>
                       Jan Christian Meyer <vimes@odinms.de>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License version 3
    as published by the Free Software Foundation. You may not use, modify
    or distribute this program under any other version of the
    GNU Affero General Public License.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package net.sf.odinms.exttools.shopcreator;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import net.sf.odinms.provider.MapleData;
import net.sf.odinms.provider.MapleDataDirectoryEntry;
import net.sf.odinms.provider.MapleDataFileEntry;
import net.sf.odinms.provider.MapleDataProvider;
import net.sf.odinms.provider.MapleDataProviderFactory;
import net.sf.odinms.provider.MapleDataTool;

/**
 *
 * @author  andy
 */
public class ShopCreatorMainForm extends javax.swing.JFrame {
	
	/** Creates new form ShopCreatorMainForm */
	public ShopCreatorMainForm() {
		initComponents();
	}
	
	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jList1 = new javax.swing.JList();
                jComboBox1 = new javax.swing.JComboBox();
                jScrollPane2 = new javax.swing.JScrollPane();
                jList2 = new javax.swing.JList();
                jLabel1 = new javax.swing.JLabel();
                jMenuBar1 = new javax.swing.JMenuBar();
                jMenu1 = new javax.swing.JMenu();
                jMenuItem2 = new javax.swing.JMenuItem();
                jMenu2 = new javax.swing.JMenu();
                jMenuItem1 = new javax.swing.JMenuItem();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("OdinMS Shop Creator - Fuko-chan v0.0.1");
                setResizable(false);

                jList1.setModel(new javax.swing.AbstractListModel() {
                        String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
                        public int getSize() { return strings.length; }
                        public Object getElementAt(int i) { return strings[i]; }
                });
                jList1.setLayoutOrientation(javax.swing.JList.VERTICAL_WRAP);
                jScrollPane1.setViewportView(jList1);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                .addContainerGap())
                );

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                jList2.setModel(new javax.swing.AbstractListModel() {
                        String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
                        public int getSize() { return strings.length; }
                        public Object getElementAt(int i) { return strings[i]; }
                });
                jScrollPane2.setViewportView(jList2);

                jLabel1.setText("jLabel1");

                jMenu1.setText("File");

                jMenuItem2.setText("Close");
                jMenu1.add(jMenuItem2);

                jMenuBar1.add(jMenu1);

                jMenu2.setText("Help");

                jMenuItem1.setText("About");
                jMenu2.add(jMenuItem1);

                jMenuBar1.add(jMenu2);

                setJMenuBar(jMenuBar1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents
	

	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
	
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				ShopCreatorMainForm sc = new ShopCreatorMainForm();

				//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

				sc.initializeShopItemList();
				sc.initializeItemList();
				sc.setVisible(true);

			}
		});
	}
	
	public void initializeShopItemList()
	{
		final ShopItem[] shopItems =
		{
			/*new ShopItem("gnorks", "test.png"),
			new ShopItem("rumsmgenurp", "test.png"),
			new ShopItem("broetchen", "test.png"),
			new ShopItem("wuerste", "test.png")*/
		};		
		
		this.jList1.setCellRenderer(new ShopItemListCellRenderer());
		this.jList1.setListData(shopItems);		
	}
	
	public void initializeItemList()
	{
		ArrayList<ShopItem> items = new ArrayList<ShopItem>();
		
		MapleDataProvider strings  = MapleDataProviderFactory.getImageProvidingDataProvider(new File("String.wz"));
		MapleData stringsItem = strings.getData("Item.img");
		
		MapleDataProvider data = MapleDataProviderFactory.getImageProvidingDataProvider(new File("Item.wz"));
		MapleDataDirectoryEntry root =  data.getRoot();

 		for(MapleDataDirectoryEntry topDir : root.getSubdirectories())
		{
			MapleData stringTopDir;
			
			if(topDir.getName().equals("Install"))
			{
				stringTopDir = stringsItem.getChildByPath("Ins");
			}
			else if(topDir.getName().equals("Consume"))
			{
				stringTopDir = stringsItem.getChildByPath("Con");
			}
			else
			{
				stringTopDir = stringsItem.getChildByPath(topDir.getName());
			}
			
			for(MapleDataFileEntry iFile : topDir.getFiles())
			{
				/**
				 * Pets haben da noch kranke dinge in dem IMG drin,
				 * da muss man nich noch tiefer gehen
				 */
				if(topDir.getName().equals("Pet"))
				{
					continue;
					/*String itemname = iFile.getName();
					itemname = theItemName(itemname.substring(0, itemname.length()-4));		
					
					String a = MapleDataTool.getString(itemname + "/name", stringTopDir, iFile.getName());
					items.add(new ShopItem(a, new ImageIcon()));*/
				}
				
				/**
				 * Bei special sind die namen in der item.wz gespeichert
				 */
				else if(topDir.getName().equals("Special"))
				{
					continue;
					/**
					 * Mesos & MaplePoints
					 
					if(iFile.getName().equals("0900.img") || iFile.getName().equals("MaplePoint.img"))
					{
						continue;
					}
						
					for(MapleData item : data.getData(topDir.getName() +"/"+ iFile.getName()).getChildren())
					{						
						String itemname = theItemName(item.getName());					

						String a = MapleDataTool.getString("name", item, item.getName());
						items.add(new ShopItem(a, new ImageIcon()));
					}	*/				
				}
				/**
				 * Alles andere => tiefer gehen
				 */
				else
				{
					for(MapleData item : data.getData(topDir.getName() +"/"+ iFile.getName()).getChildren())
					{
						String itemname = item.getName();
						for(int i = 0; i < itemname.length(); i++) {
							if(itemname.charAt(i) != '0')
							{
								itemname = itemname.substring(i);
								break;
							}
						}

						String a = MapleDataTool.getString(itemname + "/name", stringTopDir, item.getName());	
						
						BufferedImage img = MapleDataTool.getImage(item.getChildByPath("info/icon"));
						
						/*
						//a = new 
						try
						{
							FileOutputStream t = new FileOutputStream(itemname + a + c.getWidth() + "x" + c.getHeight() +".raw");
							t.write(unwusched);
							t.close();
						}
						catch(Exception e)
						{
							//
						}*/
						
						items.add(new ShopItem(a + img.getData().getDataBuffer().getSize(), new ImageIcon(img)));
						break;
					}
				}
				break;
			}
		}

		this.jLabel1.setText("Items: " + items.size());
		this.jList2.setCellRenderer(new ShopItemListCellRenderer());
		this.jList2.setListData(items.toArray());
	}

	// private String theItemName(String in)
	// {
	// for(int i = 0; i < in.length(); i++) {
	// if(in.charAt(i) != '0')
	// {
	// in = in.substring(i);
	// return in;
	// }
	// }
	//		
	// return in;
	//	}	
	
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JComboBox jComboBox1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JList jList1;
        private javax.swing.JList jList2;
        private javax.swing.JMenu jMenu1;
        private javax.swing.JMenu jMenu2;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JMenuItem jMenuItem1;
        private javax.swing.JMenuItem jMenuItem2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        // End of variables declaration//GEN-END:variables
	
}
