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
 * A representation of the model object '<em><b>Remove</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                                 
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Removal</b>
 *   : Specifies objects to be removed from a control based on specific aspects of the object that must all match.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Remove#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Remove#getByClass <em>By Class</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Remove#getById <em>By Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Remove#getByItemName <em>By Item Name</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Remove#getByName <em>By Name</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Remove#getByNs <em>By Ns</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRemove()
 * @model extendedMetaData="name='remove_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Remove extends EObject {
	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                       
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Remarks</b>
	 *   : Additional commentary about the containing object.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' containment reference.
	 * @see #setRemarks(MarkupMultilineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRemove_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Remove#getRemarks <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' containment reference.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(MarkupMultilineDatatype value);

	/**
	 * Returns the value of the '<em><b>By Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                    
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Reference by class</b>
	 *   : Identify items to remove by matching their class.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>By Class</em>' attribute.
	 * @see #setByClass(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRemove_ByClass()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype"
	 *        extendedMetaData="kind='attribute' name='by-class'"
	 * @generated
	 */
	String getByClass();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Remove#getByClass <em>By Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Class</em>' attribute.
	 * @see #getByClass()
	 * @generated
	 */
	void setByClass(String value);

	/**
	 * Returns the value of the '<em><b>By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                    
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Reference by ID</b>
	 *   : Identify items to remove indicated by their id.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>By Id</em>' attribute.
	 * @see #setById(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRemove_ById()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype"
	 *        extendedMetaData="kind='attribute' name='by-id'"
	 * @generated
	 */
	String getById();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Remove#getById <em>By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Id</em>' attribute.
	 * @see #getById()
	 * @generated
	 */
	void setById(String value);

	/**
	 * Returns the value of the '<em><b>By Item Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                    
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Item Name Reference</b>
	 *   : Identify items to remove by the name of the item's information object name, e.g. prop or link.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>By Item Name</em>' attribute.
	 * @see #setByItemName(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRemove_ByItemName()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype"
	 *        extendedMetaData="kind='attribute' name='by-item-name'"
	 * @generated
	 */
	String getByItemName();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Remove#getByItemName <em>By Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Item Name</em>' attribute.
	 * @see #getByItemName()
	 * @generated
	 */
	void setByItemName(String value);

	/**
	 * Returns the value of the '<em><b>By Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                    
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Reference by (assigned) name</b>
	 *   : Identify items remove by matching their assigned name.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>By Name</em>' attribute.
	 * @see #setByName(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRemove_ByName()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype"
	 *        extendedMetaData="kind='attribute' name='by-name'"
	 * @generated
	 */
	String getByName();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Remove#getByName <em>By Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Name</em>' attribute.
	 * @see #getByName()
	 * @generated
	 */
	void setByName(String value);

	/**
	 * Returns the value of the '<em><b>By Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                    
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Item Namespace Reference</b>
	 *   : Identify items to remove by the item's ns, which is the namespace associated with a part, or prop.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>By Ns</em>' attribute.
	 * @see #setByNs(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRemove_ByNs()
	 * @model dataType="gov.nist.csrc.ns.oscal.URIDatatype"
	 *        extendedMetaData="kind='attribute' name='by-ns'"
	 * @generated
	 */
	String getByNs();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Remove#getByNs <em>By Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Ns</em>' attribute.
	 * @see #getByNs()
	 * @generated
	 */
	void setByNs(String value);

} // Remove
