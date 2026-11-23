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
 * A representation of the model object '<em><b>CIM Power Allocation Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PowerAllocationSettingData class is used to provide configuration and capabilities information about power consumption and/or allocation for a CIM_ManagedSystemElement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PowerAllocationSettingData#getPowerAllocationSettingPurpose <em>Power Allocation Setting Purpose</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerAllocationSettingData#getOtherSettingPurpose <em>Other Setting Purpose</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PowerAllocationSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.23.0' UMLPackagePath='CIM::Device::CoolingAndPower' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PowerAllocationSettingData extends CIM_ResourceAllocationSettingData {
	/**
	 * Returns the value of the '<em><b>Power Allocation Setting Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When power is consumed by or allocated to a ManagedSystemElement, there may be well-known or meaningful levels of allocation or consumption for the ManagedSystemElement. The PowerAllocationSettingPurpose property may be used to identify the well known level or provide context for the interpretation of the other values of the PowerAllocationSettingData instance. A value of "MaxConAuxiliary" shall indicate the instance provides information about the maximum power allocated or consumed by the ManagedSystemElement as currently configured, while the ManagedSystemElement is turned off and drawing auxiliary power. Note that an alternate name for "auxiliary power" is "trickle power" 
	 * A value of "MinWhenOn" shall indicate the instance provides information about the minimum value for power consumption for which a configuration of the ManagedSystemElement exists such that when it is powered on and operating in that configuration, the power consumption of the ManagedSystemElement is guaranteed not to exceed the specified amount. 
	 * A value of "MaxAsConfigured" shall indicate the instance provides information about the maximum power that may be allocated to or consumed by the ManagedSystemElement as currently configured while powered on. The actual power consumed may be less.
	 * A value of "MaxIfAllHotPlug" shall indicate the instance provides information about the maximum power allocated or consumed by the ManagedSystemElement if all components that could be added to the ManagedSystemElement without requiring a power cycle of the ManagedSystemElement were added to the ManagedSystemElement. 
	 * A value of "MaxIfAllColdPlug" shall indicate the instance provides information about the maximum power allocated or consumed by the ManagedSystemElement if all components that could be added to the ManagedSystemElement, including those that require a power cycle of the ManagedSystemElement, were added to the ManagedSystemElement. 
	 * A value of "Allocated" shall indicate the instance provides information about the current power allocated to the ManagedSystemElement. 
	 * A value of "MinWithoutDegradation" shall indicate the instance provides information about the minimum power allocated or consumed by the ManagedSystemElement with out causing performance degradation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Allocation Setting Purpose</em>' attribute.
	 * @see #setPowerAllocationSettingPurpose(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerAllocationSettingData_PowerAllocationSettingPurpose()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"MaxConAuxiliary\",\"MinWhenOn\",\"MaxAsConfigured\",\"MaxIfAllHotPlug\",\"MaxIfAllColdPlug\",\"Allocated\",\"MinWithoutDegradation\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_PowerAllocationSettingData.OtherSettingPurpose\"]'"
	 * @generated
	 */
	Integer getPowerAllocationSettingPurpose();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerAllocationSettingData#getPowerAllocationSettingPurpose <em>Power Allocation Setting Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Allocation Setting Purpose</em>' attribute.
	 * @see #getPowerAllocationSettingPurpose()
	 * @generated
	 */
	void setPowerAllocationSettingPurpose(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Setting Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property shall be set to null if SettingPurpose is any value other than 1. This property shall be non-null if SettingPurpose has the value 1. If non-null, the value of this property shall be formatted using the following algorithm: : , where and are separated by a colon (:) and shall include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the value or that is a registered ID assigned to the business entity by a recognized global authority. In addition, to ensure uniqueness, shall not contain a colon (:). If this algorithm is used, the first colon to appear in the value shall appear between and . The is chosen by the business entity and shall be used uniquely.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Setting Purpose</em>' attribute.
	 * @see #setOtherSettingPurpose(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerAllocationSettingData_OtherSettingPurpose()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PowerAllocationSettingData.PowerAllocationSettingPurpose\"]'"
	 * @generated
	 */
	String getOtherSettingPurpose();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerAllocationSettingData#getOtherSettingPurpose <em>Other Setting Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Setting Purpose</em>' attribute.
	 * @see #getOtherSettingPurpose()
	 * @generated
	 */
	void setOtherSettingPurpose(String value);

} // CIM_PowerAllocationSettingData
