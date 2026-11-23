/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Architecture Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ArchitectureCheck specifies the hardware platform on which a SoftwareElement can run. The details of this Check are compared with the information found in the CIM_Processor object, related to the CIM_ComputerSystem instance that describes the environment (related by the association, CIM_ComputerSystemProcessor). There should be at least one CIM_Processor that satisfies the details of the Check. In other words, all the processors on the relevant computer system do not need to satisfy the Check.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ArchitectureCheck#getArchitectureType <em>Architecture Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ArchitectureCheck()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.55.0' UMLPackagePath='CIM::Application::CheckAction' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem,CheckID'"
 * @generated
 */
@ProviderType
public interface CIM_ArchitectureCheck extends CIM_Check {
	/**
	 * Returns the value of the '<em><b>Architecture Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ArchitectureType property identifies a particular type of architecture or architectural family that is required to properly execute a particular SoftwareElement. The intent is to capture the details about the machine instructions exploited by the executables of the SoftwareElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Architecture Type</em>' attribute.
	 * @see #setArchitectureType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ArchitectureCheck_ArchitectureType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82\",\"83\",\"84\",\"85\",\"86\",\"87\",\"88\",\"96\",\"97\",\"98\",\"99\",\"100\",\"101\",\"102\",\"103\",\"104\",\"105\",\"106\",\"107\",\"112\",\"120\",\"121\",\"122\",\"128\",\"130\",\"131\",\"132\",\"133\",\"134\",\"135\",\"136\",\"137\",\"138\",\"139\",\"140\",\"141\",\"142\",\"143\",\"144\",\"145\",\"146\",\"147\",\"148\",\"149\",\"150\",\"160\",\"161\",\"162\",\"163\",\"164\",\"165\",\"166\",\"167\",\"168\",\"169\",\"170\",\"171\",\"172\",\"173\",\"174\",\"175\",\"176\",\"177\",\"178\",\"179\",\"180\",\"181\",\"182\",\"183\",\"184\",\"185\",\"186\",\"187\",\"188\",\"189\",\"190\",\"191\",\"192\",\"193\",\"194\",\"195\",\"196\",\"197\",\"198\",\"199\",\"200\",\"201\",\"202\",\"203\",\"204\",\"205\",\"206\",\"207\",\"210\",\"211\",\"212\",\"213\",\"214\",\"215\",\"216\",\"217\",\"218\",\"219\",\"221\",\"222\",\"223\",\"224\",\"228\",\"229\",\"230\",\"231\",\"232\",\"233\",\"234\",\"235\",\"236\",\"237\",\"238\",\"239\",\"250\",\"251\",\"254\",\"255\",\"256\",\"257\",\"258\",\"259\",\"260\",\"261\",\"280\",\"281\",\"300\",\"301\",\"302\",\"320\",\"350\",\"500\",\"512\",\"513\",\"514\",\"600\",\"601\",\"602\",\"603\",\"604\",\"605\",\"606\",\"607\",\"608\",\"609\",\"610\",\"620\",\"621\",\"622\",\"623\",\"624\",\"625\",\"65534\",\"65535\"]' Values='[\"Other\",\"Unknown\",\"8086\",\"80286\",\"80386\",\"80486\",\"8087\",\"80287\",\"80387\",\"80487\",\"Pentium(R) brand\",\"Pentium(R) Pro\",\"Pentium(R) II\",\"Pentium(R) processor with MMX(TM) technology\",\"Celeron(TM)\",\"Pentium(R) II Xeon(TM)\",\"Pentium(R) III\",\"M1 Family\",\"M2 Family\",\"Intel(R) Celeron(R) M processor\",\"Intel(R) Pentium(R) 4 HT processor\",\"K5 Family\",\"K6 Family\",\"K6-2\",\"K6-3\",\"AMD Athlon(TM) Processor Family\",\"AMD(R) Duron(TM) Processor\",\"AMD29000 Family\",\"K6-2+\",\"Power PC Family\",\"Power PC 601\",\"Power PC 603\",\"Power PC 603+\",\"Power PC 604\",\"Power PC 620\",\"Power PC X704\",\"Power PC 750\",\"Intel(R) Core(TM) Duo processor\",\"Intel(R) Core(TM) Duo mobile processor\",\"Intel(R) Core(TM) Solo mobile processor\",\"Intel(R) Atom(TM) processor\",\"Intel(R) Core(TM) M processor\",\"Intel(R) Core(TM) m3 processor\",\"Intel(R) Core(TM) m5 processor\",\"Intel(R) Core(TM) m7 processor\",\"Alpha Family\",\"Alpha 21064\",\"Alpha 21066\",\"Alpha 21164\",\"Alpha 21164PC\",\"Alpha 21164a\",\"Alpha 21264\",\"Alpha 21364\",\"AMD Turion(TM) II Ultra Dual-Core Mobile M Processor Family\",\"AMD Turion(TM) II Dual-Core Mobile M Processor Family\",\"AMD Athlon(TM) II Dual-Core Mobile M Processor Family\",\"AMD Opteron(TM) 6100 Series Processor\",\"AMD Opteron(TM) 4100 Series Processor\",\"AMD Opteron(TM) 6200 Series Processor\",\"AMD Opteron(TM) 4200 Series Processor\",\"AMD FX(TM) Series Processor\",\"MIPS Family\",\"MIPS R4000\",\"MIPS R4200\",\"MIPS R4400\",\"MIPS R4600\",\"MIPS R10000\",\"AMD C-Series Processor\",\"AMD E-Series Processor\",\"AMD A-Series Processor\",\"AMD G-Series Processor\",\"AMD Z-Series Processor\",\"AMD R-Series Processor\",\"AMD Opteron(TM) 4300 Series Processor\",\"AMD Opteron(TM) 6300 Series Processor\",\"AMD Opteron(TM) 3300 Series Processor\",\"AMD FirePro(TM) Series Processor\",\"SPARC Family\",\"SuperSPARC\",\"microSPARC II\",\"microSPARC IIep\",\"UltraSPARC\",\"UltraSPARC II\",\"UltraSPARC IIi\",\"UltraSPARC III\",\"UltraSPARC IIIi\",\"68040\",\"68xxx Family\",\"68000\",\"68010\",\"68020\",\"68030\",\"AMD Athlon(TM) X4 Quad-Core Processor Family\",\"AMD Opteron(TM) X1000 Series Processor\",\"AMD Opteron(TM) X2000 Series APU\",\"AMD Opteron(TM) A-Series Processor\",\"AMD Opteron(TM) X3000 Series APU\",\"AMD Zen Processor Family\",\"Hobbit Family\",\"Crusoe(TM) TM5000 Family\",\"Crusoe(TM) TM3000 Family\",\"Efficeon(TM) TM8000 Family\",\"Weitek\",\"Itanium(TM) Processor\",\"AMD Athlon(TM) 64 Processor Family\",\"AMD Opteron(TM) Processor Family\",\"AMD Sempron(TM) Processor Family\",\"AMD Turion(TM) 64 Mobile Technology\",\"Dual-Core AMD Opteron(TM) Processor Family\",\"AMD Athlon(TM) 64 X2 Dual-Core Processor Family\",\"AMD Turion(TM) 64 X2 Mobile Technology\",\"Quad-Core AMD Opteron(TM) Processor Family\",\"Third-Generation AMD Opteron(TM) Processor Family\",\"AMD Phenom(TM) FX Quad-Core Processor Family\",\"AMD Phenom(TM) X4 Quad-Core Processor Family\",\"AMD Phenom(TM) X2 Dual-Core Processor Family\",\"AMD Athlon(TM) X2 Dual-Core Processor Family\",\"PA-RISC Family\",\"PA-RISC 8500\",\"PA-RISC 8000\",\"PA-RISC 7300LC\",\"PA-RISC 7200\",\"PA-RISC 7100LC\",\"PA-RISC 7100\",\"V30 Family\",\"Quad-Core Intel(R) Xeon(R) processor 3200 Series\",\"Dual-Core Intel(R) Xeon(R) processor 3000 Series\",\"Quad-Core Intel(R) Xeon(R) processor 5300 Series\",\"Dual-Core Intel(R) Xeon(R) processor 5100 Series\",\"Dual-Core Intel(R) Xeon(R) processor 5000 Series\",\"Dual-Core Intel(R) Xeon(R) processor LV\",\"Dual-Core Intel(R) Xeon(R) processor ULV\",\"Dual-Core Intel(R) Xeon(R) processor 7100 Series\",\"Quad-Core Intel(R) Xeon(R) processor 5400 Series\",\"Quad-Core Intel(R) Xeon(R) processor\",\"Dual-Core Intel(R) Xeon(R) processor 5200 Series\",\"Dual-Core Intel(R) Xeon(R) processor 7200 Series\",\"Quad-Core Intel(R) Xeon(R) processor 7300 Series\",\"Quad-Core Intel(R) Xeon(R) processor 7400 Series\",\"Multi-Core Intel(R) Xeon(R) processor 7400 Series\",\"Pentium(R) III Xeon(TM)\",\"Pentium(R) III Processor with Intel(R) SpeedStep(TM) Technology\",\"Pentium(R) 4\",\"Intel(R) Xeon(TM)\",\"AS400 Family\",\"Intel(R) Xeon(TM) processor MP\",\"AMD Athlon(TM) XP Family\",\"AMD Athlon(TM) MP Family\",\"Intel(R) Itanium(R) 2\",\"Intel(R) Pentium(R) M processor\",\"Intel(R) Celeron(R) D processor\",\"Intel(R) Pentium(R) D processor\",\"Intel(R) Pentium(R) Processor Extreme Edition\",\"Intel(R) Core(TM) Solo Processor\",\"K7\",\"Intel(R) Core(TM)2 Duo Processor\",\"Intel(R) Core(TM)2 Solo processor\",\"Intel(R) Core(TM)2 Extreme processor\",\"Intel(R) Core(TM)2 Quad processor\",\"Intel(R) Core(TM)2 Extreme mobile processor\",\"Intel(R) Core(TM)2 Duo mobile processor\",\"Intel(R) Core(TM)2 Solo mobile processor\",\"Intel(R) Core(TM) i7 processor\",\"Dual-Core Intel(R) Celeron(R) Processor\",\"S/390 and zSeries Family\",\"ESA/390 G4\",\"ESA/390 G5\",\"ESA/390 G6\",\"z/Architectur base\",\"Intel(R) Core(TM) i5 processor\",\"Intel(R) Core(TM) i3 processor\",\"Intel(R) Core(TM) i9 processor\",\"VIA C7(TM)-M Processor Family\",\"VIA C7(TM)-D Processor Family\",\"VIA C7(TM) Processor Family\",\"VIA Eden(TM) Processor Family\",\"Multi-Core Intel(R) Xeon(R) processor\",\"Dual-Core Intel(R) Xeon(R) processor 3xxx Series\",\"Quad-Core Intel(R) Xeon(R) processor 3xxx Series\",\"VIA Nano(TM) Processor Family\",\"Dual-Core Intel(R) Xeon(R) processor 5xxx Series\",\"Quad-Core Intel(R) Xeon(R) processor 5xxx Series\",\"Dual-Core Intel(R) Xeon(R) processor 7xxx Series\",\"Quad-Core Intel(R) Xeon(R) processor 7xxx Series\",\"Multi-Core Intel(R) Xeon(R) processor 7xxx Series\",\"Multi-Core Intel(R) Xeon(R) processor 3400 Series\",\"AMD Opteron(TM) 3000 Series Processor\",\"AMD Sempron(TM) II Processor Family\",\"Embedded AMD Opteron(TM) Quad-Core Processor Family\",\"AMD Phenom(TM) Triple-Core Processor Family\",\"AMD Turion(TM) Ultra Dual-Core Mobile Processor Family\",\"AMD Turion(TM) Dual-Core Mobile Processor Family\",\"AMD Athlon(TM) Dual-Core Processor Family\",\"AMD Sempron(TM) SI Processor Family\",\"AMD Phenom(TM) II Processor Family\",\"AMD Athlon(TM) II Processor Family\",\"Six-Core AMD Opteron(TM) Processor Family\",\"AMD Sempron(TM) M Processor Family\",\"i860\",\"i960\",\"Reserved (SMBIOS Extension)\",\"Reserved (Un-initialized Flash Content - Lo)\",\"ARMv7\",\"ARMv8\",\"ARMv9\",\"Reserved for future use by ARM\",\"SH-3\",\"SH-4\",\"ARM\",\"StrongARM\",\"6x86\",\"MediaGX\",\"MII\",\"WinChip\",\"DSP\",\"Video Processor\",\"RISC-V RV32\",\"RISC-V RV64\",\"RISC-V RV128\",\"LoongArch\",\"Loongson(TM) 1 Processor Family\",\"Loongson(TM) 2 Processor Family\",\"Loongson(TM) 3 Processor Family\",\"Loongson(TM) 2K Processor Family\",\"Loongson(TM) 3A Processor Family\",\"Loongson(TM) 3B Processor Family\",\"Loongson(TM) 3C Processor Family\",\"Loongson(TM) 3D Processor Family\",\"Loongson(TM) 3E Processor Family\",\"Dual-Core Loongson(TM) 2K Processor 2xxx Series\",\"Quad-Core Loongson(TM) 3A Processor 5xxx Series\",\"Multi-Core Loongson(TM) 3A Processor 5xxx Series\",\"Quad-Core Loongson(TM) 3B Processor 5xxx Series\",\"Multi-Core Loongson(TM) 3B Processor 5xxx Series\",\"Multi-Core Loongson(TM) 3C Processor 5xxx Series\",\"Multi-Core Loongson(TM) 3D Processor 5xxx Series\",\"Reserved (For Future Special Purpose Assignment)\",\"Reserved (Un-initialized Flash Content - Hi)\"]' MappingStrings='[\"MIF.DMTF|Processor|017.3\"]' ModelCorrespondence='[\"CIM_Processor.Family\"]'"
	 * @generated
	 */
	Integer getArchitectureType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ArchitectureCheck#getArchitectureType <em>Architecture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture Type</em>' attribute.
	 * @see #getArchitectureType()
	 * @generated
	 */
	void setArchitectureType(Integer value);

} // CIM_ArchitectureCheck
