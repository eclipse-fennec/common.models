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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markup Insert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *   An insert can be used to identify a placeholder for dynamically inserting text related to a specific object, which is referenced by the object's identifier using an 
 *   <code>id-ref</code>
 *   . This insert mechanism allows the selection of which text value from the object to dynamically include based on the application's display requirements.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupInsert#getIdRef <em>Id Ref</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupInsert#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupInsert()
 * @model extendedMetaData="name='insertType' kind='empty'"
 * @generated
 */
@ProviderType
public interface MarkupInsert extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   The identity of the object to insert a value for. The identity will be selected from the index of objects of the specified 
	 *   <code>type</code>
	 *   . The specific value to include is based on the application's display requirements, which will likely use a specific data element associated with the 
	 *   <code>type</code>
	 *    (e.g., title, identifier, value, etc.) that is appropriate for the application.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id Ref</em>' attribute.
	 * @see #setIdRef(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupInsert_IdRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='id-ref'"
	 * @generated
	 */
	String getIdRef();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MarkupInsert#getIdRef <em>Id Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Ref</em>' attribute.
	 * @see #getIdRef()
	 * @generated
	 */
	void setIdRef(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of object to include from (e.g., parameter, control, component, role, etc.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupInsert_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MarkupInsert#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // MarkupInsert
