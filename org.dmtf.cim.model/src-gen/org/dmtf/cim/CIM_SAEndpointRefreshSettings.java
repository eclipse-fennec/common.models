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
 * A representation of the model object '<em><b>CIM SA Endpoint Refresh Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SAEndpointRefreshSettings hold the refresh thresholds for the SecurityAssociationEndpoint. Since these settings may change for an SA, the properties are defined both in this class and in SecurityAssociationEndpoint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SAEndpointRefreshSettings#getRefreshThresholdSecondsPercentage <em>Refresh Threshold Seconds Percentage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SAEndpointRefreshSettings#getRefreshThresholdKbytesPercentage <em>Refresh Threshold Kbytes Percentage</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SAEndpointRefreshSettings()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Network::IPsec' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SAEndpointRefreshSettings extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Refresh Threshold Seconds Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RefreshThresholdSecondsPercentage is the lifetime percentage after which a new SA should be acquired, before the existing SA expires.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refresh Threshold Seconds Percentage</em>' attribute.
	 * @see #setRefreshThresholdSecondsPercentage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SAEndpointRefreshSettings_RefreshThresholdSecondsPercentage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Write='true' Units='Percent' MinValue='0' MaxValue='100' ModelCorrespondence='[\"CIM_SecurityAssociationEndpoint.RefreshThresholdSecondsPercentage\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getRefreshThresholdSecondsPercentage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SAEndpointRefreshSettings#getRefreshThresholdSecondsPercentage <em>Refresh Threshold Seconds Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Threshold Seconds Percentage</em>' attribute.
	 * @see #getRefreshThresholdSecondsPercentage()
	 * @generated
	 */
	void setRefreshThresholdSecondsPercentage(Integer value);

	/**
	 * Returns the value of the '<em><b>Refresh Threshold Kbytes Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RefreshThresholdKbytesPercentage is the lifetime percentage of kilobytes processed, at which a new SA should be acquired.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refresh Threshold Kbytes Percentage</em>' attribute.
	 * @see #setRefreshThresholdKbytesPercentage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SAEndpointRefreshSettings_RefreshThresholdKbytesPercentage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Write='true' Units='Percent' MinValue='0' MaxValue='100' ModelCorrespondence='[\"CIM_SecurityAssociationEndpoint.RefreshThresholdKbytesPercentage\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getRefreshThresholdKbytesPercentage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SAEndpointRefreshSettings#getRefreshThresholdKbytesPercentage <em>Refresh Threshold Kbytes Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Threshold Kbytes Percentage</em>' attribute.
	 * @see #getRefreshThresholdKbytesPercentage()
	 * @generated
	 */
	void setRefreshThresholdKbytesPercentage(Integer value);

} // CIM_SAEndpointRefreshSettings
