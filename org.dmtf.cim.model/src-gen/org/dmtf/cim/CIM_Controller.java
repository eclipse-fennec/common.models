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
 * A representation of the model object '<em><b>CIM Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Controller is a superclass for grouping the miscellaneous control-related Devices that provide a classic bus master interface. Examples of Controllers are USBControllers, SerialControllers, and so on. The Controller class is an abstraction for Devices with a single protocol stack, which exist to control communications (data, control, and reset) to downstream devices. Note that a new abstract class (ProtocolController) has been created to model more complex interface controllers such as SCSI.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Controller#getTimeOfLastReset <em>Time Of Last Reset</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Controller#getProtocolSupported <em>Protocol Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Controller#getMaxNumberControlled <em>Max Number Controlled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Controller#getProtocolDescription <em>Protocol Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Controller()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.54.0' UMLPackagePath='CIM::Device::Controller' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_Controller extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Time Of Last Reset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time of last reset of the Controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Of Last Reset</em>' attribute.
	 * @see #setTimeOfLastReset(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Controller_TimeOfLastReset()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimeOfLastReset();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Controller#getTimeOfLastReset <em>Time Of Last Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Last Reset</em>' attribute.
	 * @see #getTimeOfLastReset()
	 * @generated
	 */
	void setTimeOfLastReset(String value);

	/**
	 * Returns the value of the '<em><b>Protocol Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The protocol used by the Controller to access controlled Devices.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Supported</em>' attribute.
	 * @see #setProtocolSupported(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Controller_ProtocolSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\"]' Values='[\"Other\",\"Unknown\",\"EISA\",\"ISA\",\"PCI\",\"ATA/ATAPI\",\"Flexible Diskette\",\"1496\",\"SCSI Parallel Interface\",\"SCSI Fibre Channel Protocol\",\"SCSI Serial Bus Protocol\",\"SCSI Serial Bus Protocol-2 (1394)\",\"SCSI Serial Storage Architecture\",\"VESA\",\"PCMCIA\",\"Universal Serial Bus\",\"Parallel Protocol\",\"ESCON\",\"Diagnostic\",\"I2C\",\"Power\",\"HIPPI\",\"MultiBus\",\"VME\",\"IPI\",\"IEEE-488\",\"RS232\",\"IEEE 802.3 10BASE5\",\"IEEE 802.3 10BASE2\",\"IEEE 802.3 1BASE5\",\"IEEE 802.3 10BROAD36\",\"IEEE 802.3 100BASEVG\",\"IEEE 802.5 Token-Ring\",\"ANSI X3T9.5 FDDI\",\"MCA\",\"ESDI\",\"IDE\",\"CMD\",\"ST506\",\"DSSI\",\"QIC2\",\"Enhanced ATA/IDE\",\"AGP\",\"TWIRP (two-way infrared)\",\"FIR (fast infrared)\",\"SIR (serial infrared)\",\"IrBus\",\"Serial ATA\",\"DDR3\",\"DDR4\",\"DDR5\"]' MappingStrings='[\"MIF.DMTF|Bus Port|004.2\",\"MIF.DMTF|Disks|003.3\"]' ModelCorrespondence='[\"CIM_Controller.ProtocolDescription\"]'"
	 * @generated
	 */
	Integer getProtocolSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Controller#getProtocolSupported <em>Protocol Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Supported</em>' attribute.
	 * @see #getProtocolSupported()
	 * @generated
	 */
	void setProtocolSupported(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Number Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of directly addressable entities that are supported by this Controller. A value of 0 should be used if the number is unknown or unlimited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Number Controlled</em>' attribute.
	 * @see #setMaxNumberControlled(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Controller_MaxNumberControlled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIF.DMTF|Bus Port|004.9\"]'"
	 * @generated
	 */
	Long getMaxNumberControlled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Controller#getMaxNumberControlled <em>Max Number Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Controlled</em>' attribute.
	 * @see #getMaxNumberControlled()
	 * @generated
	 */
	void setMaxNumberControlled(Long value);

	/**
	 * Returns the value of the '<em><b>Protocol Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string that provides more information that is related to the ProtocolSupported by the Controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Description</em>' attribute.
	 * @see #setProtocolDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Controller_ProtocolDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIF.DMTF|Bus Port|004.3\"]' ModelCorrespondence='[\"CIM_Controller.ProtocolSupported\"]'"
	 * @generated
	 */
	String getProtocolDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Controller#getProtocolDescription <em>Protocol Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Description</em>' attribute.
	 * @see #getProtocolDescription()
	 * @generated
	 */
	void setProtocolDescription(String value);

} // CIM_Controller
