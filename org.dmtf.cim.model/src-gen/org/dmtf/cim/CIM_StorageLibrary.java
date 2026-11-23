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
 * A representation of the model object '<em><b>CIM Storage Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StorageLibrary is a collection of ManagedSystemElements that operate together to provide cartridge library capabilities. This object serves as an aggregation point to group the following elements: MediaTransferDevices, a Label Reader, a library Door, MediaAccessDevices, and other Library components. 
 * The use of this class is deprecated in favor of CIM_ComputerSystem. Originally it was felt that a media library could be purely mechanical and thus not a ComputerSystem. However all manageable libraries are ComputerSystems. This change simplifies the use of the model by client software.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageLibrary#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageLibrary#getOverfilled <em>Overfilled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageLibrary#getAuditNeeded <em>Audit Needed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageLibrary#getAuditInProgress <em>Audit In Progress</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageLibrary#getMaxAuditTime <em>Max Audit Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageLibrary#getAutomated <em>Automated</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageLibrary#getRoboticsEnabled <em>Robotics Enabled</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageLibrary()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_ComputerSystem\",\"CIM_StorageLibraryCapabilities\"]' Version='2.9.0' UMLPackagePath='CIM::Device::StorageLib' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_StorageLibrary extends CIM_System {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities of the StorageLibrary. For example, it can be indicated that the Library can perform automatic cleaning of the MediaAccessDevices contained in it (value=1) or that the Library provides physical door access for an operator (value=2).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageLibrary_Capabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Automatic Cleaning\",\"Manual Operation\",\"Front Panel Lockable\"]'"
	 * @generated
	 */
	EList<Integer> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Overfilled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is deprecated in favour of an OperationalStatus value of 4 ('stressed').
	 * Boolean set to TRUE if there are more PhysicalMedia in a Library than there are StorageMediaLocations to contain them. For instance, if all MediaAccessDevices have a Media loaded in them, and all StorageMediaLocations are loaded by an operator, then an Overfilled condition exists.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overfilled</em>' attribute.
	 * @see #setOverfilled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageLibrary_Overfilled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_ComputerSystem.OperationalStatus\"]'"
	 * @generated
	 */
	Boolean getOverfilled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageLibrary#getOverfilled <em>Overfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overfilled</em>' attribute.
	 * @see #getOverfilled()
	 * @generated
	 */
	void setOverfilled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Audit Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is deprecated in favour of an OperationalStatus value of 0 ('Unknown').
	 * Boolean set to TRUE if the Library can not currently report the correct state of each PhysicalMedia within its proper StorageMediaLocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audit Needed</em>' attribute.
	 * @see #setAuditNeeded(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageLibrary_AuditNeeded()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_ComputerSystem.OperationalStatus\"]'"
	 * @generated
	 */
	Boolean getAuditNeeded();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageLibrary#getAuditNeeded <em>Audit Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audit Needed</em>' attribute.
	 * @see #getAuditNeeded()
	 * @generated
	 */
	void setAuditNeeded(Boolean value);

	/**
	 * Returns the value of the '<em><b>Audit In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is deprecated in favour of an OperationalStatus value of 11 ('In Service').
	 * Boolean set to TRUE if an audit of the location of some or all of the Library's PhysicalMedia is currently being performed. That an individual Changer is currently doing an audit is indicated by a similar AuditInProgress boolean property on the Changer object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audit In Progress</em>' attribute.
	 * @see #setAuditInProgress(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageLibrary_AuditInProgress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_ComputerSystem.OperationalStatus\"]'"
	 * @generated
	 */
	Boolean getAuditInProgress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageLibrary#getAuditInProgress <em>Audit In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audit In Progress</em>' attribute.
	 * @see #getAuditInProgress()
	 * @generated
	 */
	void setAuditInProgress(Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Audit Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum time in seconds that it takes for the Storage Library to perform a complete audit of each StorageMedia Location, to determine the absence or presence of a Physical Media. If automated support is not provided, then this property's value is undefined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Audit Time</em>' attribute.
	 * @see #setMaxAuditTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageLibrary_MaxAuditTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getMaxAuditTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageLibrary#getMaxAuditTime <em>Max Audit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Audit Time</em>' attribute.
	 * @see #getMaxAuditTime()
	 * @generated
	 */
	void setMaxAuditTime(Long value);

	/**
	 * Returns the value of the '<em><b>Automated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is deprecated since all managed libraries willbe automated.
	 * Boolean set to TRUE if the Library includes a robotics mechanism that can be controlled by a ComputerSystem, to automatically load and unload PhysicalMedia to/from MediaAccessDevices and StorageMediaLocations. The property is set to FALSE if the Library represents a repository of Media that are inaccessible to a MediaAccess Device without human intervention. An example of a non- automated Library is a 'shelf' or 'vault' where Physical Media are kept for extended periods of time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automated</em>' attribute.
	 * @see #setAutomated(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageLibrary_Automated()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Boolean getAutomated();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageLibrary#getAutomated <em>Automated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automated</em>' attribute.
	 * @see #getAutomated()
	 * @generated
	 */
	void setAutomated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Robotics Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is deprecated in favour of an OperationalStatus value of 10 ('Stopped').
	 * Boolean indicating whether the Library's robotics are currently active/enabled. If TRUE, then the Library may not be safe for a human to enter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Robotics Enabled</em>' attribute.
	 * @see #setRoboticsEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageLibrary_RoboticsEnabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_ComputerSystem.OperationalStatus\"]'"
	 * @generated
	 */
	Boolean getRoboticsEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageLibrary#getRoboticsEnabled <em>Robotics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robotics Enabled</em>' attribute.
	 * @see #getRoboticsEnabled()
	 * @generated
	 */
	void setRoboticsEnabled(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests that the Library robotics be enabled for automated operation (input parameter, Enabled, set to TRUE), or disabled for manual operation (input parameter set to FALSE). The return value should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param Enable Set TRUE to enable.
	 * <!-- end-model-doc -->
	 * @model EnableAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_ComputerSystem.RequestStateChange\"]'"
	 * @generated
	 */
	Long EnableRobotics(Boolean Enable);

} // CIM_StorageLibrary
