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
 * A representation of the model object '<em><b>Step Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.StepType1#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getStepType1()
 * @model extendedMetaData="name='step_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StepType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Step-Klasse setzt einen Property-Zugriff mit einem weiteren Namen fort. Der Name ist ein im laufenden Kontext erreichbarer Property-Name des GML-Modells, FeatureType-Name, DataType oder Attributname.
	 * 
	 * Jeder Step kann ein Prädikat tragen. Dieses wird dann im erreichten Kontext interpretiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step</em>' containment reference.
	 * @see #setStep(StepType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getStepType1_Step()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Step' namespace='##targetNamespace'"
	 * @generated
	 */
	StepType getStep();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StepType1#getStep <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' containment reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(StepType value);

} // StepType1
