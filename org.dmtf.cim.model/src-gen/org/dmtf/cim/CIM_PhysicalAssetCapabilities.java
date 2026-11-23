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
 * A representation of the model object '<em><b>CIM Physical Asset Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PhysicalAssetCapabilities describes the capabilities of representing the FRU related information of the associated instance of the CIM_PhysicalElement subclass.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalAssetCapabilities#getFRUInfoSupported <em>FRU Info Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalAssetCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.18.0' UMLPackagePath='CIM::Physical::Misc' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PhysicalAssetCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>FRU Info Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the PartNumber, Serial Number, Model, Manufacturer, and SKU properties of PhysicalElement are non-null, non-blank values, and the availability of the complete FRU information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FRU Info Supported</em>' attribute.
	 * @see #setFRUInfoSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalAssetCapabilities_FRUInfoSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_PhysicalElement.PartNumber\",\"CIM_PhysicalElement.SerialNumber\",\"CIM_PhysicalElement.Model\",\"CIM_PhysicalElement.Manufacturer\",\"CIM_PhysicalElement.SKU\"]'"
	 * @generated
	 */
	Boolean getFRUInfoSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalAssetCapabilities#getFRUInfoSupported <em>FRU Info Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FRU Info Supported</em>' attribute.
	 * @see #getFRUInfoSupported()
	 * @generated
	 */
	void setFRUInfoSupported(Boolean value);

} // CIM_PhysicalAssetCapabilities
