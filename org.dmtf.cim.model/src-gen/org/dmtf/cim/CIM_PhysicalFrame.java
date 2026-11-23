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
 * A representation of the model object '<em><b>CIM Physical Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PhysicalFrame is a superclass of Rack, Chassis and other frame enclosures, as they are defined in extension classes. Properties like visible or audible alarm, and data related to security breaches are in this superclass.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalFrame#getCableManagementStrategy <em>Cable Management Strategy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalFrame#getServicePhilosophy <em>Service Philosophy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalFrame#getServiceDescriptions <em>Service Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalFrame#getLockPresent <em>Lock Present</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalFrame#getAudibleAlarm <em>Audible Alarm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalFrame#getVisibleAlarm <em>Visible Alarm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalFrame#getSecurityBreach <em>Security Breach</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalFrame#getBreachDescription <em>Breach Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalFrame#getIsLocked <em>Is Locked</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalFrame()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Physical::Package' keys='Tag,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_PhysicalFrame extends CIM_PhysicalPackage {
	/**
	 * Returns the value of the '<em><b>Cable Management Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CableManagementStrategy is a free-form string that contains information on how the various cables are connected and bundled for the Frame. With many networking, storage-related and power cables, cable management can be a complex and challenging endeavor. This string property contains information to aid in assembly and service of the Frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cable Management Strategy</em>' attribute.
	 * @see #setCableManagementStrategy(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalFrame_CableManagementStrategy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCableManagementStrategy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalFrame#getCableManagementStrategy <em>Cable Management Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cable Management Strategy</em>' attribute.
	 * @see #getCableManagementStrategy()
	 * @generated
	 */
	void setCableManagementStrategy(String value);

	/**
	 * Returns the value of the '<em><b>Service Philosophy</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ServicePhilosophy is an enumerated, integer-valued array that indicates whether the Frame is serviced from the top (value=2), front (3), back (4) or side (5), whether it has sliding trays (6) or removable sides (7), and/or whether the Frame is moveable (8), for example, having rollers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Philosophy</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalFrame_ServicePhilosophy()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"Service From Top\",\"Service From Front\",\"Service From Back\",\"Service From Side\",\"Sliding Trays\",\"Removable Sides\",\"Moveable\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PhysicalFrame.ServiceDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getServicePhilosophy();

	/**
	 * Returns the value of the '<em><b>Service Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings providing more detailed explanations for any of the entries in the Service Philosophy array. Note, each entry of this array is related to the entry in ServicePhilosophy that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalFrame_ServiceDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PhysicalFrame.ServicePhilosophy\"]'"
	 * @generated
	 */
	EList<String> getServiceDescriptions();

	/**
	 * Returns the value of the '<em><b>Lock Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the Frame is protected with a lock.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lock Present</em>' attribute.
	 * @see #setLockPresent(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalFrame_LockPresent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getLockPresent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalFrame#getLockPresent <em>Lock Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Present</em>' attribute.
	 * @see #getLockPresent()
	 * @generated
	 */
	void setLockPresent(Boolean value);

	/**
	 * Returns the value of the '<em><b>Audible Alarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the Frame is equipped with an audible alarm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audible Alarm</em>' attribute.
	 * @see #setAudibleAlarm(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalFrame_AudibleAlarm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getAudibleAlarm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalFrame#getAudibleAlarm <em>Audible Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audible Alarm</em>' attribute.
	 * @see #getAudibleAlarm()
	 * @generated
	 */
	void setAudibleAlarm(Boolean value);

	/**
	 * Returns the value of the '<em><b>Visible Alarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the equipment includes a visible alarm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visible Alarm</em>' attribute.
	 * @see #setVisibleAlarm(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalFrame_VisibleAlarm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getVisibleAlarm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalFrame#getVisibleAlarm <em>Visible Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Alarm</em>' attribute.
	 * @see #getVisibleAlarm()
	 * @generated
	 */
	void setVisibleAlarm(Boolean value);

	/**
	 * Returns the value of the '<em><b>Security Breach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SecurityBreach is an enumerated, integer-valued property indicating whether a physical breach of the Frame was attempted but unsuccessful (value=4) or attempted and successful (5). Also, the values, "Unknown", "Other" or "No Breach", can be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Breach</em>' attribute.
	 * @see #setSecurityBreach(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalFrame_SecurityBreach()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Other\",\"Unknown\",\"No Breach\",\"Breach Attempted\",\"Breach Successful\"]' MappingStrings='[\"MIF.DMTF|Physical Container Global Table|004.12\"]' ModelCorrespondence='[\"CIM_PhysicalFrame.BreachDescription\"]'"
	 * @generated
	 */
	Integer getSecurityBreach();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalFrame#getSecurityBreach <em>Security Breach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Breach</em>' attribute.
	 * @see #getSecurityBreach()
	 * @generated
	 */
	void setSecurityBreach(Integer value);

	/**
	 * Returns the value of the '<em><b>Breach Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BreachDescription is a free-form string providing more information if the SecurityBreach property indicates that a breach or some other security-related event occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Breach Description</em>' attribute.
	 * @see #setBreachDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalFrame_BreachDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalFrame.SecurityBreach\"]'"
	 * @generated
	 */
	String getBreachDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalFrame#getBreachDescription <em>Breach Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breach Description</em>' attribute.
	 * @see #getBreachDescription()
	 * @generated
	 */
	void setBreachDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the Frame is currently locked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Locked</em>' attribute.
	 * @see #setIsLocked(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalFrame_IsLocked()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsLocked();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalFrame#getIsLocked <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Locked</em>' attribute.
	 * @see #getIsLocked()
	 * @generated
	 */
	void setIsLocked(Boolean value);

} // CIM_PhysicalFrame
