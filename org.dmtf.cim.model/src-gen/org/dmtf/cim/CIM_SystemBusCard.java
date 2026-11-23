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
 * A representation of the model object '<em><b>CIM System Bus Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The SystemBusCard class represents additional information for a CIM_Card, detailing the Card's bus type and data width. These properties dictate the type of Slot into which the Card can be inserted. For example, using the properties of this class, one can define that a Card is a PCI, 64 bit adapter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SystemBusCard#getBusType <em>Bus Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemBusCard#getBusWidth <em>Bus Width</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SystemBusCard()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::Physical::Package' keys='Tag,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_SystemBusCard extends CIM_Card {
	/**
	 * Returns the value of the '<em><b>Bus Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated integer describing the System bus type for this Card. It indicates the type of Slot into which the Card can plug. The list of permissible values aligns with the System bus types in CIM_PhysicalConnector.Connector Type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Type</em>' attribute.
	 * @see #setBusType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemBusCard_BusType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"52\",\"64\",\"65\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82\",\"83\",\"84\",\"85\",\"86\",\"87\",\"98\",\"99\",\"100\",\"101\",\"102\",\"103\",\"104\",\"105\",\"106\",\"109\",\"110\",\"111\",\"112\"]' Values='[\"PCI\",\"ISA\",\"EISA\",\"VESA\",\"PCMCIA\",\"PCMCIA Type I\",\"PCMCIA Type II\",\"PCMCIA Type III\",\"CardBus\",\"Access.bus\",\"NuBus\",\"AGP\",\"VME Bus\",\"VME64\",\"Proprietary\",\"Proprietary Processor Card Slot\",\"Proprietary Memory Card Slot\",\"Proprietary I/O Riser Slot\",\"PCI-66MHZ\",\"AGP2X\",\"AGP4X\",\"PC-98\",\"PC-98-Hireso\",\"PC-H98\",\"PC-98Note\",\"PC-98Full\",\"PCI-X\",\"Sbus IEEE 1396-1993 32 bit\",\"Sbus IEEE 1396-1993 64 bit\",\"MCA\",\"GIO\",\"XIO\",\"HIO\",\"NGIO\",\"PMC\",\"Future I/O\",\"InfiniBand\",\"AGP8X\",\"PCI-E\"]' ModelCorrespondence='[\"CIM_PhysicalConnector.ConnectorType\"]'"
	 * @generated
	 */
	Integer getBusType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SystemBusCard#getBusType <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Type</em>' attribute.
	 * @see #getBusType()
	 * @generated
	 */
	void setBusType(Integer value);

	/**
	 * Returns the value of the '<em><b>Bus Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System bus width (in bits) required by this Card. If 'unknown', enter 0. If 'other' than the values, 8, 16, 32, 64 or 128, enter 1. The list of permissible values aligns with the data in CIM_Slot.MaxBusWidth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Width</em>' attribute.
	 * @see #setBusWidth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemBusCard_BusWidth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Bits' ValueMap='[\"0\",\"1\",\"8\",\"16\",\"32\",\"64\",\"128\"]' ModelCorrespondence='[\"CIM_Slot.MaxDataWidth\"]' PUnit='bit'"
	 * @generated
	 */
	Integer getBusWidth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SystemBusCard#getBusWidth <em>Bus Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Width</em>' attribute.
	 * @see #getBusWidth()
	 * @generated
	 */
	void setBusWidth(Integer value);

} // CIM_SystemBusCard
