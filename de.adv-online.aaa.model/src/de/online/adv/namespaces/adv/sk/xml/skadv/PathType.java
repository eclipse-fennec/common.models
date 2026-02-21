/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package de.online.adv.namespaces.adv.sk.xml.skadv;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PathType#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPathType()
 * @model extendedMetaData="name='PathType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PathType extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elemente eines Pfads.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(ElementType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPathType_Element()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	ElementType getElement();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PathType#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(ElementType value);

} // PathType
