package com.peterbochs;

import info.clearthought.layout.TableLayout;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import com.peterswing.advancedswing.searchtextfield.JSearchTextField;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class SettingDialog extends javax.swing.JDialog {
	private JCheckBox jCheckBox1;
	private JCheckBox jCheckBox2;
	private JButton jBrowseDwarfdumpButton;
	private JButton jBrowseObjdumpButton;
	private JSearchTextField jDwarfdumpTextField;
	private JSearchTextField jObjdumpTextField;
	private JLabel jLabel3;
	private JLabel objdump;
	private JLabel jLabel2;
	private JPanel jThirdPartyProgramPanel;
	private JCheckBox jFastStepHistoryCheckBox;
	private JCheckBox jLogToPetersoftServerCheckBox;
	private JCheckBox jInterruptProfilingCheckBox;
	private JLabel jProfileInfoLabel;
	private JLabel jLabel1;
	private JCheckBox jUpdateGraphCheckBox;
	private JCheckBox jJmpProfilingCheckBox;
	private JCheckBox jCustomZoneCheckBox;
	private JCheckBox jHitZoneCheckBox;
	private JCheckBox jMemoryProfilingCheckBox;
	private JPanel jProfilingPanel;
	private JCheckBox jFastStepIDTCheckBox;
	private JCheckBox jFastStepLDTCheckBox;
	private JCheckBox jFastStepGDTCheckBox;
	private JCheckBox jFastStepBreakpointCheckBox;
	private JCheckBox jFastStepInstructionCheckBox;
	private JCheckBox jFastStepMemoryCheckBox;
	private JCheckBox jFastStepRegisterCheckBox;
	private JPanel jPanel2;
	private JLabel jLabel9;
	private JCheckBox jBochsIDTCheckBox;
	private JCheckBox jBochsLDTCheckBox;
	private JCheckBox jBochsGDTCheckBox;
	private JTabbedPane jTabbedPane1;
	private JPanel jPanel3;
	private JCheckBox jBochsHistoryCheckBox;
	private JCheckBox jBochsAddressTranslateCheckBox;
	private JCheckBox jBochsStackCheckBox;
	private JCheckBox jBochsPageTableCheckBox;
	private JCheckBox jBochsBreakpointCheckBox;
	private JCheckBox jBochsInstructionCheckBox;
	private JCheckBox jBochsMemoryCheckBox;
	private JCheckBox jBochsRegisterCheckBox;
	private JPanel jPanel1;

	/**
	 * Auto-generated main method to display this JDialog
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				SettingDialog inst = new SettingDialog(frame);
				inst.setVisible(true);
			}
		});
	}

	public SettingDialog(JFrame frame) {
		super(frame, true);
		initGUI();
	}

	private void initGUI() {
		try {
			this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			BorderLayout thisLayout = new BorderLayout();
			getContentPane().setLayout(thisLayout);
			this.setTitle("Setting");
			{
				jTabbedPane1 = new JTabbedPane();
				getContentPane().add(jTabbedPane1, BorderLayout.CENTER);
				{
					jPanel3 = new JPanel();
					TableLayout jPanel3Layout = new TableLayout(new double[][] { { TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL },
							{ TableLayout.FILL, TableLayout.FILL, 99.0, TableLayout.FILL, 70.0, TableLayout.FILL, TableLayout.FILL } });
					jPanel3Layout.setHGap(5);
					jPanel3Layout.setVGap(5);
					jPanel3.setLayout(jPanel3Layout);
					jTabbedPane1.addTab("General", null, jPanel3, null);
					{
						jCheckBox1 = new JCheckBox();
						jPanel3.add(jCheckBox1, "0, 0, 3, 0");
						jCheckBox1.setText(MyLanguage.getString("Load_breakpoint_at_startup"));
						jCheckBox1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jCheckBox1ActionPerformed(evt);
							}
						});
					}
					{
						jCheckBox2 = new JCheckBox();
						jPanel3.add(jCheckBox2, "0, 1, 3, 1");
						jCheckBox2.setText(MyLanguage.getString("Update_status_after_bochs_command"));
						jCheckBox2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jCheckBox2ActionPerformed(evt);
							}
						});
					}
					{
						jPanel1 = new JPanel();
						jPanel3.add(jPanel1, "0, 2, 3, 2");
						TableLayout jPanel1Layout = new TableLayout(new double[][] { { 34.0, TableLayout.FILL, TableLayout.FILL, TableLayout.PREFERRED },
								{ 15.0, 15.0, 15.0, TableLayout.PREFERRED } });
						jPanel1Layout.setHGap(10);
						jPanel1Layout.setVGap(5);
						jPanel1.setLayout(jPanel1Layout);
						{
							jBochsRegisterCheckBox = new JCheckBox();
							jPanel1.add(jBochsRegisterCheckBox, "1, 0");
							jBochsRegisterCheckBox.setText(MyLanguage.getString("Register"));
							jBochsRegisterCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jInterruptProfilingCheckBoxActionPerformed(evt);
								}
							});
						}
						{
							jBochsMemoryCheckBox = new JCheckBox();
							jPanel1.add(jBochsMemoryCheckBox, "2, 0");
							jBochsMemoryCheckBox.setText("Memory");
							jBochsMemoryCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jCheckBox4ActionPerformed(evt);
								}
							});
						}
						{
							jBochsInstructionCheckBox = new JCheckBox();
							jPanel1.add(jBochsInstructionCheckBox, "3, 0");
							jBochsInstructionCheckBox.setText(MyLanguage.getString("Instruction"));
							jBochsInstructionCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jCheckBox5ActionPerformed(evt);
								}
							});
						}
						{
							jBochsBreakpointCheckBox = new JCheckBox();
							jPanel1.add(jBochsBreakpointCheckBox, "1, 1");
							jBochsBreakpointCheckBox.setText(MyLanguage.getString("Breakpoint"));
							jBochsBreakpointCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jCheckBox6ActionPerformed(evt);
								}
							});
						}
						{
							jBochsGDTCheckBox = new JCheckBox();
							jPanel1.add(jBochsGDTCheckBox, "2, 1");
							jBochsGDTCheckBox.setText(MyLanguage.getString("GDT"));
							jBochsGDTCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jCheckBox7ActionPerformed(evt);
								}
							});
						}
						{
							jBochsLDTCheckBox = new JCheckBox();
							jPanel1.add(jBochsLDTCheckBox, "3, 1");
							jBochsLDTCheckBox.setText(MyLanguage.getString("LDT"));
							jBochsLDTCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jCheckBox8ActionPerformed(evt);
								}
							});
						}
						{
							jBochsIDTCheckBox = new JCheckBox();
							jPanel1.add(jBochsIDTCheckBox, "1, 2");
							jBochsIDTCheckBox.setText(MyLanguage.getString("IDT"));
							jBochsIDTCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jCheckBox9ActionPerformed(evt);
								}
							});
						}
						{
							jBochsPageTableCheckBox = new JCheckBox();
							jPanel1.add(jBochsPageTableCheckBox, "2, 2");
							jBochsPageTableCheckBox.setText(MyLanguage.getString("Page_table"));
							jBochsPageTableCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jBochsPageTableCheckBoxActionPerformed(evt);
								}
							});
						}
						{
							jBochsStackCheckBox = new JCheckBox();
							jPanel1.add(jBochsStackCheckBox, "3, 2");
							jBochsStackCheckBox.setText(MyLanguage.getString("Stack"));
							jBochsStackCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jBochsStackCheckBoxActionPerformed(evt);
								}
							});
						}
						{
							jBochsAddressTranslateCheckBox = new JCheckBox();
							jPanel1.add(jBochsAddressTranslateCheckBox, "1, 3, 2, 3");
							jBochsAddressTranslateCheckBox.setText(MyLanguage.getString("Address_translate"));
							jBochsAddressTranslateCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jBochsAddressTranslateCheckBoxActionPerformed(evt);
								}
							});
						}
						{
							jBochsHistoryCheckBox = new JCheckBox();
							jPanel1.add(jBochsHistoryCheckBox, "3, 3");
							jBochsHistoryCheckBox.setText(MyLanguage.getString("History"));
							jBochsHistoryCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jBochsHistoryCheckBoxActionPerformed(evt);
								}
							});
						}
					}
					{
						jLabel9 = new JLabel();
						jPanel3.add(jLabel9, "0, 3, 3, 3");
						jLabel9.setText(MyLanguage.getString("What_panel_will_update_after_fast_step_button"));
					}
					{
						jPanel2 = new JPanel();
						jPanel3.add(jPanel2, "0, 4, 3, 4");
						TableLayout jPanel2Layout = new TableLayout(new double[][] { { 34.0, TableLayout.FILL, TableLayout.FILL, TableLayout.PREFERRED },
								{ 15.0, 15.0, 15.0, TableLayout.FILL } });
						jPanel2Layout.setHGap(10);
						jPanel2Layout.setVGap(5);
						jPanel2.setLayout(jPanel2Layout);
						{
							jFastStepRegisterCheckBox = new JCheckBox();
							jPanel2.add(jFastStepRegisterCheckBox, "1, 0");
							jFastStepRegisterCheckBox.setText(MyLanguage.getString("Register"));
							jFastStepRegisterCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jFastStepRegisterCheckBoxActionPerformed(evt);
								}
							});
						}
						{
							jFastStepMemoryCheckBox = new JCheckBox();
							jPanel2.add(jFastStepMemoryCheckBox, "2, 0");
							jFastStepMemoryCheckBox.setText(MyLanguage.getString("Memory"));
							jFastStepMemoryCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jFastStepMemoryCheckBoxActionPerformed(evt);
								}
							});
						}
						{
							jFastStepInstructionCheckBox = new JCheckBox();
							jPanel2.add(jFastStepInstructionCheckBox, "3, 0");
							jFastStepInstructionCheckBox.setText(MyLanguage.getString("Instruction"));
							jFastStepInstructionCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jFastStepInstructionCheckBoxActionPerformed(evt);
								}
							});
						}
						{
							jFastStepBreakpointCheckBox = new JCheckBox();
							jPanel2.add(jFastStepBreakpointCheckBox, "1, 1");
							jFastStepBreakpointCheckBox.setText(MyLanguage.getString("Breakpoint"));
							jFastStepBreakpointCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jFastStepBreakpointCheckBoxActionPerformed(evt);
								}
							});
						}
						{
							jFastStepGDTCheckBox = new JCheckBox();
							jPanel2.add(jFastStepGDTCheckBox, "2, 1");
							jFastStepGDTCheckBox.setText(MyLanguage.getString(MyLanguage.getString("GDT")));
							jFastStepGDTCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jFastStepGDTCheckBoxActionPerformed(evt);
								}
							});
						}
						{
							jFastStepLDTCheckBox = new JCheckBox();
							jPanel2.add(jFastStepLDTCheckBox, "3, 1");
							jFastStepLDTCheckBox.setText(MyLanguage.getString(MyLanguage.getString("LDT")));
							jFastStepLDTCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jFastStepLDTCheckBoxActionPerformed(evt);
								}
							});
						}
						{
							jFastStepIDTCheckBox = new JCheckBox();
							jPanel2.add(jFastStepIDTCheckBox, "1, 2");
							jFastStepIDTCheckBox.setText(MyLanguage.getString(MyLanguage.getString("IDT")));
							jFastStepIDTCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jFastStepIDTCheckBoxActionPerformed(evt);
								}
							});
						}
						{
							jFastStepHistoryCheckBox = new JCheckBox();
							jPanel2.add(jFastStepHistoryCheckBox, "2, 2");
							jFastStepHistoryCheckBox.setText(MyLanguage.getString("History"));
							jFastStepHistoryCheckBox.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jFastHistoryCheckBoxActionPerformed(evt);
								}
							});
						}
					}
					{
						jLogToPetersoftServerCheckBox = new JCheckBox();
						jPanel3.add(jLogToPetersoftServerCheckBox, "0, 5, 1, 5");
						jLogToPetersoftServerCheckBox.setText("Log to Petersoft Server?");
						jLogToPetersoftServerCheckBox.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jLogToPetersoftServerCheckBoxActionPerformed(evt);
							}
						});
					}
				}
				{
					jProfilingPanel = new JPanel();
					GroupLayout jProfilingPanelLayout = new GroupLayout((JComponent) jProfilingPanel);
					jProfilingPanel.setLayout(jProfilingPanelLayout);
					jTabbedPane1.addTab("Profiling", null, jProfilingPanel, null);
					{
						jMemoryProfilingCheckBox = new JCheckBox();
						jMemoryProfilingCheckBox.setText("Memory profiling");
						jMemoryProfilingCheckBox.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jMemoryProfilingCheckBoxActionPerformed(evt);
							}
						});
					}
					{
						jLabel1 = new JLabel();
						jLabel1.setText("You need to restart peter-bochs if you change the following settings");
						jLabel1.setForeground(new java.awt.Color(255, 0, 0));
					}
					{
						jProfileInfoLabel = new JLabel();
					}
					{
						jJmpProfilingCheckBox = new JCheckBox();
						jJmpProfilingCheckBox.setText("Jmp profiling");
						jJmpProfilingCheckBox.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jJmpProfilingCheckBoxActionPerformed(evt);
							}
						});
					}
					{
						jUpdateGraphCheckBox = new JCheckBox();
						jUpdateGraphCheckBox.setText("Update graph");
						jUpdateGraphCheckBox.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jUpdateGraphCheckBoxActionPerformed(evt);
							}
						});
					}
					{
						jHitZoneCheckBox = new JCheckBox();
						jHitZoneCheckBox.setText("Hit zone");
						jHitZoneCheckBox.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jHitZoneCheckBoxActionPerformed(evt);
							}
						});
					}
					{
						jCustomZoneCheckBox = new JCheckBox();
						jCustomZoneCheckBox.setText("Custom zone");
						jCustomZoneCheckBox.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jCustomZoneCheckBoxActionPerformed(evt);
							}
						});
					}
					{
						jInterruptProfilingCheckBox = new JCheckBox();
						jInterruptProfilingCheckBox.setText("Interrupt profiling");
						jInterruptProfilingCheckBox.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jInterruptProfilingCheckBoxActionPerformed(evt);
							}
						});
					}
					jProfilingPanelLayout.setHorizontalGroup(jProfilingPanelLayout
							.createSequentialGroup()
							.addContainerGap()
							.addGroup(
									jProfilingPanelLayout
											.createParallelGroup()
											.addGroup(
													GroupLayout.Alignment.LEADING,
													jProfilingPanelLayout.createSequentialGroup()
															.addComponent(jInterruptProfilingCheckBox, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
															.addGap(0, 208, Short.MAX_VALUE))
											.addGroup(
													GroupLayout.Alignment.LEADING,
													jProfilingPanelLayout.createSequentialGroup()
															.addComponent(jUpdateGraphCheckBox, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
															.addGap(0, 268, Short.MAX_VALUE))
											.addGroup(
													GroupLayout.Alignment.LEADING,
													jProfilingPanelLayout.createSequentialGroup()
															.addComponent(jJmpProfilingCheckBox, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
															.addGap(0, 251, Short.MAX_VALUE))
											.addGroup(
													GroupLayout.Alignment.LEADING,
													jProfilingPanelLayout.createSequentialGroup()
															.addComponent(jMemoryProfilingCheckBox, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
															.addGap(0, 199, Short.MAX_VALUE))
											.addComponent(jLabel1, GroupLayout.Alignment.LEADING, 0, 411, Short.MAX_VALUE)
											.addComponent(jProfileInfoLabel, GroupLayout.Alignment.LEADING, 0, 411, Short.MAX_VALUE)
											.addGroup(
													GroupLayout.Alignment.LEADING,
													jProfilingPanelLayout.createSequentialGroup().addGap(19)
															.addComponent(jHitZoneCheckBox, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
															.addComponent(jCustomZoneCheckBox, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
															.addGap(0, 167, Short.MAX_VALUE))).addContainerGap());
					jProfilingPanelLayout.setVerticalGroup(jProfilingPanelLayout
							.createSequentialGroup()
							.addContainerGap()
							.addComponent(jProfileInfoLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(24)
							.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(jMemoryProfilingCheckBox, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(
									jProfilingPanelLayout
											.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(jHitZoneCheckBox, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(jCustomZoneCheckBox, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(jJmpProfilingCheckBox, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(jInterruptProfilingCheckBox, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(jUpdateGraphCheckBox, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE).addContainerGap(50, Short.MAX_VALUE));
				}
				{
					jThirdPartyProgramPanel = new JPanel();
					TableLayout jThirdPartyProgramPanelLayout = new TableLayout(new double[][] { { 7.0, TableLayout.FILL, TableLayout.FILL, 159.0, 54.0, 7.0 },
							{ 7.0, 15.0, 20.0, 7.0, 20.0, TableLayout.FILL } });
					jThirdPartyProgramPanelLayout.setHGap(5);
					jThirdPartyProgramPanelLayout.setVGap(5);
					jThirdPartyProgramPanel.setLayout(jThirdPartyProgramPanelLayout);
					jTabbedPane1.addTab("Third party program", null, jThirdPartyProgramPanel, null);
					jThirdPartyProgramPanel.setPreferredSize(new java.awt.Dimension(442, 301));
					{
						jLabel2 = new JLabel();
						jThirdPartyProgramPanel.add(jLabel2, "1, 1, 4, 1");
						jLabel2.setText("Clear the path to use the default path");
					}
					{
						objdump = new JLabel();
						jThirdPartyProgramPanel.add(objdump, "1, 2");
						objdump.setText("objdump");
						objdump.setHorizontalAlignment(SwingConstants.TRAILING);
					}
					{
						jLabel3 = new JLabel();
						jThirdPartyProgramPanel.add(jLabel3, "1, 4");
						jLabel3.setText("dwarfdump");
						jLabel3.setHorizontalAlignment(SwingConstants.TRAILING);
					}
					{
						jObjdumpTextField = new JSearchTextField();
						jThirdPartyProgramPanel.add(jObjdumpTextField, "2, 2, 3, 2");
						jObjdumpTextField.addKeyListener(new KeyAdapter() {
							public void keyReleased(KeyEvent evt) {
								jObjdumpTextFieldKeyReleased(evt);
							}
						});
					}
					{
						jDwarfdumpTextField = new JSearchTextField();
						jThirdPartyProgramPanel.add(jDwarfdumpTextField, "2, 4, 3, 4");
						jDwarfdumpTextField.addKeyListener(new KeyAdapter() {
							public void keyTyped(KeyEvent evt) {
								jDwarfdumpTextFieldKeyTyped(evt);
							}
						});
					}
					{
						jBrowseObjdumpButton = new JButton();
						jThirdPartyProgramPanel.add(jBrowseObjdumpButton, "4, 2");
						jBrowseObjdumpButton.setText("...");
						jBrowseObjdumpButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBrowseObjdumpButtonActionPerformed(evt);
							}
						});
					}
					{
						jBrowseDwarfdumpButton = new JButton();
						jThirdPartyProgramPanel.add(jBrowseDwarfdumpButton, "4, 4");
						jBrowseDwarfdumpButton.setText("...");
						jBrowseDwarfdumpButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBrowseDwarfdumpButtonActionPerformed(evt);
							}
						});
					}
				}
			}
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent evt) {
					thisWindowClosing(evt);
				}
			});
			jProfileInfoLabel.setText("Memory profile port : " + Global.profilingMemoryPort + " , jmp profile port : " + Global.profilingJmpPort + " , interrupt profile port : "
					+ Global.profilingInterruptPort);

			setSize(450, 350);
			initValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initValue() {
		jCheckBox1.setSelected(Setting.getInstance().isLoadBreakpointAtStartup());
		jCheckBox2.setSelected(Setting.getInstance().isUpdateAfterBochsCommand());

		jBochsRegisterCheckBox.setSelected(Setting.getInstance().isUpdateAfterBochsCommand_register());
		jBochsMemoryCheckBox.setSelected(Setting.getInstance().isUpdateAfterBochsCommand_memory());
		jBochsInstructionCheckBox.setSelected(Setting.getInstance().isUpdateAfterBochsCommand_instruction());
		jBochsBreakpointCheckBox.setSelected(Setting.getInstance().isUpdateAfterBochsCommand_breakpoint());
		jBochsGDTCheckBox.setSelected(Setting.getInstance().isUpdateAfterBochsCommand_gdt());
		jBochsLDTCheckBox.setSelected(Setting.getInstance().isUpdateAfterBochsCommand_ldt());
		jBochsIDTCheckBox.setSelected(Setting.getInstance().isUpdateAfterBochsCommand_idt());
		jBochsPageTableCheckBox.setSelected(Setting.getInstance().isUpdateAfterBochsCommand_pageTable());
		jBochsAddressTranslateCheckBox.setSelected(Setting.getInstance().isUpdateAfterBochsCommand_addressTranslate());
		jBochsStackCheckBox.setSelected(Setting.getInstance().isUpdateAfterBochsCommand_stack());
		jBochsHistoryCheckBox.setSelected(Setting.getInstance().isUpdateAfterBochsCommand_history());

		jFastStepIDTCheckBox.setSelected(Setting.getInstance().isUpdateFastStepCommand_idt());
		jFastStepLDTCheckBox.setSelected(Setting.getInstance().isUpdateFastStepCommand_ldt());
		jFastStepGDTCheckBox.setSelected(Setting.getInstance().isUpdateFastStepCommand_gdt());
		jFastStepBreakpointCheckBox.setSelected(Setting.getInstance().isUpdateFastStepCommand_breakpoint());
		jFastStepInstructionCheckBox.setSelected(Setting.getInstance().isUpdateFastStepCommand_instruction());
		jFastStepMemoryCheckBox.setSelected(Setting.getInstance().isUpdateFastStepCommand_memory());
		jFastStepRegisterCheckBox.setSelected(Setting.getInstance().isUpdateFastStepCommand_register());
		jFastStepHistoryCheckBox.setSelected(Setting.getInstance().isUpdateFastStepCommand_history());

		jMemoryProfilingCheckBox.setSelected(Setting.getInstance().isMemoryProfiling());
		jHitZoneCheckBox.setSelected(Setting.getInstance().isHitZone());
		jCustomZoneCheckBox.setSelected(Setting.getInstance().isCustomZone());
		jJmpProfilingCheckBox.setSelected(Setting.getInstance().isJmpProfiling());
		jInterruptProfilingCheckBox.setSelected(Setting.getInstance().isInterruptProfiling());
		jUpdateGraphCheckBox.setSelected(Setting.getInstance().isProfilingUpdateGraph());

		jLogToPetersoftServerCheckBox.setSelected(Setting.getInstance().isLogToPetersoftServer());

		jObjdumpTextField.setText(Setting.getInstance().getPath_objdump());
		jDwarfdumpTextField.setText(Setting.getInstance().getPath_dwarfdump());
	}

	private void jCheckBox1ActionPerformed(ActionEvent evt) {
		Setting.getInstance().setLoadBreakpointAtStartup(jCheckBox1.isSelected());
	}

	private void jCheckBox2ActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateAfterBochsCommand(jCheckBox2.isSelected());
	}

	private void thisWindowClosing(WindowEvent evt) {
		Setting.getInstance().save();
	}

	private void jInterruptProfilingCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setInterruptProfiling(jInterruptProfilingCheckBox.isSelected());
	}

	private void jCheckBox4ActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateAfterBochsCommand_memory(jBochsMemoryCheckBox.isSelected());
	}

	private void jCheckBox5ActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateAfterBochsCommand_instruction(jBochsInstructionCheckBox.isSelected());
	}

	private void jCheckBox6ActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateAfterBochsCommand_breakpoint(jBochsBreakpointCheckBox.isSelected());
	}

	private void jCheckBox7ActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateAfterBochsCommand_gdt(jBochsGDTCheckBox.isSelected());
	}

	private void jCheckBox8ActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateAfterBochsCommand_ldt(jBochsLDTCheckBox.isSelected());
	}

	private void jCheckBox9ActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateAfterBochsCommand_idt(jBochsIDTCheckBox.isSelected());
	}

	private void jBochsPageTableCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateAfterBochsCommand_pageTable(jBochsPageTableCheckBox.isSelected());
	}

	private void jBochsStackCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateAfterBochsCommand_stack(jBochsStackCheckBox.isSelected());
	}

	private void jBochsAddressTranslateCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateAfterBochsCommand_addressTranslate(jBochsAddressTranslateCheckBox.isSelected());
	}

	private void jBochsHistoryCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateAfterBochsCommand_history(jBochsHistoryCheckBox.isSelected());
	}

	private void jFastStepRegisterCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateFastStepCommand_register(jFastStepRegisterCheckBox.isSelected());
	}

	private void jFastStepMemoryCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateFastStepCommand_memory(jFastStepMemoryCheckBox.isSelected());
	}

	private void jFastStepInstructionCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateFastStepCommand_instruction(jFastStepInstructionCheckBox.isSelected());
	}

	private void jFastStepBreakpointCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateFastStepCommand_breakpoint(jFastStepBreakpointCheckBox.isSelected());
	}

	private void jFastStepGDTCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateFastStepCommand_gdt(jFastStepGDTCheckBox.isSelected());
	}

	private void jFastStepLDTCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateFastStepCommand_ldt(jFastStepLDTCheckBox.isSelected());
	}

	private void jFastStepIDTCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateFastStepCommand_idt(jFastStepIDTCheckBox.isSelected());
	}

	private void jMemoryProfilingCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setMemoryProfiling(jMemoryProfilingCheckBox.isSelected());
	}

	private void jHitZoneCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setHitZone(jHitZoneCheckBox.isSelected());
	}

	private void jCustomZoneCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setCustomZone(jCustomZoneCheckBox.isSelected());
	}

	private void jJmpProfilingCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setJmpProfiling(jJmpProfilingCheckBox.isSelected());
	}

	private void jUpdateGraphCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setProfilingUpdateGraph(jUpdateGraphCheckBox.isSelected());
	}

	private void jLogToPetersoftServerCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setLogToPetersoftServer(jLogToPetersoftServerCheckBox.isSelected());
	}

	private void jFastHistoryCheckBoxActionPerformed(ActionEvent evt) {
		Setting.getInstance().setUpdateFastStepCommand_history(jFastStepHistoryCheckBox.isSelected());
	}

	private void jObjdumpTextFieldKeyReleased(KeyEvent evt) {
		Setting.getInstance().setPath_objdump(jObjdumpTextField.getText());
	}

	private void jBrowseObjdumpButtonActionPerformed(ActionEvent evt) {
		JFileChooser jChooser = new JFileChooser();
		int result = jChooser.showOpenDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {
			File file = jChooser.getSelectedFile();

			if (file.exists()) {
				jObjdumpTextField.setText(file.getAbsolutePath());
				jObjdumpTextFieldKeyReleased(null);
			}
		}
	}

	private void jBrowseDwarfdumpButtonActionPerformed(ActionEvent evt) {
		JFileChooser jChooser = new JFileChooser();
		int result = jChooser.showOpenDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {
			File file = jChooser.getSelectedFile();

			if (file.exists()) {
				jDwarfdumpTextField.setText(file.getAbsolutePath());
				jDwarfdumpTextFieldKeyTyped(null);
			}
		}
	}

	private void jDwarfdumpTextFieldKeyTyped(KeyEvent evt) {
		Setting.getInstance().setPath_dwarfdump(jObjdumpTextField.getText());
	}
}
