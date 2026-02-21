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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Symbolizer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LineSymbolizerType#getStroke <em>Stroke</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLineSymbolizerType()
 * @model extendedMetaData="name='LineSymbolizerType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LineSymbolizerType extends PureSymbolizerType1 {
	/**
	 * Returns the value of the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke</em>' containment reference.
	 * @see #setStroke(StrokeType1)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLineSymbolizerType_Stroke()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='stroke' namespace='##targetNamespace'"
	 * @generated
	 */
	StrokeType1 getStroke();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LineSymbolizerType#getStroke <em>Stroke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke</em>' containment reference.
	 * @see #getStroke()
	 * @generated
	 */
	void setStroke(StrokeType1 value);

} // LineSymbolizerType
