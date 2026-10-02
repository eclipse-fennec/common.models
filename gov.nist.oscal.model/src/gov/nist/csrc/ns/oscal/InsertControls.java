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
package gov.nist.csrc.ns.oscal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Controls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Insert Controls</b>
 *   : Specifies which controls to use in the containing context.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.InsertControls#getIncludeAll <em>Include All</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InsertControls#getIncludeControls <em>Include Controls</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InsertControls#getExcludeControls <em>Exclude Controls</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InsertControls#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInsertControls()
 * @model extendedMetaData="name='oscal-profile-insert-controls-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InsertControls extends EObject {
	/**
	 * Returns the value of the '<em><b>Include All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include All</em>' containment reference.
	 * @see #setIncludeAll(IncludeAll)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInsertControls_IncludeAll()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='include-all' namespace='##targetNamespace'"
	 * @generated
	 */
	IncludeAll getIncludeAll();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.InsertControls#getIncludeAll <em>Include All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include All</em>' containment reference.
	 * @see #getIncludeAll()
	 * @generated
	 */
	void setIncludeAll(IncludeAll value);

	/**
	 * Returns the value of the '<em><b>Include Controls</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ControlSelectControlById}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Controls</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInsertControls_IncludeControls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='include-controls' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ControlSelectControlById> getIncludeControls();

	/**
	 * Returns the value of the '<em><b>Exclude Controls</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ControlSelectControlById}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Controls</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInsertControls_ExcludeControls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude-controls' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ControlSelectControlById> getExcludeControls();

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Order</b>
	 *   : A designation of how a selection of controls in a profile is to be ordered.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInsertControls_Order()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype"
	 *        extendedMetaData="kind='attribute' name='order'"
	 * @generated
	 */
	String getOrder();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.InsertControls#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(String value);

} // InsertControls
