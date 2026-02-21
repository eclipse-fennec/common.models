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
package org.cyclonedx.schema.bom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>License Types Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.LicenseTypesType#getLicenseType <em>License Type</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseTypesType()
 * @model extendedMetaData="name='licenseTypes_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LicenseTypesType extends EObject {
	/**
	 * Returns the value of the '<em><b>License Type</b></em>' attribute list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.LicenseTypeEnum}.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.LicenseTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License Type</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.LicenseTypeEnum
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseTypesType_LicenseType()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='licenseType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LicenseTypeEnum> getLicenseType();

} // LicenseTypesType
