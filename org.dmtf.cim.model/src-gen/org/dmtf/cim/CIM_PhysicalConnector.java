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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Physical Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The PhysicalConnector class represents any PhysicalElement that is used to connect to other Elements. Any object that can be used to connect and transmit signals or power between two or more PhysicalElements is a descendant (or member) of this class. For example, Slots and D-shell connectors are types of PhysicalConnectors.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalConnector#getConnectorPinout <em>Connector Pinout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalConnector#getConnectorType <em>Connector Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalConnector#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalConnector#getConnectorGender <em>Connector Gender</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalConnector#getConnectorElectricalCharacteristics <em>Connector Electrical Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalConnector#getOtherElectricalCharacteristics <em>Other Electrical Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalConnector#getNumPhysicalPins <em>Num Physical Pins</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalConnector#getConnectorLayout <em>Connector Layout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalConnector#getConnectorDescription <em>Connector Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalConnector()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::Physical::Package' keys='Tag,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_PhysicalConnector extends CIM_PhysicalElement {
	/**
	 * Returns the value of the '<em><b>Connector Pinout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string describing the pin configuration and/or signal usage of a PhysicalConnector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Pinout</em>' attribute.
	 * @see #setConnectorPinout(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalConnector_ConnectorPinout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalConnector.NumPhysicalPins\"]'"
	 * @generated
	 */
	String getConnectorPinout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalConnector#getConnectorPinout <em>Connector Pinout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Pinout</em>' attribute.
	 * @see #getConnectorPinout()
	 * @generated
	 */
	void setConnectorPinout(String value);

	/**
	 * Returns the value of the '<em><b>Connector Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers defining the type of PhysicalConnector. An array is specified to allow the description of 'combinations' of Connector information. For example, one array entry could specify RS-232 (value=25), another DB-25 (value=23) and a third entry define the Connector as "Male" (value=2). 
	 * This single property is being deprecated in lieu of using separate properties to describe the various aspects of the connector. The separation allows for a more generic means of describing the connectors. Obsolete connectors were intentionally removed from the new list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalConnector_ConnectorType()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_PhysicalConnector.ConnectorGender\",\"CIM_PhysicalConnector.ConnectorElectricalCharacteristics\",\"CIM_PhysicalConnector.NumPhysicalPins\",\"CIM_PhysicalConnector.ConnectorLayout\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82\",\"83\",\"84\",\"85\",\"86\",\"87\",\"88\",\"89\",\"90\",\"91\",\"92\",\"93\",\"94\",\"95\",\"96\",\"97\",\"98\",\"99\",\"100\",\"101\",\"102\",\"103\",\"104\",\"105\",\"106\",\"107\",\"108\",\"109\",\"110\",\"111\",\"112\",\"113\",\"114\",\"115\",\"116\",\"117\",\"118\",\"119\",\"120\",\"121\",\"122\",\"123-150\"]' Values='[\"Unknown\",\"Other\",\"Male\",\"Female\",\"Shielded\",\"Unshielded\",\"SCSI (A) High-Density (50 pins)\",\"SCSI (A) Low-Density (50 pins)\",\"SCSI (P) High-Density (68 pins)\",\"SCSI SCA-I (80 pins)\",\"SCSI SCA-II (80 pins)\",\"Fibre Channel (DB-9, Copper)\",\"Fibre Channel (Optical Fibre)\",\"Fibre Channel SCA-II (40 pins)\",\"Fibre Channel SCA-II (20 pins)\",\"Fibre Channel BNC\",\"ATA 3-1/2 Inch (40 pins)\",\"ATA 2-1/2 Inch (44 pins)\",\"ATA-2\",\"ATA-3\",\"ATA/66\",\"DB-9\",\"DB-15\",\"DB-25\",\"DB-36\",\"RS-232C\",\"RS-422\",\"RS-423\",\"RS-485\",\"RS-449\",\"V.35\",\"X.21\",\"IEEE-488\",\"AUI\",\"UPT Category 3\",\"UPT Category 4\",\"UPT Category 5\",\"BNC\",\"RJ11\",\"RJ45\",\"Fiber MIC\",\"Apple AUI\",\"Apple GeoPort\",\"PCI\",\"ISA\",\"EISA\",\"VESA\",\"PCMCIA\",\"PCMCIA Type I\",\"PCMCIA Type II\",\"PCMCIA Type III\",\"ZV Port\",\"CardBus\",\"USB\",\"IEEE 1394\",\"HIPPI\",\"HSSDC (6 pins)\",\"GBIC\",\"DIN\",\"Mini-DIN\",\"Micro-DIN\",\"PS/2\",\"Infrared\",\"HP-HIL\",\"Access.bus\",\"NuBus\",\"Centronics\",\"Mini-Centronics\",\"Mini-Centronics Type-14\",\"Mini-Centronics Type-20\",\"Mini-Centronics Type-26\",\"Bus Mouse\",\"ADB\",\"AGP\",\"VME Bus\",\"VME64\",\"Proprietary\",\"Proprietary Processor Card Slot\",\"Proprietary Memory Card Slot\",\"Proprietary I/O Riser Slot\",\"PCI-66MHZ\",\"AGP2X\",\"AGP4X\",\"PC-98\",\"PC-98-Hireso\",\"PC-H98\",\"PC-98Note\",\"PC-98Full\",\"SSA SCSI\",\"Circular\",\"On Board IDE Connector\",\"On Board Floppy Connector\",\"9 Pin Dual Inline\",\"25 Pin Dual Inline\",\"50 Pin Dual Inline\",\"68 Pin Dual Inline\",\"On Board Sound Connector\",\"Mini-jack\",\"PCI-X\",\"Sbus IEEE 1396-1993 32 bit\",\"Sbus IEEE 1396-1993 64 bit\",\"MCA\",\"GIO\",\"XIO\",\"HIO\",\"NGIO\",\"PMC\",\"MTRJ\",\"VF-45\",\"Future I/O\",\"SC\",\"SG\",\"Electrical\",\"Optical\",\"Ribbon\",\"GLM\",\"1x9\",\"Mini SG\",\"LC\",\"HSSC\",\"VHDCI Shielded (68 pins)\",\"InfiniBand\",\"AGP8X\",\"DMTF Reserved\"]' ArrayType='Indexed' MappingStrings='[\"MIF.DMTF|Bus Port|004.10\"]' ModelCorrespondence='[\"CIM_PhysicalConnector.OtherTypeDescription\"]'"
	 * @generated
	 */
	EList<Integer> getConnectorType();

	/**
	 * Returns the value of the '<em><b>Other Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the Connector - used when the ConnectorType property is set to 1 ("Other"). OtherType Description should be set to NULL when ConnectorType is any value other than 1. 
	 * The use of this property is deprecated in lieu of Connector Description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Type Description</em>' attribute.
	 * @see #setOtherTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalConnector_OtherTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_PhysicalConnector.ConnectorDescription\"]' MappingStrings='[\"MIF.DMTF|Bus Port|004.11\"]' ModelCorrespondence='[\"CIM_PhysicalConnector.ConnectorType\"]'"
	 * @generated
	 */
	String getOtherTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalConnector#getOtherTypeDescription <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Type Description</em>' attribute.
	 * @see #getOtherTypeDescription()
	 * @generated
	 */
	void setOtherTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Connector Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the gender of the connector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Gender</em>' attribute.
	 * @see #setConnectorGender(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalConnector_ConnectorGender()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\"]' Values='[\"Unknown\",\"Male\",\"Female\"]'"
	 * @generated
	 */
	Integer getConnectorGender();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalConnector#getConnectorGender <em>Connector Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Gender</em>' attribute.
	 * @see #getConnectorGender()
	 * @generated
	 */
	void setConnectorGender(Integer value);

	/**
	 * Returns the value of the '<em><b>Connector Electrical Characteristics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the electrical characteristic for this connector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Electrical Characteristics</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalConnector_ConnectorElectricalCharacteristics()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"Single Ended\",\"Differential\",\"Low Voltage Differential\",\"Optical\",\"Copper\",\"Shielded\",\"Unshielded\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PhysicalConnector.OtherElectricalCharacteristics\"]'"
	 * @generated
	 */
	EList<Integer> getConnectorElectricalCharacteristics();

	/**
	 * Returns the value of the '<em><b>Other Electrical Characteristics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the connector's electrical characteristics - used when the ConnectorElectricalCharacteristics property contains an entry of 1 (Other). OtherElectricalCharacteristics should be set to NULL when ConnectorElectricalCharacteristics does not contain an value of 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Electrical Characteristics</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalConnector_OtherElectricalCharacteristics()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PhysicalConnector.ConnectorElectricalCharacteristics\"]'"
	 * @generated
	 */
	EList<String> getOtherElectricalCharacteristics();

	/**
	 * Returns the value of the '<em><b>Num Physical Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the number of physical pins (male/female) that are present on this connector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Physical Pins</em>' attribute.
	 * @see #setNumPhysicalPins(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalConnector_NumPhysicalPins()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_PhysicalConnector.ConnectorPinout\"]'"
	 * @generated
	 */
	Long getNumPhysicalPins();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalConnector#getNumPhysicalPins <em>Num Physical Pins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Physical Pins</em>' attribute.
	 * @see #getNumPhysicalPins()
	 * @generated
	 */
	void setNumPhysicalPins(Long value);

	/**
	 * Returns the value of the '<em><b>Connector Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the type of packaging normally associated with this type of connector.16 (PCI) - describes the generic PCI connector layout. 17 (PCI-X) - describes the PCI Extended connector layout. 18 (PCI-E) - describes the PCI Express connector layout, where the actual layout as far as the length is concerned is unknown. 19 - 25 (PCI-E xN) - describes the PCI Express connector layout, where N is the lane count that appropriately descirbes the length of the PCI-E connector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Layout</em>' attribute.
	 * @see #setConnectorLayout(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalConnector_ConnectorLayout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26..32567\",\"32568..65535\"]' Values='[\"Unknown\",\"Other\",\"RS232\",\"BNC\",\"RJ11\",\"RJ45\",\"DB9\",\"Slot\",\"SCSI High Density\",\"SCSI Low Density\",\"Ribbon\",\"AUI\",\"Fiber SC\",\"Fiber ST\",\"FDDI-MIC\",\"Fiber-RTMJ\",\"PCI\",\"PCI-X\",\"PCI-E\",\"PCI-E x1\",\"PCI-E x2\",\"PCI-E x4\",\"PCI-E x8\",\"PCI-E x16\",\"PCI-E x32\",\"PCI-E x64\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_PhysicalConnector.ConnectorDescription\"]'"
	 * @generated
	 */
	Integer getConnectorLayout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalConnector#getConnectorLayout <em>Connector Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Layout</em>' attribute.
	 * @see #getConnectorLayout()
	 * @generated
	 */
	void setConnectorLayout(Integer value);

	/**
	 * Returns the value of the '<em><b>Connector Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the Connector - used when the ConnectorLayout property is set to 1 ("Other"). Connector Description should be set to NULL when ConnectorLayout is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Description</em>' attribute.
	 * @see #setConnectorDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalConnector_ConnectorDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIF.DMTF|Bus Port|004.11\"]' ModelCorrespondence='[\"CIM_PhysicalConnector.ConnectorLayout\"]'"
	 * @generated
	 */
	String getConnectorDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalConnector#getConnectorDescription <em>Connector Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Description</em>' attribute.
	 * @see #getConnectorDescription()
	 * @generated
	 */
	void setConnectorDescription(String value);

} // CIM_PhysicalConnector
