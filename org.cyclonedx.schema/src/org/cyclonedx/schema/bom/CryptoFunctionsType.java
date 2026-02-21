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
 * A representation of the model object '<em><b>Crypto Functions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.CryptoFunctionsType#getCryptoFunction <em>Crypto Function</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getCryptoFunctionsType()
 * @model extendedMetaData="name='cryptoFunctions_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CryptoFunctionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Crypto Function</b></em>' attribute list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.CryptoFunctionType}.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.CryptoFunctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crypto Function</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.CryptoFunctionType
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCryptoFunctionsType_CryptoFunction()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='cryptoFunction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CryptoFunctionType> getCryptoFunction();

} // CryptoFunctionsType
