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
 * A representation of the model object '<em><b>Ethical Considerations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.EthicalConsiderationsType#getEthicalConsideration <em>Ethical Consideration</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getEthicalConsiderationsType()
 * @model extendedMetaData="name='ethicalConsiderations_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EthicalConsiderationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ethical Consideration</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.EthicalConsiderationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ethical Consideration</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEthicalConsiderationsType_EthicalConsideration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ethicalConsideration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EthicalConsiderationType> getEthicalConsideration();

} // EthicalConsiderationsType
