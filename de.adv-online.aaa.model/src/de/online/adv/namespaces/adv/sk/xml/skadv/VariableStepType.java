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
 * A representation of the model object '<em><b>Variable Step Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariableStepType#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getVariableStepType()
 * @model extendedMetaData="name='VariableStepType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VariableStepType extends FirstStepType1 {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Variable eines VariableStep.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(VariableType2)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getVariableStepType_Variable()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableType2 getVariable();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariableStepType#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(VariableType2 value);

} // VariableStepType
