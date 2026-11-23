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
 * A representation of the model object '<em><b>CIM Operational Power Manifest Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The OperationalPowerManifestCollection class aggregates, via MemberOfCollection, a set of OperationalPowerManifests. The OperationalPowerManifestCollection is used to filter the retrieval of statistics. For example, an OperationalPowerManifestCollection is specified as part of the OperationalPowerStatisticsService.GetStatisticsCollection method to filter the statistics returned by that method.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OperationalPowerManifestCollection#getIsDefault <em>Is Default</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OperationalPowerManifestCollection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Power' override.ElementName='string' override.ElementName.Description='A user-friendly name for the OperationalPowerManifestCollection. It can be set through the ElementName parameter of the StatisticsService.CreateManifestCollection method.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_OperationalPowerManifestCollection extends CIM_SystemSpecificCollection {
	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes whether or not this OperationalPowerManifestCollection is a provider defined default OperationalPowerStatisticsManifestCollection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperationalPowerManifestCollection_IsDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Required='true'"
	 * @generated
	 */
	Boolean getIsDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperationalPowerManifestCollection#getIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #getIsDefault()
	 * @generated
	 */
	void setIsDefault(Boolean value);

} // CIM_OperationalPowerManifestCollection
