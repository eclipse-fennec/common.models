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
 * A representation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Catalog</b>
 *   : A structured, organized collection of control information.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Catalog#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Catalog#getParam <em>Param</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Catalog#getControl <em>Control</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Catalog#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Catalog#getBackMatter <em>Back Matter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Catalog#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getCatalog()
 * @model extendedMetaData="name='oscal-catalog-catalog-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Catalog extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getCatalog_Metadata()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Catalog#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getCatalog_Param()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='params'"
	 * @generated
	 */
	EList<Parameter> getParam();

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getCatalog_Control()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='control' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='controls'"
	 * @generated
	 */
	EList<Control> getControl();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.CatalogGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getCatalog_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='groups'"
	 * @generated
	 */
	EList<CatalogGroup> getGroup();

	/**
	 * Returns the value of the '<em><b>Back Matter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Back Matter</em>' containment reference.
	 * @see #setBackMatter(BackMatter)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getCatalog_BackMatter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='back-matter' namespace='##targetNamespace'"
	 * @generated
	 */
	BackMatter getBackMatter();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Catalog#getBackMatter <em>Back Matter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Matter</em>' containment reference.
	 * @see #getBackMatter()
	 * @generated
	 */
	void setBackMatter(BackMatter value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Catalog Universally Unique Identifier</b>
	 *   : Provides a globally unique means to identify a given catalog instance.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getCatalog_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Catalog#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // Catalog
