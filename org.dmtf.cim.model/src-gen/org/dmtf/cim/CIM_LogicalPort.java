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
 * A representation of the model object '<em><b>CIM Logical Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The abstraction of a port or connection point of a Device. This object should be instantiated when the Port has independent management characteristics from the Device that includes it. Examples are a Fibre Channel Port and a USB Port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LogicalPort#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalPort#getMaxSpeed <em>Max Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalPort#getRequestedSpeed <em>Requested Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalPort#getUsageRestriction <em>Usage Restriction</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalPort#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalPort#getOtherPortType <em>Other Port Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPort()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::Ports' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_LogicalPort extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bandwidth of the Port in Bits per Second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPort_Speed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bits per Second' PUnit='bit / second'"
	 * @generated
	 */
	Long getSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalPort#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Max Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum bandwidth of the Port in Bits per Second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Speed</em>' attribute.
	 * @see #setMaxSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPort_MaxSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bits per Second' PUnit='bit / second'"
	 * @generated
	 */
	Long getMaxSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalPort#getMaxSpeed <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Speed</em>' attribute.
	 * @see #getMaxSpeed()
	 * @generated
	 */
	void setMaxSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Requested Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The requested bandwidth of the Port in Bits per Second. The actual bandwidth is reported in LogicalPort.Speed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Speed</em>' attribute.
	 * @see #setRequestedSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPort_RequestedSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Write='true' Units='Bits per Second' ModelCorrespondence='[\"CIM_LogicalPort.Speed\"]' PUnit='bit / second'"
	 * @generated
	 */
	Long getRequestedSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalPort#getRequestedSpeed <em>Requested Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Speed</em>' attribute.
	 * @see #getRequestedSpeed()
	 * @generated
	 */
	void setRequestedSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Usage Restriction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In some circumstances, a LogicalPort might be identifiable as a front end or back end port. An example of this situation would be a storage array that might have back end ports to communicate with disk drives and front end ports to communicate with hosts. If there is no restriction on the use of the port, then the value should be set to 'not restricted'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Restriction</em>' attribute.
	 * @see #setUsageRestriction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPort_UsageRestriction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Front-end only\",\"Back-end only\",\"Not restricted\"]'"
	 * @generated
	 */
	Integer getUsageRestriction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalPort#getUsageRestriction <em>Usage Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Restriction</em>' attribute.
	 * @see #getUsageRestriction()
	 * @generated
	 */
	void setUsageRestriction(Integer value);

	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PortType is defined to force consistent naming of the 'type' property in subclasses and to guarantee unique enum values for all instances of NetworkPort. When set to 1 ("Other"), related property OtherPortType contains a string description of the type of port. A range of values, DMTF_Reserved, has been defined that allows subclasses to override and define their specific types of ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Type</em>' attribute.
	 * @see #setPortType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPort_PortType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3..15999\",\"16000..65535\"]' Values='[\"Unknown\",\"Other\",\"Not Applicable\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_NetworkPort.OtherNetworkPortType\"]'"
	 * @generated
	 */
	Integer getPortType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalPort#getPortType <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' attribute.
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the type of module, when PortType is set to 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Port Type</em>' attribute.
	 * @see #setOtherPortType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPort_OtherPortType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_LogicalPort.PortType\"]'"
	 * @generated
	 */
	String getOtherPortType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalPort#getOtherPortType <em>Other Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Port Type</em>' attribute.
	 * @see #getOtherPortType()
	 * @generated
	 */
	void setOtherPortType(String value);

} // CIM_LogicalPort
