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
 * A representation of the model object '<em><b>CIM Controlled By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ControlledBy relationship indicates which Devices are controlled by a CIM_Controller.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ControlledBy#getAccessState <em>Access State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ControlledBy#getTimeOfDeviceReset <em>Time Of Device Reset</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ControlledBy#getNumberOfHardResets <em>Number Of Hard Resets</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ControlledBy#getNumberOfSoftResets <em>Number Of Soft Resets</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ControlledBy#getDeviceNumber <em>Device Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ControlledBy#getAccessMode <em>Access Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ControlledBy#getAccessPriority <em>Access Priority</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ControlledBy()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Device::Controller' override.Antecedent='CIM_Controller REF' override.Antecedent.Description='The Controller.' override.Dependent='CIM_LogicalDevice REF' override.Dependent.Description='The controlled Device.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ControlledBy extends CIM_DeviceConnection {
	/**
	 * Returns the value of the '<em><b>Access State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The State property indicates whether the Controller is actively commanding or accessing the Device (value=1) or not (value=2). Also, the value, "Unknown" (0), can be defined. This information is necessary when a LogicalDevice can be commanded by, or accessed through, multiple Controllers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access State</em>' attribute.
	 * @see #setAccessState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ControlledBy_AccessState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"Active\",\"Inactive\"]'"
	 * @generated
	 */
	Integer getAccessState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ControlledBy#getAccessState <em>Access State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access State</em>' attribute.
	 * @see #getAccessState()
	 * @generated
	 */
	void setAccessState(Integer value);

	/**
	 * Returns the value of the '<em><b>Time Of Device Reset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time that the downstream Device was last reset by the Controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Of Device Reset</em>' attribute.
	 * @see #setTimeOfDeviceReset(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ControlledBy_TimeOfDeviceReset()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimeOfDeviceReset();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ControlledBy#getTimeOfDeviceReset <em>Time Of Device Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Device Reset</em>' attribute.
	 * @see #getTimeOfDeviceReset()
	 * @generated
	 */
	void setTimeOfDeviceReset(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Hard Resets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of hard resets issued by the Controller. A hard reset returns the Device to its initialization or boot-up state. All internal Device state information and data are lost.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Hard Resets</em>' attribute.
	 * @see #setNumberOfHardResets(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ControlledBy_NumberOfHardResets()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true'"
	 * @generated
	 */
	Long getNumberOfHardResets();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ControlledBy#getNumberOfHardResets <em>Number Of Hard Resets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Hard Resets</em>' attribute.
	 * @see #getNumberOfHardResets()
	 * @generated
	 */
	void setNumberOfHardResets(Long value);

	/**
	 * Returns the value of the '<em><b>Number Of Soft Resets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of soft resets issued by the Controller. A soft reset does not completely clear current Device state or data. Exact semantics are dependent on the Device and on the protocols and mechanisms used to communicate with the Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Soft Resets</em>' attribute.
	 * @see #setNumberOfSoftResets(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ControlledBy_NumberOfSoftResets()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true'"
	 * @generated
	 */
	Long getNumberOfSoftResets();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ControlledBy#getNumberOfSoftResets <em>Number Of Soft Resets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Soft Resets</em>' attribute.
	 * @see #getNumberOfSoftResets()
	 * @generated
	 */
	void setNumberOfSoftResets(Long value);

	/**
	 * Returns the value of the '<em><b>Device Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Address of associated Device in context of the antecedent Controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Number</em>' attribute.
	 * @see #setDeviceNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ControlledBy_DeviceNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDeviceNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ControlledBy#getDeviceNumber <em>Device Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Number</em>' attribute.
	 * @see #getDeviceNumber()
	 * @generated
	 */
	void setDeviceNumber(String value);

	/**
	 * Returns the value of the '<em><b>Access Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property describes the accessibility of the device through the antecedent controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Mode</em>' attribute.
	 * @see #setAccessMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ControlledBy_AccessMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"ReadWrite\",\"ReadOnly\",\"NoAccess\"]'"
	 * @generated
	 */
	Integer getAccessMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ControlledBy#getAccessMode <em>Access Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Mode</em>' attribute.
	 * @see #getAccessMode()
	 * @generated
	 */
	void setAccessMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Access Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property describes the priority given to accesses of the device through this controller. The highest priority path will have the lowest value for this parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Priority</em>' attribute.
	 * @see #setAccessPriority(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ControlledBy_AccessPriority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getAccessPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ControlledBy#getAccessPriority <em>Access Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Priority</em>' attribute.
	 * @see #getAccessPriority()
	 * @generated
	 */
	void setAccessPriority(Integer value);

} // CIM_ControlledBy
