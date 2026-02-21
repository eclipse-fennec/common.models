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
 * A representation of the model object '<em><b>Text Symbolizer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.TextSymbolizerType#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getTextSymbolizerType()
 * @model extendedMetaData="name='TextSymbolizerType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TextSymbolizerType extends PureSymbolizerType1 {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das beschreibende Label-Objekt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(LabelType2)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getTextSymbolizerType_Label()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelType2 getLabel();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TextSymbolizerType#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelType2 value);

} // TextSymbolizerType
